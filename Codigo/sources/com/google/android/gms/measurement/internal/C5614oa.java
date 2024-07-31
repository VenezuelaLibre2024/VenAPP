package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import la.InterfaceC9461f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.oa */
/* loaded from: classes2.dex */
public final class C5614oa {

    /* renamed from: a */
    private final InterfaceC9461f f11671a;

    /* renamed from: b */
    private long f11672b;

    public C5614oa(InterfaceC9461f interfaceC9461f) {
        C5276s.m13324j(interfaceC9461f);
        this.f11671a = interfaceC9461f;
    }

    /* renamed from: a */
    public final void m14215a() {
        this.f11672b = 0L;
    }

    /* renamed from: b */
    public final boolean m14216b(long j10) {
        return this.f11672b == 0 || this.f11671a.mo28131b() - this.f11672b >= 3600000;
    }

    /* renamed from: c */
    public final void m14217c() {
        this.f11672b = this.f11671a.mo28131b();
    }
}
