package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.b1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdou {
    private final zzdtk zza;
    private final zzdrz zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdou(zzdtk zzdtkVar, zzdrz zzdrzVar) {
        this.zza = zzdtkVar;
        this.zzb = zzdrzVar;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        x.b();
        return zzcdv.zzx(context, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) {
        zzcjk zza = this.zza.zza(z4.w1(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzae("/sendMessageToSdk", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdou.this.zzb((zzcjk) obj, map);
            }
        });
        zza.zzae("/hideValidatorOverlay", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdou.this.zzc(windowManager, view, (zzcjk) obj, map);
            }
        });
        zza.zzae("/open", new zzbnr(null, null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdou.this.zze(view, windowManager, (zzcjk) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzcec.zze("Show native ad policy validator overlay.");
                ((zzcjk) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcjk zzcjkVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcjk zzcjkVar, Map map) {
        zzcec.zze("Hide native ad policy validator overlay.");
        zzcjkVar.zzF().setVisibility(8);
        if (zzcjkVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcjkVar.zzF());
        }
        zzcjkVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcjk zzcjkVar, final Map map) {
        zzcjkVar.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzckw
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdou.this.zzd(map, z10, i10, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) a0.c().zza(zzbgc.zzhV)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) a0.c().zza(zzbgc.zzhW)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcjkVar.zzah(zzcla.zzb(zzf, zzf2));
        try {
            zzcjkVar.zzG().getSettings().setUseWideViewPort(((Boolean) a0.c().zza(zzbgc.zzhX)).booleanValue());
            zzcjkVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) a0.c().zza(zzbgc.zzhY)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams b10 = b1.b();
        b10.x = zzf3;
        b10.y = zzf4;
        windowManager.updateViewLayout(zzcjkVar.zzF(), b10);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i10 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdos
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcjk zzcjkVar2 = zzcjkVar;
                        if (zzcjkVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i11 = i10;
                        WindowManager.LayoutParams layoutParams = b10;
                        String str2 = str;
                        layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i11;
                        windowManager.updateViewLayout(zzcjkVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcjkVar.loadUrl(str2);
    }
}
