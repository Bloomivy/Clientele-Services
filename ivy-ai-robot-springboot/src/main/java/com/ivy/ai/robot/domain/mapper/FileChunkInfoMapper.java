package com.ivy.ai.robot.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ivy.ai.robot.domain.dos.FileChunkInfoDO;
import java.util.List;

/**
 * @Author: Ivy
 * @Date: 2026/2/5 21:43
 * @Version 1.00
 * @Description：分片信息表
 */
public interface FileChunkInfoMapper extends BaseMapper<FileChunkInfoDO> {
    /**
     * 根据文件 MD5 值查询所有已上传的分片
     * @param fileMd5
     * @return
     */
    default List<FileChunkInfoDO> selecChunkedtList(String fileMd5) {
        return selectList(
                Wrappers.<FileChunkInfoDO>lambdaQuery()
                        .eq(FileChunkInfoDO::getFileMd5, fileMd5)
                        .orderByAsc(FileChunkInfoDO::getChunkNumber)
        );
    }
}