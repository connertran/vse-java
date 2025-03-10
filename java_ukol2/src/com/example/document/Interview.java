package com.example.document;

public class Interview {
    private String interviewee;
    private String interviewer;
    private String transcript;
    private int lengthinMinutes;

    public Interview(String interviewee, String interviewer, String transcript, int lengthinMinutes) {
        this.interviewee = interviewee;
        this.interviewer = interviewer;
        this.transcript = transcript;
        this.lengthinMinutes = lengthinMinutes;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public int getLengthinMinutes() {
        return lengthinMinutes;
    }

    public void setLengthinMinutes(int lengthinMinutes) {
        this.lengthinMinutes = lengthinMinutes;
    }
}
