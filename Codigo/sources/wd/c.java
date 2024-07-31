package wd;

import android.view.LayoutInflater;
import de.i;
import ud.l;
import vd.g;
import vd.h;
import xd.q;
import xd.r;
import xd.s;
import xd.t;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private q f29908a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public e a() {
            td.d.a(this.f29908a, q.class);
            return new C0485c(this.f29908a);
        }

        public b b(q qVar) {
            this.f29908a = (q) td.d.b(qVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wd.c$c */
    /* loaded from: classes.dex */
    public static final class C0485c implements e {

        /* renamed from: a */
        private final C0485c f29909a;

        /* renamed from: b */
        private bk.a<l> f29910b;

        /* renamed from: c */
        private bk.a<LayoutInflater> f29911c;

        /* renamed from: d */
        private bk.a<i> f29912d;

        /* renamed from: e */
        private bk.a<vd.f> f29913e;

        /* renamed from: f */
        private bk.a<h> f29914f;

        /* renamed from: g */
        private bk.a<vd.a> f29915g;

        /* renamed from: h */
        private bk.a<vd.d> f29916h;

        private C0485c(q qVar) {
            this.f29909a = this;
            e(qVar);
        }

        /* synthetic */ C0485c(q qVar, a aVar) {
            this(qVar);
        }

        private void e(q qVar) {
            this.f29910b = td.b.a(r.a(qVar));
            this.f29911c = td.b.a(t.a(qVar));
            s a10 = s.a(qVar);
            this.f29912d = a10;
            this.f29913e = td.b.a(g.a(this.f29910b, this.f29911c, a10));
            this.f29914f = td.b.a(vd.i.a(this.f29910b, this.f29911c, this.f29912d));
            this.f29915g = td.b.a(vd.b.a(this.f29910b, this.f29911c, this.f29912d));
            this.f29916h = td.b.a(vd.e.a(this.f29910b, this.f29911c, this.f29912d));
        }

        @Override // wd.e
        public vd.f a() {
            return this.f29913e.get();
        }

        @Override // wd.e
        public vd.d b() {
            return this.f29916h.get();
        }

        @Override // wd.e
        public vd.a c() {
            return this.f29915g.get();
        }

        @Override // wd.e
        public h d() {
            return this.f29914f.get();
        }
    }

    public static b a() {
        return new b();
    }
}
