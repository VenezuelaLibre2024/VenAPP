package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnj extends zzgzu implements zzhbf {
    private static final zzfnj zzb;
    private int zzd;
    private zzfnf zze;

    static {
        zzfnj zzfnjVar = new zzfnj();
        zzb = zzfnjVar;
        zzgzu.zzaU(zzfnj.class, zzfnjVar);
    }

    private zzfnj() {
    }

    public static zzfni zza() {
        return (zzfni) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzfnj zzfnjVar, zzfnf zzfnfVar) {
        zzfnfVar.getClass();
        zzfnjVar.zze = zzfnfVar;
        zzfnjVar.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzfnj();
        }
        zzfng zzfngVar = null;
        if (i11 == 4) {
            return new zzfni(zzfngVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
