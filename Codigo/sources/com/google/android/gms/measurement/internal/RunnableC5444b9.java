package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import p418wa.InterfaceC12109i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b9 */
/* loaded from: classes2.dex */
public final class RunnableC5444b9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11122a;

    /* renamed from: b */
    private final /* synthetic */ boolean f11123b;

    /* renamed from: c */
    private final /* synthetic */ C5524hb f11124c;

    /* renamed from: d */
    private final /* synthetic */ C5703v8 f11125d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5444b9(C5703v8 c5703v8, C5576lb c5576lb, boolean z10, C5524hb c5524hb) {
        this.f11125d = c5703v8;
        this.f11122a = c5576lb;
        this.f11123b = z10;
        this.f11124c = c5524hb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC12109i interfaceC12109i;
        interfaceC12109i = this.f11125d.f11907d;
        if (interfaceC12109i == null) {
            this.f11125d.zzj().m14182B().m14218a("Discarding data. Failed to set user property");
            return;
        }
        C5276s.m13324j(this.f11122a);
        this.f11125d.m14398O(interfaceC12109i, this.f11123b ? null : this.f11124c, this.f11122a);
        this.f11125d.m14379b0();
    }
}
