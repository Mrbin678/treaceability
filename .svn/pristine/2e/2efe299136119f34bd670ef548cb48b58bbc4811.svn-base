package com.hx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hx.mapper.PackageDetailMapper;
import com.hx.model.PackageDetail;
import com.hx.service.PackageDetailService;

@Service("packageDetaiService")
public class PackageDetailServiceImpl implements PackageDetailService{
	
	@Autowired
	private PackageDetailMapper packageDetailMapper;

	@Override
	public int create(PackageDetail p) {
		return packageDetailMapper.insertSelective(p);
	}

	@Override
	public List<String> findByPackageCode(String code) {
		return packageDetailMapper.findByPackageCode(code);
	}

}
