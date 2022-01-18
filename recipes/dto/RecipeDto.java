package recipes.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RecipeDto {

    private String name;
    private String description;
    private List<String> ingredients;
    private List<String> directions;
}
