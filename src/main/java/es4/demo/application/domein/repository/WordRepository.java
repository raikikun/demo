package es4.demo.application.domein.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import es4.demo.application.domein.entity.WordEntity;


@Repository
public interface WordRepository extends CrudRepository<WordEntity, Long>{

}


