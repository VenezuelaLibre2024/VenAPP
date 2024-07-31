package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5822d0;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.C5823e;
import com.google.android.play.integrity.internal.InterfaceC5852z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.ab */
/* loaded from: classes2.dex */
public final class C5757ab extends AbstractRunnableC5822d0 {

    /* renamed from: a */
    final /* synthetic */ byte[] f12117a;

    /* renamed from: b */
    final /* synthetic */ Long f12118b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f12119c;

    /* renamed from: d */
    final /* synthetic */ IntegrityTokenRequest f12120d;

    /* renamed from: e */
    final /* synthetic */ C5759ad f12121e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757ab(C5759ad c5759ad, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f12121e = c5759ad;
        this.f12117a = bArr;
        this.f12118b = l10;
        this.f12119c = taskCompletionSource2;
        this.f12120d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: a */
    public final void mo14616a(Exception exc) {
        if (exc instanceof C5823e) {
            super.mo14616a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo14616a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    protected final void mo14617b() {
        C5820c0 c5820c0;
        try {
            ((InterfaceC5852z) this.f12121e.f12125a.m14680e()).mo14703w(C5759ad.m14619a(this.f12121e, this.f12117a, this.f12118b, null), new BinderC5758ac(this.f12121e, this.f12119c));
        } catch (RemoteException e10) {
            c5820c0 = this.f12121e.f12126b;
            c5820c0.m14657b(e10, "requestIntegrityToken(%s)", this.f12120d);
            this.f12119c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
