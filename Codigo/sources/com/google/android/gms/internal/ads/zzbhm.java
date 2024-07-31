package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzbhm {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbhm(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbhm zza(String str, double d10) {
        return new zzbhm(str, Double.valueOf(d10), 3);
    }

    public static zzbhm zzb(String str, long j10) {
        return new zzbhm(str, Long.valueOf(j10), 2);
    }

    public static zzbhm zzc(String str, String str2) {
        return new zzbhm(str, str2, 4);
    }

    public static zzbhm zzd(String str, boolean z10) {
        return new zzbhm(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbiq zza = zzbis.zza();
        if (zza != null) {
            int i10 = this.zzc - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbis.zzb() != null) {
            zzbis.zzb().zza();
        }
        return this.zzb;
    }
}
