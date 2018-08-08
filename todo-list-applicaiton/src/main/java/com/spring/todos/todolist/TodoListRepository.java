package com.spring.todos.todolist;

import org.springframework.data.repository.CrudRepository;

import com.spring.todos.user.User;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Matt Stine
 */
public interface TodoListRepository extends CrudRepository<TodoList, Long> {
    List<TodoList> findAllByOwner(User owner);

    TodoList findOneByIdAndOwner(Long id, User owner);

    @Transactional
    void deleteByIdAndOwner(Long id, User owner);
}
