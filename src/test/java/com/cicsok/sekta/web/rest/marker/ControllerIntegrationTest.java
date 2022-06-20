package com.cicsok.sekta.web.rest.marker;

import com.cicsok.sekta.web.app.SEKTAWebRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SpringBootTest(classes = SEKTAWebRunner.class)
@AutoConfigureMockMvc
public @interface ControllerIntegrationTest {

    String value() default "";
}
