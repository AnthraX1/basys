package com.aisino2.publicsystem.service;

import java.util.List;
import java.util.Map;

import com.aisino2.core.dao.Page;
import com.aisino2.publicsystem.domain.Tjclxx;

public interface ITjclxxService {
	/** @param 提交材料信息(t_tjclxx) 增加 */
	Tjclxx insertTjclxx(Tjclxx tjclxx);

	/** @param 提交材料信息(t_tjclxx) 删除 */
	boolean deleteTjclxx(Tjclxx tjclxx);

	/** @param 提交材料信息(t_tjclxx) 修改 */
	boolean updateTjclxx(Tjclxx tjclxx);

	/** @param 提交材料信息(t_tjclxx) 查询单条 */
	Tjclxx getTjclxx(Tjclxx tjclxx);

	/** @param 提交材料信息(t_tjclxx) 分页查询 */
	Page getListForPage(Map map, int pageNo,int pageSize,String sort,String desc);

	/** @param 提交材料信息(t_tjclxx) 多条查询 */
	List getListTjclxx(Tjclxx tjclxx);
}
