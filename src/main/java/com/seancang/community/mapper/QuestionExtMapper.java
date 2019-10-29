package com.seancang.community.mapper;

import com.seancang.community.model.Question;
import com.seancang.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {


    int incView(Question record);
}