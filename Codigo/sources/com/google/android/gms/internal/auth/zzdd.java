package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdd implements zzcl {
    private static final Map zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdd zza(Context context, String str, Runnable runnable) {
        zzdd zzddVar;
        if (zzcc.zzb()) {
            throw null;
        }
        synchronized (zzdd.class) {
            zzddVar = (zzdd) zza.get(null);
            if (zzddVar == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return zzddVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzdd.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzdd) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final Object zzb(String str) {
        throw null;
    }
}
