package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.service.TodoService;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/list")
    public List<TodoEntity> list(){
        System.out.println("[Controller]");
        List<TodoEntity> r = todoService.getTodos();
        return r;
    }
    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id){
        TodoEntity r = todoService.findById(id);
        return r;
    }

    //C
    @PostMapping("/todos")
    public void createEntity(@RequestBody TodoEntity todoEntity){
        System.out.println("[Controller] "+todoEntity.toString());
        todoService.createEntity(todoEntity);
        System.out.println("insert success");
    }

    // U
    @DeleteMapping("/todos/{id}")
    public void deleteById(@PathVariable int id){
        todoService.deleteById(id);
        System.out.println(id + " delete success");
    }

    // D
    @PutMapping("/todos/{id}")
    public void updateById(@PathVariable int id, @RequestBody TodoEntity todoEntity){
        todoEntity.setId(id);

        System.out.println("[Controller] "+todoEntity.toString());
        todoService.updateById(todoEntity);
        System.out.println("update success");
    }

}
