package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzaxl extends zzaxx {
    public zzaxl(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "hvOzu3pRF2dcNdvDy8db1rttL97bOQyvLLd+NabZhD5sRaprNsAQL2vdtDd+eY16", "XE2927Ta6gTWmjrPmk4in7GLLwsXJnqTbhVN3N+/b3M=", zzasgVar, i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        zzavp zzavpVar = new zzavp((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) a0.c().zza(zzbgc.zzcA)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzj(zzavpVar.zza);
            this.zze.zzC(zzavpVar.zzb);
        }
    }
}
