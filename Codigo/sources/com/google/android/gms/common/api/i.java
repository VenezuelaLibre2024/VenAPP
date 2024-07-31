package com.google.android.gms.common.api;

import com.google.android.gms.common.api.n;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i<R extends n> {

    /* loaded from: classes.dex */
    public interface a {
        void a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract R await();

    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(o<? super R> oVar);

    public abstract void setResultCallback(o<? super R> oVar, long j10, TimeUnit timeUnit);

    public <S extends n> r<S> then(q<? super R, ? extends S> qVar) {
        throw new UnsupportedOperationException();
    }
}
