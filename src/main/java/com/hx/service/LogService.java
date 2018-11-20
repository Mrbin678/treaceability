package com.hx.service;

import java.util.List;

import com.hx.model.Logging;

public interface LogService {
	List<Logging> findAll();

	Integer pageView();
}
