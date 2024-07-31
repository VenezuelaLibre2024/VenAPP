package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class zzua extends zzts {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhy zzc;

    public abstract void zzA(Object obj, zzut zzutVar, zzcx zzcxVar);

    public final void zzB(Object obj, zzut zzutVar) {
        zzek.zzd(!this.zza.containsKey(obj));
        zzus zztxVar = new zzus() { // from class: com.google.android.gms.internal.ads.zztx
            public final /* synthetic */ Object zzb;

            public /* synthetic */ zztx(Object obj2) {
                r2 = obj2;
            }

            @Override // com.google.android.gms.internal.ads.zzus
            public final void zza(zzut zzutVar2, zzcx zzcxVar) {
                zzua.this.zzA(r2, zzutVar2, zzcxVar);
            }
        };
        zzty zztyVar = new zzty(this, obj2);
        this.zza.put(obj2, new zztz(zzutVar, zztxVar, zztyVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzutVar.zzh(handler, zztyVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzutVar.zzg(handler2, zztyVar);
        zzutVar.zzm(zztxVar, this.zzc, zzb());
        if (zzu()) {
            return;
        }
        zzutVar.zzi(zztxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzts
    protected final void zzj() {
        for (zztz zztzVar : this.zza.values()) {
            zztzVar.zza.zzi(zztzVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzts
    protected final void zzl() {
        for (zztz zztzVar : this.zza.values()) {
            zztzVar.zza.zzk(zztzVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public void zzn(zzhy zzhyVar) {
        this.zzc = zzhyVar;
        this.zzb = zzfy.zzw(null);
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public void zzq() {
        for (zztz zztzVar : this.zza.values()) {
            zztzVar.zza.zzp(zztzVar.zzb);
            zztzVar.zza.zzs(zztzVar.zzc);
            zztzVar.zza.zzr(zztzVar.zzc);
        }
        this.zza.clear();
    }

    public int zzw(Object obj, int i10) {
        return 0;
    }

    public long zzx(Object obj, long j10, zzur zzurVar) {
        return j10;
    }

    public zzur zzy(Object obj, zzur zzurVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public void zzz() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zztz) it.next()).zza.zzz();
        }
    }
}
