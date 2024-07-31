package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public class zzjn {
    private static final zzik zza = zzik.zza;
    private zzhm zzb;
    private volatile zzkj zzc;
    private volatile zzhm zzd;

    private final zzkj zzb(zzkj zzkjVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzkjVar;
                        this.zzd = zzhm.zza;
                    } catch (zzji unused) {
                        this.zzc = zzkjVar;
                        this.zzd = zzhm.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjn)) {
            return false;
        }
        zzjn zzjnVar = (zzjn) obj;
        zzkj zzkjVar = this.zzc;
        zzkj zzkjVar2 = zzjnVar.zzc;
        return (zzkjVar == null && zzkjVar2 == null) ? zzc().equals(zzjnVar.zzc()) : (zzkjVar == null || zzkjVar2 == null) ? zzkjVar != null ? zzkjVar.equals(zzjnVar.zzb(zzkjVar.zzcf())) : zzb(zzkjVar2.zzcf()).equals(zzkjVar2) : zzkjVar.equals(zzkjVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkj zza(zzkj zzkjVar) {
        zzkj zzkjVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkjVar;
        return zzkjVar2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzbw();
        }
        return 0;
    }

    public final zzhm zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            this.zzd = this.zzc == null ? zzhm.zza : this.zzc.zzbu();
            return this.zzd;
        }
    }
}
