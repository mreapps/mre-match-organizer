package com.mreapps.matchorganizer.repository;

import com.mreapps.matchorganizer.entity.Message;
import com.mreapps.matchorganizer.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 */
public interface MessageRepository extends PagingAndSortingRepository<Message, Long>
{
    Page<Message> getByUserOrderByMessageSent(User user, Pageable pageable);
}
