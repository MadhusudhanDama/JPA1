package com.tendecoders.librarymgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tendecoders.librarymgt.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {

}
