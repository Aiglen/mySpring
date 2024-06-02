package main.java.cn.aigle.springframework.beans.factory.support;

import main.java.cn.aigle.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
