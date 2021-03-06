package recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    private String name;
    private String description;
    private List<String> ingredients;
    private List<String> directions;
    private int id;
}
