package com.repository;

import com.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

// Assume you have repositories for each table
public interface AgentRepository extends JpaRepository<Agent, Long> {
}

// Similar repository interfaces for other tables: UserRepository, UserAccountRepository, PolicyCategoryRepository, PolicyCarrierRepository, PolicyInfoRepository
