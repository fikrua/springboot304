package boot303.boot303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoder implements CommandLineRunner {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public void run(String...strings) throws  Exception{
        Course course = new Course("astrophsics","neil d tyson","just a course on strst",3);
        courseRepository.save(course);
        course=new Course("calculese","adesu gemeda","it was a good teacher i have",4);
        courseRepository.save(course);
        course=new Course("ALEJEBRA","ALEMAYEHU","back in elemetry he was good",3);
        courseRepository.save(course);
    }
}
