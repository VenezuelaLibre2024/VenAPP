package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5101a.b;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC5123d<R extends InterfaceC5204n, A extends C5101a.b> extends BasePendingResult<R> implements InterfaceC5127e<R> {
    private final C5101a<?> mApi;
    private final C5101a.c<A> mClientKey;

    @Deprecated
    protected AbstractC5123d(C5101a.c<A> cVar, AbstractC5106f abstractC5106f) {
        super((AbstractC5106f) C5276s.m13325k(abstractC5106f, "GoogleApiClient must not be null"));
        this.mClientKey = (C5101a.c) C5276s.m13324j(cVar);
        this.mApi = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5123d(C5101a<?> c5101a, AbstractC5106f abstractC5106f) {
        super((AbstractC5106f) C5276s.m13325k(abstractC5106f, "GoogleApiClient must not be null"));
        C5276s.m13325k(c5101a, "Api must not be null");
        this.mClientKey = c5101a.m12975b();
        this.mApi = c5101a;
    }

    protected AbstractC5123d(BasePendingResult.HandlerC5110a<R> handlerC5110a) {
        super(handlerC5110a);
        this.mClientKey = new C5101a.c<>();
        this.mApi = null;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void doExecute(A a10);

    public final C5101a<?> getApi() {
        return this.mApi;
    }

    public final C5101a.c<A> getClientKey() {
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

    @Override // com.google.android.gms.common.api.internal.InterfaceC5127e
    public final void setFailedResult(Status status) {
        C5276s.m13316b(!status.m12972y1(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult((AbstractC5123d<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.InterfaceC5127e
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((AbstractC5123d<R, A>) obj);
    }
}
