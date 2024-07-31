package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzcc implements zzby {
    public static final zzcc zza = new zzcc();

    private zzcc() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Class<?> cls = objArr[0];
        if (true != (cls instanceof Object)) {
            cls = null;
        }
        if (cls == null) {
            throw new zzt(4, 5, null);
        }
        Class<?> cls2 = cls instanceof Class ? cls : cls.getClass();
        Object obj = objArr[1];
        if (true != (obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        try {
            zzblVar.zzc().zzf(i10, cls2.getField(zzbx.zza(this, str, zzblVar.zza())));
        } catch (Exception e10) {
            throw new zzt(6, 10, e10);
        }
    }
}
