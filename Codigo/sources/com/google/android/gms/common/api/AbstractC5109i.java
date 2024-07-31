package com.google.android.gms.common.api;

import com.google.android.gms.common.api.InterfaceC5204n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.i */
/* loaded from: classes.dex */
public abstract class AbstractC5109i<R extends InterfaceC5204n> {

    /* renamed from: com.google.android.gms.common.api.i$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo12994a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract R await();

    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(InterfaceC5205o<? super R> interfaceC5205o);

    public abstract void setResultCallback(InterfaceC5205o<? super R> interfaceC5205o, long j10, TimeUnit timeUnit);

    public <S extends InterfaceC5204n> AbstractC5208r<S> then(AbstractC5207q<? super R, ? extends S> abstractC5207q) {
        throw new UnsupportedOperationException();
    }
}
