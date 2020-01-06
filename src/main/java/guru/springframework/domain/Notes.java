package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;


    @OneToOne
    private Recipe recipe;
    private String recipeNotes;
}
