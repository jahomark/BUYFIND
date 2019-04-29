package com.spring.buyfind.service.impl;

import com.spring.buyfind.dao.domain.MusicInfo;
import com.spring.buyfind.dao.mapper.MusicInfoMapper;
import com.spring.buyfind.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author MAI JIAHAO
 * @Date 2019/4/29 14:26
 * @Version 1.0
 */
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo){
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }
}
