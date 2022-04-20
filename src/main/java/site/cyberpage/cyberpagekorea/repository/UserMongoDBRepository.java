package site.cyberpage.cyberpagekorea.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import site.cyberpage.cyberpagekorea.mongoDto.DataNode;

@Repository
public interface UserMongoDBRepository extends MongoRepository<DataNode, String> {
//    public DataNode findByName(String name);
}
