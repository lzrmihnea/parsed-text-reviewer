package ro.code4.textParserReview.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.code4.textParserReview.entity.ParsedInputField;

@Repository
public interface ParsedInputFieldsRepository extends CrudRepository<ParsedInputField, Serializable> {

}
