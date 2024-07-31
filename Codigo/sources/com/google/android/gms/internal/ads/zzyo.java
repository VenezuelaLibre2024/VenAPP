package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzyo {
    private zzyn zza;
    private zzyw zzb;

    public zzmg zzd() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzk zzkVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyp zzp(zzmh[] zzmhVarArr, zzws zzwsVar, zzur zzurVar, zzcx zzcxVar);

    public abstract void zzq(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzyw zzr() {
        zzyw zzywVar = this.zzb;
        zzek.zzb(zzywVar);
        return zzywVar;
    }

    public final void zzs(zzyn zzynVar, zzyw zzywVar) {
        this.zza = zzynVar;
        this.zzb = zzywVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzt() {
        zzyn zzynVar = this.zza;
        if (zzynVar != null) {
            zzynVar.zzj();
        }
    }
}
