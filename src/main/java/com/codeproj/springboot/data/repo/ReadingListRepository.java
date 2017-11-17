package com.codeproj.springboot.data.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codeproj.springboot.data.domain.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}