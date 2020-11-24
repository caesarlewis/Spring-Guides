package com.jasonless.spring.test;


import com.jasonless.spring.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

/**
 * @author LiuShiZeng
 */
@SpringBootTest
public class SpringServiceTest {

    @Autowired
    UserService userService;

    @MockBean
    MoneyService moneyService;

    @Test
    public void testService(){
        int expectMoney = 100;
        given(this.moneyService.getUserMoney(anyInt())).willReturn(expectMoney);
        int money = userService.getMoney();
        assertEquals(expectMoney,money);

    }

}
