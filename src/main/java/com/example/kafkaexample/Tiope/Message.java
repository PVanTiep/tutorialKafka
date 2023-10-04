package com.example.kafkaexample.Tiope;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {

}