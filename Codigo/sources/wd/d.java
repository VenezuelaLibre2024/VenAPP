package wd;

import android.app.Application;
import android.util.DisplayMetrics;
import java.util.Map;
import ud.h;
import ud.l;
import xd.g;
import xd.i;
import xd.j;
import xd.k;
import xd.m;
import xd.n;
import xd.o;
import xd.p;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private xd.a f29917a;

        /* renamed from: b, reason: collision with root package name */
        private g f29918b;

        private b() {
        }

        public b a(xd.a aVar) {
            this.f29917a = (xd.a) td.d.b(aVar);
            return this;
        }

        public f b() {
            td.d.a(this.f29917a, xd.a.class);
            if (this.f29918b == null) {
                this.f29918b = new g();
            }
            return new c(this.f29917a, this.f29918b);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final g f29919a;

        /* renamed from: b, reason: collision with root package name */
        private final c f29920b;

        /* renamed from: c, reason: collision with root package name */
        private bk.a<Application> f29921c;

        /* renamed from: d, reason: collision with root package name */
        private bk.a<ud.g> f29922d;

        /* renamed from: e, reason: collision with root package name */
        private bk.a<ud.a> f29923e;

        /* renamed from: f, reason: collision with root package name */
        private bk.a<DisplayMetrics> f29924f;

        /* renamed from: g, reason: collision with root package name */
        private bk.a<l> f29925g;

        /* renamed from: h, reason: collision with root package name */
        private bk.a<l> f29926h;

        /* renamed from: i, reason: collision with root package name */
        private bk.a<l> f29927i;

        /* renamed from: j, reason: collision with root package name */
        private bk.a<l> f29928j;

        /* renamed from: k, reason: collision with root package name */
        private bk.a<l> f29929k;

        /* renamed from: l, reason: collision with root package name */
        private bk.a<l> f29930l;

        /* renamed from: m, reason: collision with root package name */
        private bk.a<l> f29931m;

        /* renamed from: n, reason: collision with root package name */
        private bk.a<l> f29932n;

        private c(xd.a aVar, g gVar) {
            this.f29920b = this;
            this.f29919a = gVar;
            e(aVar, gVar);
        }

        private void e(xd.a aVar, g gVar) {
            this.f29921c = td.b.a(xd.b.a(aVar));
            this.f29922d = td.b.a(h.a());
            this.f29923e = td.b.a(ud.b.a(this.f29921c));
            xd.l a10 = xd.l.a(gVar, this.f29921c);
            this.f29924f = a10;
            this.f29925g = p.a(gVar, a10);
            this.f29926h = m.a(gVar, this.f29924f);
            this.f29927i = n.a(gVar, this.f29924f);
            this.f29928j = o.a(gVar, this.f29924f);
            this.f29929k = j.a(gVar, this.f29924f);
            this.f29930l = k.a(gVar, this.f29924f);
            this.f29931m = i.a(gVar, this.f29924f);
            this.f29932n = xd.h.a(gVar, this.f29924f);
        }

        @Override // wd.f
        public ud.g a() {
            return this.f29922d.get();
        }

        @Override // wd.f
        public Application b() {
            return this.f29921c.get();
        }

        @Override // wd.f
        public Map<String, bk.a<l>> c() {
            return td.c.b(8).c("IMAGE_ONLY_PORTRAIT", this.f29925g).c("IMAGE_ONLY_LANDSCAPE", this.f29926h).c("MODAL_LANDSCAPE", this.f29927i).c("MODAL_PORTRAIT", this.f29928j).c("CARD_LANDSCAPE", this.f29929k).c("CARD_PORTRAIT", this.f29930l).c("BANNER_PORTRAIT", this.f29931m).c("BANNER_LANDSCAPE", this.f29932n).a();
        }

        @Override // wd.f
        public ud.a d() {
            return this.f29923e.get();
        }
    }

    public static b a() {
        return new b();
    }
}
