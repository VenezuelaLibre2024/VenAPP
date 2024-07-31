package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzmd extends zzgo implements zzhz {
    private static final zzmd zzb;
    private int zzd;

    static {
        zzmd zzmdVar = new zzmd();
        zzb = zzmdVar;
        zzgo.zzC(zzmd.class, zzmdVar);
    }

    private zzmd() {
    }

    public static zzmd zzg(byte[] bArr) {
        return (zzmd) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzmd();
        }
        if (i11 == 4) {
            return new zzmc(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzb2 = zzmf.zzb(this.zzd);
        return zzb2 == null ? zzmf.UNRECOGNIZED : zzb2;
    }
}
