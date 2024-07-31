package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzlz extends zzgo implements zzhz {
    private static final zzlz zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private int zzg;

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzgo.zzC(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    public static zzlz zzg(byte[] bArr) {
        return (zzlz) zzgo.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzlz();
        }
        if (i11 == 4) {
            return new zzly(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzmf zzi() {
        zzmf zzb2 = zzmf.zzb(this.zzf);
        return zzb2 == null ? zzmf.UNRECOGNIZED : zzb2;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }
}
