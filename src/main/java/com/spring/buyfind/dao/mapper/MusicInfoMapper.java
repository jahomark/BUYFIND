package com.spring.buyfind.dao.mapper;

import com.spring.buyfind.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author MAI JIAHAO
 * @Date 2019/4/29 14:32
 * @Version 1.0
 */
public interface MusicInfoMapper {
    @ResultMap("BaseResultMap")
    @Select("select * from music_info")
    List<MusicInfo> selectAll(MusicInfo musicInfo);
}
