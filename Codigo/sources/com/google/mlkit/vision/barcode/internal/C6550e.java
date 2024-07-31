package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzui;
import com.google.mlkit.common.sdkinternal.C6514d;
import com.google.mlkit.common.sdkinternal.C6524i;
import p402vf.C11886b;

/* renamed from: com.google.mlkit.vision.barcode.internal.e */
/* loaded from: classes2.dex */
public final class C6550e {

    /* renamed from: a */
    private final C6551f f14381a;

    /* renamed from: b */
    private final C6514d f14382b;

    /* renamed from: c */
    private final C6524i f14383c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6550e(C6551f c6551f, C6514d c6514d, C6524i c6524i) {
        this.f14381a = c6551f;
        this.f14382b = c6514d;
        this.f14383c = c6524i;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl m18356a() {
        C11886b c11886b;
        c11886b = BarcodeScannerImpl.f14365x;
        return m18357b(c11886b);
    }

    /* renamed from: b */
    public final BarcodeScannerImpl m18357b(C11886b c11886b) {
        return new BarcodeScannerImpl(c11886b, (C6554i) this.f14381a.get(c11886b), this.f14382b.m18305a(c11886b.m38014c()), zzui.zzb(C6547b.m18353d()), this.f14383c);
    }
}
