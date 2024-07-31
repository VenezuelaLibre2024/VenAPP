package io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import vi.d0;
import vi.f;

/* loaded from: classes3.dex */
final class n extends vi.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f18999a;

    /* renamed from: b, reason: collision with root package name */
    private final k2 f19000b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19001a;

        static {
            int[] iArr = new int[f.a.values().length];
            f19001a = iArr;
            try {
                iArr[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19001a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19001a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, k2 k2Var) {
        this.f18999a = (o) eb.o.p(oVar, "tracer");
        this.f19000b = (k2) eb.o.p(k2Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f18999a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(vi.i0 i0Var, f.a aVar, String str) {
        Level f10 = f(aVar);
        if (o.f19017f.isLoggable(f10)) {
            o.d(i0Var, f10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(vi.i0 i0Var, f.a aVar, String str, Object... objArr) {
        Level f10 = f(aVar);
        if (o.f19017f.isLoggable(f10)) {
            o.d(i0Var, f10, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int i10 = a.f19001a[aVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? Level.FINE : i10 != 3 ? Level.FINEST : Level.FINER;
    }

    private static d0.b g(f.a aVar) {
        int i10 = a.f19001a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? d0.b.CT_INFO : d0.b.CT_WARNING : d0.b.CT_ERROR;
    }

    private void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f18999a.f(new d0.a().b(str).c(g(aVar)).e(this.f19000b.a()).a());
    }

    @Override // vi.f
    public void a(f.a aVar, String str) {
        d(this.f18999a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // vi.f
    public void b(f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || o.f19017f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
