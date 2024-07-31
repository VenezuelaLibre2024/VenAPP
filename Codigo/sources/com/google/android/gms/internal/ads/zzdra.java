package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.s;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzdra extends zzbpr implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbiy {
    private View zza;
    private s2 zzb;
    private zzdmv zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdra(zzdmv zzdmvVar, zzdna zzdnaVar) {
        this.zza = zzdnaVar.zzf();
        this.zzb = zzdnaVar.zzj();
        this.zzc = zzdmvVar;
        if (zzdnaVar.zzs() != null) {
            zzdnaVar.zzs().zzan(this);
        }
    }

    private final void zzg() {
        View view;
        zzdmv zzdmvVar = this.zzc;
        if (zzdmvVar == null || (view = this.zza) == null) {
            return;
        }
        zzdmvVar.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdmv.zzW(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbpv zzbpvVar, int i10) {
        try {
            zzbpvVar.zze(i10);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbps
    public final s2 zzb() {
        s.e("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzcec.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbps
    public final zzbjj zzc() {
        s.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcec.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdmv zzdmvVar = this.zzc;
        if (zzdmvVar == null || zzdmvVar.zzc() == null) {
            return null;
        }
        return zzdmvVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbps
    public final void zzd() {
        s.e("#008 Must be called on the main UI thread.");
        zzh();
        zzdmv zzdmvVar = this.zzc;
        if (zzdmvVar != null) {
            zzdmvVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbps
    public final void zze(com.google.android.gms.dynamic.b bVar) {
        s.e("#008 Must be called on the main UI thread.");
        zzf(bVar, new zzdqz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbps
    public final void zzf(com.google.android.gms.dynamic.b bVar, zzbpv zzbpvVar) {
        s.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzcec.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbpvVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzcec.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbpvVar, 0);
            return;
        }
        if (this.zze) {
            zzcec.zzg("Instream ad should not be used again.");
            zzi(zzbpvVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) com.google.android.gms.dynamic.d.g2(bVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        t.z();
        zzcfc.zza(this.zza, this);
        t.z();
        zzcfc.zzb(this.zza, this);
        zzg();
        try {
            zzbpvVar.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
