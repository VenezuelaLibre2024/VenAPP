package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzfr extends zzgo implements zzhz {
    private static final zzfr zzb;
    private int zzd;
    private boolean zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzfr zzfrVar = new zzfr();
        zzb = zzfrVar;
        zzgo.zzC(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return new zzij(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzfr();
        }
        if (i11 == 4) {
            return new zzfq(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
