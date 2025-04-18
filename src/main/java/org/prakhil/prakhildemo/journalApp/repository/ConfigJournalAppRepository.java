package org.prakhil.prakhildemo.journalApp.repository;

import org.prakhil.prakhildemo.journalApp.entity.ConfigJournalAppEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
