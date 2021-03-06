package com.zoudys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.zoudys.entities.Category;
import com.zoudys.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category saveCategory(Category c) {

		return categoryRepository.save(c);
	}

	public Iterable<Category> listAllCategory() {

		return categoryRepository.findAll();
	}

	public Category getCategory(String idCategory) {

		return categoryRepository.findOne(idCategory);
	}

	public List<Category> findByName(String name) {
		
		return categoryRepository.findByName(name);
	}

}
