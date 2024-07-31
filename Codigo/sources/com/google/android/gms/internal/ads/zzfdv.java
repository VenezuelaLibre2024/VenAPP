package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdv implements zzfws {
    final /* synthetic */ zzfdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfdv(zzfdz zzfdzVar) {
        this.zza = zzfdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfjf zze;
        zzfdy zzfdyVar;
        zzcec.zzh("", (zzecf) obj);
        u1.a("Failed to get a cache key, reverting to legacy flow.");
        zzfdz zzfdzVar = this.zza;
        zze = zzfdzVar.zze();
        zzfdzVar.zzd = new zzfdy(null, zze, null);
        zzfdyVar = this.zza.zzd;
        return zzfdyVar;
    }
}
