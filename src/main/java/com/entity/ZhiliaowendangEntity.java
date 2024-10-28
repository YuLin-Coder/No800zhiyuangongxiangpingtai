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
 * 面试通知
 *
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("zhiliaowendang")
public class ZhiliaowendangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhiliaowendangEntity() {

	}

	public ZhiliaowendangEntity(T t) {
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
     * 文档名称
     */
    @TableField(value = "zhiliaowendang_name")

    private String zhiliaowendangName;


    /**
     * 文档图片
     */
    @TableField(value = "zhiliaowendang_photo")

    private String zhiliaowendangPhoto;


    /**
     * 文档大小
     */
    @TableField(value = "zhiliaowendang_daxiao")

    private String zhiliaowendangDaxiao;


    /**
     * 文档下载
     */
    @TableField(value = "zhiliaowendang_file")

    private String zhiliaowendangFile;


    /**
     * 上传人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 文档详情
     */
    @TableField(value = "zhiliaowendang_content")

    private String zhiliaowendangContent;


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
	 * 设置：文档名称
	 */
    public String getZhiliaowendangName() {
        return zhiliaowendangName;
    }


    /**
	 * 获取：文档名称
	 */

    public void setZhiliaowendangName(String zhiliaowendangName) {
        this.zhiliaowendangName = zhiliaowendangName;
    }
    /**
	 * 设置：文档图片
	 */
    public String getZhiliaowendangPhoto() {
        return zhiliaowendangPhoto;
    }


    /**
	 * 获取：文档图片
	 */

    public void setZhiliaowendangPhoto(String zhiliaowendangPhoto) {
        this.zhiliaowendangPhoto = zhiliaowendangPhoto;
    }
    /**
	 * 设置：文档大小
	 */
    public String getZhiliaowendangDaxiao() {
        return zhiliaowendangDaxiao;
    }


    /**
	 * 获取：文档大小
	 */

    public void setZhiliaowendangDaxiao(String zhiliaowendangDaxiao) {
        this.zhiliaowendangDaxiao = zhiliaowendangDaxiao;
    }
    /**
	 * 设置：文档下载
	 */
    public String getZhiliaowendangFile() {
        return zhiliaowendangFile;
    }


    /**
	 * 获取：文档下载
	 */

    public void setZhiliaowendangFile(String zhiliaowendangFile) {
        this.zhiliaowendangFile = zhiliaowendangFile;
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
	 * 设置：文档详情
	 */
    public String getZhiliaowendangContent() {
        return zhiliaowendangContent;
    }


    /**
	 * 获取：文档详情
	 */

    public void setZhiliaowendangContent(String zhiliaowendangContent) {
        this.zhiliaowendangContent = zhiliaowendangContent;
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
        return "Zhiliaowendang{" +
            "id=" + id +
            ", zhiliaowendangName=" + zhiliaowendangName +
            ", zhiliaowendangPhoto=" + zhiliaowendangPhoto +
            ", zhiliaowendangDaxiao=" + zhiliaowendangDaxiao +
            ", zhiliaowendangFile=" + zhiliaowendangFile +
            ", yonghuId=" + yonghuId +
            ", zhiliaowendangContent=" + zhiliaowendangContent +
            ", createTime=" + createTime +
        "}";
    }
}
