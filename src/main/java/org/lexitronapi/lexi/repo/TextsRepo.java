package org.lexitronapi.lexi.repo;

import org.lexitronapi.lexi.entities.Txt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextsRepo extends JpaRepository<Txt, Integer> {
}
