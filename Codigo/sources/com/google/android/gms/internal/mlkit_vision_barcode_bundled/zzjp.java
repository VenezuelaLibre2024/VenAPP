package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzjp extends zzed implements zzfp {
    private static final zzjp zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzjp zzjpVar = new zzjp();
        zza = zzjpVar;
        zzed.zzU(zzjp.class, zzjpVar);
    }

    private zzjp() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzjp();
        }
        zzhr zzhrVar = null;
        if (i11 == 4) {
            return new zzjo(zzhrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
