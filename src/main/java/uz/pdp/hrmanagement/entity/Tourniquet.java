package uz.pdp.hrmanagement.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Tourniquet {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "tourniquet")
    private List<Stories> stories;

    @CreatedDate
    private Date date;
}
