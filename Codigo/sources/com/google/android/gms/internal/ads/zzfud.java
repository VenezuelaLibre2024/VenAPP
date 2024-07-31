package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzfud {
    private static zzfud zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfud(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfud zzb(Context context) {
        if (zza == null) {
            zza = new zzfud(context);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(String str, long j10) {
        return this.zzc.getLong(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str, Object obj) {
        SharedPreferences.Editor putBoolean;
        if (obj instanceof String) {
            putBoolean = this.zzc.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            putBoolean = this.zzc.edit().putLong(str, ((Long) obj).longValue());
        } else {
            if (!(obj instanceof Boolean)) {
                Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb);
                throw new IOException("Failed to store " + str + " for app " + this.zzb);
            }
            putBoolean = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (putBoolean.commit()) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str) {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf(String str, boolean z10) {
        return this.zzc.getBoolean(str, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
