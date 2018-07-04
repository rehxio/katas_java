import tdd.User;
import tdd.UserRepository;

import java.util.List;

public class UserRepositoryFake implements UserRepository {

    @Override
    public List<User> findAll() {
        return null;
    }
}