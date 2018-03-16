package com.dubo.utils;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/10/20 0020.
 * 定义@DataSource注解
 */
public class DataSourceAspect {
    public void intercept(JoinPoint point)throws Exception{
        Class<?> target=point.getTarget().getClass();
        MethodSignature signature=(MethodSignature)point.getSignature();
        for(Class<?> clazz:target.getInterfaces()){
            reslolveDataSource(clazz,signature.getMethod());
        }
        reslolveDataSource(target, signature.getMethod());
    }

    public void reslolveDataSource(Class<?> clazz, Method method){
        try{
            Class<?>[] types=method.getParameterTypes();
            if(clazz.isAnnotationPresent(DataSource.class)){
                DataSource source=clazz.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.setDataSource(source.value());
            }
            Method m=clazz.getMethod(method.getName(),types);
            if(m!=null&&m.isAnnotationPresent(DataSource.class)){
                DataSource source = m.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.setDataSource(source.value());

            }
        }catch (Exception e){
            System.out.println(clazz + ":" + e.getMessage());
        }
    }
}
