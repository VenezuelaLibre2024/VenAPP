package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zziw extends zzed implements zzfp {
    private static final zziw zza;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        zziw zziwVar = new zziw();
        zza = zziwVar;
        zzed.zzU(zziw.class, zziwVar);
    }

    private zziw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzeh zzehVar = zzix.zza;
            return zzed.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", zziy.zza, "zzg", "zzh", zziu.zza, "zzi", zzehVar, "zzj", zzehVar, "zzk", zzehVar, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zziw();
        }
        if (i11 == 4) {
            return new zziv(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
