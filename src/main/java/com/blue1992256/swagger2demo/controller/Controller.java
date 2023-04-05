package com.blue1992256.swagger2demo.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Api(value = "기본 컨트롤러")
@RestController("/api")
public class Controller {

    @ApiOperation("게시글 조회")
    @GetMapping("/board")
    public Map<String, String> get(@ApiParam(required = true, example = "1") @RequestParam int boardId) {
        Map<String, String> map = new HashMap<>();
        map.put("boardId", String.valueOf(boardId));
        map.put("title", "샘플 제목");
        map.put("content", "샘플 내용");
        return map;
    }

    @ApiOperation("게시글 등록")
    @PostMapping("/board")
    public Map<String, String> post(@ApiParam(required = true) @RequestParam String title,
            @ApiParam(required = true) @RequestParam String content) {
        Map<String, String> map = new HashMap<>();
        map.put("result", "ok");
        map.put("regDate", new Date().toString());
        return map;
    }

    @ApiOperation("게시글 업데이트")
    @PutMapping("/board")
    public Map<String, String> put(@ApiParam(required = true, example = "1") @RequestParam int boardId,
                                   @ApiParam(required = true) @RequestParam String title,
                                   @ApiParam(required = true) @RequestParam String content) {
        Map<String, String> map = new HashMap<>();
        map.put("boardId", String.valueOf(boardId));
        map.put("result", "ok");
        map.put("updateDate", new Date().toString());
        return map;
    }

    @ApiOperation("게시글 삭제")
    @DeleteMapping("/board")
    public Map<String, String> delete(@ApiParam(required = true, example = "1") @RequestParam int boardId) {
        Map<String, String> map = new HashMap<>();
        map.put("result", "ok");
        map.put("updateDate", new Date().toString());
        return map;
    }
}
