package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.a;

/* loaded from: classes2.dex */
public final class zzeil {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeil(Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.f zza(boolean z10) {
        androidx.privacysandbox.ads.adservices.topics.a a10 = new a.C0076a().b("com.google.android.gms.ads").c(z10).a();
        o1.a a11 = o1.a.a(this.zza);
        return a11 != null ? a11.b(a10) : zzgen.zzg(new IllegalStateException());
    }
}
