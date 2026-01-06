package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Tkt;
import com.example.Repository.TktRepo;

@Service
public class TktServiceImpl implements TktService {

	@Autowired
	TktRepo tr;

	@Override
	public int saveTkt(Tkt ticket) {
	Tkt tkt	= tr.save(ticket);
		return tkt.getId();
	}

	@Override
	public Tkt getTkt(int id) {
		Optional<Tkt> o= tr.findById(id);
		Tkt ticket = o.get();
		return ticket;
	}
	
	
	
	
}
