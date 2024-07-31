package sd;

import android.app.Application;
import java.util.Map;
import p029bk.InterfaceC1806a;
import p311qd.C10457q;
import p382ud.C11532a;
import p382ud.C11534c;
import p382ud.C11536e;
import p382ud.C11538g;
import p382ud.C11543l;
import p382ud.C11545n;

/* renamed from: sd.d */
/* loaded from: classes.dex */
public final class C10897d implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<C10457q> f27630a;

    /* renamed from: b */
    private final InterfaceC1806a<Map<String, InterfaceC1806a<C11543l>>> f27631b;

    /* renamed from: c */
    private final InterfaceC1806a<C11536e> f27632c;

    /* renamed from: d */
    private final InterfaceC1806a<C11545n> f27633d;

    /* renamed from: e */
    private final InterfaceC1806a<C11545n> f27634e;

    /* renamed from: f */
    private final InterfaceC1806a<C11538g> f27635f;

    /* renamed from: g */
    private final InterfaceC1806a<Application> f27636g;

    /* renamed from: h */
    private final InterfaceC1806a<C11532a> f27637h;

    /* renamed from: i */
    private final InterfaceC1806a<C11534c> f27638i;

    public C10897d(InterfaceC1806a<C10457q> interfaceC1806a, InterfaceC1806a<Map<String, InterfaceC1806a<C11543l>>> interfaceC1806a2, InterfaceC1806a<C11536e> interfaceC1806a3, InterfaceC1806a<C11545n> interfaceC1806a4, InterfaceC1806a<C11545n> interfaceC1806a5, InterfaceC1806a<C11538g> interfaceC1806a6, InterfaceC1806a<Application> interfaceC1806a7, InterfaceC1806a<C11532a> interfaceC1806a8, InterfaceC1806a<C11534c> interfaceC1806a9) {
        this.f27630a = interfaceC1806a;
        this.f27631b = interfaceC1806a2;
        this.f27632c = interfaceC1806a3;
        this.f27633d = interfaceC1806a4;
        this.f27634e = interfaceC1806a5;
        this.f27635f = interfaceC1806a6;
        this.f27636g = interfaceC1806a7;
        this.f27637h = interfaceC1806a8;
        this.f27638i = interfaceC1806a9;
    }

    /* renamed from: a */
    public static C10897d m33274a(InterfaceC1806a<C10457q> interfaceC1806a, InterfaceC1806a<Map<String, InterfaceC1806a<C11543l>>> interfaceC1806a2, InterfaceC1806a<C11536e> interfaceC1806a3, InterfaceC1806a<C11545n> interfaceC1806a4, InterfaceC1806a<C11545n> interfaceC1806a5, InterfaceC1806a<C11538g> interfaceC1806a6, InterfaceC1806a<Application> interfaceC1806a7, InterfaceC1806a<C11532a> interfaceC1806a8, InterfaceC1806a<C11534c> interfaceC1806a9) {
        return new C10897d(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7, interfaceC1806a8, interfaceC1806a9);
    }

    /* renamed from: c */
    public static C10895b m33275c(C10457q c10457q, Map<String, InterfaceC1806a<C11543l>> map, C11536e c11536e, C11545n c11545n, C11545n c11545n2, C11538g c11538g, Application application, C11532a c11532a, C11534c c11534c) {
        return new C10895b(c10457q, map, c11536e, c11545n, c11545n2, c11538g, application, c11532a, c11534c);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10895b get() {
        return m33275c(this.f27630a.get(), this.f27631b.get(), this.f27632c.get(), this.f27633d.get(), this.f27634e.get(), this.f27635f.get(), this.f27636g.get(), this.f27637h.get(), this.f27638i.get());
    }
}
