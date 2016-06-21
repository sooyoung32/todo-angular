package kr.co.kware.todo.mapper;

import java.util.List;

import kr.co.kware.todo.vo.Todo;

public interface TodoMapper {

    int insertTodo(Todo todo);

    int updateTodo(Todo todo);

    int updateHasDone(Todo todo);

    int deleteTodo(int todoId);

    List<Todo> selectTodoList();

    Todo selectTodoItem(int todoId);

    int countHasNotBeenDone();


}
