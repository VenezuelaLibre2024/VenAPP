package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzca implements zzby {
    public static final zzca zza = new zzca();

    private zzca() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        try {
            if (obj instanceof String) {
                obj = zzbx.zza(this, (String) obj, zzblVar.zza());
            }
            zzblVar.zzc().zzf(i10, zzbk.zza(obj));
        } catch (Exception e10) {
            throw new zzt(6, 8, e10);
        }
    }
}
