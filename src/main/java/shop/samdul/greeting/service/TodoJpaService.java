package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.mapper.TodoMapper;

import java.util.List;

@Service
public class TodoJpaService {

    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTodos() {
        System.out.println("[service] findAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]: " + todos.size());
        return todos;
    }

    public TodoEntity findById(Integer id) {
        return todoMapper.findById(id);
    }

    public void createEntity(TodoEntity todoEntity){
        System.out.println("[SERVICE] createEntity");
        System.out.println("[SERVICE] "+todoEntity.toString());
        todoMapper.createEntity(todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    }

    public void deleteById(int id){
        System.out.println("[SERVICE] deleteById");
        todoMapper.deleteById(id);
    }

    public void updateById(TodoEntity todoEntity){
        System.out.println("[SERVICE] updateById");
        todoMapper.updateById(todoEntity.getId(), todoEntity.getSubject(), todoEntity.getBody(), todoEntity.getCompleted());
    }


}
