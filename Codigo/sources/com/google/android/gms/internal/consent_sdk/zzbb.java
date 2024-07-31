package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import cb.b;
import cb.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbb implements b {
    private final Application zzb;
    private final zzab zzc;
    private final zzbw zzd;
    private final zzap zze;
    private final zzbp zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbu zzi;
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    boolean zza = false;

    public zzbb(Application application, zzab zzabVar, zzbw zzbwVar, zzap zzapVar, zzbp zzbpVar, zzdr zzdrVar) {
        this.zzb = application;
        this.zzc = zzabVar;
        this.zzd = zzbwVar;
        this.zze = zzapVar;
        this.zzf = zzbpVar;
        this.zzg = zzdrVar;
    }

    private final void zzg() {
        Dialog dialog = this.zzh;
        if (dialog != null) {
            dialog.dismiss();
            this.zzh = null;
        }
        this.zzd.zza(null);
        zzay zzayVar = (zzay) this.zzm.getAndSet(null);
        if (zzayVar != null) {
            zzayVar.zza.zzb.unregisterActivityLifecycleCallbacks(zzayVar);
        }
    }

    @Override // cb.b
    public final void show(Activity activity, b.a aVar) {
        zzcr.zza();
        if (!this.zzj.compareAndSet(false, true)) {
            aVar.onConsentFormDismissed(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzi.zzc();
        zzay zzayVar = new zzay(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzayVar);
        this.zzm.set(zzayVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzi);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.zzl.set(aVar);
        dialog.show();
        this.zzh = dialog;
        this.zzi.zzd("UMP_messagePresented", "");
    }

    public final zzbu zza() {
        return this.zzi;
    }

    public final void zzb(f.b bVar, f.a aVar) {
        zzbu zza = ((zzbv) this.zzg).zza();
        this.zzi = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new zzbt(zza, null));
        this.zzk.set(new zzba(bVar, aVar, null));
        zzbu zzbuVar = this.zzi;
        zzbp zzbpVar = this.zzf;
        zzbuVar.loadDataWithBaseURL(zzbpVar.zza(), zzbpVar.zzb(), "text/html", "UTF-8", null);
        zzcr.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzax
            public /* synthetic */ zzax() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbb.this.zzf(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzc(int i10) {
        zzg();
        b.a aVar = (b.a) this.zzl.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.zze.zzg(3);
        aVar.onConsentFormDismissed(null);
    }

    public final void zzd(zzg zzgVar) {
        zzg();
        b.a aVar = (b.a) this.zzl.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.onConsentFormDismissed(zzgVar.zza());
    }

    public final void zze() {
        zzba zzbaVar = (zzba) this.zzk.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzf(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzk.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
