package com.example.dao;

import com.example.jdbcex.dao.TodoDAO;
import com.example.jdbcex.domain.TodoVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception{
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception{
        TodoVO vo = TodoVO.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2021,12,31))
                .build();

        todoDAO.insert(vo);
    }

    @Test
    public void testList() throws Exception{
        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(vo -> System.out.println(vo));
    }

    @Test
    public  void testSelectOne() throws Exception{
        Long tno = 1L;
        TodoVO vo = todoDAO.selectOne(tno);

        System.out.println(vo);
    }

    @Test
    public void testUpdateOne() throws Exception{
        TodoVO vo = TodoVO.builder()
                .tno(1L)
                .title("Sample Title...")
                .dueDate(LocalDate.of(2021,12,31))
                .finished(true)
                .build();

        todoDAO.updateOne(vo);
    }
}
