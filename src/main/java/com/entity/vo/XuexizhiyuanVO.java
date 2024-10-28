package com.entity.vo;

import com.entity.XuexizhiyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习资源
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("xuexizhiyuan")
public class XuexizhiyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资源名称
     */

    @TableField(value = "xuexizhiyuan_name")
    private String xuexizhiyuanName;


    /**
     * 资源图片
     */

    @TableField(value = "xuexizhiyuan_Photo")
    private String xuexizhiyuanPhoto;


    /**
     * 资源下载
     */

    @TableField(value = "xuexizhiyuan_file")
    private String xuexizhiyuanFile;


    /**
     * 资源分类
     */

    @TableField(value = "xuexizhiyuan_types")
    private Integer xuexizhiyuanTypes;


    /**
     * 上传人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 资源详情
     */

    @TableField(value = "xuexizhiyuan_content")
    private String xuexizhiyuanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：资源名称
	 */
    public String getXuexizhiyuanName() {
        return xuexizhiyuanName;
    }


    /**
	 * 获取：资源名称
	 */

    public void setXuexizhiyuanName(String xuexizhiyuanName) {
        this.xuexizhiyuanName = xuexizhiyuanName;
    }
    /**
	 * 设置：资源图片
	 */
    public String getXuexizhiyuanPhoto() {
        return xuexizhiyuanPhoto;
    }


    /**
	 * 获取：资源图片
	 */

    public void setXuexizhiyuanPhoto(String xuexizhiyuanPhoto) {
        this.xuexizhiyuanPhoto = xuexizhiyuanPhoto;
    }
    /**
	 * 设置：资源下载
	 */
    public String getXuexizhiyuanFile() {
        return xuexizhiyuanFile;
    }


    /**
	 * 获取：资源下载
	 */

    public void setXuexizhiyuanFile(String xuexizhiyuanFile) {
        this.xuexizhiyuanFile = xuexizhiyuanFile;
    }
    /**
	 * 设置：资源分类
	 */
    public Integer getXuexizhiyuanTypes() {
        return xuexizhiyuanTypes;
    }


    /**
	 * 获取：资源分类
	 */

    public void setXuexizhiyuanTypes(Integer xuexizhiyuanTypes) {
        this.xuexizhiyuanTypes = xuexizhiyuanTypes;
    }
    /**
	 * 设置：上传人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：上传人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：资源详情
	 */
    public String getXuexizhiyuanContent() {
        return xuexizhiyuanContent;
    }


    /**
	 * 获取：资源详情
	 */

    public void setXuexizhiyuanContent(String xuexizhiyuanContent) {
        this.xuexizhiyuanContent = xuexizhiyuanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
