package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbxq {
    private final View zza;
    private final Map zzb;
    private final zzcct zzc;

    public zzbxq(zzbxp zzbxpVar) {
        View view;
        Map map;
        View view2;
        view = zzbxpVar.zza;
        this.zza = view;
        map = zzbxpVar.zzb;
        this.zzb = map;
        view2 = zzbxpVar.zza;
        zzcct zza = zzbxk.zza(view2.getContext());
        this.zzc = zza;
        if (zza == null || map.isEmpty()) {
            return;
        }
        try {
            zza.zzg(new zzbxr(com.google.android.gms.dynamic.d.h2(view).asBinder(), com.google.android.gms.dynamic.d.h2(map).asBinder()));
        } catch (RemoteException unused) {
            zzcec.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcec.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcec.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, com.google.android.gms.dynamic.d.h2(this.zza), new zzbxo(this, list));
        } catch (RemoteException e10) {
            zzcec.zzg("RemoteException recording click: ".concat(e10.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcec.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcct zzcctVar = this.zzc;
        if (zzcctVar == null) {
            zzcec.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzcctVar.zzi(list, com.google.android.gms.dynamic.d.h2(this.zza), new zzbxn(this, list));
        } catch (RemoteException e10) {
            zzcec.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcct zzcctVar = this.zzc;
        if (zzcctVar == null) {
            zzcec.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcctVar.zzk(com.google.android.gms.dynamic.d.h2(motionEvent));
        } catch (RemoteException unused) {
            zzcec.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, m9.c cVar) {
        zzcct zzcctVar = this.zzc;
        zzcctVar.getClass();
        try {
            zzcctVar.zzl(new ArrayList(Arrays.asList(uri)), com.google.android.gms.dynamic.d.h2(this.zza), new zzbxm(this, cVar));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            throw null;
        }
    }

    public final void zze(List list, m9.d dVar) {
        zzcct zzcctVar = this.zzc;
        zzcctVar.getClass();
        try {
            zzcctVar.zzm(list, com.google.android.gms.dynamic.d.h2(this.zza), new zzbxl(this, dVar));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            throw null;
        }
    }
}
