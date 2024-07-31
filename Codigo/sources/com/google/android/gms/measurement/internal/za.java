package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class za implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10894a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f10895b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public za(va vaVar, lb lbVar) {
        this.f10895b = vaVar;
        this.f10894a = lbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        p4 F;
        String str;
        if (this.f10895b.L((String) com.google.android.gms.common.internal.s.j(this.f10894a.f10366a)).y() && y6.e(this.f10894a.G).y()) {
            r5 d10 = this.f10895b.d(this.f10894a);
            if (d10 != null) {
                return d10.u0();
            }
            F = this.f10895b.zzj().G();
            str = "App info was null when attempting to get app instance id";
        } else {
            F = this.f10895b.zzj().F();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        F.a(str);
        return null;
    }
}
