package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 extends b0 {

    /* renamed from: a */
    private final Context f8948a;

    public c1(Context context) {
        this.f8948a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.b0
    public final void zza() {
        boolean z10;
        try {
            z10 = c9.a.c(this.f8948a);
        } catch (ca.h | ca.i | IOException | IllegalStateException e10) {
            zzcec.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        zzceb.zzj(z10);
        zzcec.zzj("Update ad debug logging enablement as " + z10);
    }
}
