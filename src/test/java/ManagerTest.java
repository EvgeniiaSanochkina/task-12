import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void shouldAddNewMovie() {
      Manager manag = new Manager();
        manag.addNewMovie("movie1");
        manag.addNewMovie("movie2");
        manag.addNewMovie("movie3");
        String[] expected = { "movie1", "movie2", "movie3" };
        String[] actual = manag.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseBillboardWithParameter() {
        Manager manag = new Manager(6);
        manag.addNewMovie("movie1");
        manag.addNewMovie("movie2");
        manag.addNewMovie("movie3");
        manag.addNewMovie("movie4");
        manag.addNewMovie("movie5");
        manag.addNewMovie("movie6");
        manag.addNewMovie("movie7");
        manag.addNewMovie("movie8");
        manag.addNewMovie("movie9");
        String[] expected = { "movie9", "movie8", "movie7", "movie6", "movie5", "movie4" };
        String[] actual = manag.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldReverseBillboardWithoutParameter() {
        Manager manag = new Manager();
        manag.addNewMovie("movie1");
        manag.addNewMovie("movie2");
        manag.addNewMovie("movie3");
        manag.addNewMovie("movie4");
        manag.addNewMovie("movie5");
        manag.addNewMovie("movie6");
        manag.addNewMovie("movie7");
        manag.addNewMovie("movie8");
        manag.addNewMovie("movie9");
        manag.addNewMovie("movie10");
        manag.addNewMovie("movie11");
        manag.addNewMovie("movie12");
        manag.addNewMovie("movie13");
        String[] expected = { "movie13", "movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4" };
        String[] actual = manag.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
