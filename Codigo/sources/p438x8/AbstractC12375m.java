package p438x8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4808d3;
import com.google.android.gms.ads.internal.client.InterfaceC4783a;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import p461y8.InterfaceC12649e;

/* renamed from: x8.m */
/* loaded from: classes.dex */
public abstract class AbstractC12375m extends ViewGroup {

    /* renamed from: a */
    protected final C4808d3 f33226a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12375m(Context context, int i10) {
        super(context);
        this.f33226a = new C4808d3(this, i10);
    }

    /* renamed from: a */
    public void m40029a() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zze.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkD)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12375m abstractC12375m = AbstractC12375m.this;
                        try {
                            abstractC12375m.f33226a.m12387n();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(abstractC12375m.getContext()).zzg(e10, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f33226a.m12387n();
    }

    /* renamed from: b */
    public void m40030b(final C12365h c12365h) {
        C5276s.m13319e("#008 Must be called on the main UI thread.");
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12375m abstractC12375m = AbstractC12375m.this;
                        try {
                            abstractC12375m.f33226a.m12389p(c12365h.f33196a);
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(abstractC12375m.getContext()).zzg(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f33226a.m12389p(c12365h.f33196a);
    }

    /* renamed from: c */
    public void m40031c() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzg.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkE)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12375m abstractC12375m = AbstractC12375m.this;
                        try {
                            abstractC12375m.f33226a.m12390q();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(abstractC12375m.getContext()).zzg(e10, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f33226a.m12390q();
    }

    /* renamed from: d */
    public void m40032d() {
        zzbgc.zza(getContext());
        if (((Boolean) zzbhy.zzh.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkC)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12375m abstractC12375m = AbstractC12375m.this;
                        try {
                            abstractC12375m.f33226a.m12391r();
                        } catch (IllegalStateException e10) {
                            zzbxw.zza(abstractC12375m.getContext()).zzg(e10, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f33226a.m12391r();
    }

    public AbstractC12359e getAdListener() {
        return this.f33226a.m12378d();
    }

    public C12367i getAdSize() {
        return this.f33226a.m12379e();
    }

    public String getAdUnitId() {
        return this.f33226a.m12386m();
    }

    public InterfaceC12382t getOnPaidEventListener() {
        return this.f33226a.m12380f();
    }

    public C12388z getResponseInfo() {
        return this.f33226a.m12381g();
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
        C12367i c12367i;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                c12367i = getAdSize();
            } catch (NullPointerException e10) {
                zzcec.zzh("Unable to retrieve ad size.", e10);
                c12367i = null;
            }
            if (c12367i != null) {
                Context context = getContext();
                int m40003k = c12367i.m40003k(context);
                i12 = c12367i.m40001d(context);
                i13 = m40003k;
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
    public void setAdListener(AbstractC12359e abstractC12359e) {
        this.f33226a.m12393t(abstractC12359e);
        if (abstractC12359e == 0) {
            this.f33226a.m12392s(null);
            return;
        }
        if (abstractC12359e instanceof InterfaceC4783a) {
            this.f33226a.m12392s((InterfaceC4783a) abstractC12359e);
        }
        if (abstractC12359e instanceof InterfaceC12649e) {
            this.f33226a.m12397x((InterfaceC12649e) abstractC12359e);
        }
    }

    public void setAdSize(C12367i c12367i) {
        this.f33226a.m12394u(c12367i);
    }

    public void setAdUnitId(String str) {
        this.f33226a.m12396w(str);
    }

    public void setOnPaidEventListener(InterfaceC12382t interfaceC12382t) {
        this.f33226a.m12399z(interfaceC12382t);
    }
}
