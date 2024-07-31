package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcv;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes2.dex */
public final class RunnableC5727x8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f12031a;

    /* renamed from: b */
    private final /* synthetic */ String f12032b;

    /* renamed from: c */
    private final /* synthetic */ C5576lb f12033c;

    /* renamed from: d */
    private final /* synthetic */ boolean f12034d;

    /* renamed from: e */
    private final /* synthetic */ zzcv f12035e;

    /* renamed from: f */
    private final /* synthetic */ C5703v8 f12036f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5727x8(C5703v8 c5703v8, String str, String str2, C5576lb c5576lb, boolean z10, zzcv zzcvVar) {
        this.f12036f = c5703v8;
        this.f12031a = str;
        this.f12032b = str2;
        this.f12033c = c5576lb;
        this.f12034d = z10;
        this.f12035e = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        Bundle bundle = new Bundle();
        try {
            try {
                interfaceC12109i = this.f12036f.f11907d;
                if (interfaceC12109i == null) {
                    this.f12036f.zzj().m14182B().m14220c("Failed to get user properties; not connected to service", this.f12031a, this.f12032b);
                } else {
                    C5276s.m13324j(this.f12033c);
                    bundle = C5537ib.m13970A(interfaceC12109i.mo13603I1(this.f12031a, this.f12032b, this.f12034d, this.f12033c));
                    this.f12036f.m14379b0();
                }
            } catch (RemoteException e10) {
                this.f12036f.zzj().m14182B().m14220c("Failed to get user properties; remote exception", this.f12031a, e10);
            }
        } finally {
            this.f12036f.mo13681f().m14019L(this.f12035e, bundle);
        }
    }
}
