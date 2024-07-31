package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import g9.f0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzbnr implements zzbng {
    private final com.google.android.gms.ads.internal.b zza;
    private final zzdwf zzb;
    private final zzflw zzc;
    private final zzbvq zze;
    private final zzehh zzf;
    private final zzcse zzg;
    private f0 zzh = null;
    private final zzgey zzi = zzcep.zzf;
    private final zzceh zzd = new zzceh(null);

    public zzbnr(com.google.android.gms.ads.internal.b bVar, zzbvq zzbvqVar, zzehh zzehhVar, zzdwf zzdwfVar, zzflw zzflwVar, zzcse zzcseVar) {
        this.zza = bVar;
        this.zze = zzbvqVar;
        this.zzf = zzehhVar;
        this.zzb = zzdwfVar;
        this.zzc = zzflwVar;
        this.zzg = zzcseVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzavi zzaviVar, Uri uri, View view, Activity activity, zzfhl zzfhlVar) {
        if (zzaviVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) a0.c().zza(zzbgc.zzlr)).booleanValue() || zzfhlVar == null) {
                if (zzaviVar.zze(uri)) {
                    uri = zzaviVar.zza(uri, context, view, activity);
                }
            } else if (zzaviVar.zze(uri)) {
                uri = zzfhlVar.zza(uri, context, view, activity);
            }
        } catch (zzavj unused) {
        } catch (Exception e10) {
            t.q().zzw(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzcec.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.a aVar, Map map, String str2) {
        String str3;
        boolean z10;
        HashMap hashMap;
        boolean z11;
        zzcjk zzcjkVar = (zzcjk) aVar;
        zzfgm zzD = zzcjkVar.zzD();
        zzfgp zzP = zzcjkVar.zzP();
        boolean z12 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z10 = false;
        } else {
            String str4 = zzP.zzb;
            z10 = zzD.zzaj;
            str3 = str4;
        }
        boolean z13 = (((Boolean) a0.c().zza(zzbgc.zzkk)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcjkVar.zzaC()) {
                zzcec.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzckq) aVar).zzaH(zzf(map), zzb(map), z13);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z14 = ((Boolean) a0.c().zza(zzbgc.zzlm)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            zzckq zzckqVar = (zzckq) aVar;
            boolean zzf = zzf(map);
            int zzb = zzb(map);
            if (str != null) {
                zzckqVar.zzaJ(zzf, zzb, str, z13, z14);
                return;
            } else {
                zzckqVar.zzaI(zzf, zzb, (String) map.get("html"), (String) map.get("baseurl"), z13);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzcjkVar.getContext();
            if (((Boolean) a0.c().zza(zzbgc.zzew)).booleanValue()) {
                if (((Boolean) a0.c().zza(zzbgc.zzeA)).booleanValue()) {
                    u1.a("User opt out chrome custom tab.");
                } else {
                    z12 = true;
                }
            }
            boolean zzg = zzbhd.zzg(zzcjkVar.getContext());
            if (z12) {
                if (zzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcec.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), Uri.parse(str), zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ()));
                    if (z10 && this.zzf != null && zzl(aVar, zzcjkVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbno(this);
                    ((zzckq) aVar).zzaF(new g9.j(null, zzd.toString(), null, null, null, null, null, null, com.google.android.gms.dynamic.d.h2(this.zzh).asBinder(), true), z13);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(aVar, map, z10, str3, z13);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(aVar, map, z10, str3, z13);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) a0.c().zza(zzbgc.zzid)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    zzcec.zzj("Package name missing from open app action.");
                    return;
                }
                if (z10 && this.zzf != null && zzl(aVar, zzcjkVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcjkVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcec.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzckq) aVar).zzaF(new g9.j(launchIntentForPackage, this.zzh), z13);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e10) {
                zzcec.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e10);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), data, zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) a0.c().zza(zzbgc.zzie)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z15 = ((Boolean) a0.c().zza(zzbgc.zziv)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z15) {
            hashMap = hashMap2;
            this.zzh = new zzbnp(this, z13, aVar, hashMap2, map);
            z11 = false;
        } else {
            hashMap = hashMap2;
            z11 = z13;
        }
        if (intent2 != null) {
            if (!z10 || this.zzf == null || !zzl(aVar, zzcjkVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzckq) aVar).zzaF(new g9.j(intent2, this.zzh), z11);
                return;
            } else {
                if (z15) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbqa) aVar).zzd("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        HashMap hashMap4 = hashMap;
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcjkVar.getContext(), zzcjkVar.zzI(), Uri.parse(str), zzcjkVar.zzF(), zzcjkVar.zzi(), zzcjkVar.zzQ())).toString() : str;
        if (!z10 || this.zzf == null || !zzl(aVar, zzcjkVar.getContext(), uri, str3)) {
            ((zzckq) aVar).zzaF(new g9.j((String) map.get("i"), uri, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z11);
        } else if (z15) {
            hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
            ((zzbqa) aVar).zzd("openIntentAsync", hashMap4);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdwf zzdwfVar = this.zzb;
        if (zzdwfVar != null) {
            zzehs.zzc(context, zzdwfVar, this.zzc, this.zzf, str, "dialog_not_shown", zzgad.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0101, code lost:
    
        if (com.google.android.gms.internal.ads.zzbnq.zzc(r2, r11, r12, r13, r14) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(com.google.android.gms.ads.internal.client.a r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnr.zzj(com.google.android.gms.ads.internal.client.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbvq zzbvqVar = this.zze;
        if (zzbvqVar != null) {
            zzbvqVar.zza(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(android.os.Build.VERSION.SDK_INT < 33 ? com.google.android.gms.internal.ads.zzbgc.zzio : com.google.android.gms.internal.ads.zzbgc.zzin)).booleanValue() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnr.zzl(com.google.android.gms.ads.internal.client.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
            zzdwe zza = this.zzb.zza();
            zza.zzb("action", "cct_action");
            zza.zzb("cct_open_status", zzbhc.zza(i10));
            zza.zzg();
            return;
        }
        zzflw zzflwVar = this.zzc;
        String zza2 = zzbhc.zza(i10);
        zzflv zzb = zzflv.zzb("cct_action");
        zzb.zza("cct_open_status", zza2);
        zzflwVar.zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.a aVar = (com.google.android.gms.ads.internal.client.a) obj;
        String zzc = zzccj.zzc((String) map.get("u"), ((zzcjk) aVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcec.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.b bVar = this.zza;
        if (bVar == null || bVar.c()) {
            zzgen.zzr((((Boolean) a0.c().zza(zzbgc.zzjL)).booleanValue() && this.zzg != null && zzcse.zzh(zzc)) ? this.zzg.zzb(zzc, x.e()) : zzgen.zzh(zzc), new zzbnn(this, aVar, map, str), this.zzi);
        } else {
            bVar.b(zzc);
        }
    }
}
