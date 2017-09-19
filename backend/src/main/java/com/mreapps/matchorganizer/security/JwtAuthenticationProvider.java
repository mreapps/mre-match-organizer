package com.mreapps.matchorganizer.security;

import com.mreapps.matchorganizer.security.exception.JwtTokenMalformedException;
import com.mreapps.matchorganizer.security.model.AuthenticatedUser;
import com.mreapps.matchorganizer.security.model.JwtAuthenticationToken;
import com.mreapps.matchorganizer.security.model.User;
import com.mreapps.matchorganizer.security.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 */
@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider
{
    private final JwtUtil jwtUtil;

    @Autowired
    public JwtAuthenticationProvider(JwtUtil jwtUtil)
    {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public boolean supports(Class<?> authentication)
    {
        return JwtAuthenticationToken.class.isAssignableFrom(authentication);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException
    {

    }

    @Override
    protected UserDetails retrieveUser(String s, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException
    {
        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
        String token = jwtAuthenticationToken.getToken();

        User parsedUser = jwtUtil.parseToken(token);

        if (parsedUser == null)
        {
            throw new JwtTokenMalformedException("JWT token is not valid");
        }

        List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(parsedUser.getRole().name());

        return new AuthenticatedUser(parsedUser.getId(), parsedUser.getEmailAddress(), token, authorityList);
    }
}
