package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o<R extends com.google.android.gms.common.api.n> extends com.google.android.gms.common.api.h<R> {

    /* renamed from: a, reason: collision with root package name */
    private final BasePendingResult f9435a;

    public o(com.google.android.gms.common.api.i iVar) {
        this.f9435a = (BasePendingResult) iVar;
    }

    @Override // com.google.android.gms.common.api.i
    public final void addStatusListener(i.a aVar) {
        this.f9435a.addStatusListener(aVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final R await() {
        return (R) this.f9435a.await();
    }

    @Override // com.google.android.gms.common.api.i
    public final R await(long j10, TimeUnit timeUnit) {
        return (R) this.f9435a.await(j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.i
    public final void cancel() {
        this.f9435a.cancel();
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean isCanceled() {
        return this.f9435a.isCanceled();
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.o<? super R> oVar) {
        this.f9435a.setResultCallback(oVar);
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.o<? super R> oVar, long j10, TimeUnit timeUnit) {
        this.f9435a.setResultCallback(oVar, j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.i
    public final <S extends com.google.android.gms.common.api.n> com.google.android.gms.common.api.r<S> then(com.google.android.gms.common.api.q<? super R, ? extends S> qVar) {
        return this.f9435a.then(qVar);
    }
}
