package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzmp extends zzgo implements zzhz {
    private static final zzmp zzb;
    private String zzd = "";
    private zzgt zze = zzgo.zzv();

    static {
        zzmp zzmpVar = new zzmp();
        zzb = zzmpVar;
        zzgo.zzC(zzmp.class, zzmpVar);
    }

    private zzmp() {
    }

    public static zzmp zzg(byte[] bArr) {
        return (zzmp) zzgo.zzu(zzb, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.recaptcha.internal.zzgo
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgo.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzmp();
        }
        zzlv zzlvVar = null;
        if (i11 == 4) {
            return new zzmo(zzlvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zze;
    }
}
