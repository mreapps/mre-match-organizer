package com.mreapps.matchorganizer.repository;

import com.mreapps.matchorganizer.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long>
{
    User findByPhoneNumber(String phoneNumber);
}
