package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c3;
import g9.w;

/* loaded from: classes2.dex */
public final class zzdfe implements y8.e, n9.a, zzdax, com.google.android.gms.ads.internal.client.a, zzddi, zzdbr, zzdcw, w, zzdbn, zzdiu {
    private final zzdfc zza = new zzdfc(this, null);
    private zzeqe zzb;
    private zzeqi zzc;
    private zzfck zzd;
    private zzffp zze;

    private static void zzn(Object obj, zzdfd zzdfdVar) {
        if (obj != null) {
            zzdfdVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        zzn(this.zzb, zzddu.zza);
        zzn(this.zzc, zzddv.zza);
    }

    @Override // n9.a
    public final void onAdMetadataChanged() {
        zzn(this.zze, zzdea.zza);
    }

    @Override // y8.e
    public final void onAppEvent(String str, String str2) {
        zzn(this.zzb, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdeg
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;

            public /* synthetic */ zzdeg(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzeqe) obj).onAppEvent(r1, r2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        zzn(this.zzb, zzdez.zza);
        zzn(this.zze, zzdfa.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
        zzn(this.zzb, zzdes.zza);
        zzn(this.zze, zzdet.zza);
    }

    @Override // g9.w
    public final void zzbA() {
        zzn(this.zzd, zzdei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
        zzn(this.zzb, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzded
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzc;

            public /* synthetic */ zzded(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdef
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzc;

            public /* synthetic */ zzdef(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzffp) obj).zzbB(zzbzu.this, r2, r3);
            }
        });
    }

    @Override // g9.w
    public final void zzbC() {
        zzn(this.zzd, zzdeo.zza);
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        zzn(this.zzd, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdeq
            public final /* synthetic */ int zza;

            public /* synthetic */ zzdeq(int i102) {
                r1 = i102;
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzfck) obj).zzbD(r1);
            }
        });
    }

    @Override // g9.w
    public final void zzbP() {
        zzn(this.zzd, zzden.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        zzn(this.zzb, zzdeh.zza);
    }

    @Override // g9.w
    public final void zzbt() {
        zzn(this.zzd, zzddz.zza);
    }

    @Override // g9.w
    public final void zzbz() {
        zzn(this.zzd, zzdem.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzn(this.zzb, zzdeb.zza);
        zzn(this.zze, zzdec.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
        zzn(this.zzb, zzddt.zza);
        zzn(this.zze, zzdee.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
        zzn(this.zzb, zzddw.zza);
        zzn(this.zze, zzddx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzg() {
        zzn(this.zzd, zzder.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzh(b5 b5Var) {
        zzn(this.zzb, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdej
            public /* synthetic */ zzdej() {
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzeqe) obj).zzh(b5.this);
            }
        });
        zzn(this.zze, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdek
            public /* synthetic */ zzdek() {
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzffp) obj).zzh(b5.this);
            }
        });
        zzn(this.zzd, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdel
            public /* synthetic */ zzdel() {
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzfck) obj).zzh(b5.this);
            }
        });
    }

    public final zzdfc zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzp(c3 c3Var) {
        zzn(this.zze, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdex
            public /* synthetic */ zzdex() {
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzffp) obj).zzp(c3.this);
            }
        });
        zzn(this.zzb, new zzdfd() { // from class: com.google.android.gms.internal.ads.zzdey
            public /* synthetic */ zzdey() {
            }

            @Override // com.google.android.gms.internal.ads.zzdfd
            public final void zza(Object obj) {
                ((zzeqe) obj).zzp(c3.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        zzn(this.zzb, zzddy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        zzn(this.zzb, zzdep.zza);
        zzn(this.zzc, zzdeu.zza);
        zzn(this.zze, zzdev.zza);
        zzn(this.zzd, zzdew.zza);
    }
}
