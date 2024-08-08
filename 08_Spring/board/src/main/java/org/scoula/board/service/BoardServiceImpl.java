package org.scoula.board.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.scoula.board.dto.BoardDTO;
import org.springframework.stereotype.Service;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service // Service 역할을 하는 Bean 등록
@RequiredArgsConstructor // final 필드로 생성자 추가
public class BoardServicelmpl implements BoardService {
//    생성자가 하나 있다면 그 생성자로 주입 가능
    final private BoardMapper Mapper;
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getList() {
        log.info("getList..........");
        return Mapper.getList().stream() // BoardVO의 스트림
                .map(BoardDTO::of) // 전부 BoradDTO로 변환 -> BoardDTO의 스트림
                .toList(); // List<BoardDTO> 변환
    }

    @Override
    public BoardDTO get(Long no) {
        log.info("get......" + no);
        BoardDTO board = BoardDTO.of(Mapper.get(no));
        return Optional.ofNullable(board)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void create(BoardDTO board) {

    }

    @Override
    public boolean update(BoardDTO board) {
        return false;
    }

    @Override
    public boolean delete(Long no) {
        return false;
    }
}
