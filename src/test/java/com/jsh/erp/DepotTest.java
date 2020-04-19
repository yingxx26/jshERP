package com.jsh.erp;

import com.alibaba.fastjson.JSON;
import com.jsh.erp.datasource.entities.Depot;
import com.jsh.erp.service.depot.DepotService;
import com.jsh.erp.testservice.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Select;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.ServletWebRequest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepotTest {

    @Resource
    private DepotService depotService;
    @Autowired
    private Map<String, TestService> testServiceMap;
    /**
     * 测试select事务 缓存
     * @throws Exception
     */
    @Test
    public void getDepotTest() throws Exception{
        Depot result = depotService.getDepotTest(1l);
        log.info("depot result:" + JSON.toJSONString(result));
    }

    /**
     * 测试注解和xml一起使用
     * @throws Exception
     */
    @Test
    public void getDepotcountTest() throws Exception{
        Long x=depotService.testcountDepot("1",0,"1");
        log.info("depot result:" + JSON.toJSONString(x));
    }

    /**
     * 测试service放入一个map里
     * @throws Exception
     */
    @Test
    public void multiServiceTest() throws Exception{
        String type = "two";
        String generatorName = type + TestService.class.getSimpleName();
        TestService testService = testServiceMap.get(generatorName);
        log.info("depot result:" + JSON.toJSONString(testService.testcountDepot()));
    }


    @Test
    public void getAllList() throws Exception{
        List<Depot> depotList =depotService.getAllList();
        log.info("depot result:" + JSON.toJSONString(depotList));
    }

}
