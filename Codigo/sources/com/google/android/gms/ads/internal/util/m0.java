package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzceb;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 extends zzare {

    /* renamed from: a */
    final /* synthetic */ byte[] f9013a;

    /* renamed from: b */
    final /* synthetic */ Map f9014b;

    /* renamed from: c */
    final /* synthetic */ zzceb f9015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, int i10, String str, zzaqf zzaqfVar, zzaqe zzaqeVar, byte[] bArr, Map map, zzceb zzcebVar) {
        super(i10, str, zzaqfVar, zzaqeVar);
        this.f9013a = bArr;
        this.f9014b = map;
        this.f9015c = zzcebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final Map zzl() {
        Map map = this.f9014b;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzare, com.google.android.gms.internal.ads.zzaqa
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final byte[] zzx() {
        byte[] bArr = this.f9013a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzare
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.f9015c.zzg(str);
        super.zzo(str);
    }
}
