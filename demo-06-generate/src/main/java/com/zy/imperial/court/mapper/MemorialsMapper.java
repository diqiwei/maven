package com.zy.imperial.court.mapper;

import com.zy.imperial.court.entity.Memorials;
import com.zy.imperial.court.entity.MemorialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorialsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int countByExample(MemorialsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int deleteByExample(MemorialsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int deleteByPrimaryKey(Integer memorialsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int insert(Memorials record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int insertSelective(Memorials record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    List<Memorials> selectByExample(MemorialsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    Memorials selectByPrimaryKey(Integer memorialsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") Memorials record, @Param("example") MemorialsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int updateByExample(@Param("record") Memorials record, @Param("example") MemorialsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int updateByPrimaryKeySelective(Memorials record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_memorials
     *
     * @mbggenerated Tue May 16 10:48:46 CST 2023
     */
    int updateByPrimaryKey(Memorials record);
}