package com.company.project.repository;

import com.company.project.entity.Thing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends CrudRepository<Thing, Integer> {
}
