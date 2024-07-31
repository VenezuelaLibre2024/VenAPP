package p422we;

import ee.InterfaceC7183b;
import p098f6.AbstractC7299c;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7302f;
import p098f6.InterfaceC7303g;
import p444xe.C12476i;
import re.C10696a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: we.b */
/* loaded from: classes.dex */
public final class C12169b {

    /* renamed from: d */
    private static final C10696a f32398d = C10696a.m32565e();

    /* renamed from: a */
    private final String f32399a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC7303g> f32400b;

    /* renamed from: c */
    private InterfaceC7302f<C12476i> f32401c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12169b(InterfaceC7183b<InterfaceC7303g> interfaceC7183b, String str) {
        this.f32399a = str;
        this.f32400b = interfaceC7183b;
    }

    /* renamed from: a */
    private boolean m39044a() {
        if (this.f32401c == null) {
            InterfaceC7303g interfaceC7303g = this.f32400b.get();
            if (interfaceC7303g != null) {
                this.f32401c = interfaceC7303g.mo21886b(this.f32399a, C12476i.class, C7298b.m21878b("proto"), new InterfaceC7301e() { // from class: we.a
                    @Override // p098f6.InterfaceC7301e
                    public final Object apply(Object obj) {
                        return ((C12476i) obj).mo18375h();
                    }
                });
            } else {
                f32398d.m32574j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f32401c != null;
    }

    /* renamed from: b */
    public void m39045b(C12476i c12476i) {
        if (m39044a()) {
            this.f32401c.mo21884b(AbstractC7299c.m21880d(c12476i));
        } else {
            f32398d.m32574j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
