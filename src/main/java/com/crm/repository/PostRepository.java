package com.crm.repository;

import com.crm.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<post, Long> {
  }