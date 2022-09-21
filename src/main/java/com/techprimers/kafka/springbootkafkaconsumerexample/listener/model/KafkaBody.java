package com.techprimers.kafka.springbootkafkaconsumerexample.listener.model;

public class KafkaBody {

    private String originalOpertionId="try";
    private String code="try";

    public KafkaBody(String originalOpertionId, String code) {
        this.originalOpertionId = originalOpertionId;
        this.code = code;
    }

    public KafkaBody() {

    }

    public String getOriginalOpertionId() {
        return originalOpertionId;
    }

    public void setOriginalOpertionId(String originalOpertionId) {
        this.originalOpertionId = originalOpertionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("\"originalOpertionId\"=\"").append(originalOpertionId).append("\",\n");
        sb.append("\"code\"=\"").append(code).append("\"");
        sb.append("}");
        return sb.toString();
    }

}