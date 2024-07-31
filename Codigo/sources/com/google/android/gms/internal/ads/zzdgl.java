package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzdgl {
    protected final Map zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdgl(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdim zzdimVar) {
        zzo(zzdimVar.zza, zzdimVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdim) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzu(final zzdgk zzdgkVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgj
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdgk.this.zza(key);
                    } catch (Throwable th2) {
                        t.q().zzv(th2, "EventEmitter.notify");
                        u1.b("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}
