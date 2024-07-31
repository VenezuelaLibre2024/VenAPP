package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvr extends zzgzu implements zzhbf {
    private static final zzgvr zzb;
    private String zzd = "";

    static {
        zzgvr zzgvrVar = new zzgvr();
        zzb = zzgvrVar;
        zzgzu.zzaU(zzgvr.class, zzgvrVar);
    }

    private zzgvr() {
    }

    public static zzgvq zza() {
        return (zzgvq) zzb.zzaA();
    }

    public static zzgvr zzd() {
        return zzb;
    }

    public static zzgvr zze(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzgvr) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    public static /* synthetic */ void zzg(zzgvr zzgvrVar, String str) {
        str.getClass();
        zzgvrVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzgvr();
        }
        if (i11 == 4) {
            return new zzgvq(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zzd;
    }
}
