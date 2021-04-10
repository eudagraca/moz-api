package moz.api.repository;



import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import moz.api.model.Province;

import java.util.List;

@ApplicationScoped
public class ProvinceRepository implements PanacheRepositoryBase<Province, Long> {
}


