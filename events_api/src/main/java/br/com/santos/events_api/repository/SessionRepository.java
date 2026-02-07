package br.com.santos.events_api.repository;

import br.com.santos.events_api.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {

}
