package recipes.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import recipes.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class RecipeRepository {

    private final List<Recipe> recipes = new ArrayList<>();
    private int recipesLastId = 0;

    public int getNextId() {
        return recipesLastId + 1;
    }
}
