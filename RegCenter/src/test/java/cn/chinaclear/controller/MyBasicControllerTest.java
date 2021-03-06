package cn.chinaclear.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBasicControllerTest {

    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc;


    @Before
    public void setUp() {
    mockMvc= MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void basicMethod() throws Exception {
        ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.get("/test1"));
        System.out.println(perform.toString());
    }

}
