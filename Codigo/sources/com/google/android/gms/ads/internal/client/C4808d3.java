package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzaze;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;
import java.util.concurrent.atomic.AtomicBoolean;
import p438x8.AbstractC12359e;
import p438x8.C12354b0;
import p438x8.C12356c0;
import p438x8.C12360e0;
import p438x8.C12367i;
import p438x8.C12388z;
import p438x8.InterfaceC12382t;
import p461y8.InterfaceC12649e;

/* renamed from: com.google.android.gms.ads.internal.client.d3 */
/* loaded from: classes.dex */
public final class C4808d3 {

    /* renamed from: a */
    private final zzbsr f9710a;

    /* renamed from: b */
    private final C4941y4 f9711b;

    /* renamed from: c */
    private final AtomicBoolean f9712c;

    /* renamed from: d */
    private final C12354b0 f9713d;

    /* renamed from: e */
    final C4936y f9714e;

    /* renamed from: f */
    private InterfaceC4783a f9715f;

    /* renamed from: g */
    private AbstractC12359e f9716g;

    /* renamed from: h */
    private C12367i[] f9717h;

    /* renamed from: i */
    private InterfaceC12649e f9718i;

    /* renamed from: j */
    private InterfaceC4913u0 f9719j;

    /* renamed from: k */
    private C12356c0 f9720k;

    /* renamed from: l */
    private String f9721l;

    /* renamed from: m */
    private final ViewGroup f9722m;

    /* renamed from: n */
    private int f9723n;

    /* renamed from: o */
    private boolean f9724o;

    /* renamed from: p */
    private InterfaceC12382t f9725p;

