package com.google.firebase.storage;

import java.util.concurrent.Executor;
import p310qc.C10428j;

/* renamed from: com.google.firebase.storage.g0 */
/* loaded from: classes2.dex */
public class C6385g0 {

    /* renamed from: a */
    public static C6385g0 f13847a = new C6385g0();

    /* renamed from: b */
    private static Executor f13848b;

    /* renamed from: c */
    private static Executor f13849c;

    /* renamed from: d */
    private static Executor f13850d;

    /* renamed from: e */
    private static Executor f13851e;

    /* renamed from: f */
    private static Executor f13852f;

    /* renamed from: b */
    public static C6385g0 m17878b() {
        return f13847a;
    }

    /* renamed from: d */
    public static void m17879d(Executor executor, Executor executor2) {
        f13848b = C10428j.m31229b(executor, 5);
        f13850d = C10428j.m31229b(executor, 3);
        f13849c = C10428j.m31229b(executor, 2);
        f13851e = C10428j.m31230c(executor);
        f13852f = executor2;
    }

    /* renamed from: a */
    public Executor m17880a() {
        return f13848b;
    }

    /* renamed from: c */
    public Executor m17881c() {
        return f13852f;
    }

    /* renamed from: e */
    public void m17882e(Runnable runnable) {
        f13851e.execute(runnable);
    }

    /* renamed from: f */
    public void m17883f(Runnable runnable) {
        f13848b.execute(runnable);
    }

    /* renamed from: g */
    public void m17884g(Runnable runnable) {
        f13850d.execute(runnable);
    }

    /* renamed from: h */
    public void m17885h(Runnable runnable) {
        f13849c.execute(runnable);
    }
}
