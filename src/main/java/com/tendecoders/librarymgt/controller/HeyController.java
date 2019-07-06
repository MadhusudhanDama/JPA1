
package com.tendecoders.librarymgt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendecoders.librarymgt.model.Library;
import com.tendecoders.librarymgt.service.Service;

@RestController
@RequestMapping("/Libry")
public class HeyController {
	@Autowired
	private Service service;

	@PostMapping("/create")
	private Library create(@RequestBody Library library) {
		return service.create(library);
	}

	@GetMapping("/getall")
	private List<Library> getall() {
		return service.getall();
	}

	@GetMapping("get/{Id}")
	private Library getid(@PathVariable("Id") long Id) {
		return service.get(Id);
	}

	@DeleteMapping("delete/{Id}")
	private void delete(@PathVariable("Id") int id) {
		service.delete(id);
	}

	@PostMapping("update/{Id}")
	private void update(@PathVariable("Id") int id, @RequestBody Library library) {
		// service.up(id, library);
	}
}
