package es4.demo.allication.domein.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordRepository extends CrudRepository<WordRepository, Long>{

}


