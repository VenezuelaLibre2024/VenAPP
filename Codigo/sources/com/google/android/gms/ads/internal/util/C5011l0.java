package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzcec;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.l0 */
/* loaded from: classes.dex */
public final class C5011l0 implements zzaqe {

    /* renamed from: a */
    final /* synthetic */ String f10107a;

    /* renamed from: b */
    final /* synthetic */ C5027p0 f10108b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5011l0(C5039s0 c5039s0, String str, C5027p0 c5027p0) {
        this.f10107a = str;
        this.f10108b = c5027p0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final void zza(zzaqj zzaqjVar) {
        zzcec.zzj("Failed to load URL: " + this.f10107a + "\n" + zzaqjVar.toString());
        this.f10108b.zza((Object) null);
    }
}
