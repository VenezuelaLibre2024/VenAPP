package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnk extends zzgzu implements zzhbf {
    private static final zzfnk zzb;
    private zzhad zzd = zzgzu.zzaN();

    static {
        zzfnk zzfnkVar = new zzfnk();
        zzb = zzfnkVar;
        zzgzu.zzaU(zzfnk.class, zzfnkVar);
    }

    private zzfnk() {
    }

    public static zzfnh zzc() {
        return (zzfnh) zzb.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfnk zzfnkVar, zzfnj zzfnjVar) {
        zzfnjVar.getClass();
        zzhad zzhadVar = zzfnkVar.zzd;
        if (!zzhadVar.zzc()) {
            zzfnkVar.zzd = zzgzu.zzaO(zzhadVar);
        }
        zzfnkVar.zzd.add(zzfnjVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfnj.class});
        }
        if (i11 == 3) {
            return new zzfnk();
        }
        zzfng zzfngVar = null;
        if (i11 == 4) {
            return new zzfnh(zzfngVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
