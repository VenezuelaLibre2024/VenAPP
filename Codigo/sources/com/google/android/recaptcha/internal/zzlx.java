package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzlx extends zzgo implements zzhz {
    private static final zzlx zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzgo.zzC(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzlx();
        }
        zzlv zzlvVar = null;
        if (i11 == 4) {
            return new zzlw(zzlvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
