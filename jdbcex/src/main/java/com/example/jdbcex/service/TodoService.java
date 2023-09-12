package com.example.jdbcex.service;

import com.example.jdbcex.dao.TodoDAO;
import com.example.jdbcex.domain.TodoVO;
import com.example.jdbcex.dto.TodoDTO;
import com.example.jdbcex.util.MapperUtil;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

@Log4j2
public enum TodoService {
    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService(){
        this.dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public void register(TodoDTO todoDTO) throws Exception{
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);

        //System.out.println("todoVO: " + todoVO);
        log.info(todoVO);

        dao.insert(todoVO);
    }
}
