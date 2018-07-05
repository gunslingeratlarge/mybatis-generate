package cn.kvmial.mybatisgenerate.controller;

import cn.kvmial.mybatisgenerate.pojo.VoteTotal;
import cn.kvmial.mybatisgenerate.service.VoteTotalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;


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

        String[] names = new String[]{
            "张漫群","杨永泰","宋秋烁","金纬","林昭涣","刘雨浓","万奕奇","杨子傲","姚瑶","郑方舟","朱琪琪","陈云霞","覃颖逢","赵婵琴","蔡盛贤","黄丽莎","潘文思","许晓海","黄瑞桦","辛著飞","陈念","李上群","杨乐南","尹慧","林佳鹏","徐丹","张婷美","罗龙宝","曹子一","蔡沓露","陈淦华"
        };
        String[] inst_ids = new String[]{"603030","600452","000958"};
        Random r = new Random();

        for (int i = 0; i < number; i++) {

        }
        return 1;
    }

    @RequestMapping("/listVoteTotal")
    public List<VoteTotal> listVoteTotal() {
        return mapper.selectAll();
    }



}
