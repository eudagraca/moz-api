package moz.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class AdministrativePost extends Base {

    @ManyToOne
    private District district;

    @OneToMany
    private Set<Language> languages;

    @OneToMany
    private Set<Locale> locales;

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Set<Locale> getLocales() {
        return locales;
    }

    public void setLocales(Set<Locale> locales) {
        this.locales = locales;
    }
}
