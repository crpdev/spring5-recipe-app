package com.crpdev.recipe.repositories;

import com.crpdev.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by rajapandian
 * Date: 13/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.repositories
 **/
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
