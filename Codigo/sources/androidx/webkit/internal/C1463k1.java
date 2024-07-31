package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: androidx.webkit.internal.k1 */
/* loaded from: classes.dex */
public class C1463k1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.webkit.internal.k1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        static final C1484r1 f6453a = new C1484r1(C1463k1.m8377d().getWebkitToCompatConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.webkit.internal.k1$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        static final InterfaceC1469m1 f6454a = C1463k1.m8374a();
    }

    /* renamed from: a */
    static InterfaceC1469m1 m8374a() {
        try {
            return new C1472n1((WebViewProviderFactoryBoundaryInterface) C7757a.m23674a(WebViewProviderFactoryBoundaryInterface.class, m8375b()));
        } catch (ClassNotFoundException unused) {
            return new C1480q0();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m8375b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m8378e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static C1484r1 m8376c() {
        return a.f6453a;
    }

    /* renamed from: d */
    public static InterfaceC1469m1 m8377d() {
        return b.f6454a;
    }

    /* renamed from: e */
    public static ClassLoader m8378e() {
        return Build.VERSION.SDK_INT >= 28 ? C1438c0.m8287b() : m8379f().getClass().getClassLoader();
    }

    /* renamed from: f */
    private static Object m8379f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
