package com.crpdev.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by rajapandian
 * Date: 11/05/20
 * Project: spring5-recipe-app
 * Package: com.crpdev.recipe.model
 **/
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    // TODO: 11/05/20
    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;
    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(final String description, final BigDecimal amount, final UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(final String description, final BigDecimal amount, final UnitOfMeasure uom, final Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }
}
