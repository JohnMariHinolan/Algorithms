package com.jm.exercise.obj;

public class ExerciseRes {

	private String status;
	private String result;
	private String errorMsg;

	private long algoTime;
	private String algoinfo = "Standard";

	public synchronized String getAlgoinfo() {
		return algoinfo;
	}

	public synchronized void setAlgoinfo(String algoinfo) {
		this.algoinfo = algoinfo;
	}

	public long getAlgoTime() {
		return algoTime;
	}

	public void setAlgoTime(long algoTime) {
		this.algoTime = algoTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
