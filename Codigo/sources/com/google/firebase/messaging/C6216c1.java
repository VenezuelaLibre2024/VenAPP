package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.c1 */
/* loaded from: classes.dex */
public final class C6216c1 {

    /* renamed from: d */
    private static WeakReference<C6216c1> f13279d;

    /* renamed from: a */
    private final SharedPreferences f13280a;

    /* renamed from: b */
    private C6270y0 f13281b;

    /* renamed from: c */
    private final Executor f13282c;

    private C6216c1(SharedPreferences sharedPreferences, Executor executor) {
        this.f13282c = executor;
        this.f13280a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C6216c1 m16966b(Context context, Executor executor) {
        C6216c1 c6216c1;
        synchronized (C6216c1.class) {
            WeakReference<C6216c1> weakReference = f13279d;
            c6216c1 = weakReference != null ? weakReference.get() : null;
            if (c6216c1 == null) {
                c6216c1 = new C6216c1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c6216c1.m16967d();
                f13279d = new WeakReference<>(c6216c1);
            }
        }
        return c6216c1;
    }

    /* renamed from: d */
    private synchronized void m16967d() {
        this.f13281b = C6270y0.m17206d(this.f13280a, "topic_operation_queue", ",", this.f13282c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m16968a(C6213b1 c6213b1) {
        return this.f13281b.m17210b(c6213b1.m16948e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C6213b1 m16969c() {
        return C6213b1.m16942a(this.f13281b.m17211f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized boolean m16970e(C6213b1 c6213b1) {
        return this.f13281b.m17212g(c6213b1.m16948e());
    }
}
