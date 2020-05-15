package com.crpdev.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by rajapandian
 * Date: 11/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.model
 **/
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
