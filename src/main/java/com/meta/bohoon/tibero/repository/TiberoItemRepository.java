package com.meta.bohoon.tibero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meta.bohoon.tibero.entity.TiberoItem;

public interface TiberoItemRepository extends JpaRepository<TiberoItem, Long> {
}