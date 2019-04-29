package com.spring.buyfind.service;

import com.spring.buyfind.dao.domain.MusicInfo;

import java.util.List;

/**
 * @Author MAI JIAHAO
 * @Date 2019/4/29 14:32
 * @Version 1.0
 */
public interface MusicInfoService {
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo);
}
