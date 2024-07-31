package vi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vi.InterfaceC11928l;

/* renamed from: vi.o */
/* loaded from: classes3.dex */
public final class C11936o {

    /* renamed from: b */
    private static final C11936o f31607b = new C11936o(new InterfaceC11928l.a(), InterfaceC11928l.b.f31595a);

    /* renamed from: a */
    private final ConcurrentMap<String, InterfaceC11934n> f31608a = new ConcurrentHashMap();

    C11936o(InterfaceC11934n... interfaceC11934nArr) {
        for (InterfaceC11934n interfaceC11934n : interfaceC11934nArr) {
            this.f31608a.put(interfaceC11934n.mo38199a(), interfaceC11934n);
        }
    }

    /* renamed from: a */
    public static C11936o m38206a() {
        return f31607b;
    }

    /* renamed from: b */
    public InterfaceC11934n m38207b(String str) {
        return this.f31608a.get(str);
    }
}
