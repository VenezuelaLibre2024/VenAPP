package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzdrh extends zzbkf {
    private final Context zza;
    private final zzdna zzb;
    private zzdoa zzc;
    private zzdmv zzd;

    public zzdrh(Context context, zzdna zzdnaVar, zzdoa zzdoaVar, zzdmv zzdmvVar) {
        this.zza = context;
        this.zzb = zzdnaVar;
        this.zzc = zzdoaVar;
        this.zzd = zzdmvVar;
    }

    private final zzbja zzd(String str) {
        return new zzdrg(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final s2 zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjj zzf() {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e10) {
            t.q().zzw(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final zzbjm zzg(String str) {
        return (zzbjm) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final com.google.android.gms.dynamic.b zzh() {
        return com.google.android.gms.dynamic.d.h2(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final List zzk() {
        try {
            androidx.collection.h zzh = this.zzb.zzh();
            androidx.collection.h zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.size() + zzi.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.size(); i11++) {
                strArr[i10] = (String) zzh.j(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.size(); i12++) {
                strArr[i10] = (String) zzi.j(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            t.q().zzw(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzl() {
        zzdmv zzdmvVar = this.zzd;
        if (zzdmvVar != null) {
            zzdmvVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                zzcec.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(zzC)) {
                zzcec.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdmv zzdmvVar = this.zzd;
            if (zzdmvVar != null) {
                zzdmvVar.zzf(zzC, false);
            }
        } catch (NullPointerException e10) {
            t.q().zzw(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzn(String str) {
        zzdmv zzdmvVar = this.zzd;
        if (zzdmvVar != null) {
            zzdmvVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzo() {
        zzdmv zzdmvVar = this.zzd;
        if (zzdmvVar != null) {
            zzdmvVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzp(com.google.android.gms.dynamic.b bVar) {
        zzdmv zzdmvVar;
        Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
        if (!(g22 instanceof View) || this.zzb.zzu() == null || (zzdmvVar = this.zzd) == null) {
            return;
        }
        zzdmvVar.zzI((View) g22);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzq() {
        zzdmv zzdmvVar = this.zzd;
        return (zzdmvVar == null || zzdmvVar.zzV()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzr(com.google.android.gms.dynamic.b bVar) {
        zzdoa zzdoaVar;
        Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
        if (!(g22 instanceof ViewGroup) || (zzdoaVar = this.zzc) == null || !zzdoaVar.zzf((ViewGroup) g22)) {
            return false;
        }
        this.zzb.zzq().zzap(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzs(com.google.android.gms.dynamic.b bVar) {
        zzdoa zzdoaVar;
        Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
        if (!(g22 instanceof ViewGroup) || (zzdoaVar = this.zzc) == null || !zzdoaVar.zzg((ViewGroup) g22)) {
            return false;
        }
        this.zzb.zzs().zzap(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final boolean zzt() {
        zzfod zzu = this.zzb.zzu();
        if (zzu == null) {
            zzcec.zzj("Trying to start OMID session before creation.");
            return false;
        }
        t.a().zzi(zzu);
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new androidx.collection.a());
        return true;
    }
}
