package p421wd;

import android.app.Application;
import android.util.DisplayMetrics;
import java.util.Map;
import p029bk.InterfaceC1806a;
import p382ud.C11532a;
import p382ud.C11533b;
import p382ud.C11538g;
import p382ud.C11539h;
import p382ud.C11543l;
import p443xd.C12448a;
import p443xd.C12449b;
import p443xd.C12454g;
import p443xd.C12455h;
import p443xd.C12456i;
import p443xd.C12457j;
import p443xd.C12458k;
import p443xd.C12459l;
import p443xd.C12460m;
import p443xd.C12461n;
import p443xd.C12462o;
import p443xd.C12463p;
import td.C11244b;
import td.C11245c;
import td.C11246d;

/* renamed from: wd.d */
/* loaded from: classes.dex */
public final class C12165d {

    /* renamed from: wd.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C12448a f32382a;

        /* renamed from: b */
        private C12454g f32383b;

        private b() {
        }

        /* renamed from: a */
        public b m39037a(C12448a c12448a) {
            this.f32382a = (C12448a) C11246d.m35130b(c12448a);
            return this;
        }

        /* renamed from: b */
        public InterfaceC12167f m39038b() {
            C11246d.m35129a(this.f32382a, C12448a.class);
            if (this.f32383b == null) {
                this.f32383b = new C12454g();
            }
            return new c(this.f32382a, this.f32383b);
        }
    }

    /* renamed from: wd.d$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC12167f {

        /* renamed from: a */
        private final C12454g f32384a;

        /* renamed from: b */
        private final c f32385b;

        /* renamed from: c */
        private InterfaceC1806a<Application> f32386c;

        /* renamed from: d */
        private InterfaceC1806a<C11538g> f32387d;

        /* renamed from: e */
        private InterfaceC1806a<C11532a> f32388e;

        /* renamed from: f */
        private InterfaceC1806a<DisplayMetrics> f32389f;

        /* renamed from: g */
        private InterfaceC1806a<C11543l> f32390g;

        /* renamed from: h */
        private InterfaceC1806a<C11543l> f32391h;

        /* renamed from: i */
        private InterfaceC1806a<C11543l> f32392i;

        /* renamed from: j */
        private InterfaceC1806a<C11543l> f32393j;

        /* renamed from: k */
        private InterfaceC1806a<C11543l> f32394k;

        /* renamed from: l */
        private InterfaceC1806a<C11543l> f32395l;

        /* renamed from: m */
        private InterfaceC1806a<C11543l> f32396m;

        /* renamed from: n */
        private InterfaceC1806a<C11543l> f32397n;

        private c(C12448a c12448a, C12454g c12454g) {
            this.f32385b = this;
            this.f32384a = c12454g;
            m39039e(c12448a, c12454g);
        }

        /* renamed from: e */
        private void m39039e(C12448a c12448a, C12454g c12454g) {
            this.f32386c = C11244b.m35124a(C12449b.m40428a(c12448a));
            this.f32387d = C11244b.m35124a(C11539h.m36131a());
            this.f32388e = C11244b.m35124a(C11533b.m36094a(this.f32386c));
            C12459l m40461a = C12459l.m40461a(c12454g, this.f32386c);
            this.f32389f = m40461a;
            this.f32390g = C12463p.m40473a(c12454g, m40461a);
            this.f32391h = C12460m.m40464a(c12454g, this.f32389f);
            this.f32392i = C12461n.m40467a(c12454g, this.f32389f);
            this.f32393j = C12462o.m40470a(c12454g, this.f32389f);
            this.f32394k = C12457j.m40455a(c12454g, this.f32389f);
            this.f32395l = C12458k.m40458a(c12454g, this.f32389f);
            this.f32396m = C12456i.m40452a(c12454g, this.f32389f);
            this.f32397n = C12455h.m40449a(c12454g, this.f32389f);
        }

        @Override // p421wd.InterfaceC12167f
        /* renamed from: a */
        public C11538g mo39040a() {
            return this.f32387d.get();
        }

        @Override // p421wd.InterfaceC12167f
        /* renamed from: b */
        public Application mo39041b() {
            return this.f32386c.get();
        }

        @Override // p421wd.InterfaceC12167f
        /* renamed from: c */
        public Map<String, InterfaceC1806a<C11543l>> mo39042c() {
            return C11245c.m35126b(8).m35128c("IMAGE_ONLY_PORTRAIT", this.f32390g).m35128c("IMAGE_ONLY_LANDSCAPE", this.f32391h).m35128c("MODAL_LANDSCAPE", this.f32392i).m35128c("MODAL_PORTRAIT", this.f32393j).m35128c("CARD_LANDSCAPE", this.f32394k).m35128c("CARD_PORTRAIT", this.f32395l).m35128c("BANNER_PORTRAIT", this.f32396m).m35128c("BANNER_LANDSCAPE", this.f32397n).m35127a();
        }

        @Override // p421wd.InterfaceC12167f
        /* renamed from: d */
        public C11532a mo39043d() {
            return this.f32388e.get();
        }
    }

    /* renamed from: a */
    public static b m39036a() {
        return new b();
    }
}
