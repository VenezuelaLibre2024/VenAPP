package h6;

import android.content.Context;
import h6.v;
import java.util.concurrent.Executor;
import o6.x;
import p6.m0;
import p6.n0;
import p6.u0;

/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: a */
    private bk.a<Executor> f16432a;

    /* renamed from: b */
    private bk.a<Context> f16433b;

    /* renamed from: c */
    private bk.a f16434c;

    /* renamed from: d */
    private bk.a f16435d;

    /* renamed from: e */
    private bk.a f16436e;

    /* renamed from: f */
    private bk.a<String> f16437f;

    /* renamed from: r */
    private bk.a<m0> f16438r;

    /* renamed from: s */
    private bk.a<o6.f> f16439s;

    /* renamed from: t */
    private bk.a<x> f16440t;

    /* renamed from: u */
    private bk.a<n6.c> f16441u;

    /* renamed from: v */
    private bk.a<o6.r> f16442v;

    /* renamed from: w */
    private bk.a<o6.v> f16443w;

    /* renamed from: x */
    private bk.a<u> f16444x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements v.a {

        /* renamed from: a */
        private Context f16445a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // h6.v.a
        /* renamed from: b */
        public b a(Context context) {
            this.f16445a = (Context) j6.d.b(context);
            return this;
        }

        @Override // h6.v.a
        public v build() {
            j6.d.a(this.f16445a, Context.class);
            return new e(this.f16445a);
        }
    }

    private e(Context context) {
        f(context);
    }

    /* synthetic */ e(Context context, a aVar) {
        this(context);
    }

    public static v.a e() {
        return new b();
    }

    private void f(Context context) {
        this.f16432a = j6.a.a(k.a());
        j6.b a10 = j6.c.a(context);
        this.f16433b = a10;
        i6.j a11 = i6.j.a(a10, r6.c.a(), r6.d.a());
        this.f16434c = a11;
        this.f16435d = j6.a.a(i6.l.a(this.f16433b, a11));
        this.f16436e = u0.a(this.f16433b, p6.g.a(), p6.i.a());
        this.f16437f = j6.a.a(p6.h.a(this.f16433b));
        this.f16438r = j6.a.a(n0.a(r6.c.a(), r6.d.a(), p6.j.a(), this.f16436e, this.f16437f));
        n6.g b10 = n6.g.b(r6.c.a());
        this.f16439s = b10;
        n6.i a12 = n6.i.a(this.f16433b, this.f16438r, b10, r6.d.a());
        this.f16440t = a12;
        bk.a<Executor> aVar = this.f16432a;
        bk.a aVar2 = this.f16435d;
        bk.a<m0> aVar3 = this.f16438r;
        this.f16441u = n6.d.a(aVar, aVar2, a12, aVar3, aVar3);
        bk.a<Context> aVar4 = this.f16433b;
        bk.a aVar5 = this.f16435d;
        bk.a<m0> aVar6 = this.f16438r;
        this.f16442v = o6.s.a(aVar4, aVar5, aVar6, this.f16440t, this.f16432a, aVar6, r6.c.a(), r6.d.a(), this.f16438r);
        bk.a<Executor> aVar7 = this.f16432a;
        bk.a<m0> aVar8 = this.f16438r;
        this.f16443w = o6.w.a(aVar7, aVar8, this.f16440t, aVar8);
        this.f16444x = j6.a.a(w.a(r6.c.a(), r6.d.a(), this.f16441u, this.f16442v, this.f16443w));
    }

    @Override // h6.v
    p6.d a() {
        return this.f16438r.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h6.v
    public u b() {
        return this.f16444x.get();
    }
}
