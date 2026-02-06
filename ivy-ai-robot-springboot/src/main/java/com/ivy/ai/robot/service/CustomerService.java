package com.ivy.ai.robot.service;


import com.ivy.ai.robot.model.vo.chat.CheckFileReqVO;
import com.ivy.ai.robot.model.vo.chat.CheckFileRspVO;
import com.ivy.ai.robot.model.vo.customerService.*;
import com.ivy.ai.robot.utils.PageResponse;
import com.ivy.ai.robot.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Ivy
 * @Date: 2026/1/25 19:20
 * @Version 1.00
 * @Description：客服
 */
public interface CustomerService {

//    /**
//     * 上传 Markdown 问答文件
//     * @param file
//     * @return
//     */
//    Response<?> uploadMarkdownFile(MultipartFile file);

    /**
     * 删除 Markdown 问答文件
     * @param deleteMarkdownFileReqVO
     * @return
     */
    Response<?> deleteMarkdownFile(DeleteMarkdownFileReqVO deleteMarkdownFileReqVO);

    /**
     * 分页查询 Markdown 问答文件
     * @param findMarkdownFilePageListReqVO
     * @return
     */
    PageResponse<FindMarkdownFilePageListRspVO> findMarkdownFilePageList(FindMarkdownFilePageListReqVO findMarkdownFilePageListReqVO);

    /**
     * 修改  Markdown 问答文件信息
     * @param updateMarkdownFileReqVO
     * @return
     */
    Response<?> updateMarkdownFile(UpdateMarkdownFileReqVO updateMarkdownFileReqVO);

    /**
     * 检查文件是否存在
     * @param checkFileReqVO
     * @return
     */
    Response<CheckFileRspVO> checkFile(CheckFileReqVO checkFileReqVO);

    /**
     * 文件分片上传
     * @param uploadChunkReqVO
     * @return
     */
    Response<?> uploadChunk(UploadChunkReqVO uploadChunkReqVO);

    /**
     * 文件分片合并
     * @param mergeChunkReqVO
     * @return
     */
    Response<?> mergeChunk(MergeChunkReqVO mergeChunkReqVO);
}
