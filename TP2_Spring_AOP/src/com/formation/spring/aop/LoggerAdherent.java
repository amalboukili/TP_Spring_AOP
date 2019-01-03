package com.formation.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;



public class LoggerAdherent {
	
	public void logDebutMethode(JoinPoint jointPoint){
		final Object[] args=jointPoint.getArgs();
		final StringBuffer sb =new StringBuffer();
		sb.append(jointPoint.getSignature().toString());
		sb.append(" avec les paramétres : (");
		
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			
			if (i<args.length - 1) {
				sb.append(", ");
				
			}
		}
		sb.append(")");
		System.out.println(sb);
	}
	
	public void logFinMethode(StaticPart staticPart, Object result){
		// Nom de la methode interceptée
		String name = staticPart.getSignature().toLongString();
		System.out.println(name+ " returning: [" +result+ " ]");
	}
	
	
}
