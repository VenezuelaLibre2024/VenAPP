package zj;

import dj.r;
import java.util.concurrent.Callable;
import uj.j;
import uj.k;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    static final r f32826a = yj.a.h(new h());

    /* renamed from: b */
    static final r f32827b = yj.a.e(new b());

    /* renamed from: c */
    static final r f32828c = yj.a.f(new c());

    /* renamed from: d */
    static final r f32829d = k.d();

    /* renamed from: e */
    static final r f32830e = yj.a.g(new f());

    /* renamed from: zj.a$a */
    /* loaded from: classes3.dex */
    public static final class C0544a {

        /* renamed from: a */
        static final r f32831a = new uj.b();
    }

    /* loaded from: classes3.dex */
    static final class b implements Callable<r> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public r call() {
            return C0544a.f32831a;
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements Callable<r> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public r call() {
            return d.f32832a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        static final r f32832a = new uj.c();
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a */
        static final r f32833a = new uj.d();
    }

    /* loaded from: classes3.dex */
    static final class f implements Callable<r> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public r call() {
            return e.f32833a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        static final r f32834a = new j();
    }

    /* loaded from: classes3.dex */
    static final class h implements Callable<r> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public r call() {
            return g.f32834a;
        }
    }

    public static r a() {
        return yj.a.p(f32827b);
    }

    public static r b() {
        return yj.a.r(f32828c);
    }
}
