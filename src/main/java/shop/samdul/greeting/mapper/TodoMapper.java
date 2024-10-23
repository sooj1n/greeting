package shop.samdul.greeting.mapper;

import org.apache.ibatis.annotations.Mapper;
import shop.samdul.greeting.entity.TodoEntity;
import java.util.List;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();

    TodoEntity findById(Integer id);
    void createEntity(String subject, String body, Boolean completed);
    void deleteById(int id);
    void updateById(int id, String subject, String body, Boolean completed);

}
