package com.company.calendar.security;

import com.company.calendar.entity.User;
import io.jmix.core.security.PasswordNotMatchException;
import io.jmix.securitydata.user.AbstractDatabaseUserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Primary
@Component("cs_UserRepository")
public class DatabaseUserRepository extends AbstractDatabaseUserRepository<User> {

    @Override
    protected Class<User> getUserClass() {
        return User.class;
    }

    @Override
    protected void initSystemUser(final User systemUser) {
        final Collection<GrantedAuthority> authorities = getGrantedAuthoritiesBuilder()
                .addResourceRole(FullAccessRole.CODE)
                .build();
        systemUser.setAuthorities(authorities);
    }

    @Override
    protected void initAnonymousUser(final User anonymousUser) {
    }

    @Override
    public void changePassword(String userName, String oldPassword, String newPassword) throws PasswordNotMatchException {
        super.changePassword(userName, oldPassword, newPassword);
    }

    @Override
    public Map<UserDetails, String> resetPasswords(Set<UserDetails> users) {
        return super.resetPasswords(users);
    }
}