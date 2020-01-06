package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;


    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public Notes setId(Long id) {
        this.id = id;
        return this;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Notes setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public Notes setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
        return this;
    }
}
