package test.test_deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        return "test gg, testing s3 , testing 3 for s3, testing code deploy";
    }
}
