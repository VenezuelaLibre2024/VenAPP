package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzui;

/* loaded from: classes2.dex */
public final class f extends com.google.mlkit.common.sdkinternal.e {

    /* renamed from: a */
    private final com.google.mlkit.common.sdkinternal.i f13110a;

    public f(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f13110a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        vf.b bVar = (vf.b) obj;
        Context b10 = this.f13110a.b();
        zztx zzb = zzui.zzb(b.d());
        return new i(this.f13110a, bVar, (k.b(b10) || ca.g.f().a(b10) >= 204500000) ? new k(b10, bVar, zzb) : new l(b10, bVar, zzb), zzb);
    }
}
