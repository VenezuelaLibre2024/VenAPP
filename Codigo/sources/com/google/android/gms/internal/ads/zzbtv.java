package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import i9.a0;
import i9.b0;
import i9.c0;
import i9.d0;
import i9.l;
import i9.o;
import i9.p;
import i9.r;
import i9.u;
import i9.w;
import i9.y;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import x8.e0;

/* loaded from: classes2.dex */
public final class zzbtv extends zzbsx {
    private final Object zza;
    private zzbtx zzb;
    private zzcaf zzc;
    private com.google.android.gms.dynamic.b zzd;
    private View zze;
    private p zzf;
    private c0 zzg;
    private w zzh;
    private o zzi;
    private i9.h zzj;
    private final String zzk = "";

    public zzbtv(i9.a aVar) {
        this.zza = aVar;
    }

    public zzbtv(i9.g gVar) {
        this.zza = gVar;
    }

    private final Bundle zzU(u4 u4Var) {
        Bundle bundle;
        Bundle bundle2 = u4Var.f8761x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzV(String str, u4 u4Var, String str2) {
        zzcec.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (u4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", u4Var.f8755r);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            zzcec.zzh("", th2);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(u4 u4Var) {
        if (u4Var.f8754f) {
            return true;
        }
        x.b();
        return zzcdv.zzr();
    }

    private static final String zzX(String str, u4 u4Var) {
        String str2 = u4Var.F;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzA(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting rewarded ad from adapter.");
        try {
            ((i9.a) this.zza).loadRewardedAd(new y((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, null), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), ""), new zzbtt(this, zzbtbVar));
        } catch (Exception e10) {
            zzcec.zzh("", e10);
            zzbss.zza(bVar, e10, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzB(u4 u4Var, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof i9.a) {
            zzA(this.zzd, u4Var, str, new zzbty((i9.a) obj, this.zzc));
            return;
        }
        zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzC(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (obj instanceof i9.a) {
            zzcec.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((i9.a) this.zza).loadRewardedInterstitialAd(new y((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, null), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), ""), new zzbtt(this, zzbtbVar));
                return;
            } catch (Exception e10) {
                zzbss.zza(bVar, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzD(com.google.android.gms.dynamic.b bVar) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        Object obj = this.zza;
        if (obj instanceof a0) {
            ((a0) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzE() {
        Object obj = this.zza;
        if (obj instanceof i9.g) {
            try {
                ((i9.g) obj).onPause();
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzF() {
        Object obj = this.zza;
        if (obj instanceof i9.g) {
            try {
                ((i9.g) obj).onResume();
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzG(boolean z10) {
        Object obj = this.zza;
        if (obj instanceof b0) {
            try {
                ((b0) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                return;
            }
        }
        zzcec.zze(b0.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzH(com.google.android.gms.dynamic.b bVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Show app open ad from adapter.");
        i9.h hVar = this.zzj;
        if (hVar == null) {
            zzcec.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            hVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
        } catch (RuntimeException e10) {
            zzbss.zza(bVar, e10, "adapter.appOpen.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzI() {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            zzcec.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                throw new RemoteException();
            }
        }
        zzcec.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzJ(com.google.android.gms.dynamic.b bVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a) && !(obj instanceof MediationInterstitialAdapter)) {
            zzcec.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzI();
            return;
        }
        zzcec.zze("Show interstitial ad from adapter.");
        p pVar = this.zzf;
        if (pVar == null) {
            zzcec.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            pVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
        } catch (RuntimeException e10) {
            zzbss.zza(bVar, e10, "adapter.interstitial.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzK(com.google.android.gms.dynamic.b bVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Show rewarded ad from adapter.");
        w wVar = this.zzh;
        if (wVar == null) {
            zzcec.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            wVar.a((Context) com.google.android.gms.dynamic.d.g2(bVar));
        } catch (RuntimeException e10) {
            zzbss.zza(bVar, e10, "adapter.rewarded.showAd");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzL() {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        w wVar = this.zzh;
        if (wVar == null) {
            zzcec.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        try {
            wVar.a((Context) com.google.android.gms.dynamic.d.g2(this.zzd));
        } catch (RuntimeException e10) {
            zzbss.zza(this.zzd, e10, "adapter.showVideo");
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final boolean zzN() {
        Object obj = this.zza;
        if ((obj instanceof i9.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbtg zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbth zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final s2 zzh() {
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

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbkg zzi() {
        zzbtx zzbtxVar = this.zzb;
        if (zzbtxVar == null) {
            return null;
        }
        zzbkh zzc = zzbtxVar.zzc();
        if (zzc instanceof zzbkh) {
            return zzc.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbte zzj() {
        o oVar = this.zzi;
        if (oVar != null) {
            return new zzbtw(oVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbtk zzk() {
        c0 c0Var;
        c0 zza;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof i9.a) || (c0Var = this.zzg) == null) {
                return null;
            }
            return new zzbua(c0Var);
        }
        zzbtx zzbtxVar = this.zzb;
        if (zzbtxVar == null || (zza = zzbtxVar.zza()) == null) {
            return null;
        }
        return new zzbua(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbvg zzl() {
        Object obj = this.zza;
        if (obj instanceof i9.a) {
            return zzbvg.zza(((i9.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final zzbvg zzm() {
        Object obj = this.zza;
        if (obj instanceof i9.a) {
            return zzbvg.zza(((i9.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final com.google.android.gms.dynamic.b zzn() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return com.google.android.gms.dynamic.d.h2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof i9.a) {
            return com.google.android.gms.dynamic.d.h2(this.zze);
        }
        zzcec.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzo() {
        Object obj = this.zza;
        if (obj instanceof i9.g) {
            try {
                ((i9.g) obj).onDestroy();
            } catch (Throwable th2) {
                zzcec.zzh("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzp(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzcaf zzcafVar, String str2) {
        Object obj = this.zza;
        if ((obj instanceof i9.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = bVar;
            this.zzc = zzcafVar;
            zzcafVar.zzl(com.google.android.gms.dynamic.d.h2(this.zza));
            return;
        }
        Object obj2 = this.zza;
        zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzli)).booleanValue() != false) goto L91;
     */
    @Override // com.google.android.gms.internal.ads.zzbsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzq(com.google.android.gms.dynamic.b r6, com.google.android.gms.internal.ads.zzbph r7, java.util.List r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zza
            boolean r0 = r0 instanceof i9.a
            if (r0 == 0) goto Lb5
            com.google.android.gms.internal.ads.zzbtp r0 = new com.google.android.gms.internal.ads.zzbtp
            r0.<init>(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.zzbpn r1 = (com.google.android.gms.internal.ads.zzbpn) r1
            java.lang.String r2 = r1.zza
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 3
            goto L71
        L34:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 6
            goto L71
        L3e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 5
            goto L71
        L48:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 1
            goto L71
        L52:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 2
            goto L71
        L5c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 4
            goto L71
        L66:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 0
            goto L71
        L70:
            r2 = -1
        L71:
            r3 = 0
            switch(r2) {
                case 0: goto L97;
                case 1: goto L94;
                case 2: goto L91;
                case 3: goto L8e;
                case 4: goto L8b;
                case 5: goto L88;
                case 6: goto L76;
                default: goto L75;
            }
        L75:
            goto L99
        L76:
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzli
            com.google.android.gms.internal.ads.zzbga r4 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L99
        L88:
            x8.c r3 = x8.c.APP_OPEN_AD
            goto L99
        L8b:
            x8.c r3 = x8.c.NATIVE
            goto L99
        L8e:
            x8.c r3 = x8.c.REWARDED_INTERSTITIAL
            goto L99
        L91:
            x8.c r3 = x8.c.REWARDED
            goto L99
        L94:
            x8.c r3 = x8.c.INTERSTITIAL
            goto L99
        L97:
            x8.c r3 = x8.c.BANNER
        L99:
            if (r3 == 0) goto L14
            i9.n r2 = new i9.n
            android.os.Bundle r1 = r1.zzb
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L14
        La7:
            java.lang.Object r8 = r5.zza
            i9.a r8 = (i9.a) r8
            java.lang.Object r6 = com.google.android.gms.dynamic.d.g2(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        Lb5:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtv.zzq(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.zzbph, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzr(com.google.android.gms.dynamic.b bVar, zzcaf zzcafVar, List list) {
        zzcec.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzs(u4 u4Var, String str) {
        zzB(u4Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzt(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting app open ad from adapter.");
        try {
            ((i9.a) this.zza).loadAppOpenAd(new i9.i((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, null), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), ""), new zzbtu(this, zzbtbVar));
        } catch (Exception e10) {
            zzcec.zzh("", e10);
            zzbss.zza(bVar, e10, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzu(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, zzbtb zzbtbVar) {
        zzv(bVar, z4Var, u4Var, str, null, zzbtbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzv(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof i9.a)) {
            zzcec.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting banner ad from adapter.");
        x8.i d10 = z4Var.f8844y ? e0.d(z4Var.f8835e, z4Var.f8832b) : e0.c(z4Var.f8835e, z4Var.f8832b, z4Var.f8831a);
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof i9.a) {
                try {
                    ((i9.a) obj2).loadBannerAd(new l((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, str2), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), d10, this.zzk), new zzbtq(this, zzbtbVar));
                    return;
                } catch (Throwable th2) {
                    zzcec.zzh("", th2);
                    zzbss.zza(bVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = u4Var.f8753e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = u4Var.f8750b;
            zzbtn zzbtnVar = new zzbtn(j10 == -1 ? null : new Date(j10), u4Var.f8752d, hashSet, u4Var.f8759v, zzW(u4Var), u4Var.f8755r, u4Var.C, u4Var.E, zzX(str, u4Var));
            Bundle bundle = u4Var.f8761x;
            mediationBannerAdapter.requestBannerAd((Context) com.google.android.gms.dynamic.d.g2(bVar), new zzbtx(zzbtbVar), zzV(str, u4Var, str2), d10, zzbtnVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            zzcec.zzh("", th3);
            zzbss.zza(bVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzw(com.google.android.gms.dynamic.b bVar, z4 z4Var, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (!(obj instanceof i9.a)) {
            zzcec.zzj(i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting interscroller ad from adapter.");
        try {
            i9.a aVar = (i9.a) this.zza;
            aVar.loadInterscrollerAd(new l((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, str2), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), e0.e(z4Var.f8835e, z4Var.f8832b), ""), new zzbto(this, zzbtbVar, aVar));
        } catch (Exception e10) {
            zzcec.zzh("", e10);
            zzbss.zza(bVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzx(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, zzbtb zzbtbVar) {
        zzy(bVar, u4Var, str, null, zzbtbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzy(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, String str2, zzbtb zzbtbVar) {
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof i9.a)) {
            zzcec.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof i9.a) {
                try {
                    ((i9.a) obj2).loadInterstitialAd(new r((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, str2), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), this.zzk), new zzbtr(this, zzbtbVar));
                    return;
                } catch (Throwable th2) {
                    zzcec.zzh("", th2);
                    zzbss.zza(bVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = u4Var.f8753e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = u4Var.f8750b;
            zzbtn zzbtnVar = new zzbtn(j10 == -1 ? null : new Date(j10), u4Var.f8752d, hashSet, u4Var.f8759v, zzW(u4Var), u4Var.f8755r, u4Var.C, u4Var.E, zzX(str, u4Var));
            Bundle bundle = u4Var.f8761x;
            mediationInterstitialAdapter.requestInterstitialAd((Context) com.google.android.gms.dynamic.d.g2(bVar), new zzbtx(zzbtbVar), zzV(str, u4Var, str2), zzbtnVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            zzcec.zzh("", th3);
            zzbss.zza(bVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzz(com.google.android.gms.dynamic.b bVar, u4 u4Var, String str, String str2, zzbtb zzbtbVar, zzbjb zzbjbVar, List list) {
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof i9.a)) {
            zzcec.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + i9.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcec.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof i9.a) {
                try {
                    ((i9.a) obj2).loadNativeAd(new u((Context) com.google.android.gms.dynamic.d.g2(bVar), "", zzV(str, u4Var, str2), zzU(u4Var), zzW(u4Var), u4Var.f8759v, u4Var.f8755r, u4Var.E, zzX(str, u4Var), this.zzk, zzbjbVar), new zzbts(this, zzbtbVar));
                    return;
                } catch (Throwable th2) {
                    zzcec.zzh("", th2);
                    zzbss.zza(bVar, th2, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = u4Var.f8753e;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j10 = u4Var.f8750b;
            zzbtz zzbtzVar = new zzbtz(j10 == -1 ? null : new Date(j10), u4Var.f8752d, hashSet, u4Var.f8759v, zzW(u4Var), u4Var.f8755r, zzbjbVar, list, u4Var.C, u4Var.E, zzX(str, u4Var));
            Bundle bundle = u4Var.f8761x;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzb = new zzbtx(zzbtbVar);
            mediationNativeAdapter.requestNativeAd((Context) com.google.android.gms.dynamic.d.g2(bVar), this.zzb, zzV(str, u4Var, str2), zzbtzVar, bundle2);
        } catch (Throwable th3) {
            zzcec.zzh("", th3);
            zzbss.zza(bVar, th3, "adapter.requestNativeAd");
            throw new RemoteException();
        }
    }
}
