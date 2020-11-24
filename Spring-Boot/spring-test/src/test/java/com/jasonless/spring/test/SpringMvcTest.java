package com.jasonless.spring.test;


import com.jasonless.spring.test.controller.UserController;
import com.jasonless.spring.test.entity.User;
import com.jasonless.spring.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * @author LiuShiZeng
 */
//@SpringBootTest(classes = TestApplication.class) Configuration error: found multiple declarations of @BootstrapWith for test class [test.SpringMvcTest]
@ContextConfiguration(classes = {TestApplication.class})
@WebMvcTest(UserController.class)
public class SpringMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    UserService userService;

    @Test
    public void testMvc() throws Exception {
        User user = new User("1","aa");
        given(this.userService.getUser()).willReturn(user);

        String name = "@.name";
        mvc.perform(get("/get")).andExpect(jsonPath(name).value("aa"));
    }




}
