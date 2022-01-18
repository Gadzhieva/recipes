package recipes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import recipes.dto.RecipeDto;
import recipes.entity.Recipe;
import recipes.mapper.RecipeMapper;
import recipes.repository.RecipeRepository;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public int addRecipe(RecipeDto recipeDto) {
        Recipe recipe = recipeMapper.toRecipe(recipeDto);
        int newId = recipeRepository.getNextId();
        recipe.setId(newId);
        recipeRepository.getRecipes().add(recipe);
        recipeRepository.setRecipesLastId(newId);
        return newId;
    }

    private Recipe getRecipeById(int id) {
        for (Recipe recipe : recipeRepository.getRecipes()) {
            if (recipe.getId() == id) {
                return recipe;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public RecipeDto getRecipeDto(int id) {
        return recipeMapper.toRecipeDto(getRecipeById(id));
    }
}
