package moz.api.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;
import moz.api.model.District;
import moz.api.model.Language;
import moz.api.repository.DistrictRepository;
import moz.api.repository.LanguageRepository;

import java.util.List;

@ResourceProperties(path = "district")
public interface DistrictResource extends PanacheRepositoryResource<DistrictRepository, District, Long> {

    @MethodProperties()
    List<District> list(Page page, Sort sort);
}
