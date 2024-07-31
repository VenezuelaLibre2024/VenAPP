package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import cb.c;
import cb.d;
import cb.e;

/* loaded from: classes2.dex */
public final class zzj implements c {
    private final zzap zza;
    private final zzu zzb;
    private final zzbn zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private d zzh = new d.a().a();

    public zzj(zzap zzapVar, zzu zzuVar, zzbn zzbnVar) {
        this.zza = zzapVar;
        this.zzb = zzuVar;
        this.zzc = zzbnVar;
    }

    @Override // cb.c
    public final boolean canRequestAds() {
        int zza = !zzc() ? 0 : this.zza.zza();
        return zza == 1 || zza == 3;
    }

    @Override // cb.c
    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // cb.c
    public final c.EnumC0119c getPrivacyOptionsRequirementStatus() {
        return !zzc() ? c.EnumC0119c.UNKNOWN : this.zza.zzb();
    }

    @Override // cb.c
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // cb.c
    public final void requestConsentInfoUpdate(Activity activity, d dVar, c.b bVar, c.a aVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = dVar;
        this.zzb.zzc(activity, dVar, bVar, aVar);
    }

    @Override // cb.c
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new c.b() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                public /* synthetic */ zzh() {
                }

                @Override // cb.c.b
                public final void onConsentInfoUpdateSuccess() {
                    zzj.this.zzb(false);
                }
            }, new c.a() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                public /* synthetic */ zzi() {
                }

                @Override // cb.c.a
                public final void onConsentInfoUpdateFailure(e eVar) {
                    zzj.this.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z10) {
        synchronized (this.zze) {
            this.zzg = z10;
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzd) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzg;
        }
        return z10;
    }
}
