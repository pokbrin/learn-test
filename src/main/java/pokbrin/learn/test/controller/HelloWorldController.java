package pokbrin.learn.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author pokbrin
 * @date 2022-08-12 10:05
 */
@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
}
