package com.bluethink.mapper;

import com.bluethink.model.Plugin;
import com.bluethink.model.PluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginMapper {
    long countByExample(PluginExample example);

    int deleteByExample(PluginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Plugin record);

    int insertSelective(Plugin record);

    List<Plugin> selectByExample(PluginExample example);

    Plugin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Plugin record, @Param("example") PluginExample example);

    int updateByExample(@Param("record") Plugin record, @Param("example") PluginExample example);

    int updateByPrimaryKeySelective(Plugin record);

    int updateByPrimaryKey(Plugin record);
}