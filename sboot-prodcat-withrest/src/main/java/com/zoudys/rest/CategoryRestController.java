package com.zoudys.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoudys.entities.Category;
import com.zoudys.services.CategoryService;

@RestController
@RequestMapping(value="/api")
class CategoryRestController {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category c) {
		return categoryService.saveCategory(c);
	}

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public Iterable<Category> listAllCategory() {
		return categoryService.listAllCategory();
	}

	@RequestMapping(value="/list/{id}", method=RequestMethod.GET)
	public Category getCategory(@PathVariable(value="id") String idCategory) {
		return categoryService.getCategory(idCategory);
	}
	
	@RequestMapping(value="/list/{name}", method=RequestMethod.GET)
	public List<Category> findByName(@PathVariable(value="name") String name) {
		return categoryService.findByName(name);
	}
	
}
