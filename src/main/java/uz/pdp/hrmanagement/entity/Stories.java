package uz.pdp.hrmanagement.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import uz.pdp.hrmanagement.entity.enums.StoriesStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Stories {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private StoriesStatus status;

    @ManyToOne
    private Tourniquet tourniquet;

    @CreatedDate
    private Date createdAt;
}
