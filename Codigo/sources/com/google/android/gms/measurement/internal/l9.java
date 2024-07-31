package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f10359a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f10360b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f10361c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ d0 f10362d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f10363e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f10364f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l9(v8 v8Var, boolean z10, lb lbVar, boolean z11, d0 d0Var, String str) {
        this.f10364f = v8Var;
        this.f10359a = z10;
        this.f10360b = lbVar;
        this.f10361c = z11;
        this.f10362d = d0Var;
        this.f10363e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10364f.f10709d;
        if (iVar == null) {
            this.f10364f.zzj().B().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f10359a) {
            com.google.android.gms.common.internal.s.j(this.f10360b);
            this.f10364f.O(iVar, this.f10361c ? null : this.f10362d, this.f10360b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10363e)) {
                    com.google.android.gms.common.internal.s.j(this.f10360b);
                    iVar.V0(this.f10362d, this.f10360b);
                } else {
                    iVar.P1(this.f10362d, this.f10363e, this.f10364f.zzj().J());
                }
            } catch (RemoteException e10) {
                this.f10364f.zzj().B().b("Failed to send event to the service", e10);
            }
        }
        this.f10364f.b0();
    }
}
