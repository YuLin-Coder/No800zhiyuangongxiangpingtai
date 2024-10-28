package com.entity.view;

import com.entity.MianshitongzhiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 面试通知收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("mianshitongzhi_collection")
public class MianshitongzhiCollectionView extends MianshitongzhiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 mianshitongzhi
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 所属部门名称
			*/
			private Integer bumenTypes;
				/**
				* 所属部门名称的值
				*/
				private String bumenValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 身份
			*/
			private String yonghuRole;

	public MianshitongzhiCollectionView() {

	}

	public MianshitongzhiCollectionView(MianshitongzhiCollectionEntity mianshitongzhiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, mianshitongzhiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set mianshitongzhi
					/**
					* 获取： 公司名称
					*/
					public String getMianshitongzhiName() {
						return mianshitongzhiName;
					}
					/**
					* 设置： 公司名称
					*/
					public void setMianshitongzhiName(String mianshitongzhiName) {
						this.mianshitongzhiName = mianshitongzhiName;
					}
					/**
					* 获取： 职位
					*/
					public String getMianshitongzhiZhiwei() {
						return mianshitongzhiZhiwei;
					}
					/**
					* 设置： 职位
					*/
					public void setMianshitongzhiZhiwei(String mianshitongzhiZhiwei) {
						this.mianshitongzhiZhiwei = mianshitongzhiZhiwei;
					}
					/**
					* 获取： 公司图片
					*/
					public String getMianshitongzhiPhoto() {
						return mianshitongzhiPhoto;
					}
					/**
					* 设置： 公司图片
					*/
					public void setMianshitongzhiPhoto(String mianshitongzhiPhoto) {
						this.mianshitongzhiPhoto = mianshitongzhiPhoto;
					}
					/**
					* 获取： 公司待遇
					*/
					public String getMianshitongzhiDaiyu() {
						return mianshitongzhiDaiyu;
					}
					/**
					* 设置： 公司待遇
					*/
					public void setMianshitongzhiDaiyu(String mianshitongzhiDaiyu) {
						this.mianshitongzhiDaiyu = mianshitongzhiDaiyu;
					}
					/**
					* 获取： 月薪
					*/
					public String getMianshitongzhiYuexin() {
						return mianshitongzhiYuexin;
					}
					/**
					* 设置： 月薪
					*/
					public void setMianshitongzhiYuexin(String mianshitongzhiYuexin) {
						this.mianshitongzhiYuexin = mianshitongzhiYuexin;
					}
					/**
					* 获取： 公司地址
					*/
					public String getMianshitongzhiDizhi() {
						return mianshitongzhiDizhi;
					}
					/**
					* 设置： 公司地址
					*/
					public void setMianshitongzhiDizhi(String mianshitongzhiDizhi) {
						this.mianshitongzhiDizhi = mianshitongzhiDizhi;
					}
					/**
					* 获取： 上传人
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 上传人
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 公司详情
					*/
					public String getMianshitongzhiContent() {
						return mianshitongzhiContent;
					}
					/**
					* 设置： 公司详情
					*/
					public void setMianshitongzhiContent(String mianshitongzhiContent) {
						this.mianshitongzhiContent = mianshitongzhiContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 所属部门名称
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 所属部门名称
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 所属部门名称的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 所属部门名称的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 身份
					*/
					public String getYonghuRole() {
						return yonghuRole;
					}
					/**
					* 设置： 身份
					*/
					public void setYonghuRole(String yonghuRole) {
						this.yonghuRole = yonghuRole;
					}









}
