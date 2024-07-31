package kotlin.jvm.internal;

import p405vk.InterfaceC11966c;
import p405vk.InterfaceC11967d;
import p405vk.InterfaceC11968e;
import p405vk.InterfaceC11969f;
import p405vk.InterfaceC11970g;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes3.dex */
public class C9334z {
    /* renamed from: a */
    public InterfaceC11968e m27803a(C9318j c9318j) {
        return c9318j;
    }

    /* renamed from: b */
    public InterfaceC11966c m27804b(Class cls) {
        return new C9313e(cls);
    }

    /* renamed from: c */
    public InterfaceC11967d m27805c(Class cls, String str) {
        return new C9324p(cls, str);
    }

    /* renamed from: d */
    public InterfaceC11969f m27806d(AbstractC9325q abstractC9325q) {
        return abstractC9325q;
    }

    /* renamed from: e */
    public InterfaceC11970g m27807e(AbstractC9327s abstractC9327s) {
        return abstractC9327s;
    }

    /* renamed from: f */
    public String m27808f(InterfaceC9317i interfaceC9317i) {
        String obj = interfaceC9317i.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String m27809g(AbstractC9323o abstractC9323o) {
        return m27808f(abstractC9323o);
    }
}
