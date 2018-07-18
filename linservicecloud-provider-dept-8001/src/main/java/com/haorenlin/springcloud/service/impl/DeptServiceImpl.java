package com.haorenlin.springcloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haorenlin.springcloud.dao.DeptDao;
import com.haorenlin.springcloud.entities.Dept;
import com.haorenlin.springcloud.service.DeptService;


@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	public List<Dept> list() {
		return deptDao.findAll();
	}

}
