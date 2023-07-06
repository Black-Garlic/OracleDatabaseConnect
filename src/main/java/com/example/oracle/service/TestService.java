package com.example.oracle.service;

import com.example.oracle.entity.Test;
import com.example.oracle.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestService {
    private final TestRepository testRepository;

    @Transactional
    public List<Test> getTestList(String name) {
        return testRepository.findAllByNameContaining(name);
    }

    @Transactional
    public Test postTest(String testId, String name) {
        Test test = new Test();
        test.setTestId(testId);
        test.setName(name);

        return testRepository.save(test);
    }
}
