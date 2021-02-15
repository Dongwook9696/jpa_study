package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    // 읽기 전용
    @OneToMany(mappedBy = "member") // order테이블에 있는 member 필드와 매핑
    private List<Order> orders = new ArrayList<>();

}
