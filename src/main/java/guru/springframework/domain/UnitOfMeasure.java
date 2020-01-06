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

    private String uom;

    Ingredient ingredient;

    public Long getId() {
        return Id;
    }

    public UnitOfMeasure setId(Long id) {
        Id = id;
        return this;
    }

    public String getUom() {
        return uom;
    }

    public UnitOfMeasure setUom(String uom) {
        this.uom = uom;
        return this;
    }

}
