package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    //todo add
    //private Difficulty difficulty;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    public Long getId() {
        return id;
    }

    public Recipe setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Recipe setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public Recipe setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
        return this;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public Recipe setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
        return this;
    }

    public Integer getServings() {
        return servings;
    }

    public Recipe setServings(Integer servings) {
        this.servings = servings;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Recipe setSource(String source) {
        this.source = source;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Recipe setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDirections() {
        return directions;
    }

    public Recipe setDirections(String directions) {
        this.directions = directions;
        return this;
    }

    public Byte[] getImage() {
        return image;
    }

    public Recipe setImage(Byte[] image) {
        this.image = image;
        return this;
    }

    public Notes getNotes() {
        return notes;
    }

    public Recipe setNotes(Notes notes) {
        this.notes = notes;
        return this;
    }
}
