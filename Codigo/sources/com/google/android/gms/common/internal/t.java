package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    private static t f9643b;

    /* renamed from: c, reason: collision with root package name */
    private static final u f9644c = new u(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private u f9645a;

    private t() {
    }

    public static synchronized t b() {
        t tVar;
        synchronized (t.class) {
            if (f9643b == null) {
                f9643b = new t();
            }
            tVar = f9643b;
        }
        return tVar;
    }

    public u a() {
        return this.f9645a;
    }

    public final synchronized void c(u uVar) {
        if (uVar == null) {
            this.f9645a = f9644c;
            return;
        }
        u uVar2 = this.f9645a;
        if (uVar2 == null || uVar2.y1() < uVar.y1()) {
            this.f9645a = uVar;
        }
    }
}
