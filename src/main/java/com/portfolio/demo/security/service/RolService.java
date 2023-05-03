package com.portfolio.demo.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.demo.security.entity.Rol;
import com.portfolio.demo.security.enums.RoleName;
import com.portfolio.demo.security.repository.iRolRepository;

@Service
@Transactional
public class RolService {

	@Autowired
	iRolRepository irolRepository;
	
	public Optional<Rol> getRolByName(RoleName roleName){
		return irolRepository.findByRoleName(roleName);
	}
	
	public void save(Rol rol) {
		irolRepository.save(rol);
	}
		
}
