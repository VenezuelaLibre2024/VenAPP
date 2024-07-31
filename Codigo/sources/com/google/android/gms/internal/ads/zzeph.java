package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.n0;
import com.google.android.gms.ads.internal.client.p0;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzeph extends p0 {
    final zzfhf zza;
    final zzdnj zzb;
    private final Context zzc;
    private final zzclg zzd;
    private h0 zze;

    public zzeph(zzclg zzclgVar, Context context, String str) {
        zzfhf zzfhfVar = new zzfhf();
        this.zza = zzfhfVar;
        this.zzb = new zzdnj();
        this.zzd = zzclgVar;
        zzfhfVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final n0 zze() {
        zzdnl zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfhf zzfhfVar = this.zza;
        if (zzfhfVar.zzg() == null) {
            zzfhfVar.zzr(z4.w1());
        }
        return new zzepi(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzf(zzbkk zzbkkVar) {
        this.zzb.zza(zzbkkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzg(zzbkn zzbknVar) {
        this.zzb.zzb(zzbknVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzh(String str, zzbkt zzbktVar, zzbkq zzbkqVar) {
        this.zzb.zzc(str, zzbktVar, zzbkqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzi(zzbpy zzbpyVar) {
        this.zzb.zzd(zzbpyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzj(zzbkx zzbkxVar, z4 z4Var) {
        this.zzb.zze(zzbkxVar);
        this.zza.zzr(z4Var);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzk(zzbla zzblaVar) {
        this.zzb.zzf(zzblaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzl(h0 h0Var) {
        this.zze = h0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzm(a9.a aVar) {
        this.zza.zzq(aVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzn(zzbpp zzbppVar) {
        this.zza.zzv(zzbppVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzo(zzbjb zzbjbVar) {
        this.zza.zzA(zzbjbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzp(a9.g gVar) {
        this.zza.zzD(gVar);
    }

    @Override // com.google.android.gms.ads.internal.client.q0
    public final void zzq(g1 g1Var) {
        this.zza.zzQ(g1Var);
    }
}
