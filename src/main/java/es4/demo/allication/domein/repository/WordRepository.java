package es4.demo.allication.domein.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import es4.demo.allication.domein.entity.WordEntity;


@Repository
public interface WordRepository extends CrudRepository<WordEntity, Long>{

}


