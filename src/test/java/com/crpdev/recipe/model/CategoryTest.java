package com.crpdev.recipe.model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rajapandian
 * Date: 17/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.model
 **/
@RunWith(JUnit4.class)
public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setup(){
        System.out.println("Setting Up New Category");
        category = new Category();
    }

    @Test
    public void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}
