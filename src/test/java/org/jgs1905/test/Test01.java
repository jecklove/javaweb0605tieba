package org.jgs1905.test;

import java.util.Arrays;

import org.jgs1905.enums.PostTypeEnum;
import org.junit.Test;

/**
 * 	测试类1
 * @author junki
 * @date 2020年6月5日
 */
public class Test01 {
	
	@Test
	public void test01() {
		System.out.println("hello junit");
	}
	
	@Test
	public void test02() {
		// 1.创建枚举实例
		PostTypeEnum type = PostTypeEnum.GAME;
		
		System.out.println(type);
		System.out.println(type.ordinal());
		System.out.println(type.getName());
	}
	
	@Test
	public void test03() {
		// ordinal => PostTypeEnum
		PostTypeEnum[] values = PostTypeEnum.values();
		System.out.println(Arrays.toString(values));
		
		System.out.println(values[0].getName());
	}

}
