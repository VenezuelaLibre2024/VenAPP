package com.google.android.recaptcha.internal;

import java.util.HashMap;
import sk.c;
import uk.f;
import uk.l;

/* loaded from: classes2.dex */
public final class zzbn {
    private final zzbm zza;
    private byte zzb;
    private final HashMap zzc;

    public zzbn() {
        int i10;
        zzbm zzbmVar = new zzbm();
        this.zza = zzbmVar;
        i10 = l.i(new f(1, 127), c.f25684a);
        this.zzb = (byte) i10;
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        zzbmVar.zze(173, hashMap);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final zzbm zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zzd();
        this.zza.zze(173, this.zzc);
    }

    public final void zzd(byte b10) {
        this.zzb = b10;
    }

    public final void zze(int i10, Object obj) {
        this.zzc.put(1, obj);
    }
}
