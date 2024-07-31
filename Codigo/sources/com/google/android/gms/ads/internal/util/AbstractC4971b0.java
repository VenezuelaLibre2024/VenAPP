package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcep;
import com.google.common.util.concurrent.InterfaceFutureC5920f;

/* renamed from: com.google.android.gms.ads.internal.util.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC4971b0 {
    private final Runnable zza = new RunnableC4966a(this);
    private volatile Thread zzb;

    public abstract void zza();

    public InterfaceFutureC5920f zzb() {
        return zzcep.zza.zza(this.zza);
    }
}
