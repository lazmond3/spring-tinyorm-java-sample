package me.sample.javatinyormbaset.javatinyormbase.model;

import lombok.EqualsAndHashCode;
import lombok.Value;
import me.geso.tinyorm.Row;
import me.geso.tinyorm.annotations.Column;
import me.geso.tinyorm.annotations.PrimaryKey;
import me.geso.tinyorm.annotations.Table;

@EqualsAndHashCode(callSuper = false)
@Value
@Table("member")
public class Member extends Row<Member> {
    @PrimaryKey
    private long id;
    @Column
    private String name;
}