package com.google.android.gms.internal.p498firebaseauthapi;

import androidx.collection.C0731a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p485zb.C12867g;

/* loaded from: classes2.dex */
public final class zzaed {
    private static final Map<String, zzaec> zza = new C0731a();
    private static final Map<String, List<WeakReference<zzaef>>> zzb = new C0731a();

    public static String zza(String str) {
        zzaec zzaecVar;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":")) + "emulator/auth/handler";
    }

    private static String zza(String str, int i10, boolean z10) {
        StringBuilder sb2;
        String str2;
        if (z10) {
            sb2 = new StringBuilder("http://[");
            sb2.append(str);
            str2 = "]:";
        } else {
            sb2 = new StringBuilder("http://");
            sb2.append(str);
            str2 = ":";
        }
        sb2.append(str2);
        sb2.append(i10);
        sb2.append("/");
        return sb2.toString();
    }

    public static void zza(String str, zzaef zzaefVar) {
        Map<String, List<WeakReference<zzaef>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzaefVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference<>(zzaefVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(C12867g c12867g, String str, int i10) {
        String m42643b = c12867g.m42632r().m42643b();
        Map<String, zzaec> map = zza;
        synchronized (map) {
            map.put(m42643b, new zzaec(str, i10));
        }
        Map<String, List<WeakReference<zzaef>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(m42643b)) {
                Iterator<WeakReference<zzaef>> it = map2.get(m42643b).iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    zzaef zzaefVar = it.next().get();
                    if (zzaefVar != null) {
                        zzaefVar.zza();
                        z10 = true;
                    }
                }
                if (!z10) {
                    zza.remove(m42643b);
                }
            }
        }
    }

    public static boolean zza(C12867g c12867g) {
        return zza.containsKey(c12867g.m42632r().m42643b());
    }

    public static String zzb(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzaec zzaecVar;
        String str2;
        Map<String, zzaec> map = zza;
        synchronized (map) {
            zzaecVar = map.get(str);
        }
        if (zzaecVar != null) {
            str2 = "" + zza(zzaecVar.zzb(), zzaecVar.zza(), zzaecVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }
}
