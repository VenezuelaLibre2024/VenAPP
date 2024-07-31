package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfno extends zzgzu implements zzhbf {
    private static final zzfno zzb;
    private int zzd;
    private int zzf;
    private String zze = "";
    private String zzg = "";

    static {
        zzfno zzfnoVar = new zzfno();
        zzb = zzfnoVar;
        zzgzu.zzaU(zzfno.class, zzfnoVar);
    }

    private zzfno() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzfno();
        }
        zzfnm zzfnmVar = null;
        if (i11 == 4) {
            return new zzfnn(zzfnmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
