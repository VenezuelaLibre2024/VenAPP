package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.o3;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdqd {
    private final Context zza;
    private final zzdpm zzb;
    private final zzavi zzc;
    private final zzcei zzd;
    private final com.google.android.gms.ads.internal.a zze;
    private final zzbbp zzf;
    private final Executor zzg;
    private final zzbjb zzh;
    private final zzdqv zzi;
    private final zzdtk zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsf zzl;
    private final zzdwf zzm;
    private final zzflw zzn;
    private final zzfny zzo;
    private final zzehh zzp;
    private final zzehs zzq;
    private final zzfhl zzr;

    public zzdqd(Context context, zzdpm zzdpmVar, zzavi zzaviVar, zzcei zzceiVar, com.google.android.gms.ads.internal.a aVar, zzbbp zzbbpVar, Executor executor, zzfhh zzfhhVar, zzdqv zzdqvVar, zzdtk zzdtkVar, ScheduledExecutorService scheduledExecutorService, zzdwf zzdwfVar, zzflw zzflwVar, zzfny zzfnyVar, zzehh zzehhVar, zzdsf zzdsfVar, zzehs zzehsVar, zzfhl zzfhlVar) {
        this.zza = context;
        this.zzb = zzdpmVar;
        this.zzc = zzaviVar;
        this.zzd = zzceiVar;
        this.zze = aVar;
        this.zzf = zzbbpVar;
        this.zzg = executor;
        this.zzh = zzfhhVar.zzi;
        this.zzi = zzdqvVar;
        this.zzj = zzdtkVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdwfVar;
        this.zzn = zzflwVar;
        this.zzo = zzfnyVar;
        this.zzp = zzehhVar;
        this.zzl = zzdsfVar;
        this.zzq = zzehsVar;
        this.zzr = zzfhlVar;
    }

    public static final o3 zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgaa.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgaa.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            o3 zzr = zzr(optJSONArray.optJSONObject(i10));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzgaa.zzj(arrayList);
    }

    private final z4 zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return z4.w1();
            }
            i10 = 0;
        }
        return new z4(this.zza, new x8.i(i10, i11));
    }

    private static com.google.common.util.concurrent.f zzl(com.google.common.util.concurrent.f fVar, Object obj) {
        return zzgen.zzf(fVar, Exception.class, new zzgdu(null) { // from class: com.google.android.gms.internal.ads.zzdqb
            public /* synthetic */ zzdqb(Object obj2) {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj2) {
                u1.b("Error during loading assets.", (Exception) obj2);
                return zzgen.zzh(null);
            }
        }, zzcep.zzf);
    }

    private static com.google.common.util.concurrent.f zzm(boolean z10, com.google.common.util.concurrent.f fVar, Object obj) {
        return z10 ? zzgen.zzn(fVar, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdqc
            public /* synthetic */ zzdqc() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj2) {
                return obj2 != null ? com.google.common.util.concurrent.f.this : zzgen.zzg(new zzeml(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcep.zzf) : zzl(fVar, null);
    }

    private final com.google.common.util.concurrent.f zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzgen.zzh(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgen.zzh(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzgen.zzh(new zzbiz(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgen.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfws() { // from class: com.google.android.gms.internal.ads.zzdpt
            public final /* synthetic */ String zza;
            public final /* synthetic */ double zzb;
            public final /* synthetic */ int zzc;
            public final /* synthetic */ int zzd;

            public /* synthetic */ zzdpt(String optString2, double optDouble2, int optInt3, int optInt22) {
                r1 = optString2;
                r2 = optDouble2;
                r4 = optInt3;
                r5 = optInt22;
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return new zzbiz(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(r1), r2, r4, r5);
            }
        }, this.zzg), null);
    }

    private final com.google.common.util.concurrent.f zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgen.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10));
        }
        return zzgen.zzm(zzgen.zzd(arrayList), zzdpy.zza, this.zzg);
    }

    private final com.google.common.util.concurrent.f zzp(JSONObject jSONObject, zzfgm zzfgmVar, zzfgp zzfgpVar) {
        com.google.common.util.concurrent.f zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfgmVar, zzfgpVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgen.zzn(zzb, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzdpu
            public /* synthetic */ zzdpu() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                zzcjk zzcjkVar = (zzcjk) obj;
                if (zzcjkVar == null || zzcjkVar.zzq() == null) {
                    throw new zzeml(1, "Retrieve video view in html5 ad response failed.");
                }
                return com.google.common.util.concurrent.f.this;
            }
        }, zzcep.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final o3 zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(Constants.REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new o3(optString, optString2);
    }

    public final /* synthetic */ zzbiw zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
        return new zzbiw(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzb(z4 z4Var, zzfgm zzfgmVar, zzfgp zzfgpVar, String str, String str2, Object obj) {
        zzcjk zza = this.zzj.zza(z4Var, zzfgmVar, zzfgpVar);
        zzcet zza2 = zzcet.zza(zza);
        zzdsc zzb = this.zzl.zzb();
        zza.zzN().zzN(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.b(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null, null);
        if (((Boolean) a0.c().zza(zzbgc.zzdF)).booleanValue()) {
            zza.zzae("/getNativeAdViewSignals", zzbnf.zzs);
        }
        zza.zzae("/getNativeClickMeta", zzbnf.zzt);
        zza.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdpx
            public /* synthetic */ zzdpx() {
            }

            @Override // com.google.android.gms.internal.ads.zzckw
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzcet zzcetVar = zzcet.this;
                if (z10) {
                    zzcetVar.zzb();
                    return;
                }
                zzcetVar.zzd(new zzeml(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzac(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzc(String str, Object obj) {
        t.B();
        zzcjk zza = zzcjx.zza(this.zza, zzcla.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq, this.zzr);
        zzcet zza2 = zzcet.zza(zza);
        zza.zzN().zzB(new zzckw() { // from class: com.google.android.gms.internal.ads.zzdpz
            public /* synthetic */ zzdpz() {
            }

            @Override // com.google.android.gms.internal.ads.zzckw
            public final void zza(boolean z10, int i10, String str2, String str3) {
                zzcet.this.zzb();
            }
        });
        if (((Boolean) a0.c().zza(zzbgc.zzeX)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final com.google.common.util.concurrent.f zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgen.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgen.zzm(zzo(optJSONArray, false, true), new zzfws() { // from class: com.google.android.gms.internal.ads.zzdqa
            public final /* synthetic */ JSONObject zzb;

            public /* synthetic */ zzdqa(JSONObject optJSONObject3) {
                r2 = optJSONObject3;
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                return zzdqd.this.zza(r2, (List) obj);
            }
        }, this.zzg), null);
    }

    public final com.google.common.util.concurrent.f zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final com.google.common.util.concurrent.f zzf(JSONObject jSONObject, String str) {
        zzbjb zzbjbVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbjbVar.zzb, zzbjbVar.zzd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzdpv.<init>(com.google.android.gms.internal.ads.zzdqd, com.google.android.gms.ads.internal.client.z4, com.google.android.gms.internal.ads.zzfgm, com.google.android.gms.internal.ads.zzfgp, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.common.util.concurrent.f zzg(org.json.JSONObject r10, java.lang.String r11, com.google.android.gms.internal.ads.zzfgm r12, com.google.android.gms.internal.ads.zzfgp r13) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzbfu r11 = com.google.android.gms.internal.ads.zzbgc.zzjK
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r11 = r0.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 0
            if (r11 != 0) goto L18
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            return r10
        L18:
            java.lang.String r11 = "images"
            org.json.JSONArray r10 = r10.optJSONArray(r11)
            if (r10 == 0) goto L79
            int r11 = r10.length()
            if (r11 > 0) goto L27
            goto L79
        L27:
            r11 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r11)
            if (r10 != 0) goto L33
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            return r10
        L33:
            java.lang.String r1 = "base_url"
            java.lang.String r7 = r10.optString(r1)
            java.lang.String r1 = "html"
            java.lang.String r8 = r10.optString(r1)
            java.lang.String r1 = "width"
            int r1 = r10.optInt(r1, r11)
            java.lang.String r2 = "height"
            int r10 = r10.optInt(r2, r11)
            com.google.android.gms.ads.internal.client.z4 r4 = r9.zzk(r1, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L5a
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            return r10
        L5a:
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            com.google.android.gms.internal.ads.zzdpv r11 = new com.google.android.gms.internal.ads.zzdpv
            r2 = r11
            r3 = r9
            r5 = r12
            r6 = r13
            r2.<init>()
            com.google.android.gms.internal.ads.zzgey r12 = com.google.android.gms.internal.ads.zzcep.zze
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzn(r10, r11, r12)
            com.google.android.gms.internal.ads.zzdpw r11 = new com.google.android.gms.internal.ads.zzdpw
            r11.<init>()
            com.google.android.gms.internal.ads.zzgey r12 = com.google.android.gms.internal.ads.zzcep.zzf
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzn(r10, r11, r12)
            return r10
        L79:
            com.google.common.util.concurrent.f r10 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqd.zzg(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzfgm, com.google.android.gms.internal.ads.zzfgp):com.google.common.util.concurrent.f");
    }

    public final com.google.common.util.concurrent.f zzh(JSONObject jSONObject, zzfgm zzfgmVar, zzfgp zzfgpVar) {
        com.google.common.util.concurrent.f zza;
        JSONObject g10 = y0.g(jSONObject, "html_containers", "instream");
        if (g10 != null) {
            return zzp(g10, zzfgmVar, zzfgpVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) a0.c().zza(zzbgc.zzjJ)).booleanValue() && optJSONObject.has("html")) {
                z10 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    zzcec.zzj("Required field 'vast_xml' or 'html' is missing");
                }
            } else if (!z10) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzgen.zzo(zza, ((Integer) a0.c().zza(zzbgc.zzdG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfgmVar, zzfgpVar);
            return zzl(zzgen.zzo(zza, ((Integer) a0.c().zza(zzbgc.zzdG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzgen.zzh(null);
    }
}
