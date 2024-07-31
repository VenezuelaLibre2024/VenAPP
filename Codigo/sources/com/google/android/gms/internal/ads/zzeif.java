package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzeif implements zzeig {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfod zzc(String str, String str2, String str3, zzeih zzeihVar, String str4, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        String valueOf;
        String str7;
        String concat;
        zzfon zza = zzfon.zza("Google", str2);
        zzfom zzm = zzm("javascript");
        zzfoi zzk = zzk(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzm == zzfomVar) {
            concat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (zzk == null) {
                valueOf = String.valueOf(zzeihVar);
                str7 = "Omid html session error; Unable to parse creative type: ";
            } else {
                zzfom zzm2 = zzm(str4);
                if (zzk != zzfoi.VIDEO || zzm2 != zzfomVar) {
                    return zzfod.zza(zzfoe.zza(zzk, zzl(zzeiiVar.toString()), zzm, zzm2, true), zzfof.zzb(zza, webView, str5, ""));
                }
                valueOf = String.valueOf(str4);
                str7 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            concat = str7.concat(valueOf);
        }
        zzcec.zzj(concat);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfod zzd(String str, String str2, String str3, String str4, zzeih zzeihVar, WebView webView, String str5, String str6, zzeii zzeiiVar) {
        String valueOf;
        String str7;
        String concat;
        zzfon zza = zzfon.zza(str, str2);
        zzfom zzm = zzm("javascript");
        zzfom zzm2 = zzm(str4);
        zzfoi zzk = zzk(zzeihVar.toString());
        zzfom zzfomVar = zzfom.NONE;
        if (zzm == zzfomVar) {
            concat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (zzk == null) {
                valueOf = String.valueOf(zzeihVar);
                str7 = "Omid js session error; Unable to parse creative type: ";
            } else {
                if (zzk != zzfoi.VIDEO || zzm2 != zzfomVar) {
                    return zzfod.zza(zzfoe.zza(zzk, zzl(zzeiiVar.toString()), zzm, zzm2, true), zzfof.zzc(zza, webView, str5, ""));
                }
                valueOf = String.valueOf(str4);
                str7 = "Omid js session error; Video events owner unknown for video creative: ";
            }
            concat = str7.concat(valueOf);
        }
        zzcec.zzj(concat);
        return null;
    }

    private static zzfoi zzk(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("video")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            return zzfoi.HTML_DISPLAY;
        }
        if (c10 == 1) {
            return zzfoi.NATIVE_DISPLAY;
        }
        if (c10 != 2) {
            return null;
        }
        return zzfoi.VIDEO;
    }

    private static zzfol zzl(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? zzfol.UNSPECIFIED : zzfol.ONE_PIXEL : zzfol.DEFINED_BY_JAVASCRIPT : zzfol.BEGIN_TO_RENDER;
    }

    private static zzfom zzm(String str) {
        return "native".equals(str) ? zzfom.NATIVE : "javascript".equals(str) ? zzfom.JAVASCRIPT : zzfom.NONE;
    }

    private static final Object zzn(zzeie zzeieVar) {
        try {
            return zzeieVar.zza();
        } catch (RuntimeException e10) {
            t.q().zzv(e10, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            t.q().zzv(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final zzfod zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeii zzeiiVar, final zzeih zzeihVar, final String str5) {
        if (!((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() || !zzfob.zzb()) {
            return null;
        }
        final String str6 = "";
        final String str7 = "javascript";
        final String str8 = "Google";
        return (zzfod) zzn(new zzeie(str8, str, str7, zzeihVar, str4, webView, str5, str6, zzeiiVar) { // from class: com.google.android.gms.internal.ads.zzeib
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzeih zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeii zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeihVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzeiiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeie
            public final Object zza() {
                return zzeif.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final zzfod zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeii zzeiiVar, final zzeih zzeihVar, final String str6) {
        if (!((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() || !zzfob.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzfod) zzn(new zzeie(str5, str, str8, str4, zzeihVar, webView, str6, str7, zzeiiVar) { // from class: com.google.android.gms.internal.ads.zzehy
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzeih zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeii zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeihVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzeiiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeie
            public final Object zza() {
                return zzeif.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final String zze(Context context) {
        if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue()) {
            return (String) zzn(new zzeie() { // from class: com.google.android.gms.internal.ads.zzeic
                @Override // com.google.android.gms.internal.ads.zzeie
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final void zzf(final zzfod zzfodVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() && zzfob.zzb()) {
                    zzfod.this.zzb(view, zzfok.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final void zzg(final zzfod zzfodVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeid
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() && zzfob.zzb()) {
                    zzfod.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final void zzh(final zzfod zzfodVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() && zzfob.zzb()) {
                    zzfod.this.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final void zzi(final zzfod zzfodVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue() && zzfob.zzb()) {
            Objects.requireNonNull(zzfodVar);
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfod.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeig
    public final boolean zzj(final Context context) {
        if (((Boolean) a0.c().zza(zzbgc.zzeU)).booleanValue()) {
            Boolean bool = (Boolean) zzn(new zzeie() { // from class: com.google.android.gms.internal.ads.zzeia
                @Override // com.google.android.gms.internal.ads.zzeie
                public final Object zza() {
                    if (zzfob.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfob.zza(context);
                    return Boolean.valueOf(zzfob.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        zzcec.zzj("Omid flag is disabled");
        return false;
    }
}
