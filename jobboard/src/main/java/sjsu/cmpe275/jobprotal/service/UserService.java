package sjsu.cmpe275.jobprotal.service;

import sjsu.cmpe275.jobprotal.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
