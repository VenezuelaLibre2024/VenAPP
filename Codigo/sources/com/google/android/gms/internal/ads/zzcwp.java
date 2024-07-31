package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcwp implements zzemi {
    public final List zza;

    public zzcwp(zzcwh zzcwhVar) {
        this.zza = Collections.singletonList(zzgen.zzh(zzcwhVar));
    }

    public zzcwp(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzemi
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgen.zzr((com.google.common.util.concurrent.f) it.next(), new zzcwo(this), zzgfe.zzb());
        }
    }
}
