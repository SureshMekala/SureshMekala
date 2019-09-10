package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Executablecode {
public static void main(String[] args) {
	Result r = JUnitCore.runClasses(Code1.class, Code2.class);
	System.out.println("total ignore count:" +r.getIgnoreCount());
	System.out.println("Total time:" +r.getRunTime());
	System.out.println("run count:" +r.getRunCount());
	System.out.println("failure count:" +r.getFailureCount());
	List<Failure> f = r.getFailures();
	for (Failure failure : f) {
		System.out.println(failure);
		
	}
	
}
}
