package moz.api.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import io.quarkus.rest.data.panache.MethodProperties;
import moz.api.model.Language;
import moz.api.repository.LanguageRepository;
import javax.ws.rs.Path;
import java.util.List;

@Path("v1/language")
public interface LanguageResource extends PanacheRepositoryResource<LanguageRepository, Language, Long> {

    @MethodProperties()
    List<Language> list(Page page, Sort sort);
}
