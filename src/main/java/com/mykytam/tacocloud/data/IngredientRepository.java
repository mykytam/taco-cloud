package com.mykytam.tacocloud.data;

import com.mykytam.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
