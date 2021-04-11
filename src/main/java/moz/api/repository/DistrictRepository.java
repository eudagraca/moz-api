package moz.api.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import moz.api.model.District;
import moz.api.model.Province;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DistrictRepository implements PanacheRepositoryBase<District, Long> {
}


