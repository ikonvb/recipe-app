package com.korustlt.recipe.service;

import com.korustlt.recipe.commands.RecipeCommand;
import com.korustlt.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
