package tacos.data;

import tacos.TacoOrder;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

  TacoOrder save(TacoOrder order);

  Optional<TacoOrder> findById(Long id);

}
