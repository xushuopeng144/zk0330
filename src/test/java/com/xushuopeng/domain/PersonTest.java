package com.xushuopeng.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.prefs.BackingStoreException;

import org.junit.jupiter.api.Test;

import com.xushuopeng.utils.RandomUtil;
import com.xushuopeng.utils.StringUtil;

class PersonTest {

	@Test
	void test() {
		for (int i = 1; i <= 10000; i++) {
			Person p=new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			p.setCreated(date());
			System.out.println(i+"    "+p);
		}
		
	}
  public static String date() {
	  Random random=new Random();
	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	  Calendar cal=Calendar.getInstance();
	  cal.set(2010,0,1);
	  long start=cal.getTimeInMillis();
	  cal.setTime(new Date());
	  long end=cal.getTimeInMillis();
	  
	return sdf.format(new Date(start+(long)(random.nextDouble()*(end-start))));
	  
  }
}
