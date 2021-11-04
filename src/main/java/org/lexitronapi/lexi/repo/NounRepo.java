package org.lexitronapi.lexi.repo;

import org.lexitronapi.lexi.repo.sufijos.Sustantivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NounRepo extends JpaRepository<Sustantivo, Integer> {
}
