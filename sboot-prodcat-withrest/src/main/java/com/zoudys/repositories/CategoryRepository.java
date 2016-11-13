package com.zoudys.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zoudys.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, String>{

	public List<Category> findByName(String name);
}

