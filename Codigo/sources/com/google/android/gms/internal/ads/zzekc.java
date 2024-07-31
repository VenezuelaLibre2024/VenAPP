package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import g9.v;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzekc implements zzein {
    private final Context zza;
    private final zzdko zzb;
    private final Executor zzc;
    private final zzfgl zzd;

    public zzekc(Context context, Executor executor, zzdko zzdkoVar, zzfgl zzfglVar) {
        this.zza = context;
        this.zzb = zzdkoVar;
        this.zzc = executor;
        this.zzd = zzfglVar;
    }

    private static String zzd(zzfgm zzfgmVar) {
        try {
            return zzfgmVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        String zzd = zzd(zzfgmVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzgen.zzn(zzgen.zzh(null), new zzgdu() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzekc.this.zzc(parse, zzfgyVar, zzfgmVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbhd.zzg(context) && !TextUtils.isEmpty(zzd(zzfgmVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzc(Uri uri, zzfgy zzfgyVar, zzfgm zzfgmVar, Object obj) {
        try {
            androidx.browser.customtabs.d b10 = new d.b().b();
            b10.f1766a.setData(uri);
            g9.j jVar = new g9.j(b10.f1766a, null);
            final zzceu zzceuVar = new zzceu();
            zzdjo zze = this.zzb.zze(new zzcwx(zzfgyVar, zzfgmVar, null), new zzdjr(new zzdkw() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // com.google.android.gms.internal.ads.zzdkw
                public final void zza(boolean z10, Context context, zzdbk zzdbkVar) {
                    zzceu zzceuVar2 = zzceu.this;
                    try {
                        t.k();
                        v.a(context, (AdOverlayInfoParcel) zzceuVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzceuVar.zzc(new AdOverlayInfoParcel(jVar, null, zze.zza(), null, new zzcei(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzgen.zzh(zze.zzg());
        } catch (Throwable th2) {
            zzcec.zzh("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }
}
