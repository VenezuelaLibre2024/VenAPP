package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a */
    private final zzbsr f8633a;

    /* renamed from: b */
    private final y4 f8634b;

    /* renamed from: c */
    private final AtomicBoolean f8635c;

    /* renamed from: d */
    private final x8.b0 f8636d;

    /* renamed from: e */
    final y f8637e;

    /* renamed from: f */
    private a f8638f;

    /* renamed from: g */
    private x8.e f8639g;

    /* renamed from: h */
    private x8.i[] f8640h;

    /* renamed from: i */
    private y8.e f8641i;

    /* renamed from: j */
    private u0 f8642j;

    /* renamed from: k */
    private x8.c0 f8643k;

    /* renamed from: l */
    private String f8644l;

    /* renamed from: m */
    private final ViewGroup f8645m;

    /* renamed from: n */
    private int f8646n;

    /* renamed from: o */
    private boolean f8647o;

    /* renamed from: p */
    private x8.t f8648p;

    public d3(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, y4.f8814a, null, i10);
    }

    d3(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, y4 y4Var, u0 u0Var, int i10) {
        z4 z4Var;
        this.f8633a = new zzbsr();
        this.f8636d = new x8.b0();
        this.f8637e = new b3(this);
        this.f8645m = viewGroup;
        this.f8634b = y4Var;
        this.f8642j = null;
        this.f8635c = new AtomicBoolean(false);
        this.f8646n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                h5 h5Var = new h5(context, attributeSet);
                this.f8640h = h5Var.b(z10);
                this.f8644l = h5Var.a();
                if (viewGroup.isInEditMode()) {
                    zzcdv b10 = x.b();
                    x8.i iVar = this.f8640h[0];
                    int i11 = this.f8646n;
                    if (iVar.equals(x8.i.f30686q)) {
                        z4Var = z4.y1();
                    } else {
                        z4 z4Var2 = new z4(context, iVar);
                        z4Var2.f8840u = c(i11);
                        z4Var = z4Var2;
                    }
                    b10.zzm(viewGroup, z4Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                x.b().zzl(viewGroup, new z4(context, x8.i.f30678i), e10.getMessage(), e10.getMessage());
            }
        }
    }

    private static z4 b(Context context, x8.i[] iVarArr, int i10) {
        for (x8.i iVar : iVarArr) {
            if (iVar.equals(x8.i.f30686q)) {
                return z4.y1();
            }
        }
        z4 z4Var = new z4(context, iVarArr);
        z4Var.f8840u = c(i10);
        return z4Var;
    }

    private static boolean c(int i10) {
        return i10 == 1;
    }

    public final void A(x8.c0 c0Var) {
        this.f8643k = c0Var;
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzU(c0Var == null ? null : new n4(c0Var));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean B(u0 u0Var) {
        try {
            com.google.android.gms.dynamic.b zzn = u0Var.zzn();
            if (zzn == null || ((View) com.google.android.gms.dynamic.d.g2(zzn)).getParent() != null) {
                return false;
            }
            this.f8645m.addView((View) com.google.android.gms.dynamic.d.g2(zzn));
            this.f8642j = u0Var;
            return true;
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final x8.i[] a() {
        return this.f8640h;
    }

    public final x8.e d() {
        return this.f8639g;
    }

    public final x8.i e() {
        z4 zzg;
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null && (zzg = u0Var.zzg()) != null) {
                return x8.e0.c(zzg.f8835e, zzg.f8832b, zzg.f8831a);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        x8.i[] iVarArr = this.f8640h;
        if (iVarArr != null) {
            return iVarArr[0];
        }
        return null;
    }

    public final x8.t f() {
        return this.f8648p;
    }

    public final x8.z g() {
        p2 p2Var = null;
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                p2Var = u0Var.zzk();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return x8.z.f(p2Var);
    }

    public final x8.b0 i() {
        return this.f8636d;
    }

    public final x8.c0 j() {
        return this.f8643k;
    }

    public final y8.e k() {
        return this.f8641i;
    }

    public final s2 l() {
        u0 u0Var = this.f8642j;
        if (u0Var != null) {
            try {
                return u0Var.zzl();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String m() {
        u0 u0Var;
        if (this.f8644l == null && (u0Var = this.f8642j) != null) {
            try {
                this.f8644l = u0Var.zzr();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.f8644l;
    }

    public final void n() {
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzx();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final /* synthetic */ void o(com.google.android.gms.dynamic.b bVar) {
        this.f8645m.addView((View) com.google.android.gms.dynamic.d.g2(bVar));
    }

    public final void p(z2 z2Var) {
        try {
            if (this.f8642j == null) {
                if (this.f8640h == null || this.f8644l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f8645m.getContext();
                z4 b10 = b(context, this.f8640h, this.f8646n);
                u0 u0Var = (u0) ("search_v2".equals(b10.f8831a) ? new m(x.a(), context, b10, this.f8644l).d(context, false) : new k(x.a(), context, b10, this.f8644l, this.f8633a).d(context, false));
                this.f8642j = u0Var;
                u0Var.zzD(new p4(this.f8637e));
                a aVar = this.f8638f;
                if (aVar != null) {
                    this.f8642j.zzC(new z(aVar));
                }
                y8.e eVar = this.f8641i;
                if (eVar != null) {
                    this.f8642j.zzG(new zzaze(eVar));
                }
                if (this.f8643k != null) {
                    this.f8642j.zzU(new n4(this.f8643k));
                }
                this.f8642j.zzP(new h4(this.f8648p));
                this.f8642j.zzN(this.f8647o);
                u0 u0Var2 = this.f8642j;
                if (u0Var2 != null) {
                    try {
                        com.google.android.gms.dynamic.b zzn = u0Var2.zzn();
                        if (zzn != null) {
                            if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
                                if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                                    zzcdv.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.a3

                                        /* renamed from: b */
                                        public final /* synthetic */ com.google.android.gms.dynamic.b f8614b;

                                        public /* synthetic */ a3(com.google.android.gms.dynamic.b zzn2) {
                                            r2 = zzn2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            d3.this.o(r2);
                                        }
                                    });
                                }
                            }
                            this.f8645m.addView((View) com.google.android.gms.dynamic.d.g2(zzn2));
                        }
                    } catch (RemoteException e10) {
                        zzcec.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
            u0 u0Var3 = this.f8642j;
            u0Var3.getClass();
            u0Var3.zzaa(this.f8634b.a(this.f8645m.getContext(), z2Var));
        } catch (RemoteException e11) {
            zzcec.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void q() {
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzz();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void r() {
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzB();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void s(a aVar) {
        try {
            this.f8638f = aVar;
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzC(aVar != null ? new z(aVar) : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void t(x8.e eVar) {
        this.f8639g = eVar;
        this.f8637e.d(eVar);
    }

    public final void u(x8.i... iVarArr) {
        if (this.f8640h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        v(iVarArr);
    }

    public final void v(x8.i... iVarArr) {
        this.f8640h = iVarArr;
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzF(b(this.f8645m.getContext(), this.f8640h, this.f8646n));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        this.f8645m.requestLayout();
    }

    public final void w(String str) {
        if (this.f8644l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f8644l = str;
    }

    public final void x(y8.e eVar) {
        try {
            this.f8641i = eVar;
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzG(eVar != null ? new zzaze(eVar) : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void y(boolean z10) {
        this.f8647o = z10;
        try {
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void z(x8.t tVar) {
        try {
            this.f8648p = tVar;
            u0 u0Var = this.f8642j;
            if (u0Var != null) {
                u0Var.zzP(new h4(tVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
