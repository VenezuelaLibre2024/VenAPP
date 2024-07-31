package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import g9.v;
import g9.w;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdzl implements w, zzckw {
    private final Context zza;
    private final zzcei zzb;
    private zzdzd zzc;
    private zzcjk zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private c2 zzh;
    private boolean zzi;

    public zzdzl(Context context, zzcei zzceiVar) {
        this.zza = context;
        this.zzb = zzceiVar;
    }

    private final synchronized boolean zzl(c2 c2Var) {
        if (!((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue()) {
            zzcec.zzj("Ad inspector had an internal error.");
            try {
                c2Var.zze(zzfij.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            zzcec.zzj("Ad inspector had an internal error.");
            try {
                t.q().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                c2Var.zze(zzfij.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (t.b().a() >= this.zzg + ((Integer) a0.c().zza(zzbgc.zziQ)).intValue()) {
                return true;
            }
        }
        zzcec.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            c2Var.zze(zzfij.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzckw
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            u1.a("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzcec.zzj("Ad inspector failed to load.");
        try {
            t.q().zzw(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            c2 c2Var = this.zzh;
            if (c2Var != null) {
                c2Var.zze(zzfij.zzd(17, null, null));
            }
        } catch (RemoteException e10) {
            t.q().zzw(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // g9.w
    public final synchronized void zzbA() {
        this.zzf = true;
        zzk("");
    }

    @Override // g9.w
    public final void zzbC() {
    }

    @Override // g9.w
    public final synchronized void zzbD(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            u1.a("Inspector closed.");
            c2 c2Var = this.zzh;
            if (c2Var != null) {
                try {
                    c2Var.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
    }

    public final Activity zzg() {
        zzcjk zzcjkVar = this.zzd;
        if (zzcjkVar == null || zzcjkVar.zzaB()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdzd zzdzdVar) {
        this.zzc = zzdzdVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(c2 c2Var, zzbnz zzbnzVar, zzbns zzbnsVar) {
        if (zzl(c2Var)) {
            try {
                t.B();
                zzcjk zza = zzcjx.zza(this.zza, zzcla.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbbp.zza(), null, null, null, null);
                this.zzd = zza;
                zzcky zzN = zza.zzN();
                if (zzN == null) {
                    zzcec.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        t.q().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        c2Var.zze(zzfij.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e10) {
                        t.q().zzw(e10, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = c2Var;
                zzN.zzN(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbnzVar, null, new zzbny(this.zza), zzbnsVar, null);
                zzN.zzB(this);
                this.zzd.loadUrl((String) a0.c().zza(zzbgc.zziO));
                t.k();
                v.a(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = t.b().a();
            } catch (zzcjw e11) {
                zzcec.zzk("Failed to obtain a web view for the ad inspector", e11);
                try {
                    t.q().zzw(e11, "InspectorUi.openInspector 0");
                    c2Var.zze(zzfij.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e12) {
                    t.q().zzw(e12, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(String str) {
        if (this.zze && this.zzf) {
            zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzk
                public final /* synthetic */ String zzb;

                public /* synthetic */ zzdzk(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdzl.this.zzi(r2);
                }
            });
        }
    }
}
