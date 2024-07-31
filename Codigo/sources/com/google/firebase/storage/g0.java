package com.google.firebase.storage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static g0 f12615a = new g0();

    /* renamed from: b, reason: collision with root package name */
    private static Executor f12616b;

    /* renamed from: c, reason: collision with root package name */
    private static Executor f12617c;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f12618d;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f12619e;

    /* renamed from: f, reason: collision with root package name */
    private static Executor f12620f;

    public static g0 b() {
        return f12615a;
    }

    public static void d(Executor executor, Executor executor2) {
        f12616b = qc.j.b(executor, 5);
        f12618d = qc.j.b(executor, 3);
        f12617c = qc.j.b(executor, 2);
        f12619e = qc.j.c(executor);
        f12620f = executor2;
    }

    public Executor a() {
        return f12616b;
    }

    public Executor c() {
        return f12620f;
    }

    public void e(Runnable runnable) {
        f12619e.execute(runnable);
    }

    public void f(Runnable runnable) {
        f12616b.execute(runnable);
    }

    public void g(Runnable runnable) {
        f12618d.execute(runnable);
    }

    public void h(Runnable runnable) {
        f12617c.execute(runnable);
    }
}
