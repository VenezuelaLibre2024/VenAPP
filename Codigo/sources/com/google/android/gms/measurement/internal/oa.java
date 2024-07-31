package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    private final la.f f10484a;

    /* renamed from: b, reason: collision with root package name */
    private long f10485b;

    public oa(la.f fVar) {
        com.google.android.gms.common.internal.s.j(fVar);
        this.f10484a = fVar;
    }

    public final void a() {
        this.f10485b = 0L;
    }

    public final boolean b(long j10) {
        return this.f10485b == 0 || this.f10484a.b() - this.f10485b >= 3600000;
    }

    public final void c() {
        this.f10485b = this.f10484a.b();
    }
}
