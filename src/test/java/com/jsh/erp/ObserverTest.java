package com.jsh.erp;

import com.jsh.erp.testObserver.PayCallBackService;
import com.jsh.erp.testqiaojie.AbstractMessage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverTest {
    @Autowired
    private PayCallBackService payCallBackService;
    @Test
    public void observerTest() throws Exception {
        payCallBackService.callback();
    }
}
