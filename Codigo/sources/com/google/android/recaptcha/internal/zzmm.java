package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzmm extends zzgo implements zzhz {
    private static final zzmm zzb;
    private int zzd = 0;
    private Object zze;
    private int zzf;

    static {
        zzmm zzmmVar = new zzmm();
        zzb = zzmmVar;
        zzgo.zzC(zzmm.class, zzmmVar);
    }

    private zzmm() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzG(zzmm zzmmVar, String str) {
        str.getClass();
        zzmmVar.zzd = 11;
        zzmmVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(zzmm zzmmVar, boolean z10) {
        zzmmVar.zzd = 1;
        zzmmVar.zze = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzI(zzmm zzmmVar, zzez zzezVar) {
        zzmmVar.zzd = 2;
        zzmmVar.zze = zzezVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzJ(zzmm zzmmVar, String str) {
        str.getClass();
        zzmmVar.zzd = 3;
        zzmmVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzK(zzmm zzmmVar, int i10) {
        zzmmVar.zzd = 4;
        zzmmVar.zze = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzL(zzmm zzmmVar, int i10) {
        zzmmVar.zzd = 5;
        zzmmVar.zze = Integer.valueOf(i10);
    }

    public static zzml zzf() {
        return (zzml) zzb.zzp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzmm zzmmVar, long j10) {
        zzmmVar.zzd = 7;
        zzmmVar.zze = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzmm zzmmVar, float f10) {
        zzmmVar.zzd = 9;
        zzmmVar.zze = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzmm zzmmVar, double d10) {
        zzmmVar.zzd = 10;
        zzmmVar.zze = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000\f\u000b", new Object[]{"zze", "zzd", "zzf"});
        }
        if (i11 == 3) {
            return new zzmm();
        }
        zzlv zzlvVar = null;
        if (i11 == 4) {
            return new zzml(zzlvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
