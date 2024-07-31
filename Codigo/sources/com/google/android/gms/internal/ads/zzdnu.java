package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdnu extends zzbjv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdow {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdmv zze;
    private zzayr zzf;

    public zzdnu(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        t.z();
        zzcfc.zza(view, this);
        t.z();
        zzcfc.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzayr(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzC(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzA(zzf(), zzl(), zzm(), zzdmv.zzW(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzA(zzf(), zzl(), zzm(), zzdmv.zzW(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzJ(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final synchronized void zzb(com.google.android.gms.dynamic.b bVar) {
        if (this.zze != null) {
            Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
            if (!(g22 instanceof View)) {
                zzcec.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzL((View) g22);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final synchronized void zzc(com.google.android.gms.dynamic.b bVar) {
        Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
        if (!(g22 instanceof zzdmv)) {
            zzcec.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzR(this);
        }
        zzdmv zzdmvVar2 = (zzdmv) g22;
        if (!zzdmvVar2.zzS()) {
            zzcec.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.zze = zzdmvVar2;
        zzdmvVar2.zzQ(this);
        this.zze.zzI(zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final synchronized void zzd() {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar != null) {
            zzdmvVar.zzR(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final zzayr zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized com.google.android.gms.dynamic.b zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized JSONObject zzp() {
        zzdmv zzdmvVar = this.zze;
        if (zzdmvVar == null) {
            return null;
        }
        return zzdmvVar.zzk(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized void zzq(String str, View view, boolean z10) {
        this.zzd.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
