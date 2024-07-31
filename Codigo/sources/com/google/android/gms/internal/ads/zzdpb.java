package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdpb implements zzdni {
    private final zzbtk zza;
    private final zzdbp zzb;
    private final zzdav zzc;
    private final zzdis zzd;
    private final Context zze;
    private final zzfgm zzf;
    private final zzcei zzg;
    private final zzfhh zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbtg zzl;
    private final zzbth zzm;

    public zzdpb(zzbtg zzbtgVar, zzbth zzbthVar, zzbtk zzbtkVar, zzdbp zzdbpVar, zzdav zzdavVar, zzdis zzdisVar, Context context, zzfgm zzfgmVar, zzcei zzceiVar, zzfhh zzfhhVar) {
        this.zzl = zzbtgVar;
        this.zzm = zzbthVar;
        this.zza = zzbtkVar;
        this.zzb = zzdbpVar;
        this.zzc = zzdavVar;
        this.zzd = zzdisVar;
        this.zze = context;
        this.zzf = zzfgmVar;
        this.zzg = zzceiVar;
        this.zzh = zzfhhVar;
    }

    private final void zzb(View view) {
        try {
            zzbtk zzbtkVar = this.zza;
            if (zzbtkVar != null && !zzbtkVar.zzA()) {
                this.zza.zzw(com.google.android.gms.dynamic.d.h2(view));
                this.zzc.onAdClicked();
                if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
                    this.zzd.zzs();
                    return;
                }
                return;
            }
            zzbtg zzbtgVar = this.zzl;
            if (zzbtgVar != null && !zzbtgVar.zzx()) {
                this.zzl.zzs(com.google.android.gms.dynamic.d.h2(view));
                this.zzc.onAdClicked();
                if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
                    this.zzd.zzs();
                    return;
                }
                return;
            }
            zzbth zzbthVar = this.zzm;
            if (zzbthVar == null || zzbthVar.zzv()) {
                return;
            }
            this.zzm.zzq(com.google.android.gms.dynamic.d.h2(view));
            this.zzc.onAdClicked();
            if (((Boolean) a0.c().zza(zzbgc.zzkm)).booleanValue()) {
                this.zzd.zzs();
            }
        } catch (RemoteException e10) {
            zzcec.zzk("Failed to call handleClick", e10);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzj(x1 x1Var) {
        zzcec.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        String str;
        if (!this.zzj) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.zzf.zzM) {
                zzb(view2);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        zzcec.zzj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = t.u().n(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbtk zzbtkVar = this.zza;
                if (zzbtkVar != null && !zzbtkVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbtg zzbtgVar = this.zzl;
                if (zzbtgVar != null && !zzbtgVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbth zzbthVar = this.zzm;
                if (zzbthVar == null || zzbthVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e10) {
            zzcec.zzk("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzw(t1 t1Var) {
        zzcec.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzx(zzblg zzblgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        com.google.android.gms.dynamic.b zzn;
        try {
            com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z10 = true;
            if (((Boolean) a0.c().zza(zzbgc.zzbx)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) a0.c().zza(zzbgc.zzby)).booleanValue() && next.equals("3010")) {
                                zzbtk zzbtkVar = this.zza;
                                Object obj2 = null;
                                if (zzbtkVar != null) {
                                    try {
                                        zzn = zzbtkVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbtg zzbtgVar = this.zzl;
                                    if (zzbtgVar != null) {
                                        zzn = zzbtgVar.zzk();
                                    } else {
                                        zzbth zzbthVar = this.zzm;
                                        zzn = zzbthVar != null ? zzbthVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = com.google.android.gms.dynamic.d.g2(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                y0.c(optJSONArray, arrayList);
                                t.r();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbtk zzbtkVar2 = this.zza;
            if (zzbtkVar2 != null) {
                zzbtkVar2.zzy(h22, com.google.android.gms.dynamic.d.h2(zzc), com.google.android.gms.dynamic.d.h2(zzc2));
                return;
            }
            zzbtg zzbtgVar2 = this.zzl;
            if (zzbtgVar2 != null) {
                zzbtgVar2.zzv(h22, com.google.android.gms.dynamic.d.h2(zzc), com.google.android.gms.dynamic.d.h2(zzc2));
                this.zzl.zzu(h22);
                return;
            }
            zzbth zzbthVar2 = this.zzm;
            if (zzbthVar2 != null) {
                zzbthVar2.zzt(h22, com.google.android.gms.dynamic.d.h2(zzc), com.google.android.gms.dynamic.d.h2(zzc2));
                this.zzm.zzs(h22);
            }
        } catch (RemoteException e10) {
            zzcec.zzk("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdni
    public final void zzz(View view, Map map) {
        try {
            com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(view);
            zzbtk zzbtkVar = this.zza;
            if (zzbtkVar != null) {
                zzbtkVar.zzz(h22);
                return;
            }
            zzbtg zzbtgVar = this.zzl;
            if (zzbtgVar != null) {
                zzbtgVar.zzw(h22);
                return;
            }
            zzbth zzbthVar = this.zzm;
            if (zzbthVar != null) {
                zzbthVar.zzu(h22);
            }
        } catch (RemoteException e10) {
            zzcec.zzk("Failed to call untrackView", e10);
        }
    }
}
