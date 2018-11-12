package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

//������==�����ļ�
@Configuration  //����Spring����һ��������

@ComponentScans(
		value = {
				@ComponentScan(value={"com.atguigu.config","com.atguigu.controller","com.atguigu.dao","com.atguigu.bean","com.atguigu.service"},includeFilters = {
						/*@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),*/
						/*@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)
		}
		)
//@ComponentScan  value:ָ��Ҫɨ��İ�
//excludeFilters = Filter[] ��ָ��ɨ���ʱ����ʲô�����ų���Щ���
//includeFilters = Filter[] ��ָ��ɨ���ʱ��ֻ��Ҫ������Щ���
//FilterType.ANNOTATION������ע��
//FilterType.ASSIGNABLE_TYPE�����ո��������ͣ�
//FilterType.ASPECTJ��ʹ��ASPECTJ���ʽ
//FilterType.REGEX��ʹ������ָ��
//FilterType.CUSTOM��ʹ���Զ������
public class MainConfig {
	
	//��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("personA")
	public Person person01(){
		return new Person("lisi", 20);
}

}
