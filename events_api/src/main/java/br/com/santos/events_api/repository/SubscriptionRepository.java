package br.com.santos.events_api.repository;

import br.com.santos.events_api.model.Subscription;
import br.com.santos.events_api.model.SubscriptionID;
import org.springframework.data.repository.ListCrudRepository;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {

}
