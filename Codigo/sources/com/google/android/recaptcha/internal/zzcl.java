package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzcl implements zzby {
    public static final zzcl zza = new zzcl();

    private zzcl() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Byte)) {
            obj = null;
        }
        Byte b10 = (Byte) obj;
        if (b10 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzh(b10.byteValue());
    }
}
