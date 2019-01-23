package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzone.emaillist.dao.EmaillistDao;
import com.douzone.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		getListTest();
	}

	
	public static void getListTest() {
		List<EmaillistVo> list = new EmaillistDao().getList();
		for(EmaillistVo vo : list) {
			System.out.println(vo);
		}
	}
}
