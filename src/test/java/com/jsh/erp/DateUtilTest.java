package com.jsh.erp;

import com.alibaba.fastjson.JSON;
import com.jsh.erp.datasource.entities.Depot;
import com.jsh.erp.service.depot.DepotService;
import com.jsh.erp.testservice.TestService;
import com.jsh.erp.testutil.TestDate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DateUtilTest {

    @Autowired
    private  TestDate testDate ;
    /**
     * 测试根据jdk版本 选择时间类
     * @throws Exception
     */
    @Test
    public void testDate() throws Exception{
        String s = testDate.test();
         log.info("depot result:"+s );
    }


}
