package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public class z {
    public vk.e a(j jVar) {
        return jVar;
    }

    public vk.c b(Class cls) {
        return new e(cls);
    }

    public vk.d c(Class cls, String str) {
        return new p(cls, str);
    }

    public vk.f d(q qVar) {
        return qVar;
    }

    public vk.g e(s sVar) {
        return sVar;
    }

    public String f(i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(o oVar) {
        return f(oVar);
    }
}
