package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学习资源
 *
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("xuexizhiyuan")
public class XuexizhiyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexizhiyuanEntity() {

	}

	public XuexizhiyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Xuexizhiyuan{" +
            "id=" + id +
            ", xuexizhiyuanName=" + xuexizhiyuanName +
            ", xuexizhiyuanPhoto=" + xuexizhiyuanPhoto +
            ", xuexizhiyuanFile=" + xuexizhiyuanFile +
            ", xuexizhiyuanTypes=" + xuexizhiyuanTypes +
            ", yonghuId=" + yonghuId +
            ", xuexizhiyuanContent=" + xuexizhiyuanContent +
            ", createTime=" + createTime +
        "}";
    }
}
