module clean.arch.spring.java.template.core.main {
    requires spring.context;
    requires lombok;
    exports com.example.ports.in;
    opens com.example.service to spring.core;
}