package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzcj implements zzby {
    public static final zzcj zza = new zzcj();

    private zzcj() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        zzblVar.zzc().zzf(i10, objArr[0]);
    }
}
