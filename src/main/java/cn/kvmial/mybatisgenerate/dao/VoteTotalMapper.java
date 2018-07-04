package cn.kvmial.mybatisgenerate.dao;

import cn.kvmial.mybatisgenerate.pojo.VoteTotal;

public interface VoteTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VoteTotal record);

    int insertSelective(VoteTotal record);

    VoteTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VoteTotal record);

    int updateByPrimaryKey(VoteTotal record);
}