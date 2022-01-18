package recipes.mapper;

import org.mapstruct.Mapper;
import recipes.dto.RecipeDto;
import recipes.entity.Recipe;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    Recipe toRecipe(RecipeDto recipeDto);

    RecipeDto toRecipeDto(Recipe recipe);
}
