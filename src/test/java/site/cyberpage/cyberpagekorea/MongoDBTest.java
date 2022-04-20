package site.cyberpage.cyberpagekorea;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.cyberpage.cyberpagekorea.mongoDto.DataNode;
import site.cyberpage.cyberpagekorea.mongoDto.UserDto;
import site.cyberpage.cyberpagekorea.repository.UserMongoDBRepository;

import java.util.List;

@SpringBootTest
public class MongoDBTest {

    @Autowired
    private UserMongoDBRepository mongoDBRepository;

    @Test
    public void testMongo(){
        System.out.println("출력하면 일단 성공");
        DataNode data = new DataNode("www.naver.com", "gns3163", 123, 443, 50);

        mongoDBRepository.insert(data);

        System.out.println("연산 종료");
    }
}
