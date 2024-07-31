package wd;

import android.app.Application;
import com.bumptech.glide.k;
import java.util.Map;
import qd.q;
import ud.g;
import ud.j;
import ud.l;
import ud.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: wd.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0483b implements wd.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0483b f29890a;

        /* renamed from: b, reason: collision with root package name */
        private bk.a<q> f29891b;

        /* renamed from: c, reason: collision with root package name */
        private bk.a<Map<String, bk.a<l>>> f29892c;

        /* renamed from: d, reason: collision with root package name */
        private bk.a<Application> f29893d;

        /* renamed from: e, reason: collision with root package name */
        private bk.a<j> f29894e;

        /* renamed from: f, reason: collision with root package name */
        private bk.a<k> f29895f;

        /* renamed from: g, reason: collision with root package name */
        private bk.a<ud.e> f29896g;

        /* renamed from: h, reason: collision with root package name */
        private bk.a<g> f29897h;

        /* renamed from: i, reason: collision with root package name */
        private bk.a<ud.a> f29898i;

        /* renamed from: j, reason: collision with root package name */
        private bk.a<ud.c> f29899j;

        /* renamed from: k, reason: collision with root package name */
        private bk.a<sd.b> f29900k;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$a */
        /* loaded from: classes.dex */
        public static final class a implements bk.a<g> {

            /* renamed from: a, reason: collision with root package name */
            private final f f29901a;

            a(f fVar) {
                this.f29901a = fVar;
            }

            @Override // bk.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g get() {
                return (g) td.d.c(this.f29901a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0484b implements bk.a<ud.a> {

            /* renamed from: a, reason: collision with root package name */
            private final f f29902a;

            C0484b(f fVar) {
                this.f29902a = fVar;
            }

            @Override // bk.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ud.a get() {
                return (ud.a) td.d.c(this.f29902a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$c */
        /* loaded from: classes.dex */
        public static final class c implements bk.a<Map<String, bk.a<l>>> {

            /* renamed from: a, reason: collision with root package name */
            private final f f29903a;

            c(f fVar) {
                this.f29903a = fVar;
            }

            @Override // bk.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, bk.a<l>> get() {
                return (Map) td.d.c(this.f29903a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$d */
        /* loaded from: classes.dex */
        public static final class d implements bk.a<Application> {

            /* renamed from: a, reason: collision with root package name */
            private final f f29904a;

            d(f fVar) {
                this.f29904a = fVar;
            }

            @Override // bk.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) td.d.c(this.f29904a.b());
            }
        }

        private C0483b(xd.e eVar, xd.c cVar, f fVar) {
            this.f29890a = this;
            b(eVar, cVar, fVar);
        }

        private void b(xd.e eVar, xd.c cVar, f fVar) {
            this.f29891b = td.b.a(xd.f.a(eVar));
            this.f29892c = new c(fVar);
            this.f29893d = new d(fVar);
            bk.a<j> a10 = td.b.a(ud.k.a());
            this.f29894e = a10;
            bk.a<k> a11 = td.b.a(xd.d.a(cVar, this.f29893d, a10));
            this.f29895f = a11;
            this.f29896g = td.b.a(ud.f.a(a11));
            this.f29897h = new a(fVar);
            this.f29898i = new C0484b(fVar);
            this.f29899j = td.b.a(ud.d.a());
            this.f29900k = td.b.a(sd.d.a(this.f29891b, this.f29892c, this.f29896g, o.a(), o.a(), this.f29897h, this.f29893d, this.f29898i, this.f29899j));
        }

        @Override // wd.a
        public sd.b a() {
            return this.f29900k.get();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private xd.e f29905a;

        /* renamed from: b, reason: collision with root package name */
        private xd.c f29906b;

        /* renamed from: c, reason: collision with root package name */
        private f f29907c;

        private c() {
        }

        public wd.a a() {
            td.d.a(this.f29905a, xd.e.class);
            if (this.f29906b == null) {
                this.f29906b = new xd.c();
            }
            td.d.a(this.f29907c, f.class);
            return new C0483b(this.f29905a, this.f29906b, this.f29907c);
        }

        public c b(xd.e eVar) {
            this.f29905a = (xd.e) td.d.b(eVar);
            return this;
        }

        public c c(f fVar) {
            this.f29907c = (f) td.d.b(fVar);
            return this;
        }
    }

    public static c a() {
        return new c();
    }
}
