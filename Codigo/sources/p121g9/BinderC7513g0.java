package p121g9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.InterfaceC4783a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzdiu;

/* renamed from: g9.g0 */
/* loaded from: classes.dex */
public final class BinderC7513g0 extends zzbws {

    /* renamed from: a */
    private final AdOverlayInfoParcel f17746a;

    /* renamed from: b */
    private final Activity f17747b;

    /* renamed from: c */
    private boolean f17748c = false;

    /* renamed from: d */
    private boolean f17749d = false;

    /* renamed from: e */
    private boolean f17750e = false;

    public BinderC7513g0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f17746a = adOverlayInfoParcel;
        this.f17747b = activity;
    }

    private final synchronized void zzb() {
        if (this.f17749d) {
            return;
        }
        InterfaceC7529w interfaceC7529w = this.f17746a.f9979c;
        if (interfaceC7529w != null) {
            interfaceC7529w.zzbD(4);
        }
        this.f17749d = true;
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
    public final void zzk(InterfaceC5312b interfaceC5312b) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(Bundle bundle) {
        InterfaceC7529w interfaceC7529w;
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zziL)).booleanValue() && !this.f17750e) {
            this.f17747b.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f17746a;
        if (adOverlayInfoParcel != null && !z10) {
            if (bundle == null) {
                InterfaceC4783a interfaceC4783a = adOverlayInfoParcel.f9978b;
                if (interfaceC4783a != null) {
                    interfaceC4783a.onAdClicked();
                }
                zzdiu zzdiuVar = this.f17746a.f9974F;
                if (zzdiuVar != null) {
                    zzdiuVar.zzs();
                }
                if (this.f17747b.getIntent() != null && this.f17747b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (interfaceC7529w = this.f17746a.f9979c) != null) {
                    interfaceC7529w.zzbA();
                }
            }
            Activity activity = this.f17747b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f17746a;
            C4965t.m12573j();
            C7516j c7516j = adOverlayInfoParcel2.f9977a;
            if (C7500a.m22840b(activity, c7516j, adOverlayInfoParcel2.f9985t, c7516j.f17759t)) {
                return;
            }
        }
        this.f17747b.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm() {
        if (this.f17747b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo() {
        InterfaceC7529w interfaceC7529w = this.f17746a.f9979c;
        if (interfaceC7529w != null) {
            interfaceC7529w.zzbt();
        }
        if (this.f17747b.isFinishing()) {
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
        if (this.f17748c) {
            this.f17747b.finish();
            return;
        }
        this.f17748c = true;
        InterfaceC7529w interfaceC7529w = this.f17746a.f9979c;
        if (interfaceC7529w != null) {
            interfaceC7529w.zzbP();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f17748c);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu() {
        if (this.f17747b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzv() {
        InterfaceC7529w interfaceC7529w = this.f17746a.f9979c;
        if (interfaceC7529w != null) {
            interfaceC7529w.zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzx() {
        this.f17750e = true;
    }
}
