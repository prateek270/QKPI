package com.ndh.qkpi.dashboard.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndh.qkpi.dashboard.entity.DummyGraph;


public interface DummyGraphRepository extends JpaRepository<DummyGraph, Integer> {
	
	public List<DummyGraph> findAllByOrderByIdAsc();
}
