package p372u2;

import p357t2.InterfaceC10979b;

/* renamed from: u2.b */
/* loaded from: classes.dex */
public class C11303b implements InterfaceC10979b {
    @Override // p357t2.InterfaceC10979b
    /* renamed from: a */
    public Class<?> mo33525a(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | SecurityException unused) {
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (systemClassLoader != null) {
                return systemClassLoader.loadClass(str);
            }
        } catch (ClassNotFoundException | Error | IllegalStateException | SecurityException unused2) {
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | LinkageError unused3) {
            return null;
        }
    }
}
