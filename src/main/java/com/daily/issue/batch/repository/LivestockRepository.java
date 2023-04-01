package com.daily.issue.batch.repository;

import com.daily.issue.batch.domain.Livestock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivestockRepository extends JpaRepository<Livestock, Long> {
}
