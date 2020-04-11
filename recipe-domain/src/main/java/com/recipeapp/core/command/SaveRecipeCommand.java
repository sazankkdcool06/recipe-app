package com.recipeapp.core.command;

import com.recipeapp.core.model.Recipe;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "with")
public class SaveRecipeCommand extends RecipeCommand{
    private final Recipe recipe;
}