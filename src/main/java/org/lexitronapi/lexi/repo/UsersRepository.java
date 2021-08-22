package org.lexitronapi.lexi.repo;

import org.lexitronapi.lexi.entiities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);
}
