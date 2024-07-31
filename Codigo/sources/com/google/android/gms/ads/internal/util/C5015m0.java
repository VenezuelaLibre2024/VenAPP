package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzceb;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.m0 */
/* loaded from: classes.dex */
public final class C5015m0 extends zzare {

    /* renamed from: a */
    final /* synthetic */ byte[] f10112a;

    /* renamed from: b */
    final /* synthetic */ Map f10113b;

    /* renamed from: c */
    final /* synthetic */ zzceb f10114c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5015m0(C5039s0 c5039s0, int i10, String str, zzaqf zzaqfVar, zzaqe zzaqeVar, byte[] bArr, Map map, zzceb zzcebVar) {
        super(i10, str, zzaqfVar, zzaqeVar);
        this.f10112a = bArr;
        this.f10113b = map;
        this.f10114c = zzcebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final Map zzl() {
        Map map = this.f10113b;
        return map == null ? Collections.emptyMap() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzare, com.google.android.gms.internal.ads.zzaqa
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final byte[] zzx() {
        byte[] bArr = this.f10112a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzare
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.f10114c.zzg(str);
        super.zzo(str);
    }
}
