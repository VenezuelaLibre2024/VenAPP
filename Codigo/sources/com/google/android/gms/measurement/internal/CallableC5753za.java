package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.za */
/* loaded from: classes2.dex */
public final class CallableC5753za implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f12109a;

    /* renamed from: b */
    private final /* synthetic */ C5705va f12110b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5753za(C5705va c5705va, C5576lb c5576lb) {
        this.f12110b = c5705va;
        this.f12109a = c5576lb;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        C5621p4 m14186F;
        String str;
        if (this.f12110b.m14444L((String) C5276s.m13324j(this.f12109a.f11553a)).m14596y() && C5737y6.m14574e(this.f12109a.f11544G).m14596y()) {
            C5648r5 m14457d = this.f12110b.m14457d(this.f12109a);
            if (m14457d != null) {
                return m14457d.m14327u0();
            }
            m14186F = this.f12110b.zzj().m14187G();
            str = "App info was null when attempting to get app instance id";
        } else {
            m14186F = this.f12110b.zzj().m14186F();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        m14186F.m14218a(str);
        return null;
    }
}
