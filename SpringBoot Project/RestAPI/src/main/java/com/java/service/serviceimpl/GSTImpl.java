package com.java.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.java.model.GST;
import com.java.repository.GSTRepository;
import com.java.service1.GSTService;

@Service
public class GSTImpl implements GSTService {
	
	private GSTRepository gstRepository;
	
	public GSTImpl(GSTRepository gstRepository) {
		super();
		this.gstRepository = gstRepository;
	}

   @Override
	public GST save(GST gst) {
	
		return gstRepository.save(gst);
	}

}
