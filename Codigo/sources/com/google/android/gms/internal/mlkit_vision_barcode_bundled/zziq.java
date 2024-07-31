package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zziq extends zzed implements zzfp {
    private static final zziq zza;
    private int zzd;
    private int zze;
    private zzij zzh;
    private int zzj;
    private int zzk;
    private zzel zzf = zzed.zzO();
    private int zzg = -1;
    private String zzi = "";
    private zzej zzl = zzed.zzN();
    private String zzm = "";

    static {
        zziq zziqVar = new zziq();
        zza = zziqVar;
        zzed.zzU(zziq.class, zziqVar);
    }

    private zziq() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006", new Object[]{"zzd", "zze", zzim.zza, "zzf", zzil.class, "zzg", "zzh", "zzi", "zzj", zzio.zza, "zzk", zzip.zza, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zziq();
        }
        if (i11 == 4) {
            return new zzin(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
