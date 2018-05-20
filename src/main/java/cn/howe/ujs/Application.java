package cn.howe.ujs;

import cn.howe.ujs.web.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @GetMapping("/api/protected")
    public @ResponseBody
    Object hellWorld() {
        return "Hello World! This is a protected api";
    }
    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        JwtFilter filter = new JwtFilter();
        registrationBean.setFilter(filter);
        return registrationBean;
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

