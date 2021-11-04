package org.lexitronapi.lexi.repo;

import org.lexitronapi.lexi.repo.sufijos.Adjetivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdjRepo extends JpaRepository<Adjetivo, Integer> {
}
