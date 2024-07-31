package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes2.dex */
public final class zzgwc extends zzgzu implements zzhbf {
    private static final zzgwc zzb;
    private String zzd = "";
    private zzhad zze = zzgzu.zzaN();

    static {
        zzgwc zzgwcVar = new zzgwc();
        zzb = zzgwcVar;
        zzgzu.zzaU(zzgwc.class, zzgwcVar);
    }

    private zzgwc() {
    }

    public static zzgwc zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgvb.class});
        }
        if (i11 == 3) {
            return new zzgwc();
        }
        if (i11 == 4) {
            return new zzgwb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
