package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfru;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements zzfru {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f8852a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(i iVar) {
        this.f8852a = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zza(int i10, long j10) {
        zzfqr zzfqrVar;
        zzfqrVar = this.f8852a.f8860s;
        zzfqrVar.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zzb(int i10, long j10, String str) {
        zzfqr zzfqrVar;
        zzfqrVar = this.f8852a.f8860s;
        zzfqrVar.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
