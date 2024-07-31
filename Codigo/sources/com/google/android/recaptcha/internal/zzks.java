package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzks extends zzgo implements zzhz {
    private static final zzks zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzks zzksVar = new zzks();
        zzb = zzksVar;
        zzgo.zzC(zzks.class, zzksVar);
    }

    private zzks() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzks();
        }
        zzkq zzkqVar = null;
        if (i11 == 4) {
            return new zzkr(zzkqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
