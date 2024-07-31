package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference<c1> f12064d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f12065a;

    /* renamed from: b, reason: collision with root package name */
    private y0 f12066b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12067c;

    private c1(SharedPreferences sharedPreferences, Executor executor) {
        this.f12067c = executor;
        this.f12065a = sharedPreferences;
    }

    public static synchronized c1 b(Context context, Executor executor) {
        c1 c1Var;
        synchronized (c1.class) {
            WeakReference<c1> weakReference = f12064d;
            c1Var = weakReference != null ? weakReference.get() : null;
            if (c1Var == null) {
                c1Var = new c1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c1Var.d();
                f12064d = new WeakReference<>(c1Var);
            }
        }
        return c1Var;
    }

    private synchronized void d() {
        this.f12066b = y0.d(this.f12065a, "topic_operation_queue", ",", this.f12067c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(b1 b1Var) {
        return this.f12066b.b(b1Var.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized b1 c() {
        return b1.a(this.f12066b.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(b1 b1Var) {
        return this.f12066b.g(b1Var.e());
    }
}
