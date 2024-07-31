package io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import p082eb.C7159o;
import vi.AbstractC11910f;
import vi.C11905d0;
import vi.C11920i0;

/* renamed from: io.grpc.internal.n */
/* loaded from: classes3.dex */
final class C8877n extends AbstractC11910f {

    /* renamed from: a */
    private final C8881o f20746a;

    /* renamed from: b */
    private final InterfaceC8868k2 f20747b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.n$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20748a;

        static {
            int[] iArr = new int[AbstractC11910f.a.values().length];
            f20748a = iArr;
            try {
                iArr[AbstractC11910f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20748a[AbstractC11910f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20748a[AbstractC11910f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8877n(C8881o c8881o, InterfaceC8868k2 interfaceC8868k2) {
        this.f20746a = (C8881o) C7159o.m21313p(c8881o, "tracer");
        this.f20747b = (InterfaceC8868k2) C7159o.m21313p(interfaceC8868k2, "time");
    }

    /* renamed from: c */
    private boolean m25676c(AbstractC11910f.a aVar) {
        return aVar != AbstractC11910f.a.DEBUG && this.f20746a.m25700c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m25677d(C11920i0 c11920i0, AbstractC11910f.a aVar, String str) {
        Level m25679f = m25679f(aVar);
        if (C8881o.f20764f.isLoggable(m25679f)) {
            C8881o.m25698d(c11920i0, m25679f, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m25678e(C11920i0 c11920i0, AbstractC11910f.a aVar, String str, Object... objArr) {
        Level m25679f = m25679f(aVar);
        if (C8881o.f20764f.isLoggable(m25679f)) {
            C8881o.m25698d(c11920i0, m25679f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    private static Level m25679f(AbstractC11910f.a aVar) {
        int i10 = a.f20748a[aVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? Level.FINE : i10 != 3 ? Level.FINEST : Level.FINER;
    }

    /* renamed from: g */
    private static C11905d0.b m25680g(AbstractC11910f.a aVar) {
        int i10 = a.f20748a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? C11905d0.b.CT_INFO : C11905d0.b.CT_WARNING : C11905d0.b.CT_ERROR;
    }

    /* renamed from: h */
    private void m25681h(AbstractC11910f.a aVar, String str) {
        if (aVar == AbstractC11910f.a.DEBUG) {
            return;
        }
        this.f20746a.m25702f(new C11905d0.a().m38113b(str).m38114c(m25680g(aVar)).m38116e(this.f20747b.mo25639a()).m38112a());
    }

    @Override // vi.AbstractC11910f
    /* renamed from: a */
    public void mo25682a(AbstractC11910f.a aVar, String str) {
        m25677d(this.f20746a.m25699b(), aVar, str);
        if (m25676c(aVar)) {
            m25681h(aVar, str);
        }
    }

    @Override // vi.AbstractC11910f
    /* renamed from: b */
    public void mo25683b(AbstractC11910f.a aVar, String str, Object... objArr) {
        mo25682a(aVar, (m25676c(aVar) || C8881o.f20764f.isLoggable(m25679f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
