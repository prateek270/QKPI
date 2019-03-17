package com.ndh.qkpi.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndh.qkpi.dashboard.entity.Filter;
import java.lang.String;
import java.util.List;

public interface FilterRepository extends JpaRepository<Filter, Integer>{

	List<Filter> findByKpiName(String kpiname);
}
