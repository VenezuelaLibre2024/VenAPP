package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzmn extends zzgo implements zzhz {
    private static final zzmn zzb;
    private zzgv zzd = zzgo.zzw();
    private int zze;

    static {
        zzmn zzmnVar = new zzmn();
        zzb = zzmnVar;
        zzgo.zzC(zzmn.class, zzmnVar);
    }

    private zzmn() {
    }

    public static zzmk zzf() {
        return (zzmk) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzmn zzmnVar, zzmm zzmmVar) {
        zzmmVar.getClass();
        zzmnVar.zzk();
        zzmnVar.zzd.add(zzmmVar);
    }

    public static /* synthetic */ void zzj(zzmn zzmnVar, Iterable iterable) {
        zzmnVar.zzk();
        zzei.zzc(iterable, zzmnVar.zzd);
    }

    private final void zzk() {
        zzgv zzgvVar = this.zzd;
        if (zzgvVar.zzc()) {
            return;
        }
        this.zzd = zzgo.zzx(zzgvVar);
    }

    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzmm.class, "zze"});
        }
        if (i11 == 3) {
            return new zzmn();
        }
        if (i11 == 4) {
            return new zzmk(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
