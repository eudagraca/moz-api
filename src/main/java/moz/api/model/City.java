package moz.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.Year;

@Entity
public class City extends PanacheEntity {
    @OneToOne
    private District district;
    private Year evaluate;
}
