package com.chanderrr.service;

import com.chanderrr.config.SpringConfig;
import com.chanderrr.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Gzc
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testGetById(){
		Book book = bookService.getById(2);
		System.out.println(book);
	}

}
