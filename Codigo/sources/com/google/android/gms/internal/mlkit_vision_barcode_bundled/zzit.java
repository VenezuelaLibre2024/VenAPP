package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzit extends zzed implements zzfp {
    private static final zzit zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzit zzitVar = new zzit();
        zza = zzitVar;
        zzed.zzU(zzit.class, zzitVar);
    }

    private zzit() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzed.zzR(zza, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzit();
        }
        zzhr zzhrVar = null;
        if (i11 == 4) {
            return new zzis(zzhrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
