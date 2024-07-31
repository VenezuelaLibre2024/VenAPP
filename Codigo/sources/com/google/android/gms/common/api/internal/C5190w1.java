package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ca.C1898d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.w1 */
/* loaded from: classes.dex */
public final class C5190w1 extends AbstractC5183u0 {

    /* renamed from: b */
    private final AbstractC5188w f10605b;

    /* renamed from: c */
    private final TaskCompletionSource f10606c;

    /* renamed from: d */
    private final InterfaceC5182u f10607d;

    public C5190w1(int i10, AbstractC5188w abstractC5188w, TaskCompletionSource taskCompletionSource, InterfaceC5182u interfaceC5182u) {
        super(i10);
        this.f10606c = taskCompletionSource;
        this.f10605b = abstractC5188w;
        this.f10607d = interfaceC5182u;
        if (i10 == 2 && abstractC5188w.m13191c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: a */
    public final void mo13166a(Status status) {
        this.f10606c.trySetException(this.f10607d.mo12996a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: b */
    public final void mo13167b(Exception exc) {
        this.f10606c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: c */
    public final void mo13168c(C5156l0 c5156l0) {
        try {
            this.f10605b.mo13144b(c5156l0.m13130s(), this.f10606c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo13166a(AbstractC5196y1.m13206e(e11));
        } catch (RuntimeException e12) {
            this.f10606c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5196y1
    /* renamed from: d */
    public final void mo13189d(C5116b0 c5116b0, boolean z10) {
        c5116b0.m13005d(this.f10606c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: f */
    public final boolean mo13187f(C5156l0 c5156l0) {
        return this.f10605b.m13191c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC5183u0
    /* renamed from: g */
    public final C1898d[] mo13188g(C5156l0 c5156l0) {
        return this.f10605b.m13193e();
    }
}
