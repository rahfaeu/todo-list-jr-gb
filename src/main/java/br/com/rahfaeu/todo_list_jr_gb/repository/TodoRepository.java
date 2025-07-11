package br.com.rahfaeu.todo_list_jr_gb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rahfaeu.todo_list_jr_gb.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
