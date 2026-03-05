package com.swetonyancelmo.service;

import com.swetonyancelmo.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
