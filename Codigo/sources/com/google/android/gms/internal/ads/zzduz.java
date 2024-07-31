package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzduz implements zzdds, zzdcl, zzdba, zzdbr, com.google.android.gms.ads.internal.client.a, zzdge {
    private final zzbbp zza;
    private boolean zzb = false;

    public zzduz(zzbbp zzbbpVar, zzfeh zzfehVar) {
        this.zza = zzbbpVar;
        zzbbpVar.zzc(2);
        if (zzfehVar != null) {
            zzbbpVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        zzbbp zzbbpVar;
        int i10;
        switch (c3Var.f8626a) {
            case 1:
                zzbbpVar = this.zza;
                i10 = 101;
                break;
            case 2:
                zzbbpVar = this.zza;
                i10 = 102;
                break;
            case 3:
                zzbbpVar = this.zza;
                i10 = 5;
                break;
            case 4:
                zzbbpVar = this.zza;
                i10 = 103;
                break;
            case 5:
                zzbbpVar = this.zza;
                i10 = 104;
                break;
            case 6:
                zzbbpVar = this.zza;
                i10 = 105;
                break;
            case 7:
                zzbbpVar = this.zza;
                i10 = 106;
                break;
            default:
                zzbbpVar = this.zza;
                i10 = 4;
                break;
        }
        zzbbpVar.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(final zzfgy zzfgyVar) {
        this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // com.google.android.gms.internal.ads.zzbbo
            public final void zza(zzbde zzbdeVar) {
                zzbca zzbcaVar = (zzbca) zzbdeVar.zza().zzaB();
                zzbcs zzbcsVar = (zzbcs) zzbdeVar.zza().zzd().zzaB();
                zzbcsVar.zza(zzfgy.this.zzb.zzb.zzb);
                zzbcaVar.zzb(zzbcsVar);
                zzbdeVar.zze(zzbcaVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzi(final zzbck zzbckVar) {
        this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzduy
            @Override // com.google.android.gms.internal.ads.zzbbo
            public final void zza(zzbde zzbdeVar) {
                zzbdeVar.zzf(zzbck.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzj(final zzbck zzbckVar) {
        this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // com.google.android.gms.internal.ads.zzbbo
            public final void zza(zzbde zzbdeVar) {
                zzbdeVar.zzf(zzbck.this);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzl(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzm(final zzbck zzbckVar) {
        this.zza.zzb(new zzbbo() { // from class: com.google.android.gms.internal.ads.zzdux
            @Override // com.google.android.gms.internal.ads.zzbbo
            public final void zza(zzbde zzbdeVar) {
                zzbdeVar.zzf(zzbck.this);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final synchronized void zzq() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        this.zza.zzc(3);
    }
}
