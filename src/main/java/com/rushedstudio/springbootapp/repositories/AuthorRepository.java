package com.rushedstudio.springbootapp.repositories;

import com.rushedstudio.springbootapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
