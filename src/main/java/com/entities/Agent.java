package com.entities;

import jakarta.persistence.*;

// Assume you have a table named 'agents'
@Entity
@Table(name = "agents")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "agent_name")
    private String agentName;
    // getters and setters
}

// Similar entity classes for other tables: User, UserAccount, PolicyCategory, PolicyCarrier, PolicyInfo
