package test.test_deploy.controller;

import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.test_deploy.domain.Test;
import test.test_deploy.domain.TestRepository;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;
    private Environment env;

    @GetMapping("/test")
    @ResponseBody
    public Test test(){

        Test test = new Test();
        test.setName("이수찬12");

        Test saved = testRepository.save(test);

        return saved;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String healthcheck(){
        return "ok";
    }

    @GetMapping("/profile")
    @ResponseBody
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
            .findFirst()
            .orElse("");
    }

}
