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
@TableName("mianshitongzhi")
public class MianshitongzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MianshitongzhiEntity() {

	}

	public MianshitongzhiEntity(T t) {
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
     * 公司名称
     */
    @TableField(value = "mianshitongzhi_name")

    private String mianshitongzhiName;


    /**
     * 职位
     */
    @TableField(value = "mianshitongzhi_zhiwei")

    private String mianshitongzhiZhiwei;


    /**
     * 公司图片
     */
    @TableField(value = "mianshitongzhi_photo")

    private String mianshitongzhiPhoto;


    /**
     * 公司待遇
     */
    @TableField(value = "mianshitongzhi_daiyu")

    private String mianshitongzhiDaiyu;


    /**
     * 月薪
     */
    @TableField(value = "mianshitongzhi_yuexin")

    private String mianshitongzhiYuexin;


    /**
     * 公司地址
     */
    @TableField(value = "mianshitongzhi_dizhi")

    private String mianshitongzhiDizhi;


    /**
     * 上传人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 公司详情
     */
    @TableField(value = "mianshitongzhi_content")

    private String mianshitongzhiContent;


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
	 * 设置：公司名称
	 */
    public String getMianshitongzhiName() {
        return mianshitongzhiName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setMianshitongzhiName(String mianshitongzhiName) {
        this.mianshitongzhiName = mianshitongzhiName;
    }
    /**
	 * 设置：职位
	 */
    public String getMianshitongzhiZhiwei() {
        return mianshitongzhiZhiwei;
    }


    /**
	 * 获取：职位
	 */

    public void setMianshitongzhiZhiwei(String mianshitongzhiZhiwei) {
        this.mianshitongzhiZhiwei = mianshitongzhiZhiwei;
    }
    /**
	 * 设置：公司图片
	 */
    public String getMianshitongzhiPhoto() {
        return mianshitongzhiPhoto;
    }


    /**
	 * 获取：公司图片
	 */

    public void setMianshitongzhiPhoto(String mianshitongzhiPhoto) {
        this.mianshitongzhiPhoto = mianshitongzhiPhoto;
    }
    /**
	 * 设置：公司待遇
	 */
    public String getMianshitongzhiDaiyu() {
        return mianshitongzhiDaiyu;
    }


    /**
	 * 获取：公司待遇
	 */

    public void setMianshitongzhiDaiyu(String mianshitongzhiDaiyu) {
        this.mianshitongzhiDaiyu = mianshitongzhiDaiyu;
    }
    /**
	 * 设置：月薪
	 */
    public String getMianshitongzhiYuexin() {
        return mianshitongzhiYuexin;
    }


    /**
	 * 获取：月薪
	 */

    public void setMianshitongzhiYuexin(String mianshitongzhiYuexin) {
        this.mianshitongzhiYuexin = mianshitongzhiYuexin;
    }
    /**
	 * 设置：公司地址
	 */
    public String getMianshitongzhiDizhi() {
        return mianshitongzhiDizhi;
    }


    /**
	 * 获取：公司地址
	 */

    public void setMianshitongzhiDizhi(String mianshitongzhiDizhi) {
        this.mianshitongzhiDizhi = mianshitongzhiDizhi;
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
	 * 设置：公司详情
	 */
    public String getMianshitongzhiContent() {
        return mianshitongzhiContent;
    }


    /**
	 * 获取：公司详情
	 */

    public void setMianshitongzhiContent(String mianshitongzhiContent) {
        this.mianshitongzhiContent = mianshitongzhiContent;
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
        return "Mianshitongzhi{" +
            "id=" + id +
            ", mianshitongzhiName=" + mianshitongzhiName +
            ", mianshitongzhiZhiwei=" + mianshitongzhiZhiwei +
            ", mianshitongzhiPhoto=" + mianshitongzhiPhoto +
            ", mianshitongzhiDaiyu=" + mianshitongzhiDaiyu +
            ", mianshitongzhiYuexin=" + mianshitongzhiYuexin +
            ", mianshitongzhiDizhi=" + mianshitongzhiDizhi +
            ", yonghuId=" + yonghuId +
            ", mianshitongzhiContent=" + mianshitongzhiContent +
            ", createTime=" + createTime +
        "}";
    }
}
