//package com.jwhuang42.regisapp.config;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class RegistrationAppInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(RegistrationAppConfig.class);
//
//        // create the dispacher servlet
//        DispatcherServlet servlet = new DispatcherServlet(context);
//        ServletRegistration.Dynamic myServlet = servletContext.addServlet("mydispatcher", servlet);
//
//        myServlet.setLoadOnStartup(1);
//        myServlet.addMapping("/mywebsite/*");
//    }
//}
