package x8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.d3;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public abstract class m extends ViewGroup {

    /* renamed from: a */
    protected final d3 f30706a;

    public m(Context context, int i10) {
        super(context);
        this.f30706a = new d3(this, i10);
    }

    public void a() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkD)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.g0
                    public /* synthetic */ g0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar = m.this;
                        try {
                            mVar.f30706a.n();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(mVar.getContext()).zzg(e10, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f30706a.n();
    }

    public void b(h hVar) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.i0

                    /* renamed from: b */
                    public final /* synthetic */ h f30698b;

                    public /* synthetic */ i0(h hVar2) {
                        r2 = hVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar = m.this;
                        try {
                            mVar.f30706a.p(r2.f30676a);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(mVar.getContext()).zzg(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f30706a.p(hVar2.f30676a);
    }

    public void c() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkE)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.h0
                    public /* synthetic */ h0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar = m.this;
                        try {
                            mVar.f30706a.q();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(mVar.getContext()).zzg(e10, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f30706a.q();
    }

    public void d() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkC)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.f0
                    public /* synthetic */ f0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar = m.this;
                        try {
                            mVar.f30706a.r();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(mVar.getContext()).zzg(e10, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f30706a.r();
    }

    public e getAdListener() {
        return this.f30706a.d();
    }

    public i getAdSize() {
        return this.f30706a.e();
    }

    public String getAdUnitId() {
        return this.f30706a.m();
    }

    public t getOnPaidEventListener() {
        return this.f30706a.f();
    }

    public z getResponseInfo() {
        return this.f30706a.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        i iVar;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                iVar = getAdSize();
            } catch (NullPointerException e10) {
                zzcec.zzh("Unable to retrieve ad size.", e10);
                iVar = null;
            }
            if (iVar != null) {
                Context context = getContext();
                int k10 = iVar.k(context);
                i12 = iVar.d(context);
                i13 = k10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(e eVar) {
        this.f30706a.t(eVar);
        if (eVar == 0) {
            this.f30706a.s(null);
            return;
        }
        if (eVar instanceof com.google.android.gms.ads.internal.client.a) {
            this.f30706a.s((com.google.android.gms.ads.internal.client.a) eVar);
        }
        if (eVar instanceof y8.e) {
            this.f30706a.x((y8.e) eVar);
        }
    }

    public void setAdSize(i iVar) {
        this.f30706a.u(iVar);
    }

    public void setAdUnitId(String str) {
        this.f30706a.w(str);
    }

    public void setOnPaidEventListener(t tVar) {
        this.f30706a.z(tVar);
    }
}
