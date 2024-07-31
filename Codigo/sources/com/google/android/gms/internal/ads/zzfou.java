package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzfou extends zzfox {
    private static final zzfou zzb = new zzfou();

    private zzfou() {
    }

    public static zzfou zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfox
    public final void zzb(boolean z10) {
        Iterator it = zzfov.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfpi zzg = ((zzfoh) it.next()).zzg();
            if (zzg.zzl()) {
                zzfpb.zza().zzb(zzg.zza(), "setState", true != z10 ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfox
    public final boolean zzc() {
        Iterator it = zzfov.zza().zzb().iterator();
        while (it.hasNext()) {
            View zzf = ((zzfoh) it.next()).zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
