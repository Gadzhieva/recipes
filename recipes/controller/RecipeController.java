package recipes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import recipes.dto.RecipeDto;
import recipes.dto.RecipeIdDto;
import recipes.service.RecipeService;

@RestController
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("/api/recipe/new")
    public RecipeIdDto addRecipe(@RequestBody RecipeDto recipeDto) {
        return new RecipeIdDto(recipeService.addRecipe(recipeDto));
    }

    @GetMapping("/api/recipe/{id}")
    public RecipeDto getRecipe(@PathVariable int id) {
        return recipeService.getRecipeDto(id);
    }
}
