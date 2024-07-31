package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC5108h;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.AbstractC5207q;
import com.google.android.gms.common.api.AbstractC5208r;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.InterfaceC5205o;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public final class C5164o<R extends InterfaceC5204n> extends AbstractC5108h<R> {

    /* renamed from: a */
    private final BasePendingResult f10549a;

    public C5164o(AbstractC5109i abstractC5109i) {
        this.f10549a = (BasePendingResult) abstractC5109i;
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final void addStatusListener(AbstractC5109i.a aVar) {
        this.f10549a.addStatusListener(aVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final R await() {
        return (R) this.f10549a.await();
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final R await(long j10, TimeUnit timeUnit) {
        return (R) this.f10549a.await(j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final void cancel() {
        this.f10549a.cancel();
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final boolean isCanceled() {
        return this.f10549a.isCanceled();
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final void setResultCallback(InterfaceC5205o<? super R> interfaceC5205o) {
        this.f10549a.setResultCallback(interfaceC5205o);
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final void setResultCallback(InterfaceC5205o<? super R> interfaceC5205o, long j10, TimeUnit timeUnit) {
        this.f10549a.setResultCallback(interfaceC5205o, j10, timeUnit);
    }

    @Override // com.google.android.gms.common.api.AbstractC5109i
    public final <S extends InterfaceC5204n> AbstractC5208r<S> then(AbstractC5207q<? super R, ? extends S> abstractC5207q) {
        return this.f10549a.then(abstractC5207q);
    }
}
