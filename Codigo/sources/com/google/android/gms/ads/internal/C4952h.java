package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfru;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.h */
/* loaded from: classes.dex */
public final class C4952h implements zzfru {

    /* renamed from: a */
    final /* synthetic */ RunnableC4953i f9939a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4952h(RunnableC4953i runnableC4953i) {
        this.f9939a = runnableC4953i;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zza(int i10, long j10) {
        zzfqr zzfqrVar;
        zzfqrVar = this.f9939a.f9947s;
        zzfqrVar.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zzb(int i10, long j10, String str) {
        zzfqr zzfqrVar;
        zzfqrVar = this.f9939a.f9947s;
        zzfqrVar.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
