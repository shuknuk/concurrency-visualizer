package com.shuknuk.concurrency;

/**
 * The main Tracer class. It's a Singleton, meaning there's only ever one
 * instance of it. This ensures all parts of the application log to the same place.
 * Tracer.java writes the report. It is the logging system itself.
 */
public final class Tracer {

    // The single, static instance of the Tracer.
    private static final Tracer INSTANCE = new Tracer();

    // Private constructor prevents anyone else from creating an instance.
    private Tracer() {
        // Initialization code can go here later.
        System.out.println("Tracer initialized.");
    }

    /**
     * The public method to get the single instance of the Tracer.
     * @return The single Tracer instance.
     */
    public static Tracer getInstance() {
        return INSTANCE;
    }

    /**
     * The main logging method. For now, it just prints the event to the console.
     * @param event The event to be logged.
     */
    public void log(Event event) {
        System.out.println(event);
    }
}
