package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzgq implements zzgw {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhb zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgq(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
        zzhyVar.getClass();
        if (this.zzb.contains(zzhyVar)) {
            return;
        }
        this.zzb.add(zzhyVar);
        this.zzc++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzhb zzhbVar = this.zzd;
        int i11 = zzfy.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzhy) this.zzb.get(i12)).zza(this, zzhbVar, this.zza, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh() {
        zzhb zzhbVar = this.zzd;
        int i10 = zzfy.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhy) this.zzb.get(i11)).zzb(this, zzhbVar, this.zza);
        }
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzhb zzhbVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhy) this.zzb.get(i10)).zzc(this, zzhbVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzhb zzhbVar) {
        this.zzd = zzhbVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhy) this.zzb.get(i10)).zzd(this, zzhbVar, this.zza);
        }
    }
}
