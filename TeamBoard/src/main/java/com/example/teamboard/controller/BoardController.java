package com.example.teamboard.controller;

import com.example.teamboard.model.Board;
import com.example.teamboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {
    @Autowired
    private  BoardService boardService;


    @GetMapping("/board")
    @ResponseBody
    public List<Board> findBoards(){
        return boardService.findBoards();
    }

    @PostMapping("/board/insert")
    public void insert(@RequestBody Board board){
        boardService.save(board);
    }

    @PutMapping("/board/update/{id}")
    public void update(@RequestBody Board board){
        boardService.update(board);
    }

    @DeleteMapping("/board/delete/{id}")
    public void delete(@PathVariable("id") int id){
        boardService.delete(id);
    }

}
