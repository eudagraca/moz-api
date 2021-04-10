package moz.api.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import moz.api.model.Language;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LanguageRepository implements PanacheRepositoryBase<Language, Long> {
}
