package com.crpdev.recipe.repositories;

import com.crpdev.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by rajapandian
 * Date: 13/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.repositories
 **/
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
