package de.ebcsoft.Project;


import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnergyReadingRepository extends MongoRepository<EnergyReadingData, Long> {

    default List<EnergyReadingData> findAll(Sort and) {
        return null;
    }

    // ... otros métodos de consulta y actualización
}