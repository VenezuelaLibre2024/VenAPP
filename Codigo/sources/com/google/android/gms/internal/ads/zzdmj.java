package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;

/* loaded from: classes2.dex */
public final class zzdmj extends zzbji {
    private final zzdna zza;
    private com.google.android.gms.dynamic.b zzb;

    public zzdmj(zzdna zzdnaVar) {
        this.zza = zzdnaVar;
    }

    private static float zzb(com.google.android.gms.dynamic.b bVar) {
        Drawable drawable;
        if (bVar == null || (drawable = (Drawable) com.google.android.gms.dynamic.d.g2(bVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zze() {
        if (!((Boolean) a0.c().zza(zzbgc.zzgm)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e10) {
                zzcec.zzh("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        com.google.android.gms.dynamic.b bVar = this.zzb;
        if (bVar != null) {
            return zzb(bVar);
        }
        zzbjm zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        float zzd = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : zzm.zzd() / zzm.zzc();
        return zzd == 0.0f ? zzb(zzm.zzf()) : zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzf() {
        if (((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzg() {
        if (((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final s2 zzh() {
        if (((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue()) {
            return this.zza.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final com.google.android.gms.dynamic.b zzi() {
        com.google.android.gms.dynamic.b bVar = this.zzb;
        if (bVar != null) {
            return bVar;
        }
        zzbjm zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzj(com.google.android.gms.dynamic.b bVar) {
        this.zzb = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzk() {
        if (((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue()) {
            return this.zza.zzaf();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzl() {
        return ((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzm(zzbku zzbkuVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzgn)).booleanValue() && (this.zza.zzj() instanceof zzcki)) {
            ((zzcki) this.zza.zzj()).zzv(zzbkuVar);
        }
    }
}
