package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdnw extends zzbjp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdow {
    public static final zzgaa zza = zzgaa.zzo("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgey zzf;
    private View zzg;
    private zzdmv zzi;
    private zzayr zzj;
    private zzbjj zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private com.google.android.gms.dynamic.b zzk = null;
    private boolean zzn = false;
    private final int zzh = 240304000;

    public zzdnw(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        t.z();
        zzcfc.zza(frameLayout, this);
        t.z();
        zzcfc.zzb(frameLayout, this);
        this.zzf = zzcep.zze;
        this.zzj = new zzayr(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e10) {
                    zzcec.zzk("Encountered invalid base64 watermark.", e10);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // java.lang.Runnable
            public final void run() {
                zzdnw.this.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdoc(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar == null || !zzdmvVar.zzT()) {
            return;
        }
        this.zzi.zzu();
        this.zzi.zzC(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdmvVar.zzA(frameLayout, zzl(), zzm(), zzdmv.zzW(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdmvVar.zzA(frameLayout, zzl(), zzm(), zzdmv.zzW(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar != null) {
            zzdmvVar.zzJ(view, motionEvent, this.zzd);
            if (((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized com.google.android.gms.dynamic.b zzb(String str) {
        return com.google.android.gms.dynamic.d.h2(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzbE(String str, com.google.android.gms.dynamic.b bVar) {
        zzq(str, (View) com.google.android.gms.dynamic.d.g2(bVar), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzbF(com.google.android.gms.dynamic.b bVar) {
        this.zzi.zzL((View) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzbG(zzbjj zzbjjVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbjjVar;
            zzdmv zzdmvVar = this.zzi;
            if (zzdmvVar != null) {
                zzdmvVar.zzc().zzb(zzbjjVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzbH(com.google.android.gms.dynamic.b bVar) {
        if (this.zzn) {
            return;
        }
        this.zzk = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzbI(com.google.android.gms.dynamic.b bVar) {
        if (this.zzn) {
            return;
        }
        Object g22 = com.google.android.gms.dynamic.d.g2(bVar);
        if (!(g22 instanceof zzdmv)) {
            zzcec.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar != null) {
            zzdmvVar.zzR(this);
        }
        zzu();
        zzdmv zzdmvVar2 = (zzdmv) g22;
        this.zzi = zzdmvVar2;
        zzdmvVar2.zzQ(this);
        this.zzi.zzI(this.zzd);
        this.zzi.zzt(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzdO)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar != null) {
            zzdmvVar.zzR(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzd(com.google.android.gms.dynamic.b bVar) {
        onTouch(this.zzd, (MotionEvent) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final synchronized void zze(com.google.android.gms.dynamic.b bVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final zzayr zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final com.google.android.gms.dynamic.b zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized JSONObject zzo() {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar == null) {
            return null;
        }
        return zzdmvVar.zzi(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized JSONObject zzp() {
        zzdmv zzdmvVar = this.zzi;
        if (zzdmvVar == null) {
            return null;
        }
        return zzdmvVar.zzk(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdow
    public final synchronized void zzq(String str, View view, boolean z10) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (b1.i(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}