    public C4808d3(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, C4941y4.f9901a, null, i10);
    }

    C4808d3(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, C4941y4 c4941y4, InterfaceC4913u0 interfaceC4913u0, int i10) {
        C4947z4 c4947z4;
        this.f9710a = new zzbsr();
        this.f9713d = new C12354b0();
        this.f9714e = new C4794b3(this);
        this.f9722m = viewGroup;
        this.f9711b = c4941y4;
        this.f9719j = null;
        this.f9712c = new AtomicBoolean(false);
        this.f9723n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C4838h5 c4838h5 = new C4838h5(context, attributeSet);
                this.f9717h = c4838h5.m12406b(z10);
                this.f9721l = c4838h5.m12405a();
                if (viewGroup.isInEditMode()) {
                    zzcdv m12474b = C4930x.m12474b();
                    C12367i c12367i = this.f9717h[0];
                    int i11 = this.f9723n;
                    if (c12367i.equals(C12367i.f33206q)) {
                        c4947z4 = C4947z4.m12530y1();
                    } else {
                        C4947z4 c4947z42 = new C4947z4(context, c12367i);
                        c4947z42.f9927u = m12373c(i11);
                        c4947z4 = c4947z42;
                    }
                    m12474b.zzm(viewGroup, c4947z4, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                C4930x.m12474b().zzl(viewGroup, new C4947z4(context, C12367i.f33198i), e10.getMessage(), e10.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static C4947z4 m12372b(Context context, C12367i[] c12367iArr, int i10) {
        for (C12367i c12367i : c12367iArr) {
            if (c12367i.equals(C12367i.f33206q)) {
                return C4947z4.m12530y1();
            }
        }
        C4947z4 c4947z4 = new C4947z4(context, c12367iArr);
        c4947z4.f9927u = m12373c(i10);
        return c4947z4;
    }

    /* renamed from: c */
    private static boolean m12373c(int i10) {
        return i10 == 1;
    }

    /* renamed from: A */
    public final void m12375A(C12356c0 c12356c0) {
        this.f9720k = c12356c0;
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzU(c12356c0 == null ? null : new C4875n4(c12356c0));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: B */
    public final boolean m12376B(InterfaceC4913u0 interfaceC4913u0) {
        try {
            InterfaceC5312b zzn = interfaceC4913u0.zzn();
            if (zzn == null || ((View) BinderC5314d.m13411g2(zzn)).getParent() != null) {
                return false;
            }
            this.f9722m.addView((View) BinderC5314d.m13411g2(zzn));
            this.f9719j = interfaceC4913u0;
            return true;
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    /* renamed from: a */
    public final C12367i[] m12377a() {
        return this.f9717h;
    }

    /* renamed from: d */
    public final AbstractC12359e m12378d() {
        return this.f9716g;
    }

    /* renamed from: e */
    public final C12367i m12379e() {
        C4947z4 zzg;
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null && (zzg = interfaceC4913u0.zzg()) != null) {
                return C12360e0.m39973c(zzg.f9922e, zzg.f9919b, zzg.f9918a);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        C12367i[] c12367iArr = this.f9717h;
        if (c12367iArr != null) {
            return c12367iArr[0];
        }
        return null;
    }

    /* renamed from: f */
    public final InterfaceC12382t m12380f() {
        return this.f9725p;
    }

    /* renamed from: g */
    public final C12388z m12381g() {
        InterfaceC4885p2 interfaceC4885p2 = null;
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4885p2 = interfaceC4913u0.zzk();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return C12388z.m40046f(interfaceC4885p2);
    }

    /* renamed from: i */
    public final C12354b0 m12382i() {
        return this.f9713d;
    }

    /* renamed from: j */
    public final C12356c0 m12383j() {
        return this.f9720k;
    }

    /* renamed from: k */
    public final InterfaceC12649e m12384k() {
        return this.f9718i;
    }

    /* renamed from: l */
    public final InterfaceC4903s2 m12385l() {
        InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
        if (interfaceC4913u0 != null) {
            try {
                return interfaceC4913u0.zzl();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String m12386m() {
        InterfaceC4913u0 interfaceC4913u0;
        if (this.f9721l == null && (interfaceC4913u0 = this.f9719j) != null) {
            try {
                this.f9721l = interfaceC4913u0.zzr();
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.f9721l;
    }

    /* renamed from: n */
    public final void m12387n() {
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzx();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m12388o(InterfaceC5312b interfaceC5312b) {
        this.f9722m.addView((View) BinderC5314d.m13411g2(interfaceC5312b));
    }

    /* renamed from: p */
    public final void m12389p(C4945z2 c4945z2) {
        try {
            if (this.f9719j == null) {
                if (this.f9717h == null || this.f9721l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f9722m.getContext();
                C4947z4 m12372b = m12372b(context, this.f9717h, this.f9723n);
                InterfaceC4913u0 interfaceC4913u0 = (InterfaceC4913u0) ("search_v2".equals(m12372b.f9918a) ? new C4864m(C4930x.m12473a(), context, m12372b, this.f9721l).m12471d(context, false) : new C4852k(C4930x.m12473a(), context, m12372b, this.f9721l, this.f9710a).m12471d(context, false));
                this.f9719j = interfaceC4913u0;
                interfaceC4913u0.zzD(new BinderC4887p4(this.f9714e));
                InterfaceC4783a interfaceC4783a = this.f9715f;
                if (interfaceC4783a != null) {
                    this.f9719j.zzC(new BinderC4942z(interfaceC4783a));
                }
                InterfaceC12649e interfaceC12649e = this.f9718i;
                if (interfaceC12649e != null) {
                    this.f9719j.zzG(new zzaze(interfaceC12649e));
                }
                if (this.f9720k != null) {
                    this.f9719j.zzU(new C4875n4(this.f9720k));
                }
                this.f9719j.zzP(new BinderC4837h4(this.f9725p));
                this.f9719j.zzN(this.f9724o);
                InterfaceC4913u0 interfaceC4913u02 = this.f9719j;
                if (interfaceC4913u02 != null) {
                    try {
                        final InterfaceC5312b zzn = interfaceC4913u02.zzn();
                        if (zzn != null) {
                            if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                                    zzcdv.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.a3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C4808d3.this.m12388o(zzn);
                                        }
                                    });
                                }
                            }
                            this.f9722m.addView((View) BinderC5314d.m13411g2(zzn));
                        }
                    } catch (RemoteException e10) {
                        zzcec.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
            InterfaceC4913u0 interfaceC4913u03 = this.f9719j;
            interfaceC4913u03.getClass();
            interfaceC4913u03.zzaa(this.f9711b.m12509a(this.f9722m.getContext(), c4945z2));
        } catch (RemoteException e11) {
            zzcec.zzl("#007 Could not call remote method.", e11);
        }
    }

    /* renamed from: q */
    public final void m12390q() {
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzz();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: r */
    public final void m12391r() {
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzB();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: s */
    public final void m12392s(InterfaceC4783a interfaceC4783a) {
        try {
            this.f9715f = interfaceC4783a;
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzC(interfaceC4783a != null ? new BinderC4942z(interfaceC4783a) : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: t */
    public final void m12393t(AbstractC12359e abstractC12359e) {
        this.f9716g = abstractC12359e;
        this.f9714e.m12481d(abstractC12359e);
    }

    /* renamed from: u */
    public final void m12394u(C12367i... c12367iArr) {
        if (this.f9717h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m12395v(c12367iArr);
    }

    /* renamed from: v */
    public final void m12395v(C12367i... c12367iArr) {
        this.f9717h = c12367iArr;
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzF(m12372b(this.f9722m.getContext(), this.f9717h, this.f9723n));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        this.f9722m.requestLayout();
    }

    /* renamed from: w */
    public final void m12396w(String str) {
        if (this.f9721l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f9721l = str;
    }

    /* renamed from: x */
    public final void m12397x(InterfaceC12649e interfaceC12649e) {
        try {
            this.f9718i = interfaceC12649e;
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzG(interfaceC12649e != null ? new zzaze(interfaceC12649e) : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: y */
    public final void m12398y(boolean z10) {
        this.f9724o = z10;
        try {
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* renamed from: z */
    public final void m12399z(InterfaceC12382t interfaceC12382t) {
        try {
            this.f9725p = interfaceC12382t;
            InterfaceC4913u0 interfaceC4913u0 = this.f9719j;
            if (interfaceC4913u0 != null) {
                interfaceC4913u0.zzP(new BinderC4837h4(interfaceC12382t));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
