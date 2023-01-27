package tech.enimga.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.enimga.tacocloud.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
