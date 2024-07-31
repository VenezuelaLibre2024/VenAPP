package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class q0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.e f9460c;

    public q0(com.google.android.gms.common.api.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f9460c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends com.google.android.gms.common.api.n, T extends d<R, A>> T a(T t10) {
        return (T) this.f9460c.doRead((com.google.android.gms.common.api.e) t10);
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.n, A>> T b(T t10) {
        return (T) this.f9460c.doWrite((com.google.android.gms.common.api.e) t10);
    }

    @Override // com.google.android.gms.common.api.f
    public final Context e() {
        return this.f9460c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper f() {
        return this.f9460c.getLooper();
    }

    @Override // com.google.android.gms.common.api.f
    public final void i(s1 s1Var) {
    }

    @Override // com.google.android.gms.common.api.f
    public final void j(s1 s1Var) {
    }
}
