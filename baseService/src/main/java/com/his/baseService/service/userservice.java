package com.his.baseService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.his.baseService.dao.userdao;
import com.his.baseService.domain.Pager;
import com.his.baseService.domain.User;
import com.his.baseService.domain.Xm;

@RestController
public class userservice {
	@Autowired
	private userdao dao;
	@RequestMapping("/login.do")
 public User login(String uname,String upass) {
		return dao.finduserByNameAndPass(uname, upass);
		
	}

	@RequestMapping("/xm.do")
	 public Pager xm(int page,int rows) {
		int start=(page-1)*rows+1;
		int end =start + rows-1;
		List<Xm> xms=dao.findAll(start, end);
		int total=dao.total();
		return new Pager(total,xms);
			
		}
	@RequestMapping(value="/xmadd.do",method=RequestMethod.POST)
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,rollbackFor=Exception.class)
	 public void xmadd(@RequestBody Xm xm) {
		     dao.xmadd(xm);
			
		}
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,rollbackFor=Exception.class)
	 public void xmremove( String xmbhStr) {
		     String [] xmbhs=xmbhStr.split(",");
		     for(String xmbh:xmbhs) {
;
		    	 dao.xmremove( Integer.parseInt(xmbh));
		     }
			
		}
}
