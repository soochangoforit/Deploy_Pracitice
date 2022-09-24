package test.test_deploy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.test_deploy.domain.Test;
import test.test_deploy.domain.TestRepository;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/test")
    @ResponseBody
    public Test test(){

        Test test = new Test();
        test.setName("이수찬123123dasdssd");

        Test saved = testRepository.save(test);

        return saved;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String healthcheck(){
        return "ok";
    }

}
