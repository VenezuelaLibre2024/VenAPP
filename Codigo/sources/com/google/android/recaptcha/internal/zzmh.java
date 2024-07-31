package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzmh extends zzgo implements zzhz {
    private static final zzmh zzb;
    private zzgv zzd = zzgo.zzw();

    static {
        zzmh zzmhVar = new zzmh();
        zzb = zzmhVar;
        zzgo.zzC(zzmh.class, zzmhVar);
    }

    private zzmh() {
    }

    public static zzmh zzg(byte[] bArr) {
        return (zzmh) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzmv.class});
        }
        if (i11 == 3) {
            return new zzmh();
        }
        if (i11 == 4) {
            return new zzmg(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
