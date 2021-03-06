package com.experts.core.biller.statemachine.api.activemq.standers.config;

/*import com.acme.disttrans.webapp.util.DistTxConstants;*/
import com.experts.core.biller.statemachine.api.activemq.standers.util.DistTxConstants;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Locale;

@Configuration
@EnableWebMvc
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = "com.experts.core.biller.statemachine.api.activemq.standers.controller")
public class MvcViewConfiguration extends WebMvcConfigurerAdapter {

    private Logger log = LoggerFactory.getLogger(MvcViewConfiguration.class);

    // mvc
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix(DistTxConstants.VIEW_PREFIX);
        internalResourceViewResolver.setSuffix(DistTxConstants.VIEW_SUFFIX);
        internalResourceViewResolver.setViewClass(JstlView.class);
        return internalResourceViewResolver;
    }

    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("logout");
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    // internationalization
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale(DistTxConstants.LOCALE_TURKISH));
        return localeResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
        registry.addWebRequestInterceptor(commonDataInterceptor());
    }

    //common web request interceptor
    @Bean
    public WebRequestInterceptor commonDataInterceptor() {
        return new CommonWebRequestDataInterceptor();
    }

    // profile
    @Bean
    @Profile("dev")
    public static PropertySourcesPlaceholderConfigurer devPropertyConfigurer() {
        return preparePlaceholder(DistTxConstants.DEV_PROPERTIES_RESOURCE);
    }

    @Bean
    @Profile("test")
    public static PropertySourcesPlaceholderConfigurer testPropertyConfigurer() {
        return preparePlaceholder(DistTxConstants.TEST_PROPERTIES_RESOURCE);
    }

    private static PropertySourcesPlaceholderConfigurer preparePlaceholder(String propResource) {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        Resource resource = new ClassPathResource(propResource);
        placeholderConfigurer.setLocation(resource);
        return placeholderConfigurer;
    }

    // utilities
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
          .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)
          .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false)
          .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        return mapper;
    }

}