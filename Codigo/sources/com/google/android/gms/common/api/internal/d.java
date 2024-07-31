package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.n;

/* loaded from: classes.dex */
public abstract class d<R extends com.google.android.gms.common.api.n, A extends a.b> extends BasePendingResult<R> implements e<R> {
    private final com.google.android.gms.common.api.a<?> mApi;
    private final a.c<A> mClientKey;

    @Deprecated
    protected d(a.c<A> cVar, com.google.android.gms.common.api.f fVar) {
        super((com.google.android.gms.common.api.f) com.google.android.gms.common.internal.s.k(fVar, "GoogleApiClient must not be null"));
        this.mClientKey = (a.c) com.google.android.gms.common.internal.s.j(cVar);
        this.mApi = null;
    }

    public d(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.f fVar) {
        super((com.google.android.gms.common.api.f) com.google.android.gms.common.internal.s.k(fVar, "GoogleApiClient must not be null"));
        com.google.android.gms.common.internal.s.k(aVar, "Api must not be null");
        this.mClientKey = aVar.b();
        this.mApi = aVar;
    }

    protected d(BasePendingResult.a<R> aVar) {
        super(aVar);
        this.mClientKey = new a.c<>();
        this.mApi = null;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void doExecute(A a10);

    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.mApi;
    }

    public final a.c<A> getClientKey() {
        return this.mClientKey;
    }

    protected void onSetFailedResult(R r10) {
    }

    public final void run(A a10) {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult(e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.s.b(!status.y1(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult((d<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((d<R, A>) obj);
    }
}
