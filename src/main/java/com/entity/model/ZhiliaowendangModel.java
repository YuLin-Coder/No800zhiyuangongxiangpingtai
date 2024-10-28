package com.entity.model;

import com.entity.ZhiliaowendangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 面试通知
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-06
 */
public class ZhiliaowendangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 文档名称
     */
    private String zhiliaowendangName;


    /**
     * 文档图片
     */
    private String zhiliaowendangPhoto;


    /**
     * 文档大小
     */
    private String zhiliaowendangDaxiao;


    /**
     * 文档下载
     */
    private String zhiliaowendangFile;


    /**
     * 上传人
     */
    private Integer yonghuId;


    /**
     * 文档详情
     */
    private String zhiliaowendangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：文档名称
	 */
    public String getZhiliaowendangName() {
        return zhiliaowendangName;
    }


    /**
	 * 设置：文档名称
	 */
    public void setZhiliaowendangName(String zhiliaowendangName) {
        this.zhiliaowendangName = zhiliaowendangName;
    }
    /**
	 * 获取：文档图片
	 */
    public String getZhiliaowendangPhoto() {
        return zhiliaowendangPhoto;
    }


    /**
	 * 设置：文档图片
	 */
    public void setZhiliaowendangPhoto(String zhiliaowendangPhoto) {
        this.zhiliaowendangPhoto = zhiliaowendangPhoto;
    }
    /**
	 * 获取：文档大小
	 */
    public String getZhiliaowendangDaxiao() {
        return zhiliaowendangDaxiao;
    }


    /**
	 * 设置：文档大小
	 */
    public void setZhiliaowendangDaxiao(String zhiliaowendangDaxiao) {
        this.zhiliaowendangDaxiao = zhiliaowendangDaxiao;
    }
    /**
	 * 获取：文档下载
	 */
    public String getZhiliaowendangFile() {
        return zhiliaowendangFile;
    }


    /**
	 * 设置：文档下载
	 */
    public void setZhiliaowendangFile(String zhiliaowendangFile) {
        this.zhiliaowendangFile = zhiliaowendangFile;
    }
    /**
	 * 获取：上传人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：上传人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：文档详情
	 */
    public String getZhiliaowendangContent() {
        return zhiliaowendangContent;
    }


    /**
	 * 设置：文档详情
	 */
    public void setZhiliaowendangContent(String zhiliaowendangContent) {
        this.zhiliaowendangContent = zhiliaowendangContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
