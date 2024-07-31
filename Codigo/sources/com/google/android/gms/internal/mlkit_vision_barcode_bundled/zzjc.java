package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzjc extends zzed implements zzfp {
    private static final zzjc zza;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private zzdb zzh = zzdb.zzb;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        zzjc zzjcVar = new zzjc();
        zza = zzjcVar;
        zzed.zzU(zzjc.class, zzjcVar);
    }

    private zzjc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzeh zzehVar = zzjb.zza;
            return zzed.zzR(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", zzja.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzehVar, "zzn", zzehVar, "zzo"});
        }
        if (i11 == 3) {
            return new zzjc();
        }
        if (i11 == 4) {
            return new zziz(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
