package com.rushedstudio.springbootapp.repositories;

import com.rushedstudio.springbootapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
