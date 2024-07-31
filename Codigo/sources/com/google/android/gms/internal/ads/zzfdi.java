package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u4;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdi implements zzfjq {
    public final zzfec zza;
    public final zzfee zzb;
    public final u4 zzc;
    public final String zzd;
    public final Executor zze;
    public final f5 zzf;
    public final zzfjf zzg;

    public zzfdi(zzfec zzfecVar, zzfee zzfeeVar, u4 u4Var, String str, Executor executor, f5 f5Var, zzfjf zzfjfVar) {
        this.zza = zzfecVar;
        this.zzb = zzfeeVar;
        this.zzc = u4Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = f5Var;
        this.zzg = zzfjfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjq
    public final zzfjf zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfjq
    public final Executor zzb() {
        return this.zze;
    }
}
