package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class c1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f18662b = Logger.getLogger(c1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f18663a;

    public c1(Runnable runnable) {
        this.f18663a = (Runnable) eb.o.p(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f18663a.run();
        } catch (Throwable th2) {
            f18662b.log(Level.SEVERE, "Exception while executing runnable " + this.f18663a, th2);
            eb.y.f(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f18663a + ")";
    }
}
