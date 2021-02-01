package com.shenzhi.belina.mapper;

import java.util.*;
public class Array01 {
	public static void main(String[] args) { 

		//比如，我们可以用数组来解决上一个问题。
		//1.定义数组，存放体重
		//2. 解释
		// double : 存放是double 类型的数据
		// hens: 表示数据名字, 数组变量
		// {3,5,1,3.4,2,50 } 即向数组中存放的数据6个
		double hens[] = {3,5,1,3.4,2,50,90,9,12 };

		//获取到数组的长度[有多少个元素]
		System.out.println("hens长度(大小)=" + hens.length); //10

		//统计总体重
		double totalWeight = 0.0;
		//遍历数组 
		/*for(int i = 0; i < hens.length; i++) {
			//System.out.println(hens[i]); //演示如何获取到数组的每一个数(元素), 下标[i]从0开始
			totalWeight += hens[i];
		}*/
		for (double hen : hens) {
			totalWeight += hen;
		}
		System.out.println("总体重=" + totalWeight);
		System.out.println("平均体重=" + totalWeight / hens.length);
	}
}
