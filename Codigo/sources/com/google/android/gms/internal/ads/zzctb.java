package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.u1;
import g9.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzctb implements zzayq, zzdbs, w, zzdbr {
    private final zzcsw zza;
    private final zzcsx zzb;
    private final zzbsj zzd;
    private final Executor zze;
    private final la.f zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcta zzh = new zzcta();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzctb(zzbsg zzbsgVar, zzcsx zzcsxVar, Executor executor, zzcsw zzcswVar, la.f fVar) {
        this.zza = zzcswVar;
        zzbrr zzbrrVar = zzbru.zza;
        this.zzd = zzbsgVar.zza("google.afma.activeView.handleUpdate", zzbrrVar, zzbrrVar);
        this.zzb = zzcsxVar;
        this.zze = executor;
        this.zzf = fVar;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcjk) it.next());
        }
        this.zza.zze();
    }

    @Override // g9.w
    public final void zzbA() {
    }

    @Override // g9.w
    public final void zzbC() {
    }

    @Override // g9.w
    public final void zzbD(int i10) {
    }

    @Override // g9.w
    public final synchronized void zzbP() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final synchronized void zzbs(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // g9.w
    public final synchronized void zzbt() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final synchronized void zzbu(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final synchronized void zzbv(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final synchronized void zzby(zzayp zzaypVar) {
        zzcta zzctaVar = this.zzh;
        zzctaVar.zza = zzaypVar.zzj;
        zzctaVar.zzf = zzaypVar;
        zzg();
    }

    @Override // g9.w
    public final void zzbz() {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            this.zzh.zzd = this.zzf.b();
            JSONObject zzb = this.zzb.zzb(this.zzh);
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsz
                    public final /* synthetic */ JSONObject zzb;

                    public /* synthetic */ zzcsz(JSONObject zzb2) {
                        r2 = zzb2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjk.this.zzl("AFMA_updateActiveView", r2);
                    }
                });
            }
            zzces.zzb(this.zzd.zzb(zzb2), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e10) {
            u1.b("Failed to call ActiveViewJS", e10);
        }
    }

    public final synchronized void zzh(zzcjk zzcjkVar) {
        this.zzc.add(zzcjkVar);
        this.zza.zzd(zzcjkVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final synchronized void zzq() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
