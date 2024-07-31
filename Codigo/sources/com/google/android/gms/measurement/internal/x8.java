package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10816a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10817b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ lb f10818c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f10819d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzcv f10820e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f10821f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x8(v8 v8Var, String str, String str2, lb lbVar, boolean z10, zzcv zzcvVar) {
        this.f10821f = v8Var;
        this.f10816a = str;
        this.f10817b = str2;
        this.f10818c = lbVar;
        this.f10819d = z10;
        this.f10820e = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        Bundle bundle = new Bundle();
        try {
            try {
                iVar = this.f10821f.f10709d;
                if (iVar == null) {
                    this.f10821f.zzj().B().c("Failed to get user properties; not connected to service", this.f10816a, this.f10817b);
                } else {
                    com.google.android.gms.common.internal.s.j(this.f10818c);
                    bundle = ib.A(iVar.I1(this.f10816a, this.f10817b, this.f10819d, this.f10818c));
                    this.f10821f.b0();
                }
            } catch (RemoteException e10) {
                this.f10821f.zzj().B().c("Failed to get user properties; remote exception", this.f10816a, e10);
            }
        } finally {
            this.f10821f.f().L(this.f10820e, bundle);
        }
    }
}
