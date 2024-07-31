package p452y;

import android.util.Size;
import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.impl.C0611d1;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0638k0;
import androidx.camera.core.impl.InterfaceC0646m0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0980d;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p071e0.C7087b;
import p112g0.C7437z;
import p407w.AbstractC12019k;
import p407w.C12008g0;
import p407w.C12046x;
import p452y.C12558o;
import p474z.C12747a;

/* renamed from: y.r */
/* loaded from: classes.dex */
public class C12564r {

    /* renamed from: g */
    static final C7087b f34071g = new C7087b();

    /* renamed from: a */
    private final C0611d1 f34072a;

    /* renamed from: b */
    private final C0642l0 f34073b;

    /* renamed from: c */
    private final C12558o f34074c;

    /* renamed from: d */
    private final C12555m0 f34075d;

    /* renamed from: e */
    private final C12539e0 f34076e;

    /* renamed from: f */
    private final C12558o.b f34077f;

    public C12564r(C0611d1 c0611d1, Size size, AbstractC12019k abstractC12019k, boolean z10) {
        C0688q.m3339a();
        this.f34072a = c0611d1;
        this.f34073b = C0642l0.a.m3158j(c0611d1).m3167h();
        C12558o c12558o = new C12558o();
        this.f34074c = c12558o;
        C12555m0 c12555m0 = new C12555m0();
        this.f34075d = c12555m0;
        Executor m3024b0 = c0611d1.m3024b0(C12747a.m42282c());
        Objects.requireNonNull(m3024b0);
        C12539e0 c12539e0 = new C12539e0(m3024b0, abstractC12019k != null ? new C7437z(abstractC12019k) : null);
        this.f34076e = c12539e0;
        C12558o.b m41239j = C12558o.b.m41239j(size, c0611d1.mo3010n(), m41253i(), z10, c0611d1.m3023a0());
        this.f34077f = m41239j;
        c12539e0.m41168q(c12555m0.m41222f(c12558o.m41237n(m41239j)));
    }

    /* renamed from: b */
    private C12548j m41250b(InterfaceC0638k0 interfaceC0638k0, AbstractC12573v0 abstractC12573v0, InterfaceC12557n0 interfaceC12557n0) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(interfaceC0638k0.hashCode());
        List<InterfaceC0646m0> mo3134a = interfaceC0638k0.mo3134a();
        Objects.requireNonNull(mo3134a);
        for (InterfaceC0646m0 interfaceC0646m0 : mo3134a) {
            C0642l0.a aVar = new C0642l0.a();
            aVar.m3175r(this.f34073b.m3156h());
            aVar.m3164e(this.f34073b.m3153e());
            aVar.m3160a(abstractC12573v0.m41312n());
            aVar.m3165f(this.f34077f.m41241h());
            if (this.f34077f.mo41139d() == 256) {
                if (f34071g.m20856a()) {
                    aVar.m3163d(C0642l0.f2875i, Integer.valueOf(abstractC12573v0.m41310l()));
                }
                aVar.m3163d(C0642l0.f2876j, Integer.valueOf(m41257g(abstractC12573v0)));
            }
            aVar.m3164e(interfaceC0646m0.mo3183a().m3153e());
            aVar.m3166g(valueOf, Integer.valueOf(interfaceC0646m0.getId()));
            aVar.m3162c(this.f34077f.m41240a());
            arrayList.add(aVar.m3167h());
        }
        return new C12548j(arrayList, interfaceC12557n0);
    }

    /* renamed from: c */
    private InterfaceC0638k0 m41251c() {
        InterfaceC0638k0 m3019W = this.f34072a.m3019W(C12046x.m38697b());
        Objects.requireNonNull(m3019W);
        return m3019W;
    }

    /* renamed from: d */
    private C12541f0 m41252d(InterfaceC0638k0 interfaceC0638k0, AbstractC12573v0 abstractC12573v0, InterfaceC12557n0 interfaceC12557n0, InterfaceFutureC5920f<Void> interfaceFutureC5920f) {
        return new C12541f0(interfaceC0638k0, abstractC12573v0.m41309k(), abstractC12573v0.m41305g(), abstractC12573v0.m41310l(), abstractC12573v0.m41307i(), abstractC12573v0.m41311m(), interfaceC12557n0, interfaceFutureC5920f);
    }

    /* renamed from: i */
    private int m41253i() {
        Integer num = (Integer) this.f34072a.mo3197g(C0611d1.f2783K, null);
        return num != null ? num.intValue() : RecognitionOptions.QR_CODE;
    }

    /* renamed from: a */
    public void m41254a() {
        C0688q.m3339a();
        this.f34074c.m41234j();
        this.f34075d.m41221d();
        this.f34076e.m41167o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0980d<C12548j, C12541f0> m41255e(AbstractC12573v0 abstractC12573v0, InterfaceC12557n0 interfaceC12557n0, InterfaceFutureC5920f<Void> interfaceFutureC5920f) {
        C0688q.m3339a();
        InterfaceC0638k0 m41251c = m41251c();
        return new C0980d<>(m41250b(m41251c, abstractC12573v0, interfaceC12557n0), m41252d(m41251c, abstractC12573v0, interfaceC12557n0, interfaceFutureC5920f));
    }

    /* renamed from: f */
    public C0701y1.b m41256f(Size size) {
        C0701y1.b m3391p = C0701y1.b.m3391p(this.f34072a, size);
        m3391p.m3399h(this.f34077f.m41241h());
        return m3391p;
    }

    /* renamed from: g */
    int m41257g(AbstractC12573v0 abstractC12573v0) {
        return ((abstractC12573v0.m41308j() != null) && C0689r.m3347e(abstractC12573v0.m41305g(), this.f34077f.mo41142g())) ? abstractC12573v0.m41304f() == 0 ? 100 : 95 : abstractC12573v0.m41307i();
    }

    /* renamed from: h */
    public int m41258h() {
        C0688q.m3339a();
        return this.f34074c.m41231d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m41259j(C12008g0 c12008g0) {
        C0688q.m3339a();
        this.f34077f.mo41137b().accept(c12008g0);
    }

    /* renamed from: k */
    public void m41260k(AbstractC0592e.a aVar) {
        C0688q.m3339a();
        this.f34074c.m41236m(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m41261l(C12541f0 c12541f0) {
        C0688q.m3339a();
        this.f34077f.mo41141f().accept(c12541f0);
    }
}
