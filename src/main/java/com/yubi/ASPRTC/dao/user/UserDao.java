package com.yubi.ASPRTC.dao.user;

import com.yubi.ASPRTC.model.User;

public interface UserDao {
    User findByUserId(String userId);

    User findByUserName(String username);

}
