package com.google.android.gms.internal.auth;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzhr extends zzeu implements zzfx {
    private static final zzhr zzb;
    private zzey zzd = zzeu.zzc();

    static {
        zzhr zzhrVar = new zzhr();
        zzb = zzhrVar;
        zzeu.zzg(zzhr.class, zzhrVar);
    }

    private zzhr() {
    }

    public static zzhr zzk(byte[] bArr) {
        return (zzhr) zzeu.zzb(zzb, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.auth.zzeu
    public final Object zzi(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzeu.zzf(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzhr();
        }
        zzhp zzhpVar = null;
        if (i11 == 4) {
            return new zzhq(zzhpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzl() {
        return this.zzd;
    }
}
