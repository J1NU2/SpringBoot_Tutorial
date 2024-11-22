package com.test.project.service;

import com.test.project.dto.TestDTO;

public interface IF_TestService {

    // INSERT 작업 테스트, 서비스 레이어
    public void insertTest(TestDTO testdto) throws Exception;

}
