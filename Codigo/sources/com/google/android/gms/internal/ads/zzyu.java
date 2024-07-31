package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzyu {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyv zzyvVar) {
        zzc(zzyvVar);
        this.zza.add(new zzyt(handler, zzyvVar));
    }

    public final void zzb(final int i10, final long j10, final long j11) {
        boolean z10;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyt zzytVar = (zzyt) it.next();
            z10 = zzytVar.zzc;
            if (!z10) {
                handler = zzytVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzys
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyv zzyvVar;
                        zzyvVar = zzyt.this.zzb;
                        zzyvVar.zzX(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void zzc(zzyv zzyvVar) {
        zzyv zzyvVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyt zzytVar = (zzyt) it.next();
            zzyvVar2 = zzytVar.zzb;
            if (zzyvVar2 == zzyvVar) {
                zzytVar.zzc();
                this.zza.remove(zzytVar);
            }
        }
    }
}
