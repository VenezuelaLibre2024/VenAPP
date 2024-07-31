package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzguo extends zzgzu implements zzhbf {
    private static final zzguo zzb;
    private int zzd;
    private int zze;

    static {
        zzguo zzguoVar = new zzguo();
        zzb = zzguoVar;
        zzgzu.zzaU(zzguo.class, zzguoVar);
    }

    private zzguo() {
    }

    public static zzgun zzd() {
        return (zzgun) zzb.zzaA();
    }

    public static zzguo zzf() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzguo();
        }
        if (i11 == 4) {
            return new zzgun(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzguf zzc() {
        int i10 = this.zzd;
        zzguf zzgufVar = zzguf.UNKNOWN_HASH;
        zzguf zzgufVar2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzguf.SHA224 : zzguf.SHA512 : zzguf.SHA256 : zzguf.SHA384 : zzguf.SHA1 : zzguf.UNKNOWN_HASH;
        return zzgufVar2 == null ? zzguf.UNRECOGNIZED : zzgufVar2;
    }
}
