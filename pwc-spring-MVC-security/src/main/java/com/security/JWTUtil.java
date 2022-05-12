package com.security;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {
	public static String generateToken(String subject,String secret_key) {
		return Jwts.builder()
				.setId("tk1234")
				.setSubject("sub")
				.setIssuer("PWC_INDIA")
				.setAudience("PWC_STU")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.HOURS.toMillis(1)))
				.signWith(SignatureAlgorithm.HS512,Base64.getEncoder().encode(secret_key.getBytes()))
				.compact();
	}
	public static Claims getClaims(String token,String secret_key) {
		return Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
	}
}
