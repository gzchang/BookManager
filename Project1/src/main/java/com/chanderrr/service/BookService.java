package com.chanderrr.service;

import com.chanderrr.domain.Book;

import java.util.List;

/**
 * @author Gzc
 * @version 1.0
 */
public interface BookService {

	boolean save(Book book);

	boolean update(Book book);


	boolean delete(Integer id);

	Book getById(Integer id);

	List<Book> getAll();
}
