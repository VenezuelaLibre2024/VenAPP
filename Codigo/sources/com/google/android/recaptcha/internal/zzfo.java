package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzfo extends zzgk {
    private static final zzfo zzd;
    private int zze;
    private boolean zzf;
    private byte zzh = 2;
    private zzgv zzg = zzii.zze();

    static {
        zzfo zzfoVar = new zzfo();
        zzd = zzfoVar;
        zzgo.zzC(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfo zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new zzij(zzd, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"zze", "zzf", "zzg", zzfs.class});
        }
        if (i11 == 3) {
            return new zzfo();
        }
        if (i11 == 4) {
            return new zzfn(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
