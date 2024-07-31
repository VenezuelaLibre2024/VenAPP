package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class zzkd extends zzdz {
    private static final zzkd zzd;
    private byte zze = 2;

    static {
        zzkd zzkdVar = new zzkd();
        zzd = zzkdVar;
        zzed.zzU(zzkd.class, zzkdVar);
    }

    private zzkd() {
    }

    public static zzkd zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return zzed.zzR(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new zzkd();
        }
        if (i11 == 4) {
            return new zzkc(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
