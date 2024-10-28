package com.entity.view;

import com.entity.MianshitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 面试通知
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-06
 */
@TableName("mianshitongzhi")
public class MianshitongzhiView extends MianshitongzhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



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

	public MianshitongzhiView() {

	}

	public MianshitongzhiView(MianshitongzhiEntity mianshitongzhiEntity) {
		try {
			BeanUtils.copyProperties(this, mianshitongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
