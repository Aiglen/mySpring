package test.java.cn;

import main.java.cn.aigle.springframework.beans.factory.config.BeanDefinition;
import main.java.cn.aigle.springframework.BeanFactory;
import main.java.cn.aigle.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.java.cn.aigle.springframework.test.bean.UserService;

public class ApiTest {

    @Test
    public void test_beanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
