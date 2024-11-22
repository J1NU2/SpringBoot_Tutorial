package com.test.project.service;

import com.test.project.dto.TestDTO;
import com.test.project.repository.IF_TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class TestService implements IF_TestService {

    @Autowired
    IF_TestRepository testRepository;

    @Override
    public void insertTest(TestDTO testdto) throws Exception {
        testRepository.insertDBTest(testdto);
    }

}
