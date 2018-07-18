package com.haorenlin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haorenlin.springcloud.entities.Dept;
import com.haorenlin.springcloud.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	/**
	 * 新增
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}
    
	/**
	 * 查询
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}
    
	/**
	 * 查询 所有
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
}
