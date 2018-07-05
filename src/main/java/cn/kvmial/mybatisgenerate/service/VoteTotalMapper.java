package cn.kvmial.mybatisgenerate.service;

import cn.kvmial.mybatisgenerate.pojo.VoteTotal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface VoteTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VoteTotal record);

    int insertSelective(VoteTotal record);

    VoteTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VoteTotal record);

    int updateByPrimaryKey(VoteTotal record);

    @Select("select * from vote_total")
    List<VoteTotal> selectAll();
}