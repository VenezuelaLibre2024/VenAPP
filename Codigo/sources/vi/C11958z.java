package vi;

import java.util.List;

/* renamed from: vi.z */
/* loaded from: classes3.dex */
final class C11958z {

    /* renamed from: a */
    private static List<InterfaceC11916h> f31723a;

    /* renamed from: b */
    private static boolean f31724b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized List<InterfaceC11916h> m38384a() {
        List<InterfaceC11916h> list;
        synchronized (C11958z.class) {
            f31724b = true;
            list = f31723a;
        }
        return list;
    }
}
