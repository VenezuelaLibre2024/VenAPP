package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasb extends zzgzu implements zzhbf {
    private static final zzasb zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzasb zzasbVar = new zzasb();
        zzb = zzasbVar;
        zzgzu.zzaU(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzasc.zza});
        }
        if (i11 == 3) {
            return new zzasb();
        }
        zzarx zzarxVar = null;
        if (i11 == 4) {
            return new zzasa(zzarxVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
