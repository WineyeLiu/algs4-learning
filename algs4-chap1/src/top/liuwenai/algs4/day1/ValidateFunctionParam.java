package top.liuwenai.algs4.day1;

import java.util.ArrayList;
import java.util.List;

public class ValidateFunctionParam {
	// 先定义一个方法
	private static List<String> appendDeterm(List<String> list){
		list.add(".");
		return list;
	}
	
	public static void main(String[] args) {
		// 验证java按值传递参数。 对于对象而言， 按值传递的值指的是对象引用的值
		
		List<String> strList = new ArrayList<>();
		strList.add("liu");
		strList.add("wen");
		strList.add("ai");
		
		System.out.println("方法运行之前的List：" + strList);
		appendDeterm(strList);
		System.out.println("运行之后的List：" + strList);
		
		
	}

}
