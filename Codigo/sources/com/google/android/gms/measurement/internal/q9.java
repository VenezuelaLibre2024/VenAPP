package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10559a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10560b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ lb f10561c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzcv f10562d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ v8 f10563e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q9(v8 v8Var, String str, String str2, lb lbVar, zzcv zzcvVar) {
        this.f10563e = v8Var;
        this.f10559a = str;
        this.f10560b = str2;
        this.f10561c = lbVar;
        this.f10562d = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                iVar = this.f10563e.f10709d;
                if (iVar == null) {
                    this.f10563e.zzj().B().c("Failed to get conditional properties; not connected to service", this.f10559a, this.f10560b);
                } else {
                    com.google.android.gms.common.internal.s.j(this.f10561c);
                    arrayList = ib.o0(iVar.d(this.f10559a, this.f10560b, this.f10561c));
                    this.f10563e.b0();
                }
            } catch (RemoteException e10) {
                this.f10563e.zzj().B().d("Failed to get conditional properties; remote exception", this.f10559a, this.f10560b, e10);
            }
        } finally {
            this.f10563e.f().N(this.f10562d, arrayList);
        }
    }
}
