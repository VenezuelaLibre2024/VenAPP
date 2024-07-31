package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j<TranscodeType> extends y3.a<j<TranscodeType>> {
    protected static final y3.i Z = new y3.i().e(j3.j.f19622c).P(g.LOW).X(true);
    private final Context L;
    private final k M;
    private final Class<TranscodeType> N;
    private final b O;
    private final d P;
    private l<?, ? super TranscodeType> Q;
    private Object R;
    private List<y3.h<TranscodeType>> S;
    private j<TranscodeType> T;
    private j<TranscodeType> U;
    private Float V;
    private boolean W = true;
    private boolean X;
    private boolean Y;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7414a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7415b;

        static {
            int[] iArr = new int[g.values().length];
            f7415b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7415b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7415b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7415b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f7414a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7414a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7414a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7414a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7414a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7414a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7414a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7414a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.O = bVar;
        this.M = kVar;
        this.N = cls;
        this.L = context;
        this.Q = kVar.p(cls);
        this.P = bVar.j();
        n0(kVar.n());
        a(kVar.o());
    }

    private j<TranscodeType> h0(j<TranscodeType> jVar) {
        return jVar.Y(this.L.getTheme()).V(b4.a.c(this.L));
    }

    private y3.e i0(z3.d<TranscodeType> dVar, y3.h<TranscodeType> hVar, y3.a<?> aVar, Executor executor) {
        return j0(new Object(), dVar, hVar, null, this.Q, aVar.v(), aVar.s(), aVar.r(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y3.e j0(Object obj, z3.d<TranscodeType> dVar, y3.h<TranscodeType> hVar, y3.f fVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, y3.a<?> aVar, Executor executor) {
        y3.f fVar2;
        y3.f fVar3;
        if (this.U != null) {
            fVar3 = new y3.b(obj, fVar);
            fVar2 = fVar3;
        } else {
            fVar2 = null;
            fVar3 = fVar;
        }
        y3.e k02 = k0(obj, dVar, hVar, fVar3, lVar, gVar, i10, i11, aVar, executor);
        if (fVar2 == null) {
            return k02;
        }
        int s10 = this.U.s();
        int r10 = this.U.r();
        if (c4.l.t(i10, i11) && !this.U.L()) {
            s10 = aVar.s();
            r10 = aVar.r();
        }
        j<TranscodeType> jVar = this.U;
        y3.b bVar = fVar2;
        bVar.o(k02, jVar.j0(obj, dVar, hVar, bVar, jVar.Q, jVar.v(), s10, r10, this.U, executor));
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [y3.a] */
    private y3.e k0(Object obj, z3.d<TranscodeType> dVar, y3.h<TranscodeType> hVar, y3.f fVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, y3.a<?> aVar, Executor executor) {
        j<TranscodeType> jVar = this.T;
        if (jVar == null) {
            if (this.V == null) {
                return x0(obj, dVar, hVar, aVar, fVar, lVar, gVar, i10, i11, executor);
            }
            y3.l lVar2 = new y3.l(obj, fVar);
            lVar2.n(x0(obj, dVar, hVar, aVar, lVar2, lVar, gVar, i10, i11, executor), x0(obj, dVar, hVar, aVar.clone().W(this.V.floatValue()), lVar2, lVar, m0(gVar), i10, i11, executor));
            return lVar2;
        }
        if (this.Y) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar3 = jVar.W ? lVar : jVar.Q;
        g v10 = jVar.G() ? this.T.v() : m0(gVar);
        int s10 = this.T.s();
        int r10 = this.T.r();
        if (c4.l.t(i10, i11) && !this.T.L()) {
            s10 = aVar.s();
            r10 = aVar.r();
        }
        y3.l lVar4 = new y3.l(obj, fVar);
        y3.e x02 = x0(obj, dVar, hVar, aVar, lVar4, lVar, gVar, i10, i11, executor);
        this.Y = true;
        j<TranscodeType> jVar2 = this.T;
        y3.e j02 = jVar2.j0(obj, dVar, hVar, lVar4, lVar3, v10, s10, r10, jVar2, executor);
        this.Y = false;
        lVar4.n(x02, j02);
        return lVar4;
    }

    private g m0(g gVar) {
        int i10 = a.f7415b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + v());
    }

    private void n0(List<y3.h<Object>> list) {
        Iterator<y3.h<Object>> it = list.iterator();
        while (it.hasNext()) {
            f0((y3.h) it.next());
        }
    }

    private <Y extends z3.d<TranscodeType>> Y q0(Y y10, y3.h<TranscodeType> hVar, y3.a<?> aVar, Executor executor) {
        c4.k.d(y10);
        if (!this.X) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        y3.e i02 = i0(y10, hVar, aVar, executor);
        y3.e f10 = y10.f();
        if (i02.h(f10) && !r0(aVar, f10)) {
            if (!((y3.e) c4.k.d(f10)).isRunning()) {
                f10.j();
            }
            return y10;
        }
        this.M.m(y10);
        y10.h(i02);
        this.M.w(y10, i02);
        return y10;
    }

    private boolean r0(y3.a<?> aVar, y3.e eVar) {
        return !aVar.F() && eVar.g();
    }

    private j<TranscodeType> v0(Object obj) {
        if (E()) {
            return c().v0(obj);
        }
        this.R = obj;
        this.X = true;
        return T();
    }

    private j<TranscodeType> w0(Uri uri, j<TranscodeType> jVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? jVar : h0(jVar);
    }

    private y3.e x0(Object obj, z3.d<TranscodeType> dVar, y3.h<TranscodeType> hVar, y3.a<?> aVar, y3.f fVar, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.L;
        d dVar2 = this.P;
        return y3.k.y(context, dVar2, obj, this.R, this.N, aVar, i10, i11, gVar, dVar, hVar, this.S, fVar, dVar2.e(), lVar.b(), executor);
    }

    @Override // y3.a
    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return super.equals(jVar) && Objects.equals(this.N, jVar.N) && this.Q.equals(jVar.Q) && Objects.equals(this.R, jVar.R) && Objects.equals(this.S, jVar.S) && Objects.equals(this.T, jVar.T) && Objects.equals(this.U, jVar.U) && Objects.equals(this.V, jVar.V) && this.W == jVar.W && this.X == jVar.X;
    }

    public j<TranscodeType> f0(y3.h<TranscodeType> hVar) {
        if (E()) {
            return c().f0(hVar);
        }
        if (hVar != null) {
            if (this.S == null) {
                this.S = new ArrayList();
            }
            this.S.add(hVar);
        }
        return T();
    }

    @Override // y3.a
    /* renamed from: g0 */
    public j<TranscodeType> a(y3.a<?> aVar) {
        c4.k.d(aVar);
        return (j) super.a(aVar);
    }

    @Override // y3.a
    public int hashCode() {
        return c4.l.p(this.X, c4.l.p(this.W, c4.l.o(this.V, c4.l.o(this.U, c4.l.o(this.T, c4.l.o(this.S, c4.l.o(this.R, c4.l.o(this.Q, c4.l.o(this.N, super.hashCode())))))))));
    }

    @Override // y3.a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.Q = (l<?, ? super TranscodeType>) jVar.Q.clone();
        if (jVar.S != null) {
            jVar.S = new ArrayList(jVar.S);
        }
        j<TranscodeType> jVar2 = jVar.T;
        if (jVar2 != null) {
            jVar.T = jVar2.c();
        }
        j<TranscodeType> jVar3 = jVar.U;
        if (jVar3 != null) {
            jVar.U = jVar3.c();
        }
        return jVar;
    }

    public <Y extends z3.d<TranscodeType>> Y o0(Y y10) {
        return (Y) p0(y10, null, c4.e.b());
    }

    <Y extends z3.d<TranscodeType>> Y p0(Y y10, y3.h<TranscodeType> hVar, Executor executor) {
        return (Y) q0(y10, hVar, this, executor);
    }

    public j<TranscodeType> s0(Uri uri) {
        return w0(uri, v0(uri));
    }

    public j<TranscodeType> t0(Object obj) {
        return v0(obj);
    }

    public j<TranscodeType> u0(String str) {
        return v0(str);
    }

    public y3.d<TranscodeType> y0(int i10, int i11) {
        y3.g gVar = new y3.g(i10, i11);
        return (y3.d) p0(gVar, gVar, c4.e.a());
    }
}
