package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class zzel implements Runnable {
    final Future zza;
    final zzek zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzel(Future future, zzek zzekVar) {
        this.zza = future;
        this.zzb = zzekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza = zzfa.zza((zzez) this.zza);
        if (zza != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            Future future = this.zza;
            boolean z10 = false;
            if (!future.isDone()) {
                throw new IllegalStateException(zzbd.zzb("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (Error e10) {
            e = e10;
            this.zzb.zza(e);
        } catch (RuntimeException e11) {
            e = e11;
            this.zzb.zza(e);
        } catch (ExecutionException e12) {
            this.zzb.zza(e12.getCause());
        }
    }

    public final String toString() {
        zzaw zza = zzax.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
