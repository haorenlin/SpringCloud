package com.haorenlin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.haorenlin.springcloud.entities.Dept;

@RestController
@RequestMapping("/dept")
public class DeptController_Consumer {
	
	private static final String REST_URL_PREFIX = "http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 新增
	 */
	@RequestMapping(value = "/add")
	public boolean add(@RequestBody Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, boolean.class);
	}
    
	/**
	 * 查询
	 */
	@RequestMapping(value = "/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		System.out.println("server 80 get id: "+id);
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
	}
    
	/**
	 * 查询 所有
	 */
	@RequestMapping(value = "/list")
	public List<Dept> list() {
		System.out.println("server 80 list");
		return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
}
