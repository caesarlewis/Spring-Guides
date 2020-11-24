package com.jasonless.spring.test;


import org.junit.jupiter.api.Test;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

/**
 * @author LiuShiZeng
 */

public class MockitoTest {

//    @Autowired
//    UserService userService;

//    @MockBean
//    private MoneyService moneyService;

    @Test
    public void testService(){
    //    User user = userService.getUser();
     //   given
        MoneyService moneyService = mock(MoneyService.class);
   //     when()


    }

}
