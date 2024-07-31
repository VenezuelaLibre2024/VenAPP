package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzeij {
    private n1.a zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeij(Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.f zza() {
        n1.a a10 = n1.a.a(this.zzb);
        this.zza = a10;
        return a10 == null ? zzgen.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : a10.b();
    }

    public final com.google.common.util.concurrent.f zzb(Uri uri, InputEvent inputEvent) {
        n1.a aVar = this.zza;
        Objects.requireNonNull(aVar);
        return aVar.c(uri, inputEvent);
    }
}
