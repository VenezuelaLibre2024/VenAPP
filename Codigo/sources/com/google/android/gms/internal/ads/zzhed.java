package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhed extends zzgzu implements zzhbf {
    private static final zzhed zzb;
    private int zzd;
    private String zze = "";

    static {
        zzhed zzhedVar = new zzhed();
        zzb = zzhedVar;
        zzgzu.zzaU(zzhed.class, zzhedVar);
    }

    private zzhed() {
    }

    public static zzhec zza() {
        return (zzhec) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzhed zzhedVar, String str) {
        zzhedVar.zzd |= 1;
        zzhedVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzhed();
        }
        if (i11 == 4) {
            return new zzhec(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
