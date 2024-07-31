package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a */
    private static final z f20760a;

    /* renamed from: b */
    private static final vk.c[] f20761b;

    static {
        z zVar = null;
        try {
            zVar = (z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zVar == null) {
            zVar = new z();
        }
        f20760a = zVar;
        f20761b = new vk.c[0];
    }

    public static vk.e a(j jVar) {
        return f20760a.a(jVar);
    }

    public static vk.c b(Class cls) {
        return f20760a.b(cls);
    }

    public static vk.d c(Class cls) {
        return f20760a.c(cls, "");
    }

    public static vk.f d(q qVar) {
        return f20760a.d(qVar);
    }

    public static vk.g e(s sVar) {
        return f20760a.e(sVar);
    }

    public static String f(i iVar) {
        return f20760a.f(iVar);
    }

    public static String g(o oVar) {
        return f20760a.g(oVar);
    }
}
