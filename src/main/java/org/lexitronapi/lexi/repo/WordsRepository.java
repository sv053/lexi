package org.lexitronapi.lexi.repo;

import org.lexitronapi.lexi.entities.User;
import org.lexitronapi.lexi.entities.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordsRepository extends JpaRepository<Word, Integer> {

    Word findByMorfema(String morfema);
}
