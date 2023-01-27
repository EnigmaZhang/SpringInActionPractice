package tech.enimga.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.enimga.tacocloud.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
