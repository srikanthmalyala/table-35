package com.hack.hacktron.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hack.hacktron.vo.CustomQueue;

@Service
public interface QueeService {

	List<CustomQueue> getAllQuees();

}
