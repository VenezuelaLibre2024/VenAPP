package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzht extends zzed implements zzfp {
    private static final zzht zza;
    private int zzd;
    private int zze;
    private zzjx zzf;
    private zzjj zzg;
    private zzjl zzh;

    static {
        zzht zzhtVar = new zzht();
        zza = zzhtVar;
        zzed.zzU(zzht.class, zzhtVar);
    }

    private zzht() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", zzir.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzht();
        }
        if (i11 == 4) {
            return new zzhs(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
