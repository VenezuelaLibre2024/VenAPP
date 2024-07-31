package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzasw extends zzgzu implements zzhbf {
    private static final zzasw zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzasw zzaswVar = new zzasw();
        zzb = zzaswVar;
        zzgzu.zzaU(zzasw.class, zzaswVar);
    }

    private zzasw() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzasl.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzasw();
        }
        zzasf zzasfVar = null;
        if (i11 == 4) {
            return new zzasv(zzasfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
