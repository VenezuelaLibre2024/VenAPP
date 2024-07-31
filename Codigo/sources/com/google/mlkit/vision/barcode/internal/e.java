package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzui;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f13107a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f13108b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f13109c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, com.google.mlkit.common.sdkinternal.d dVar, com.google.mlkit.common.sdkinternal.i iVar) {
        this.f13107a = fVar;
        this.f13108b = dVar;
        this.f13109c = iVar;
    }

    public final BarcodeScannerImpl a() {
        vf.b bVar;
        bVar = BarcodeScannerImpl.f13091x;
        return b(bVar);
    }

    public final BarcodeScannerImpl b(vf.b bVar) {
        return new BarcodeScannerImpl(bVar, (i) this.f13107a.get(bVar), this.f13108b.a(bVar.c()), zzui.zzb(b.d()), this.f13109c);
    }
}
