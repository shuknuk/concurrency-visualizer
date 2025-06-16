package com.shuknuk.concurrency;

import java.time.Instant;

/**
 * Event is the blueprint for one single, structured line in the log.
 */
public record Event(
        Instant timestamp, // The timestamp
        long threadId, // The thread ID
        String eventType, // The type of event
        String eventDetails // The message
) {}
