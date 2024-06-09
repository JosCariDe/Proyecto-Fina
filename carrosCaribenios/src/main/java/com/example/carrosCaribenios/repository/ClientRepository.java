package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Client;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
