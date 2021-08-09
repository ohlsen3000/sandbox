package com.example.restservice;

import java.time.Instant;

public class ToDo {

	private final long id;
	private final String content;
	private final Status status;
	private final Instant createdAt;

	public ToDo(long id, String content, Status status, Instant createdAt) {
		this.id = id;
		this.content = content;
		this.status = status;
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

    public Status getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
