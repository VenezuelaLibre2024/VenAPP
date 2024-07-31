package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtx extends zzgzu implements zzhbf {
    private static final zzgtx zzb;
    private int zzd;
    private int zze;

    static {
        zzgtx zzgtxVar = new zzgtx();
        zzb = zzgtxVar;
        zzgzu.zzaU(zzgtx.class, zzgtxVar);
    }

    private zzgtx() {
    }

    public static zzgtw zzd() {
        return (zzgtw) zzb.zzaA();
    }

    public static zzgtx zzf(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgtx) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i11 == 3) {
            return new zzgtx();
        }
        if (i11 == 4) {
            return new zzgtw(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }
}
