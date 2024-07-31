package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzeax implements zzhhd {
    public static zzeax zza() {
        zzeax zzeaxVar;
        zzeaxVar = zzeaw.zza;
        return zzeaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* synthetic */ Object zzb() {
        t.r();
        String uuid = UUID.randomUUID().toString();
        zzhhl.zzb(uuid);
        return uuid;
    }
}
