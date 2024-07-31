package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f10337a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10338b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzcv f10339c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f10340d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k9(v8 v8Var, d0 d0Var, String str, zzcv zzcvVar) {
        this.f10340d = v8Var;
        this.f10337a = d0Var;
        this.f10338b = str;
        this.f10339c = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        byte[] bArr = null;
        try {
            try {
                iVar = this.f10340d.f10709d;
                if (iVar == null) {
                    this.f10340d.zzj().B().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = iVar.a1(this.f10337a, this.f10338b);
                    this.f10340d.b0();
                }
            } catch (RemoteException e10) {
                this.f10340d.zzj().B().b("Failed to send event to the service to bundle", e10);
            }
        } finally {
            this.f10340d.f().P(this.f10339c, bArr);
        }
    }
}
