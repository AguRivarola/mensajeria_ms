package com.cintelink.message.repository;

import com.cintelink.message.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
