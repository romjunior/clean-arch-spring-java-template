module clean.arch.spring.java.template.infra.main {
    requires clean.arch.spring.java.template.core.main;
    requires spring.web;
    opens com.example.controller to spring.core;
}