package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgut extends zzgzu implements zzhbf {
    private static final zzgut zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.zzb;
    private int zzf;

    static {
        zzgut zzgutVar = new zzgut();
        zzb = zzgutVar;
        zzgzu.zzaU(zzgut.class, zzgutVar);
    }

    private zzgut() {
    }

    public static zzguq zza() {
        return (zzguq) zzb.zzaA();
    }

    public static zzgut zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgut zzgutVar, String str) {
        str.getClass();
        zzgutVar.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgut zzgutVar, zzgyl zzgylVar) {
        zzgylVar.getClass();
        zzgutVar.zze = zzgylVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgut();
        }
        zzgup zzgupVar = null;
        if (i11 == 4) {
            return new zzguq(zzgupVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgus zzc() {
        int i10 = this.zzf;
        zzgus zzgusVar = zzgus.UNKNOWN_KEYMATERIAL;
        zzgus zzgusVar2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzgus.REMOTE : zzgus.ASYMMETRIC_PUBLIC : zzgus.ASYMMETRIC_PRIVATE : zzgus.SYMMETRIC : zzgus.UNKNOWN_KEYMATERIAL;
        return zzgusVar2 == null ? zzgus.UNRECOGNIZED : zzgusVar2;
    }

    public final zzgyl zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
