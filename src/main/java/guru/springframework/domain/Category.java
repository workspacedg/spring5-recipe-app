package guru.springframework.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public Category setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
        return this;
    }
}
