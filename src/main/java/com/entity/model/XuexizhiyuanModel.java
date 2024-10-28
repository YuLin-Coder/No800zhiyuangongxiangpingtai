package com.entity.model;

import com.entity.XuexizhiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习资源
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-06
 */
public class XuexizhiyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资源名称
     */
    private String xuexizhiyuanName;


    /**
     * 资源图片
     */
    private String xuexizhiyuanPhoto;


    /**
     * 资源下载
     */
    private String xuexizhiyuanFile;


    /**
     * 资源分类
     */
    private Integer xuexizhiyuanTypes;


    /**
     * 上传人
     */
    private Integer yonghuId;


    /**
     * 资源详情
     */
    private String xuexizhiyuanContent;


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
	 * 获取：资源名称
	 */
    public String getXuexizhiyuanName() {
        return xuexizhiyuanName;
    }


    /**
	 * 设置：资源名称
	 */
    public void setXuexizhiyuanName(String xuexizhiyuanName) {
        this.xuexizhiyuanName = xuexizhiyuanName;
    }
    /**
	 * 获取：资源图片
	 */
    public String getXuexizhiyuanPhoto() {
        return xuexizhiyuanPhoto;
    }


    /**
	 * 设置：资源图片
	 */
    public void setXuexizhiyuanPhoto(String xuexizhiyuanPhoto) {
        this.xuexizhiyuanPhoto = xuexizhiyuanPhoto;
    }
    /**
	 * 获取：资源下载
	 */
    public String getXuexizhiyuanFile() {
        return xuexizhiyuanFile;
    }


    /**
	 * 设置：资源下载
	 */
    public void setXuexizhiyuanFile(String xuexizhiyuanFile) {
        this.xuexizhiyuanFile = xuexizhiyuanFile;
    }
    /**
	 * 获取：资源分类
	 */
    public Integer getXuexizhiyuanTypes() {
        return xuexizhiyuanTypes;
    }


    /**
	 * 设置：资源分类
	 */
    public void setXuexizhiyuanTypes(Integer xuexizhiyuanTypes) {
        this.xuexizhiyuanTypes = xuexizhiyuanTypes;
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
	 * 获取：资源详情
	 */
    public String getXuexizhiyuanContent() {
        return xuexizhiyuanContent;
    }


    /**
	 * 设置：资源详情
	 */
    public void setXuexizhiyuanContent(String xuexizhiyuanContent) {
        this.xuexizhiyuanContent = xuexizhiyuanContent;
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
