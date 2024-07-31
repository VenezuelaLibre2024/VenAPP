package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzv extends zzed implements zzfp {
    public static final zzeb zza;
    private static final zzv zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private zzkd zzh;
    private byte zzi = 2;

    static {
        zzv zzvVar = new zzv();
        zzd = zzvVar;
        zzed.zzU(zzv.class, zzvVar);
        zza = zzed.zzH(zzkd.zzf(), zzvVar, zzvVar, null, 13258261, zzho.zzk, zzv.class);
    }

    private zzv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return zzed.zzR(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzv();
        }
        if (i11 == 4) {
            return new zzu(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
