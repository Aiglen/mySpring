package test.java.cn;

import main.java.cn.aigle.springframework.BeanDefinition;
import main.java.cn.aigle.springframework.BeanFactory;
import org.junit.Test;
import test.java.cn.aigle.springframework.test.bean.UserService;

public class ApiTest {

    @Test
    public void test_beanFactory()
    {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册 bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(new UserService()));
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
