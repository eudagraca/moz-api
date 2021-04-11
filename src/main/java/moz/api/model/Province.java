package moz.api.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Province extends Base {
    private String gentile;
    @Column(length = 5000, unique = true)

    @OneToMany
    private Set<District> districts;

    @OneToMany
    private Set<Language> languages;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getGentile() {
        return this.gentile;
    }

    public void setGentile(String gentile) {
        this.gentile = gentile;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }
}
