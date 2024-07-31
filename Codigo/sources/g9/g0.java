package g9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzdiu;

/* loaded from: classes.dex */
public final class g0 extends zzbws {

    /* renamed from: a, reason: collision with root package name */
    private final AdOverlayInfoParcel f16117a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f16118b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16119c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16120d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16121e = false;

    public g0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f16117a = adOverlayInfoParcel;
        this.f16118b = activity;
    }

    private final synchronized void zzb() {
        if (this.f16120d) {
            return;
        }
        w wVar = this.f16117a.f8884c;
        if (wVar != null) {
            wVar.zzbD(4);
        }
        this.f16120d = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(Bundle bundle) {
        w wVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zziL)).booleanValue() && !this.f16121e) {
            this.f16118b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f16117a;
        if (adOverlayInfoParcel != null && !z10) {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.a aVar = adOverlayInfoParcel.f8883b;
                if (aVar != null) {
                    aVar.onAdClicked();
                }
                zzdiu zzdiuVar = this.f16117a.F;
                if (zzdiuVar != null) {
                    zzdiuVar.zzs();
                }
                if (this.f16118b.getIntent() != null && this.f16118b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (wVar = this.f16117a.f8884c) != null) {
                    wVar.zzbA();
                }
            }
            Activity activity = this.f16118b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f16117a;
            com.google.android.gms.ads.internal.t.j();
            j jVar = adOverlayInfoParcel2.f8882a;
            if (a.b(activity, jVar, adOverlayInfoParcel2.f8890t, jVar.f16130t)) {
                return;
            }
        }
        this.f16118b.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm() {
        if (this.f16118b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo() {
        w wVar = this.f16117a.f8884c;
        if (wVar != null) {
            wVar.zzbt();
        }
        if (this.f16118b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzr() {
        if (this.f16119c) {
            this.f16118b.finish();
            return;
        }
        this.f16119c = true;
        w wVar = this.f16117a.f8884c;
        if (wVar != null) {
            wVar.zzbP();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f16119c);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu() {
        if (this.f16118b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzv() {
        w wVar = this.f16117a.f8884c;
        if (wVar != null) {
            wVar.zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzx() {
        this.f16121e = true;
    }
}
