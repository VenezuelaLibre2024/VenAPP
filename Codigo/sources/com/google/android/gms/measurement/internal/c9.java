package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10035a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzcv f10036b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v8 f10037c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(v8 v8Var, lb lbVar, zzcv zzcvVar) {
        this.f10037c = v8Var;
        this.f10035a = lbVar;
        this.f10036b = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        String str = null;
        try {
            try {
                if (this.f10037c.e().E().y()) {
                    iVar = this.f10037c.f10709d;
                    if (iVar == null) {
                        this.f10037c.zzj().B().a("Failed to get app instance id");
                    } else {
                        com.google.android.gms.common.internal.s.j(this.f10035a);
                        str = iVar.N0(this.f10035a);
                        if (str != null) {
                            this.f10037c.m().M(str);
                            this.f10037c.e().f10841g.b(str);
                        }
                        this.f10037c.b0();
                    }
                } else {
                    this.f10037c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                    this.f10037c.m().M(null);
                    this.f10037c.e().f10841g.b(null);
                }
            } catch (RemoteException e10) {
                this.f10037c.zzj().B().b("Failed to get app instance id", e10);
            }
        } finally {
            this.f10037c.f().M(this.f10036b, null);
        }
    }
}
