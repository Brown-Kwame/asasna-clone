package com.example.asana.repository;

import com.example.asana.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    
    List<Portfolio> findByUserId(Long userId);
    
    Optional<Portfolio> findByUserIdAndId(Long userId, Long id);
} 