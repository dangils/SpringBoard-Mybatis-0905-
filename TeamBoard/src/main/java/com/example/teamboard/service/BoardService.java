package com.example.teamboard.service;

import com.example.teamboard.mapper.BoardMapper;
import com.example.teamboard.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;


    public List<Board> findBoards(){
        return boardMapper.findBoards();
    }

    public void save(Board board){
        boardMapper.save(board);
    }

    public void update(Board board){
        boardMapper.update(board);
    }

    public void delete(int id){
        boardMapper.delete(id);
    }

}
