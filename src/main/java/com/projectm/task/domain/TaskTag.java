package com.projectm.task.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.projectm.domain.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@TableName("pear_task_tag")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TaskTag extends BaseDomain implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String code;
    private String project_code;
    private String name;
    private String color;
    private String create_time;
}
