package com.his.baseService.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.his.baseService.domain.Pager;
import com.his.baseService.domain.User;
import com.his.baseService.domain.Xm;

@Repository
public class userdao extends SqlSessionDaoSupport {
	@Autowired
	public void setFactory(SqlSessionFactory factory) {
		super.setSqlSessionFactory(
factory);
		
	}
	
	
public User finduserByNameAndPass(String uname,String upass) {
	User user=new User();
	user.setUname(uname);
	user.setUpass(upass);
	return super.getSqlSession().selectOne("user.fidnuserByNameAndPass", user);
}


public int total() {
	return super.getSqlSession().selectOne("xm.total");
	
}
public List<Xm>findAll(int start,int end) {
Map<String,Integer> params=new HashMap<String,Integer>();
params.put("start", start);
params.put("end", end);
return super.getSqlSession().selectList("xm.findall",params);
}

public void xmadd(Xm xm) {
    super.getSqlSession().insert("xm.save",xm);
}
public void xmremove(int xmbh) {
    super.getSqlSession().update("xm.remove",xmbh);
}

}
