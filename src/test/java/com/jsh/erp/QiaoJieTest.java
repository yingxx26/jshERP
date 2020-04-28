package com.jsh.erp;

import com.jsh.erp.testqiaojie.*;
import com.jsh.erp.testresponsibilitychain.Handler;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class QiaoJieTest {

    @Autowired
    private  MessageEmail memail;
    @Autowired
    private  MessageSMS msms;
    @Autowired
    private  UrgencyMessage um;
    @Autowired
    private  CommonMessage cm;

    @Autowired
    private Map<String, AbstractMessage> ams;

    @Autowired
    private Map<String, MessageImplementorInterface> mi;

    @Test
    public void qiaoJieTest() throws Exception{
        AbstractMessage commonMessage = ams.get("CommonMessage");

        MessageImplementorInterface messageSMS = mi.get("MessageSMS");
        commonMessage.setM(messageSMS);
        commonMessage.sendMessage("请喝一杯茶","小李");
/////////////////////////////////////////////////////////////////////////
        cm.setM(msms);
        cm.sendMessage("请喝一杯茶","小李");
        um.setM(memail);
        um.sendMessage("请喝一杯茶","小李");
     }
}
