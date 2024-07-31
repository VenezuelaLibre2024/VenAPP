package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzblo extends zzbkp {
    final /* synthetic */ zzblr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzblo(zzblr zzblrVar, zzbln zzblnVar) {
        this.zza = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(zzbkg zzbkgVar, String str) {
        zzblr zzblrVar = this.zza;
        if (zzblrVar.zzb == null) {
            return;
        }
        zzblrVar.zzb.c(zzblrVar.zzf(zzbkgVar), str);
    }
}
