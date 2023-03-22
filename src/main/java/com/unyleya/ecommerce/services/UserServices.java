package com.unyleya.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unyleya.dto.UserDTO;
import com.unyleya.ecommerce.domain.Produto;
import com.unyleya.ecommerce.repository.UseRepository;
import com.unyleya.ecommerce.services.exception.ObjectNotFoundException;

@Service
public class UserServices {

	@Autowired
	private UseRepository repo;

	public List<Produto> findAll() {
		return repo.findAll();
	}

	public Produto findById(String id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Produto insert(Produto obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public Produto update(Produto obj) {
		Produto newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Produto newObj, Produto obj) {
		newObj.setName(obj.getName());
		newObj.setPreco(obj.getPreco());
	}

	public Produto fromDTO(UserDTO objDto) {
		return new Produto(objDto.getId(), objDto.getName(), objDto.getPreco());
	}
}
