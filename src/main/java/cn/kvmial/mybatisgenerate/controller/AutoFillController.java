package cn.kvmial.mybatisgenerate.controller;

import cn.kvmial.mybatisgenerate.pojo.VoteTotal;
import cn.kvmial.mybatisgenerate.service.VoteTotalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AutoFillController {
    @Autowired
    VoteTotalMapper mapper;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/fill/{number}")
    public int fill(@PathVariable int number) {

        for (int i = 0; i < number; i++) {

        }
        return 1;
    }

    @RequestMapping("/listVoteTotal")
    public List<VoteTotal> listVoteTotal() {
        return mapper.selectAll();
    }



}
