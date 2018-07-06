import org.junit.Test;
import tdd.ReportWriter;
import tdd.Reporter;
import tdd.UserFinder;

import java.util.Arrays;

public class ReporterTest {

   @Test
    public void should_ (){
        //Arrange
        UserFinder finder = new UserFinder( repository: null ){
            @Override
                    public List<User> findByProfile(String profile) {
                return Arrays.asList(new User(id:0, name:"irrelevant"));
            }
        };
        ReportWriter writer;
        Reporter reporter = new Reporter(finder, writer);

        //Act
        reporter.generateReportBy();
        //Assert
    }

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
