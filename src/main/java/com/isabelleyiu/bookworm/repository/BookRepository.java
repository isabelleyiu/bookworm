package com.isabelleyiu.bookworm.repository;

import org.bson.types.ObjectId;
import com.isabelleyiu.bookworm.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author syiu
 */

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    public Book findBy_id(ObjectId _id);
}
