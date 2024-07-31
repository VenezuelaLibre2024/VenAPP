package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.c0;
import com.google.android.play.integrity.internal.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ab extends d0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f10902a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f10903b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f10904c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f10905d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ad f10906e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(ad adVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f10906e = adVar;
        this.f10902a = bArr;
        this.f10903b = l10;
        this.f10904c = taskCompletionSource2;
        this.f10905d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.d0
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.d0
    protected final void b() {
        c0 c0Var;
        try {
            ((com.google.android.play.integrity.internal.z) this.f10906e.f10910a.e()).w(ad.a(this.f10906e, this.f10902a, this.f10903b, null), new ac(this.f10906e, this.f10904c));
        } catch (RemoteException e10) {
            c0Var = this.f10906e.f10911b;
            c0Var.b(e10, "requestIntegrityToken(%s)", this.f10905d);
            this.f10904c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
