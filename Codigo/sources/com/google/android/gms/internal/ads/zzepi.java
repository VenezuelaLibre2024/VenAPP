package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.m0;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzepi extends m0 {
    private final zzeqp zza;

    public zzepi(Context context, zzclg zzclgVar, zzfhf zzfhfVar, zzdnl zzdnlVar, h0 h0Var) {
        zzeqr zzeqrVar = new zzeqr(zzdnlVar, zzclgVar.zzy());
        zzeqrVar.zze(h0Var);
        this.zza = new zzeqp(new zzerb(zzclgVar, context, zzeqrVar, zzfhfVar), zzfhfVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final void zzg(u4 u4Var) {
        this.zza.zzd(u4Var, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final synchronized void zzh(u4 u4Var, int i10) {
        this.zza.zzd(u4Var, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.n0
    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
