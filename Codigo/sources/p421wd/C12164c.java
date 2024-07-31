package p421wd;

import android.view.LayoutInflater;
import de.AbstractC6896i;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import p401vd.C11873a;
import p401vd.C11874b;
import p401vd.C11876d;
import p401vd.C11877e;
import p401vd.C11878f;
import p401vd.C11879g;
import p401vd.C11880h;
import p401vd.C11881i;
import p443xd.C12464q;
import p443xd.C12465r;
import p443xd.C12466s;
import p443xd.C12467t;
import td.C11244b;
import td.C11246d;

/* renamed from: wd.c */
/* loaded from: classes.dex */
public final class C12164c {

    /* renamed from: wd.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C12464q f32373a;

        private b() {
        }

        /* renamed from: a */
        public InterfaceC12166e m39029a() {
            C11246d.m35129a(this.f32373a, C12464q.class);
            return new c(this.f32373a);
        }

        /* renamed from: b */
        public b m39030b(C12464q c12464q) {
            this.f32373a = (C12464q) C11246d.m35130b(c12464q);
            return this;
        }
    }

    /* renamed from: wd.c$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC12166e {

        /* renamed from: a */
        private final c f32374a;

        /* renamed from: b */
        private InterfaceC1806a<C11543l> f32375b;

        /* renamed from: c */
        private InterfaceC1806a<LayoutInflater> f32376c;

        /* renamed from: d */
        private InterfaceC1806a<AbstractC6896i> f32377d;

        /* renamed from: e */
        private InterfaceC1806a<C11878f> f32378e;

        /* renamed from: f */
        private InterfaceC1806a<C11880h> f32379f;

        /* renamed from: g */
        private InterfaceC1806a<C11873a> f32380g;

        /* renamed from: h */
        private InterfaceC1806a<C11876d> f32381h;

        private c(C12464q c12464q) {
            this.f32374a = this;
            m39031e(c12464q);
        }

        /* renamed from: e */
        private void m39031e(C12464q c12464q) {
            this.f32375b = C11244b.m35124a(C12465r.m40479a(c12464q));
            this.f32376c = C11244b.m35124a(C12467t.m40485a(c12464q));
            C12466s m40482a = C12466s.m40482a(c12464q);
            this.f32377d = m40482a;
            this.f32378e = C11244b.m35124a(C11879g.m37989a(this.f32375b, this.f32376c, m40482a));
            this.f32379f = C11244b.m35124a(C11881i.m37997a(this.f32375b, this.f32376c, this.f32377d));
            this.f32380g = C11244b.m35124a(C11874b.m37973a(this.f32375b, this.f32376c, this.f32377d));
            this.f32381h = C11244b.m35124a(C11877e.m37986a(this.f32375b, this.f32376c, this.f32377d));
        }

        @Override // p421wd.InterfaceC12166e
        /* renamed from: a */
        public C11878f mo39032a() {
            return this.f32378e.get();
        }

        @Override // p421wd.InterfaceC12166e
        /* renamed from: b */
        public C11876d mo39033b() {
            return this.f32381h.get();
        }

        @Override // p421wd.InterfaceC12166e
        /* renamed from: c */
        public C11873a mo39034c() {
            return this.f32380g.get();
        }

        @Override // p421wd.InterfaceC12166e
        /* renamed from: d */
        public C11880h mo39035d() {
            return this.f32379f.get();
        }
    }

    /* renamed from: a */
    public static b m39028a() {
        return new b();
    }
}
