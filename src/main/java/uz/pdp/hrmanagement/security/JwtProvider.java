package uz.pdp.hrmanagement.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import uz.pdp.hrmanagement.entity.Role;

import java.util.Date;
import java.util.Set;

@Component
public class JwtProvider {

    private final String secretKey = "secretKey";
    private final long expireTime = 1000 * 60 * 60 * 10;

    public String generateToken(String username, Set<Role> roles){
        return Jwts
                .builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .claim("roles",roles)
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
    }

    public String getUsernameFromToken(String token){
        try {
            return Jwts
                    .parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        }catch (Exception e){
            return null;
        }
    }

}
