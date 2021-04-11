package moz.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Locale extends Base{

    @ManyToOne
    private AdministrativePost administrativePost;

    @OneToOne
    private Language language;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public AdministrativePost getAdministrativePost() {
        return administrativePost;
    }

    public void setAdministrativePost(AdministrativePost administrativePost) {
        this.administrativePost = administrativePost;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
