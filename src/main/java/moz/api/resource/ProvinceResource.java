package moz.api.resource;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;
import moz.api.model.Province;
import moz.api.repository.ProvinceRepository;
import java.util.List;

@ResourceProperties(path = "v1/province/")
public interface ProvinceResource extends PanacheRepositoryResource<ProvinceRepository, Province, Long> {
    @MethodProperties()
    List<Province> list(Page page, Sort sort);

}