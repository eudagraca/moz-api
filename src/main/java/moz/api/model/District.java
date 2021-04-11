package moz.api.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class District extends Base {
    private Integer postalCode;

    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    private Province province;

    @OneToMany
    @JsonIdentityReference(alwaysAsId = true)
    private Set<Language> languages;

    @OneToMany
    @JsonIgnore
    private Set<AdministrativePost> administrativePosts;

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Set<AdministrativePost> getAdministrativePosts() {
        return administrativePosts;
    }

    public void setAdministrativePosts(Set<AdministrativePost> administrativePosts) {
        this.administrativePosts = administrativePosts;
    }
}
