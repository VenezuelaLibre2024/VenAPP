package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p082eb.C7169y;

/* renamed from: io.grpc.internal.c1 */
/* loaded from: classes3.dex */
public final class RunnableC8835c1 implements Runnable {

    /* renamed from: b */
    private static final Logger f20358b = Logger.getLogger(RunnableC8835c1.class.getName());

    /* renamed from: a */
    private final Runnable f20359a;

    public RunnableC8835c1(Runnable runnable) {
        this.f20359a = (Runnable) C7159o.m21313p(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20359a.run();
        } catch (Throwable th2) {
            f20358b.log(Level.SEVERE, "Exception while executing runnable " + this.f20359a, th2);
            C7169y.m21362f(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f20359a + ")";
    }
}
