package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import ca.C1904g;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzui;
import com.google.mlkit.common.sdkinternal.AbstractC6516e;
import com.google.mlkit.common.sdkinternal.C6524i;
import p402vf.C11886b;

/* renamed from: com.google.mlkit.vision.barcode.internal.f */
/* loaded from: classes2.dex */
public final class C6551f extends AbstractC6516e {

    /* renamed from: a */
    private final C6524i f14384a;

    public C6551f(C6524i c6524i) {
        this.f14384a = c6524i;
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC6516e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        C11886b c11886b = (C11886b) obj;
        Context m18316b = this.f14384a.m18316b();
        zztx zzb = zzui.zzb(C6547b.m18353d());
        return new C6554i(this.f14384a, c11886b, (C6556k.m18364b(m18316b) || C1904g.m10086f().m10087a(m18316b) >= 204500000) ? new C6556k(m18316b, c11886b, zzb) : new C6557l(m18316b, c11886b, zzb), zzb);
    }
}
