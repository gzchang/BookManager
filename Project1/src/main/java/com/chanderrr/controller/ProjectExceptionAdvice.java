package com.chanderrr.controller;

import com.chanderrr.exception.BusinessException;
import com.chanderrr.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Gzc
 * @version 1.0
 *
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

	@ExceptionHandler(SystemException.class)
	public Result doSystemException(Exception e){
		return new Result(Code.SYSTEM_ERR,null,e.getMessage());
	}

	@ExceptionHandler(BusinessException.class)
	public Result doBusinessException(Exception e){
		return new Result(Code.BUSINESS_ERR,null,e.getMessage());
	}

	//other Exception
	@ExceptionHandler(Exception.class)
	public Result doExcetion(Exception exception){
		return new Result(Code.UNKNOW_ERR,null,"系统繁忙，请稍后再试");
	}
}
