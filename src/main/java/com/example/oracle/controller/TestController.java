package com.example.oracle.controller;

import com.example.oracle.entity.Test;
import com.example.oracle.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestService testService;

    @GetMapping(value = "/test", produces = "application/json")
    public List<Test> getTestList(
            @RequestParam(value = "name", required = false) String name
    ) {
        return testService.getTestList(name);
    }

    @GetMapping(value = "/test/post", produces = "application/json")
    public Test postTest(
            @RequestParam(value = "testId", required = true) String testId,
            @RequestParam(value = "name", required = true) String name
    ) {
        return testService.postTest(testId, name);
    }
}
