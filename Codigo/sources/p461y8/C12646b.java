package p461y8;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.InterfaceC4913u0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import p438x8.AbstractC12375m;
import p438x8.C12354b0;
import p438x8.C12356c0;
import p438x8.C12367i;

/* renamed from: y8.b */
/* loaded from: classes.dex */
public final class C12646b extends AbstractC12375m {
    public C12646b(Context context) {
        super(context, 0);
        C5276s.m13325k(context, "Context cannot be null");
    }

    /* renamed from: e */
    public void m41634e(final C12645a c12645a) {
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: y8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12646b.this.m41635f(c12645a);
                    }
                });
                return;
            }
        }
        this.f33226a.m12389p(c12645a.m39990a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m41635f(C12645a c12645a) {
        try {
            this.f33226a.m12389p(c12645a.m39990a());
        } catch (IllegalStateException e10) {
            zzbxw.zza(getContext()).zzg(e10, "AdManagerAdView.loadAd");
        }
    }

    /* renamed from: g */
    public final boolean m41636g(InterfaceC4913u0 interfaceC4913u0) {
        return this.f33226a.m12376B(interfaceC4913u0);
    }

    public C12367i[] getAdSizes() {
        return this.f33226a.m12377a();
    }

    public InterfaceC12649e getAppEventListener() {
        return this.f33226a.m12384k();
    }

    public C12354b0 getVideoController() {
        return this.f33226a.m12382i();
    }

    public C12356c0 getVideoOptions() {
        return this.f33226a.m12383j();
    }

    public void setAdSizes(C12367i... c12367iArr) {
        if (c12367iArr == null || c12367iArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f33226a.m12395v(c12367iArr);
    }

    public void setAppEventListener(InterfaceC12649e interfaceC12649e) {
        this.f33226a.m12397x(interfaceC12649e);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f33226a.m12398y(z10);
    }

    public void setVideoOptions(C12356c0 c12356c0) {
        this.f33226a.m12375A(c12356c0);
    }
}
