package p132h6;

import java.util.concurrent.Executor;
import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: h6.k */
/* loaded from: classes.dex */
public final class C7641k implements InterfaceC8989b<Executor> {

    /* renamed from: h6.k$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C7641k f18085a = new C7641k();
    }

    /* renamed from: a */
    public static C7641k m23216a() {
        return a.f18085a;
    }

    /* renamed from: b */
    public static Executor m23217b() {
        return (Executor) C8991d.m26386c(AbstractC7640j.m23215a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m23217b();
    }
}
