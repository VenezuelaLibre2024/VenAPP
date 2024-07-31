package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import cb.b;
import cb.c;
import cb.f;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbn {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbn(zzdr zzdrVar, Executor executor) {
        this.zza = zzdrVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzbb zzbbVar) {
        AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzbbVar.zzb(new f.b() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            public final /* synthetic */ AtomicReference zza;

            public /* synthetic */ zzbe(AtomicReference atomicReference2) {
                r1 = atomicReference2;
            }

            @Override // cb.f.b
            public final void onConsentFormLoadSuccess(b bVar) {
                r1.set(bVar);
            }
        }, zzbf.zza);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.zzav] */
    public final void zzb(f.b bVar, f.a aVar) {
        zzcr.zza();
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            aVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        ?? zza = this.zza.zza();
        zza.zza(zzbpVar);
        zza.zzb().zza().zzb(bVar, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.zzav] */
    public final void zzc() {
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ?? zza = this.zza.zza();
        zza.zza(zzbpVar);
        zzbb zza2 = zza.zzb().zza();
        zza2.zza = true;
        zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            public final /* synthetic */ zzbb zzb;

            public /* synthetic */ zzbd(zzbb zza22) {
                r2 = zza22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbn.this.zza(r2);
            }
        });
    }

    public final void zzd(zzbp zzbpVar) {
        this.zzc.set(zzbpVar);
    }

    public final void zze(Activity activity, b.a aVar) {
        zzcr.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                public /* synthetic */ zzbg() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.onConsentFormDismissed(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != c.EnumC0119c.NOT_REQUIRED) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                public /* synthetic */ zzbh() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.onConsentFormDismissed(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == c.EnumC0119c.NOT_REQUIRED) {
                zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                    public /* synthetic */ zzbi() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.this.onConsentFormDismissed(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            b bVar = (b) this.zzd.get();
            if (bVar == null) {
                zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    public /* synthetic */ zzbj() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.this.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                bVar.show(activity, aVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    public /* synthetic */ zzbk() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbn.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
