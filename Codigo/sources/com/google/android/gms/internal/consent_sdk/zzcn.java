package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcn {
    private final Context zza;
    private final Map zzb = new HashMap();

    public zzcn(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor zzd(String str) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, this.zza.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.zzb.get(str);
    }

    public final void zzb() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean zzc(String str, Object obj) {
        String str2;
        float floatValue;
        zzcm zza = zzco.zza(this.zza, str);
        if (zza == null) {
            return false;
        }
        SharedPreferences.Editor zzd = zzd(zza.zza);
        if (obj instanceof Integer) {
            zzd.putInt(zza.zzb, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            zzd.putLong(zza.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            str2 = zza.zzb;
            floatValue = ((Double) obj).floatValue();
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Boolean) {
                    zzd.putBoolean(zza.zzb, ((Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                zzd.putString(zza.zzb, (String) obj);
                return true;
            }
            str2 = zza.zzb;
            floatValue = ((Float) obj).floatValue();
        }
        zzd.putFloat(str2, floatValue);
        return true;
    }
}
