package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* loaded from: classes2.dex */
public final class RunnableC5639q9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11746a;

    /* renamed from: b */
    private final /* synthetic */ String f11747b;

    /* renamed from: c */
    private final /* synthetic */ C5576lb f11748c;

    /* renamed from: d */
    private final /* synthetic */ zzcv f11749d;

    /* renamed from: e */
    private final /* synthetic */ C5703v8 f11750e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5639q9(C5703v8 c5703v8, String str, String str2, C5576lb c5576lb, zzcv zzcvVar) {
        this.f11750e = c5703v8;
        this.f11746a = str;
        this.f11747b = str2;
        this.f11748c = c5576lb;
        this.f11749d = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                interfaceC12109i = this.f11750e.f11907d;
                if (interfaceC12109i == null) {
                    this.f11750e.zzj().m14182B().m14220c("Failed to get conditional properties; not connected to service", this.f11746a, this.f11747b);
                } else {
                    C5276s.m13324j(this.f11748c);
                    arrayList = C5537ib.m13995o0(interfaceC12109i.mo13614d(this.f11746a, this.f11747b, this.f11748c));
                    this.f11750e.m14379b0();
                }
            } catch (RemoteException e10) {
                this.f11750e.zzj().m14182B().m14221d("Failed to get conditional properties; remote exception", this.f11746a, this.f11747b, e10);
            }
        } finally {
            this.f11750e.mo13681f().m14022N(this.f11749d, arrayList);
        }
    }
}
