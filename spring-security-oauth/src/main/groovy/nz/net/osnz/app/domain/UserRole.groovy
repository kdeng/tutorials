package nz.net.osnz.app.domain

import nz.net.osnz.common.ebean.entity.BaseModel

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * @author Kefeng Deng (deng@51any.com)
 */
@Entity
@Table(name = 'o_user_role')
class UserRole extends BaseModel {

    @ManyToOne
    @Column(name = 'user_id')
    User user

    @Column(name = 'role')
    Role role

}
