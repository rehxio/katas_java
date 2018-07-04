import tdd.User;
import tdd.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryFake implements UserRepository {

    @Override
    public List<User> findAll() {
        return new ArrayList<User>();
    }
}