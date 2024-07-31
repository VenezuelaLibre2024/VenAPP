package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.a;
import com.google.firebase.auth.q0;
import java.util.Map;
import java.util.concurrent.Executor;
import la.i;

/* loaded from: classes2.dex */
public final class zzadt {
    private static final Map<String, zzadv> zza = new a();

    public static q0.b zza(String str, q0.b bVar, zzacx zzacxVar) {
        zza(str, zzacxVar);
        return new zzads(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacx zzacxVar) {
        zza.put(str, new zzadv(zzacxVar, i.d().a()));
    }

    public static boolean zza(String str, q0.b bVar, Activity activity, Executor executor) {
        Map<String, zzadv> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzadv zzadvVar = map.get(str);
        if (i.d().a() - zzadvVar.zzb >= 120000) {
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
