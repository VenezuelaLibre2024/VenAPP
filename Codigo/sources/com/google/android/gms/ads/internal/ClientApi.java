package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.e1;
import com.google.android.gms.ads.internal.client.l2;
import com.google.android.gms.ads.internal.client.p1;
import com.google.android.gms.ads.internal.client.q0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.z3;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzdnu;
import com.google.android.gms.internal.ads.zzdnw;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzeph;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfer;
import com.google.android.gms.internal.ads.zzfgf;
import g9.b0;
import g9.g0;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ClientApi extends e1 {
    @Override // com.google.android.gms.ads.internal.client.f1
    public final l2 D(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        return zzclg.zzb((Context) com.google.android.gms.dynamic.d.g2(bVar), zzbsvVar, i10).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzcct P0(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        return zzclg.zzb((Context) com.google.android.gms.dynamic.d.g2(bVar), zzbsvVar, i10).zzp();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbjq R(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        return new zzdnw((FrameLayout) com.google.android.gms.dynamic.d.g2(bVar), (FrameLayout) com.google.android.gms.dynamic.d.g2(bVar2), 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbwm R1(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        return zzclg.zzb((Context) com.google.android.gms.dynamic.d.g2(bVar), zzbsvVar, i10).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 W0(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzfbm zzs = zzclg.zzb(context, zzbsvVar, i10).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        return i10 >= ((Integer) a0.c().zza(zzbgc.zzfh)).intValue() ? zzs.zzc().zza() : new z3();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzboh e0(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10, zzboe zzboeVar) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzdxo zzj = zzclg.zzb(context, zzbsvVar, i10).zzj();
        zzj.zzb(context);
        zzj.zza(zzboeVar);
        return zzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzcan g(com.google.android.gms.dynamic.b bVar, String str, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzfgf zzv = zzclg.zzb(context, zzbsvVar, i10).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 j1(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzfda zzt = zzclg.zzb(context, zzbsvVar, i10).zzt();
        zzt.zzc(context);
        zzt.zza(z4Var);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 o1(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, int i10) {
        return new s((Context) com.google.android.gms.dynamic.d.g2(bVar), z4Var, str, new zzcei(240304000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbzx t1(com.google.android.gms.dynamic.b bVar, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzfgf zzv = zzclg.zzb(context, zzbsvVar, i10).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbjw u1(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        return new zzdnu((View) com.google.android.gms.dynamic.d.g2(bVar), (HashMap) com.google.android.gms.dynamic.d.g2(bVar2), (HashMap) com.google.android.gms.dynamic.d.g2(bVar3));
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final q0 v1(com.google.android.gms.dynamic.b bVar, String str, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        return new zzeph(zzclg.zzb(context, zzbsvVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final u0 x0(com.google.android.gms.dynamic.b bVar, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        zzfer zzu = zzclg.zzb(context, zzbsvVar, i10).zzu();
        zzu.zzc(context);
        zzu.zza(z4Var);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final p1 zzg(com.google.android.gms.dynamic.b bVar, int i10) {
        return zzclg.zzb((Context) com.google.android.gms.dynamic.d.g2(bVar), null, i10).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.f1
    public final zzbwt zzm(com.google.android.gms.dynamic.b bVar) {
        Activity activity = (Activity) com.google.android.gms.dynamic.d.g2(bVar);
        AdOverlayInfoParcel u12 = AdOverlayInfoParcel.u1(activity.getIntent());
        if (u12 == null) {
            return new b0(activity);
        }
        int i10 = u12.f8892v;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new b0(activity) : new g9.e(activity) : new g0(activity, u12) : new g9.h(activity) : new g9.g(activity) : new g9.a0(activity);
    }
}
