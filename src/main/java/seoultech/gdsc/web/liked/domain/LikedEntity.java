package seoultech.gdsc.web.liked.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import seoultech.gdsc.web.common.domain.BaseEntity;
import seoultech.gdsc.web.user.domain.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class LikedEntity extends BaseEntity {

  @Column(nullable = false)
  private int likeCategory;

  @Column(nullable = false)
  private int refId;

  @ManyToOne
//  @JoinColumn(name = "user_entity_id")
  private UserEntity toUser;

  @Builder
  public LikedEntity(int likeCategory, int refId, UserEntity toUser) {
    this.likeCategory = likeCategory;
    this.refId = refId;
    this.toUser = toUser;
  }
}
