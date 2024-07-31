package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzty implements zzvb, zzrt {
    final /* synthetic */ zzua zza;
    private final Object zzb;
    private zzva zzc;
    private zzrs zzd;

    public zzty(zzua zzuaVar, Object obj) {
        this.zza = zzuaVar;
        this.zzc = zzuaVar.zze(null);
        this.zzd = zzuaVar.zzc(null);
        this.zzb = obj;
    }

    private final zzun zzf(zzun zzunVar, zzur zzurVar) {
        zzua zzuaVar = this.zza;
        Object obj = this.zzb;
        long j10 = zzunVar.zzc;
        zzuaVar.zzx(obj, j10, zzurVar);
        zzua zzuaVar2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zzunVar.zzd;
        zzuaVar2.zzx(obj2, j11, zzurVar);
        return (j10 == zzunVar.zzc && j11 == zzunVar.zzd) ? zzunVar : new zzun(1, zzunVar.zza, zzunVar.zzb, 0, null, j10, j11);
    }

    private final boolean zzg(int i10, zzur zzurVar) {
        zzur zzurVar2;
        if (zzurVar != null) {
            zzurVar2 = this.zza.zzy(this.zzb, zzurVar);
            if (zzurVar2 == null) {
                return false;
            }
        } else {
            zzurVar2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzva zzvaVar = this.zzc;
        int i11 = zzvaVar.zza;
        if (!zzfy.zzF(zzvaVar.zzb, zzurVar2)) {
            this.zzc = this.zza.zzf(0, zzurVar2);
        }
        zzrs zzrsVar = this.zzd;
        int i12 = zzrsVar.zza;
        if (zzfy.zzF(zzrsVar.zzb, zzurVar2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzurVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzae(int i10, zzur zzurVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzc(zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaf(int i10, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzd(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i10, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zze(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i10, zzur zzurVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z10) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzf(zzuiVar, zzf(zzunVar, zzurVar), iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i10, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzg(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }
}
