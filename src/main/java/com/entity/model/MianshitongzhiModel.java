package com.entity.model;

import com.entity.MianshitongzhiEntity;

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
public class MianshitongzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 公司名称
     */
    private String mianshitongzhiName;


    /**
     * 职位
     */
    private String mianshitongzhiZhiwei;


    /**
     * 公司图片
     */
    private String mianshitongzhiPhoto;


    /**
     * 公司待遇
     */
    private String mianshitongzhiDaiyu;


    /**
     * 月薪
     */
    private String mianshitongzhiYuexin;


    /**
     * 公司地址
     */
    private String mianshitongzhiDizhi;


    /**
     * 上传人
     */
    private Integer yonghuId;


    /**
     * 公司详情
     */
    private String mianshitongzhiContent;


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
	 * 获取：公司名称
	 */
    public String getMianshitongzhiName() {
        return mianshitongzhiName;
    }


    /**
	 * 设置：公司名称
	 */
    public void setMianshitongzhiName(String mianshitongzhiName) {
        this.mianshitongzhiName = mianshitongzhiName;
    }
    /**
	 * 获取：职位
	 */
    public String getMianshitongzhiZhiwei() {
        return mianshitongzhiZhiwei;
    }


    /**
	 * 设置：职位
	 */
    public void setMianshitongzhiZhiwei(String mianshitongzhiZhiwei) {
        this.mianshitongzhiZhiwei = mianshitongzhiZhiwei;
    }
    /**
	 * 获取：公司图片
	 */
    public String getMianshitongzhiPhoto() {
        return mianshitongzhiPhoto;
    }


    /**
	 * 设置：公司图片
	 */
    public void setMianshitongzhiPhoto(String mianshitongzhiPhoto) {
        this.mianshitongzhiPhoto = mianshitongzhiPhoto;
    }
    /**
	 * 获取：公司待遇
	 */
    public String getMianshitongzhiDaiyu() {
        return mianshitongzhiDaiyu;
    }


    /**
	 * 设置：公司待遇
	 */
    public void setMianshitongzhiDaiyu(String mianshitongzhiDaiyu) {
        this.mianshitongzhiDaiyu = mianshitongzhiDaiyu;
    }
    /**
	 * 获取：月薪
	 */
    public String getMianshitongzhiYuexin() {
        return mianshitongzhiYuexin;
    }


    /**
	 * 设置：月薪
	 */
    public void setMianshitongzhiYuexin(String mianshitongzhiYuexin) {
        this.mianshitongzhiYuexin = mianshitongzhiYuexin;
    }
    /**
	 * 获取：公司地址
	 */
    public String getMianshitongzhiDizhi() {
        return mianshitongzhiDizhi;
    }


    /**
	 * 设置：公司地址
	 */
    public void setMianshitongzhiDizhi(String mianshitongzhiDizhi) {
        this.mianshitongzhiDizhi = mianshitongzhiDizhi;
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
	 * 获取：公司详情
	 */
    public String getMianshitongzhiContent() {
        return mianshitongzhiContent;
    }


    /**
	 * 设置：公司详情
	 */
    public void setMianshitongzhiContent(String mianshitongzhiContent) {
        this.mianshitongzhiContent = mianshitongzhiContent;
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
