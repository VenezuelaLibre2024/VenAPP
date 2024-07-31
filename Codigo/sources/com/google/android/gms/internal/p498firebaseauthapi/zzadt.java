package com.google.android.gms.internal.p498firebaseauthapi;

import android.app.Activity;
import androidx.collection.C0731a;
import com.google.firebase.auth.C6112q0;
import java.util.Map;
import java.util.concurrent.Executor;
import la.C9464i;

/* loaded from: classes2.dex */
public final class zzadt {
    private static final Map<String, zzadv> zza = new C0731a();

    public static C6112q0.b zza(String str, C6112q0.b bVar, zzacx zzacxVar) {
        zza(str, zzacxVar);
        return new zzads(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacx zzacxVar) {
        zza.put(str, new zzadv(zzacxVar, C9464i.m28142d().mo28130a()));
    }

    public static boolean zza(String str, C6112q0.b bVar, Activity activity, Executor executor) {
        Map<String, zzadv> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzadv zzadvVar = map.get(str);
        if (C9464i.m28142d().mo28130a() - zzadvVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzacx zzacxVar = zzadvVar.zza;
        if (zzacxVar == null) {
            return true;
        }
        zzacxVar.zza(bVar, activity, executor, str);
        return true;
    }
}
