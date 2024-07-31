package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.x;

/* loaded from: classes2.dex */
public final class zzcdc {
    public final com.google.common.util.concurrent.f zza(Context context, int i10) {
        zzceu zzceuVar = new zzceu();
        x.b();
        if (zzcdv.zzt(context)) {
            zzcep.zza.execute(new zzcdb(this, context, zzceuVar));
        }
        return zzceuVar;
    }
}
