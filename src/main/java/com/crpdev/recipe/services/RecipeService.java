package com.crpdev.recipe.services;

import com.crpdev.recipe.model.Recipe;

import java.util.Set;

/**
 * Created by rajapandian
 * Date: 14/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.services
 **/
public interface RecipeService {
    Set<Recipe> getRecipes();
}
