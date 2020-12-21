package daotest;

import com.exh.movie.dao.MovieDao;
import com.exh.movie.entity.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class MovieDaoTest {

    @Autowired
    private MovieDao dao;

    @Test
    public void testSelectList(){
        List<Movie> movieList = dao.selectList();
        System.out.println(movieList);
    }

    @Test
    public void testSelectOne(){
        Movie movie = dao.selectOne("Jumanji (1995)");
        System.out.println(movie);
    }

    @Test
    public void testInsertOne(){
        int alterNum = dao.insertOne(new Movie(1019,"逃学威龙2","Comedy"));
        System.out.println(alterNum);
    }

    @Test
    public void testUpdateOne(){
        int alterNum = dao.updateOne(new Movie(1019,"逃学威龙3","Comedy"));
        System.out.println(alterNum);
    }

    @Test
    public void testDeleteOne(){
        int alterNum = dao.deleteOne(1019);
        System.out.println(alterNum);
    }
}
