package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzjv extends zzed implements zzfp {
    private static final zzjv zza;
    private int zzd;
    private String zze = "";

    static {
        zzjv zzjvVar = new zzjv();
        zza = zzjvVar;
        zzed.zzU(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzjv();
        }
        zzhr zzhrVar = null;
        if (i11 == 4) {
            return new zzju(zzhrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}