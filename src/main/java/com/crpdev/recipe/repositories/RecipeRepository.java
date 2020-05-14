package com.crpdev.recipe.repositories;

import com.crpdev.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rajapandian
 * Date: 13/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.repositories
 **/
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
