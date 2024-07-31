package p289p6;

import p174j6.C8991d;
import p174j6.InterfaceC8989b;

/* renamed from: p6.g */
/* loaded from: classes.dex */
public final class C10073g implements InterfaceC8989b<String> {

    /* renamed from: p6.g$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C10073g f24731a = new C10073g();
    }

    /* renamed from: a */
    public static C10073g m30037a() {
        return a.f24731a;
    }

    /* renamed from: b */
    public static String m30038b() {
        return (String) C8991d.m26386c(AbstractC10071f.m30033a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m30038b();
    }
}
