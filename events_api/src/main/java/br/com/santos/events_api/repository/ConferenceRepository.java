package br.com.santos.events_api.repository;

import br.com.santos.events_api.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {

}
