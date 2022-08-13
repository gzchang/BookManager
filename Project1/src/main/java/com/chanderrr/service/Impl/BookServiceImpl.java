package com.chanderrr.service.Impl;

import com.chanderrr.dao.BookDao;
import com.chanderrr.domain.Book;
import com.chanderrr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gzc
 * @version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public boolean save(Book book) {
		bookDao.save(book);
		return false;
	}

	public boolean update(Book book) {
		bookDao.update(book);
		return false;
	}

	public boolean delete(Integer id) {
		bookDao.delete(id);
		return false;
	}

	public Book getById(Integer id) {
		return bookDao.getById(id);
	}

	public List<Book> getAll() {
		return bookDao.getAll();
	}
}
