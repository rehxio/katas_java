package tdd;

import java.util.List;

public class UserFinder {
    private UserRepository repository;

    public UserFinder(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findByProfile(String profile){
        // INCOMPLETE
        List<User> allUsers = this.repository.findAll();
        return allUsers;
    }
}
