package org.personal.utils;

import java.lang.reflect.Constructor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.personal.base.model.BaseModel;

/** 
* @ClassName: EntityFactory 
* @Description: 实体类工厂
* @author atlantis0617
* @date 2018年5月31日 上午10:36:19 
*  
*/
public class EntityFactory {

	private static final Log logger = LogFactory.getLog(EntityFactory.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends BaseModel> T getEntity(Class<T> clz) {
		try {
			Constructor constructor = clz.getDeclaredConstructor(new Class[0]);
			constructor.setAccessible(true);
			return ((T) constructor.newInstance(new Object[0]));
		} catch (SecurityException e2) {
			e2.printStackTrace();
		}catch(NoSuchMethodException e2) {
			e2.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		logger.warn("Can not instant Class [" + clz.getName() + "]");
		return null;
	}
}
