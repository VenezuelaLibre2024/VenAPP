package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import i9.d0;
import i9.l;
import i9.p;
import i9.r;
import i9.u;
import i9.w;
import i9.y;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import x8.e0;

/* loaded from: classes2.dex */
public final class zzbve extends zzbur {
    private final RtbAdapter zza;
    private p zzb;
    private w zzc;
    private i9.h zzd;
    private String zze = "";

    public zzbve(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(u4 u4Var) {
        Bundle bundle;
        Bundle bundle2 = u4Var.f8761x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) {
        zzcec.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            zzcec.zzh("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(u4 u4Var) {
        if (u4Var.f8754f) {
            return true;
        }
        x.b();
        return zzcdv.zzr();
    }

    private static final String zzy(String str, u4 u4Var) {
        String str2 = u4Var.F;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final s2 zze() {
        Object obj = this.zza;
        if (obj instanceof d0) {
            try {
                return ((d0) obj).getVideoController();
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final zzbvg zzf() {
        return zzbvg.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final zzbvg zzg() {
        return zzbvg.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzli)).booleanValue() != false) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(com.google.android.gms.dynamic.b r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, com.google.android.gms.ads.internal.client.z4 r9, com.google.android.gms.internal.ads.zzbuv r10) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbvc r0 = new com.google.android.gms.internal.ads.zzbvc     // Catch: java.lang.Throwable -> Lab
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.zza     // Catch: java.lang.Throwable -> Lab
            i9.n r1 = new i9.n     // Catch: java.lang.Throwable -> Lab
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> Lab
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L7d;
                case 1: goto L7a;
                case 2: goto L77;
                case 3: goto L74;
                case 4: goto L71;
                case 5: goto L6e;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto La3
        L5c:
            com.google.android.gms.internal.ads.zzbfu r6 = com.google.android.gms.internal.ads.zzbgc.zzli     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r6 = r2.zza(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La3
        L6e:
            x8.c r6 = x8.c.APP_OPEN_AD     // Catch: java.lang.Throwable -> Lab
            goto L7f
        L71:
            x8.c r6 = x8.c.NATIVE     // Catch: java.lang.Throwable -> Lab
            goto L7f
        L74:
            x8.c r6 = x8.c.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> Lab
            goto L7f
        L77:
            x8.c r6 = x8.c.REWARDED     // Catch: java.lang.Throwable -> Lab
            goto L7f
        L7a:
            x8.c r6 = x8.c.INTERSTITIAL     // Catch: java.lang.Throwable -> Lab
            goto L7f
        L7d:
            x8.c r6 = x8.c.BANNER     // Catch: java.lang.Throwable -> Lab
        L7f:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> Lab
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r6.<init>()     // Catch: java.lang.Throwable -> Lab
            r6.add(r1)     // Catch: java.lang.Throwable -> Lab
            k9.a r8 = new k9.a     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = com.google.android.gms.dynamic.d.g2(r5)     // Catch: java.lang.Throwable -> Lab
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Lab
            int r2 = r9.f8835e     // Catch: java.lang.Throwable -> Lab
            int r3 = r9.f8832b     // Catch: java.lang.Throwable -> Lab
            java.lang.String r9 = r9.f8831a     // Catch: java.lang.Throwable -> Lab
            x8.i r9 = x8.e0.c(r2, r3, r9)     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> Lab
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> Lab
            return
        La3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lab
            throw r6     // Catch: java.lang.Throwable -> Lab
        Lab:
            r6 = move-exception
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.zzcec.zzh(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbss.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbve.zzh(com.google.android.gms.dynamic.b, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.z4, com.google.android.gms.internal.ads.zzbuv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzi(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbud zzbudVar, zzbtb zzbtbVar) {
        try {
            this.zza.loadRtbAppOpenAd(new i9.i((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), this.zze), new zzbvb(this, zzbudVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render app open ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzj(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbug zzbugVar, zzbtb zzbtbVar, z4 z4Var) {
        try {
            this.zza.loadRtbBannerAd(new l((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), e0.c(z4Var.f8835e, z4Var.f8832b, z4Var.f8831a), this.zze), new zzbux(this, zzbugVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render banner ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzk(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbug zzbugVar, zzbtb zzbtbVar, z4 z4Var) {
        try {
            this.zza.loadRtbInterscrollerAd(new l((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), e0.c(z4Var.f8835e, z4Var.f8832b, z4Var.f8831a), this.zze), new zzbuy(this, zzbugVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render interscroller ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzl(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbuj zzbujVar, zzbtb zzbtbVar) {
        try {
            this.zza.loadRtbInterstitialAd(new r((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), this.zze), new zzbuz(this, zzbujVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render interstitial ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzm(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbum zzbumVar, zzbtb zzbtbVar) {
        zzn(str, str2, u4Var, bVar, zzbumVar, zzbtbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzn(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbum zzbumVar, zzbtb zzbtbVar, zzbjb zzbjbVar) {
        try {
            this.zza.loadRtbNativeAd(new u((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), this.zze, zzbjbVar), new zzbva(this, zzbumVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render native ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbNativeAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzo(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbup zzbupVar, zzbtb zzbtbVar) {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new y((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), this.zze), new zzbvd(this, zzbupVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render rewarded interstitial ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzp(String str, String str2, u4 u4Var, com.google.android.gms.dynamic.b bVar, zzbup zzbupVar, zzbtb zzbtbVar) {
        try {
            this.zza.loadRtbRewardedAd(new y((Context) com.google.android.gms.dynamic.d.g2(bVar), str, zzw(str2), zzv(u4Var), zzx(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzy(str2, u4Var), this.zze), new zzbvd(this, zzbupVar, zzbtbVar));
        } catch (Throwable th2) {
            zzcec.zzh("Adapter failed to render rewarded ad.", th2);
            zzbss.zza(bVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzr(com.google.android.gms.dynamic.b bVar) {
        i9.h hVar = this.zzd;
        if (hVar == null) {
            return false;
        }
        try {
            hVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
            return true;
        } catch (Throwable th2) {
            zzcec.zzh("", th2);
            zzbss.zza(bVar, th2, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzs(com.google.android.gms.dynamic.b bVar) {
        p pVar = this.zzb;
        if (pVar == null) {
            return false;
        }
        try {
            pVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
            return true;
        } catch (Throwable th2) {
            zzcec.zzh("", th2);
            zzbss.zza(bVar, th2, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzt(com.google.android.gms.dynamic.b bVar) {
        w wVar = this.zzc;
        if (wVar == null) {
            return false;
        }
        try {
            wVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
            return true;
        } catch (Throwable th2) {
            zzcec.zzh("", th2);
            zzbss.zza(bVar, th2, "adapter.showRtbRewardedAd");
            return true;
        }
    }
}
