package p421wd;

import android.app.Application;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.util.Map;
import p029bk.InterfaceC1806a;
import p311qd.C10457q;
import p382ud.C11532a;
import p382ud.C11534c;
import p382ud.C11535d;
import p382ud.C11536e;
import p382ud.C11537f;
import p382ud.C11538g;
import p382ud.C11541j;
import p382ud.C11542k;
import p382ud.C11543l;
import p382ud.C11546o;
import p443xd.C12450c;
import p443xd.C12451d;
import p443xd.C12452e;
import p443xd.C12453f;
import sd.C10895b;
import sd.C10897d;
import td.C11244b;
import td.C11246d;

/* renamed from: wd.b */
/* loaded from: classes.dex */
public final class C12163b {

    /* renamed from: wd.b$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC12162a {

        /* renamed from: a */
        private final b f32355a;

        /* renamed from: b */
        private InterfaceC1806a<C10457q> f32356b;

        /* renamed from: c */
        private InterfaceC1806a<Map<String, InterfaceC1806a<C11543l>>> f32357c;

        /* renamed from: d */
        private InterfaceC1806a<Application> f32358d;

        /* renamed from: e */
        private InterfaceC1806a<C11541j> f32359e;

        /* renamed from: f */
        private InterfaceC1806a<ComponentCallbacks2C2125k> f32360f;

        /* renamed from: g */
        private InterfaceC1806a<C11536e> f32361g;

        /* renamed from: h */
        private InterfaceC1806a<C11538g> f32362h;

        /* renamed from: i */
        private InterfaceC1806a<C11532a> f32363i;

        /* renamed from: j */
        private InterfaceC1806a<C11534c> f32364j;

        /* renamed from: k */
        private InterfaceC1806a<C10895b> f32365k;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$a */
        /* loaded from: classes.dex */
        public static final class a implements InterfaceC1806a<C11538g> {

            /* renamed from: a */
            private final InterfaceC12167f f32366a;

            a(InterfaceC12167f interfaceC12167f) {
                this.f32366a = interfaceC12167f;
            }

            @Override // p029bk.InterfaceC1806a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C11538g get() {
                return (C11538g) C11246d.m35131c(this.f32366a.mo39040a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13264b implements InterfaceC1806a<C11532a> {

            /* renamed from: a */
            private final InterfaceC12167f f32367a;

            C13264b(InterfaceC12167f interfaceC12167f) {
                this.f32367a = interfaceC12167f;
            }

            @Override // p029bk.InterfaceC1806a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C11532a get() {
                return (C11532a) C11246d.m35131c(this.f32367a.mo39043d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$c */
        /* loaded from: classes.dex */
        public static final class c implements InterfaceC1806a<Map<String, InterfaceC1806a<C11543l>>> {

            /* renamed from: a */
            private final InterfaceC12167f f32368a;

            c(InterfaceC12167f interfaceC12167f) {
                this.f32368a = interfaceC12167f;
            }

            @Override // p029bk.InterfaceC1806a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, InterfaceC1806a<C11543l>> get() {
                return (Map) C11246d.m35131c(this.f32368a.mo39042c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: wd.b$b$d */
        /* loaded from: classes.dex */
        public static final class d implements InterfaceC1806a<Application> {

            /* renamed from: a */
            private final InterfaceC12167f f32369a;

            d(InterfaceC12167f interfaceC12167f) {
                this.f32369a = interfaceC12167f;
            }

            @Override // p029bk.InterfaceC1806a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Application get() {
                return (Application) C11246d.m35131c(this.f32369a.mo39041b());
            }
        }

        private b(C12452e c12452e, C12450c c12450c, InterfaceC12167f interfaceC12167f) {
            this.f32355a = this;
            m39020b(c12452e, c12450c, interfaceC12167f);
        }

        /* renamed from: b */
        private void m39020b(C12452e c12452e, C12450c c12450c, InterfaceC12167f interfaceC12167f) {
            this.f32356b = C11244b.m35124a(C12453f.m40436a(c12452e));
            this.f32357c = new c(interfaceC12167f);
            this.f32358d = new d(interfaceC12167f);
            InterfaceC1806a<C11541j> m35124a = C11244b.m35124a(C11542k.m36137a());
            this.f32359e = m35124a;
            InterfaceC1806a<ComponentCallbacks2C2125k> m35124a2 = C11244b.m35124a(C12451d.m40432a(c12450c, this.f32358d, m35124a));
            this.f32360f = m35124a2;
            this.f32361g = C11244b.m35124a(C11537f.m36115a(m35124a2));
            this.f32362h = new a(interfaceC12167f);
            this.f32363i = new C13264b(interfaceC12167f);
            this.f32364j = C11244b.m35124a(C11535d.m36100a());
            this.f32365k = C11244b.m35124a(C10897d.m33274a(this.f32356b, this.f32357c, this.f32361g, C11546o.m36190a(), C11546o.m36190a(), this.f32362h, this.f32358d, this.f32363i, this.f32364j));
        }

        @Override // p421wd.InterfaceC12162a
        /* renamed from: a */
        public C10895b mo39018a() {
            return this.f32365k.get();
        }
    }

    /* renamed from: wd.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private C12452e f32370a;

        /* renamed from: b */
        private C12450c f32371b;

        /* renamed from: c */
        private InterfaceC12167f f32372c;

        private c() {
        }

        /* renamed from: a */
        public InterfaceC12162a m39025a() {
            C11246d.m35129a(this.f32370a, C12452e.class);
            if (this.f32371b == null) {
                this.f32371b = new C12450c();
            }
            C11246d.m35129a(this.f32372c, InterfaceC12167f.class);
            return new b(this.f32370a, this.f32371b, this.f32372c);
        }

        /* renamed from: b */
        public c m39026b(C12452e c12452e) {
            this.f32370a = (C12452e) C11246d.m35130b(c12452e);
            return this;
        }

        /* renamed from: c */
        public c m39027c(InterfaceC12167f interfaceC12167f) {
            this.f32372c = (InterfaceC12167f) C11246d.m35130b(interfaceC12167f);
            return this;
        }
    }

    /* renamed from: a */
    public static c m39019a() {
        return new c();
    }
}
