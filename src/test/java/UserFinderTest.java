import org.junit.Test;
import tdd.User;
import tdd.UserFinder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class UserFinderTest {

    @Test
    public void should_return_empty_list_when_there_are_no_users (){
        //Arrange
        UserRepositoryFake userRepositoryFake = new UserRepositoryFake();
        UserFinder userFinder = new UserFinder(userRepositoryFake);
        //Act
        List<User> users = userFinder.findByProfile("irrelevant");
        //Assert
        assertThat( users.size() ).isEqualTo( 0 );
    }
}
