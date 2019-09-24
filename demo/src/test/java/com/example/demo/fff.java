package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class fff {

//	@Test
//	public void contextLoads() {
//	}
	@Test
	public void ddd() {
		System.out.println("lll");
	}
	public static void main(String[] args) {
		/*//自定义的过期时间
				String expireDateStr = "2019-01-14 23:59:59";
				Date expireDate = null;
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				if(!"".equals(expireDateStr) && !"null".equals(expireDateStr)){
					try {
						expireDate = sdf.parse(expireDateStr);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(expireDate);*/
		/*String a ="1";
		String b ="";
		String c ="";
		if(a == null || "".equals(a) || b == null && "".equals(b) || c == null && "".equals(c)){
			System.out.println("111");
		}else{
			System.out.println("222");
		}*/
		
//		System.out.println(false || false && true || false && true);
//		double a = 1.010000001000000001;
//		System.out.println(Double.parseDouble("1.010000001000000001000000009") == a);
		int[] a = {2,1,6,8,7,9,5,4};
	}
}

