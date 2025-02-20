package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.IRolRepository;
import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.service.IRolService;


@Service("rolservice")
public class Rolservice implements IRolService {
	
	@Autowired
	@Qualifier("rolrepository")
	private IRolRepository rolRepository;
	
	@Override
	public List<Rol> listAllRol() {		
		return rolRepository.findAll();
	}
	
	@Override
	public Rol addRol(Rol rol) {
		return rolRepository.save(rol);
	}

	@Override
	public List<Rol> findAllRolByname(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
