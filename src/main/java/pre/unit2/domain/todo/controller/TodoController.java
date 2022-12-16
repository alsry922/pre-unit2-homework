package pre.unit2.domain.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/")
    public String helloTodo() {
        return "To-do Application";
    }

    @PostMapping("/todos")
    public String postTodo() {
        return "create todo";
    }
}
