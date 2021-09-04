package com.example.teamboard.mapper;

import com.example.teamboard.model.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO board(userid, title, content, hit) VALUES(#{board.userid}, #{board.title}, #{board.content}, #{board.hit})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int save(@Param("board") Board board);
    //model패키지의 board 엔티티를 @Param 어노테이션을 통해 @Insert 문의 board로 전달하여 쿼리문 시행

    @Select("SELECT * FROM board")
    List<Board> findBoards();

    @Update("UPDATE board SET userid =#{board.userid}, content=#{board.content} ,title = #{board.title} WHERE id = #{board.id}")
    int update(@Param("board") Board board);

    @Delete("DELETE FROM board WHERE id = #{id}")
    void delete(@Param("id") int id);

}
