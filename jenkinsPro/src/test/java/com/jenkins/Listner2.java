package com.jenkins;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test paassed"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail"+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped"+ result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test end");
	}
	
	
}
