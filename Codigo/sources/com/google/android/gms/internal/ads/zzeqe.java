package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzeqe implements y8.e, zzdds, zzdcl, zzdba, zzdbr, com.google.android.gms.ads.internal.client.a, zzdax, zzddi, zzdbn, zzdiu {
    private final zzflw zzj;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) a0.c().zza(zzbgc.zziK)).intValue());

    public zzeqe(zzflw zzflwVar) {
        this.zzj = zzflwVar;
    }

    private final void zzo() {
        if (this.zzh.get() && this.zzi.get()) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzepp
                    public final /* synthetic */ Pair zza;

                    public /* synthetic */ zzepp(Pair pair) {
                        r1 = pair;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfdq
                    public final void zza(Object obj) {
                        Pair pair = r1;
                        ((c1) obj).zzc((String) pair.first, (String) pair.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
            return;
        }
        zzfdr.zza(this.zzb, zzeqc.zza);
    }

    @Override // y8.e
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.zzg.get()) {
            zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzepw
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;

                public /* synthetic */ zzepw(String str3, String str22) {
                    r1 = str3;
                    r2 = str22;
                }

                @Override // com.google.android.gms.internal.ads.zzfdq
                public final void zza(Object obj) {
                    ((c1) obj).zzc(r1, r2);
                }
            });
            return;
        }
        if (!this.zza.offer(new Pair(str3, str22))) {
            zzcec.zze("The queue for app events is full, dropping the new event.");
            zzflw zzflwVar = this.zzj;
            if (zzflwVar != null) {
                zzflv zzb = zzflv.zzb("dae_action");
                zzb.zza("dae_name", str3);
                zzb.zza("dae_data", str22);
                zzflwVar.zzb(zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        zzfdr.zza(this.zzb, zzepm.zza);
        zzfdr.zza(this.zzf, zzepn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
        zzfdr.zza(this.zzb, zzepx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzepq
            public /* synthetic */ zzepq() {
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((h0) obj).zzf(c3.this);
            }
        });
        zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzepr
            public /* synthetic */ zzepr() {
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((h0) obj).zze(c3.this.f8626a);
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzeps
            public /* synthetic */ zzeps() {
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((k0) obj).zzb(c3.this);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        zzfdr.zza(this.zzb, zzepy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzfdr.zza(this.zzb, zzepz.zza);
        zzfdr.zza(this.zzf, zzeqa.zza);
        zzfdr.zza(this.zzf, zzeqb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
    }

    public final synchronized h0 zzg() {
        return (h0) this.zzb.get();
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(b5 b5Var) {
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzeqd
            public /* synthetic */ zzeqd() {
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((i2) obj).x1(b5.this);
            }
        });
    }

    public final synchronized c1 zzi() {
        return (c1) this.zzc.get();
    }

    public final void zzj(h0 h0Var) {
        this.zzb.set(h0Var);
    }

    public final void zzk(k0 k0Var) {
        this.zze.set(k0Var);
    }

    public final void zzl(i2 i2Var) {
        this.zzd.set(i2Var);
    }

    public final void zzm(c1 c1Var) {
        this.zzc.set(c1Var);
        this.zzh.set(true);
        zzo();
    }

    public final void zzn(j1 j1Var) {
        this.zzf.set(j1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzp(c3 c3Var) {
        zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzepv
            public /* synthetic */ zzepv() {
            }

            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((j1) obj).zzd(c3.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        zzfdr.zza(this.zzb, zzepl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzr() {
        zzfdr.zza(this.zzb, zzept.zza);
        zzfdr.zza(this.zze, zzepu.zza);
        this.zzi.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
            zzfdr.zza(this.zzb, zzeqc.zza);
        }
        zzfdr.zza(this.zzf, zzepo.zza);
    }
}
