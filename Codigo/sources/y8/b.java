package y8;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import x8.b0;
import x8.c0;
import x8.i;
import x8.m;

/* loaded from: classes.dex */
public final class b extends m {
    public b(Context context) {
        super(context, 0);
        s.k(context, "Context cannot be null");
    }

    public void e(final a aVar) {
        s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: y8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f(aVar);
                    }
                });
                return;
            }
        }
        this.f30706a.p(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(a aVar) {
        try {
            this.f30706a.p(aVar.a());
        } catch (IllegalStateException e10) {
            zzbxw.zza(getContext()).zzg(e10, "AdManagerAdView.loadAd");
        }
    }

    public final boolean g(u0 u0Var) {
        return this.f30706a.B(u0Var);
    }

    public i[] getAdSizes() {
        return this.f30706a.a();
    }

    public e getAppEventListener() {
        return this.f30706a.k();
    }

    public b0 getVideoController() {
        return this.f30706a.i();
    }

    public c0 getVideoOptions() {
        return this.f30706a.j();
    }

    public void setAdSizes(i... iVarArr) {
        if (iVarArr == null || iVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f30706a.v(iVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f30706a.x(eVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f30706a.y(z10);
    }

    public void setVideoOptions(c0 c0Var) {
        this.f30706a.A(c0Var);
    }
}
