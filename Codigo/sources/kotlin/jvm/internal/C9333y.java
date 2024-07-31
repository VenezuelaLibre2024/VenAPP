package kotlin.jvm.internal;

import p405vk.InterfaceC11966c;
import p405vk.InterfaceC11967d;
import p405vk.InterfaceC11968e;
import p405vk.InterfaceC11969f;
import p405vk.InterfaceC11970g;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes3.dex */
public class C9333y {

    /* renamed from: a */
    private static final C9334z f22582a;

    /* renamed from: b */
    private static final InterfaceC11966c[] f22583b;

    static {
        C9334z c9334z = null;
        try {
            c9334z = (C9334z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9334z == null) {
            c9334z = new C9334z();
        }
        f22582a = c9334z;
        f22583b = new InterfaceC11966c[0];
    }

    /* renamed from: a */
    public static InterfaceC11968e m27796a(C9318j c9318j) {
        return f22582a.m27803a(c9318j);
    }

    /* renamed from: b */
    public static InterfaceC11966c m27797b(Class cls) {
        return f22582a.m27804b(cls);
    }

    /* renamed from: c */
    public static InterfaceC11967d m27798c(Class cls) {
        return f22582a.m27805c(cls, "");
    }

    /* renamed from: d */
    public static InterfaceC11969f m27799d(AbstractC9325q abstractC9325q) {
        return f22582a.m27806d(abstractC9325q);
    }

    /* renamed from: e */
    public static InterfaceC11970g m27800e(AbstractC9327s abstractC9327s) {
        return f22582a.m27807e(abstractC9327s);
    }

    /* renamed from: f */
    public static String m27801f(InterfaceC9317i interfaceC9317i) {
        return f22582a.m27808f(interfaceC9317i);
    }

    /* renamed from: g */
    public static String m27802g(AbstractC9323o abstractC9323o) {
        return f22582a.m27809g(abstractC9323o);
    }
}
