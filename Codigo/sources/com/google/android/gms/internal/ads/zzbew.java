package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzbew extends zzgzu implements zzhbf {
    private static final zzbew zzb;
    private int zzd;
    private int zze;

    static {
        zzbew zzbewVar = new zzbew();
        zzb = zzbewVar;
        zzgzu.zzaU(zzbew.class, zzbewVar);
    }

    private zzbew() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzbev.zza});
        }
        if (i11 == 3) {
            return new zzbew();
        }
        zzbbw zzbbwVar = null;
        if (i11 == 4) {
            return new zzbeu(zzbbwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
