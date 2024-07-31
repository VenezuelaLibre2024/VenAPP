package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzaxm extends zzaxx {
    public zzaxm(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", zzasgVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzasg zzasgVar = this.zze;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzasgVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
