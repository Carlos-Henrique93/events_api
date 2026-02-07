package br.com.santos.events_api.repository;

import br.com.santos.events_api.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Integer> {

}
