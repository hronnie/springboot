package com.codeproj.springboot.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeproj.springboot.data.domain.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}