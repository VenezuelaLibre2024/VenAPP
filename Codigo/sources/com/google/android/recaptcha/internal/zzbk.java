package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzbk {
    public static final zzbk zza = new zzbk();

    private zzbk() {
    }

    public static final Class zza(Object obj) {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            Class cls = intValue == 1 ? Integer.TYPE : intValue == 2 ? Short.TYPE : intValue == 3 ? Byte.TYPE : intValue == 4 ? Long.TYPE : intValue == 5 ? Character.TYPE : intValue == 6 ? Float.TYPE : intValue == 7 ? Double.TYPE : intValue == 8 ? Boolean.TYPE : intValue == 9 ? zzcr.class : null;
            if (cls != null) {
                return cls;
            }
            throw new zzt(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzt(6, 8, null);
        }
        String str = (String) obj;
        if (!zzbj.zzc(str)) {
            throw new zzt(6, 47, null);
        }
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            throw new zzt(6, 8, e10);
        }
    }
}
