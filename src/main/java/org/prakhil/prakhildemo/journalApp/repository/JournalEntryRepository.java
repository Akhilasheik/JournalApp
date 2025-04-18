package org.prakhil.prakhildemo.journalApp.repository;

import org.prakhil.prakhildemo.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
