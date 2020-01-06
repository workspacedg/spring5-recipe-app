package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;


    public Long getId() {
        return Id;
    }

    public UnitOfMeasure setId(Long id) {
        Id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UnitOfMeasure setDescription(String description) {
        this.description = description;
        return this;
    }


}
