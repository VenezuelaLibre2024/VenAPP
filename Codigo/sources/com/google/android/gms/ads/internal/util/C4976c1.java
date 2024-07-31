package com.google.android.gms.ads.internal.util;

import android.content.Context;
import ca.C1906h;
import ca.C1908i;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import java.io.IOException;
import p041c9.C1888a;

/* renamed from: com.google.android.gms.ads.internal.util.c1 */
/* loaded from: classes.dex */
final class C4976c1 extends AbstractC4971b0 {

    /* renamed from: a */
    private final Context f10047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4976c1(Context context) {
        this.f10047a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC4971b0
    public final void zza() {
        boolean z10;
        try {
            z10 = C1888a.m10032c(this.f10047a);
        } catch (C1906h | C1908i | IOException | IllegalStateException e10) {
            zzcec.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        zzceb.zzj(z10);
        zzcec.zzj("Update ad debug logging enablement as " + z10);
    }
}
