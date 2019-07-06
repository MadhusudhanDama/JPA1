package com.tendecoders.librarymgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tendecoders.librarymgt.model.Library;
import com.tendecoders.librarymgt.repository.LibraryRepository;

@Component
public class Service {

	@Autowired
	LibraryRepository libraryRepository;

	public Library create(Library library) {

		return libraryRepository.save(library);
	}

	public List<Library> getall() {

		return (List<Library>) libraryRepository.findAll();

	}

	public Library get(long id) {

		return libraryRepository.findById(id).get();

	}

	public void delete(int id) {

		Library lib = get(id);
		libraryRepository.delete(lib);

	}

}