package com.jsh.erp.testservice;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service("twoTestService")
public class TwoTestServiceImpl implements TestService{
    private Logger logger = LoggerFactory.getLogger(TwoTestServiceImpl.class);




    @Override
    public Long testcountDepot(  )throws Exception {
        Long  result=2L;

        return result;
    }
}
