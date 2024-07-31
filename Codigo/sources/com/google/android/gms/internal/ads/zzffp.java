package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.i2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzffp implements n9.a, zzdcl, zzdba, zzdax, zzdbn, zzddi, zzfea, zzdiu {
    private final zzfir zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzffp(zzfir zzfirVar) {
        this.zza = zzfirVar;
    }

    @Override // n9.a
    public final void onAdMetadataChanged() {
        zzfdr.zza(this.zzb, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffd
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((n9.a) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        this.zza.zza();
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffl
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zzg();
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffm
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffn
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(final zzbzu zzbzuVar, final String str, final String str2) {
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffo
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                zzbzu zzbzuVar2 = zzbzu.this;
                ((zzcaq) obj).zzk(new zzcbe(zzbzuVar2.zzc(), zzbzuVar2.zzb()));
            }
        });
        zzfdr.zza(this.zzf, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfeu
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                zzbzu zzbzuVar2 = zzbzu.this;
                ((zzcav) obj).zze(new zzcbe(zzbzuVar2.zzc(), zzbzuVar2.zzb()), str, str2);
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfev
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zze(zzbzu.this);
            }
        });
        zzfdr.zza(this.zzg, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfew
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzbzv) obj).zze(zzbzu.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(final c3 c3Var) {
        final int i10 = c3Var.f8626a;
        zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffi
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcau) obj).zzf(c3.this);
            }
        });
        zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffj
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcau) obj).zze(i10);
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfex
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zzj();
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfey
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzj();
            }
        });
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfez
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffh
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfet
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzl();
            }
        });
    }

    public final void zzg(n9.a aVar) {
        this.zzb.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(final b5 b5Var) {
        zzfdr.zza(this.zzh, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffa
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((i2) obj).x1(b5.this);
            }
        });
    }

    public final void zzi(i2 i2Var) {
        this.zzh.set(i2Var);
    }

    public final void zzj(zzcaq zzcaqVar) {
        this.zzd.set(zzcaqVar);
    }

    public final void zzk(zzcau zzcauVar) {
        this.zzc.set(zzcauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfea
    public final void zzl(zzfea zzfeaVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzcaa zzcaaVar) {
        this.zze.set(zzcaaVar);
    }

    @Deprecated
    public final void zzn(zzbzv zzbzvVar) {
        this.zzg.set(zzbzvVar);
    }

    public final void zzo(zzcav zzcavVar) {
        this.zzf.set(zzcavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzp(final c3 c3Var) {
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzfff
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zzi(c3.this);
            }
        });
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffg
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zzh(c3.this.f8626a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        zzfdr.zza(this.zzc, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffb
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcau) obj).zzg();
            }
        });
        zzfdr.zza(this.zze, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffc
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaa) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        zzfdr.zza(this.zzd, new zzfdq() { // from class: com.google.android.gms.internal.ads.zzffe
            @Override // com.google.android.gms.internal.ads.zzfdq
            public final void zza(Object obj) {
                ((zzcaq) obj).zze();
            }
        });
    }
}
