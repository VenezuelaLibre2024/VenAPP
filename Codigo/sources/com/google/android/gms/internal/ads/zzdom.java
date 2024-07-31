package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.z4;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdom {
    private final zzdtk zza;
    private final zzdrz zzb;
    private final zzctl zzc;
    private final zzdni zzd;

    public zzdom(zzdtk zzdtkVar, zzdrz zzdrzVar, zzctl zzctlVar, zzdni zzdniVar) {
        this.zza = zzdtkVar;
        this.zzb = zzdrzVar;
        this.zzc = zzctlVar;
        this.zzd = zzdniVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        zzcjk zza = this.zza.zza(z4.w1(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzae("/sendMessageToSdk", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdom.this.zzb((zzcjk) obj, map);
            }
        });
        zza.zzae("/adMuted", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdom.this.zzc((zzcjk) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, final Map map) {
                zzcjk zzcjkVar = (zzcjk) obj;
                zzcky zzN = zzcjkVar.zzN();
                final zzdom zzdomVar = zzdom.this;
                zzN.zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdog
                    @Override // com.google.android.gms.internal.ads.zzckw
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzdom.this.zzd(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcjkVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcjkVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdok
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdom.this.zze((zzcjk) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbng() { // from class: com.google.android.gms.internal.ads.zzdol
            @Override // com.google.android.gms.internal.ads.zzbng
            public final void zza(Object obj, Map map) {
                zzdom.this.zzf((zzcjk) obj, map);
            }
        });
        return (View) zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcjk zzcjkVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcjk zzcjkVar, Map map) {
        this.zzd.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcjk zzcjkVar, Map map) {
        zzcec.zzi("Showing native ads overlay.");
        zzcjkVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcjk zzcjkVar, Map map) {
        zzcec.zzi("Hiding native ads overlay.");
        zzcjkVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
