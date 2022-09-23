open module clean.arch.spring.java.template.config.main {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;
    requires org.apache.tomcat.embed.core;
    requires spring.context;
    requires clean.arch.spring.java.template.core.main;
    requires clean.arch.spring.java.template.infra.main;
    exports com.example;
}