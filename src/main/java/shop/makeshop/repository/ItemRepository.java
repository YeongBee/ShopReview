package shop.makeshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import shop.makeshop.domain.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {

}
