package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* loaded from: classes2.dex */
public final class RunnableC5626p9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f11702a;

    /* renamed from: b */
    private final /* synthetic */ String f11703b;

    /* renamed from: c */
    private final /* synthetic */ String f11704c;

    /* renamed from: d */
    private final /* synthetic */ String f11705d;

    /* renamed from: e */
    private final /* synthetic */ C5576lb f11706e;

    /* renamed from: f */
    private final /* synthetic */ boolean f11707f;

    /* renamed from: r */
    private final /* synthetic */ C5703v8 f11708r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5626p9(C5703v8 c5703v8, AtomicReference atomicReference, String str, String str2, String str3, C5576lb c5576lb, boolean z10) {
        this.f11708r = c5703v8;
        this.f11702a = atomicReference;
        this.f11703b = str;
        this.f11704c = str2;
        this.f11705d = str3;
        this.f11706e = c5576lb;
        this.f11707f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC12109i interfaceC12109i;
        AtomicReference atomicReference2;
        List<C5524hb> mo13621p;
        synchronized (this.f11702a) {
            try {
                try {
                    interfaceC12109i = this.f11708r.f11907d;
                } finally {
                    this.f11702a.notify();
                }
            } catch (RemoteException e10) {
                this.f11708r.zzj().m14182B().m14221d("(legacy) Failed to get user properties; remote exception", C5595n4.m14174q(this.f11703b), this.f11704c, e10);
                this.f11702a.set(Collections.emptyList());
                atomicReference = this.f11702a;
            }
            if (interfaceC12109i == null) {
                this.f11708r.zzj().m14182B().m14221d("(legacy) Failed to get user properties; not connected to service", C5595n4.m14174q(this.f11703b), this.f11704c, this.f11705d);
                this.f11702a.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f11703b)) {
                C5276s.m13324j(this.f11706e);
                atomicReference2 = this.f11702a;
                mo13621p = interfaceC12109i.mo13603I1(this.f11704c, this.f11705d, this.f11707f, this.f11706e);
            } else {
                atomicReference2 = this.f11702a;
                mo13621p = interfaceC12109i.mo13621p(this.f11703b, this.f11704c, this.f11705d, this.f11707f);
            }
            atomicReference2.set(mo13621p);
            this.f11708r.m14379b0();
            atomicReference = this.f11702a;
            atomicReference.notify();
        }
    }
}
