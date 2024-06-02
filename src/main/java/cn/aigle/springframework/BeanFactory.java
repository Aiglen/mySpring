package main.java.cn.aigle.springframework;

import main.java.cn.aigle.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;
}
