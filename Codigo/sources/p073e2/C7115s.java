package p073e2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.internal.AbstractC1431a;
import androidx.webkit.internal.C1436b1;
import androidx.webkit.internal.C1437c;
import androidx.webkit.internal.C1448f1;
import androidx.webkit.internal.C1458j;
import androidx.webkit.internal.C1460j1;
import androidx.webkit.internal.C1462k0;
import androidx.webkit.internal.C1463k1;
import androidx.webkit.internal.C1466l1;
import androidx.webkit.internal.C1479q;
import androidx.webkit.internal.InterfaceC1469m1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: e2.s */
/* loaded from: classes.dex */
public class C7115s {

    /* renamed from: a */
    private static final Uri f15837a = Uri.parse("*");

    /* renamed from: b */
    private static final Uri f15838b = Uri.parse("");

    /* renamed from: e2.s$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: e2.s$b */
    /* loaded from: classes.dex */
    public interface b {
        void onPostMessage(WebView webView, C7109m c7109m, Uri uri, boolean z10, AbstractC7098b abstractC7098b);
    }

    @Deprecated
    /* renamed from: a */
    public static AbstractC7103g m20988a(WebView webView, String str, Set<String> set) {
        if (C1460j1.f6420W.mo8260d()) {
            return m20997j(webView).m8383a(str, (String[]) set.toArray(new String[0]));
        }
        throw C1460j1.m8361a();
    }

    /* renamed from: b */
    public static void m20989b(WebView webView, String str, Set<String> set, b bVar) {
        if (!C1460j1.f6419V.mo8260d()) {
            throw C1460j1.m8361a();
        }
        m20997j(webView).m8384b(str, (String[]) set.toArray(new String[0]), bVar);
    }

    /* renamed from: c */
    private static WebViewProviderBoundaryInterface m20990c(WebView webView) {
        return m20994g().createWebView(webView);
    }

    /* renamed from: d */
    public static AbstractC7110n[] m20991d(WebView webView) {
        AbstractC1431a.b bVar = C1460j1.f6402E;
        if (bVar.mo8259c()) {
            return C1448f1.m8321k(C1437c.m8275c(webView));
        }
        if (bVar.mo8260d()) {
            return m20997j(webView).m8385c();
        }
        throw C1460j1.m8361a();
    }

    /* renamed from: e */
    public static PackageInfo m20992e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1458j.m8355a();
        }
        try {
            return m20995h();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static PackageInfo m20993f(Context context) {
        PackageInfo m20992e = m20992e();
        return m20992e != null ? m20992e : m20996i(context);
    }

    /* renamed from: g */
    private static InterfaceC1469m1 m20994g() {
        return C1463k1.m8377d();
    }

    /* renamed from: h */
    private static PackageInfo m20995h() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: i */
    private static PackageInfo m20996i(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static C1466l1 m20997j(WebView webView) {
        return new C1466l1(m20990c(webView));
    }

    /* renamed from: k */
    public static Uri m20998k() {
        AbstractC1431a.f fVar = C1460j1.f6435j;
        if (fVar.mo8259c()) {
            return C1479q.m8406b();
        }
        if (fVar.mo8260d()) {
            return m20994g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw C1460j1.m8361a();
    }

    /* renamed from: l */
    public static String m20999l() {
        if (C1460j1.f6422Y.mo8260d()) {
            return m20994g().getStatics().getVariationsHeader();
        }
        throw C1460j1.m8361a();
    }

    /* renamed from: m */
    public static boolean m21000m() {
        if (C1460j1.f6416S.mo8260d()) {
            return m20994g().getStatics().isMultiProcessEnabled();
        }
        throw C1460j1.m8361a();
    }

    /* renamed from: n */
    public static void m21001n(WebView webView, C7109m c7109m, Uri uri) {
        if (f15837a.equals(uri)) {
            uri = f15838b;
        }
        AbstractC1431a.b bVar = C1460j1.f6403F;
        if (bVar.mo8259c() && c7109m.m20958e() == 0) {
            C1437c.m8282j(webView, C1448f1.m8316f(c7109m), uri);
        } else {
            if (!bVar.mo8260d() || !C1436b1.m8270a(c7109m.m20958e())) {
                throw C1460j1.m8361a();
            }
            m20997j(webView).m8386d(c7109m, uri);
        }
    }

    /* renamed from: o */
    public static void m21002o(Set<String> set, ValueCallback<Boolean> valueCallback) {
        AbstractC1431a.f fVar = C1460j1.f6434i;
        AbstractC1431a.f fVar2 = C1460j1.f6433h;
        if (fVar.mo8260d()) {
            m20994g().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.mo8259c()) {
            C1479q.m8408d(arrayList, valueCallback);
        } else {
            if (!fVar2.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m20994g().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    /* renamed from: p */
    public static void m21003p(List<String> list, ValueCallback<Boolean> valueCallback) {
        m21002o(new HashSet(list), valueCallback);
    }

    /* renamed from: q */
    public static void m21004q(WebView webView, AbstractC7118v abstractC7118v) {
        AbstractC1431a.h hVar = C1460j1.f6412O;
        if (hVar.mo8259c()) {
            C1462k0.m8371e(webView, abstractC7118v);
        } else {
            if (!hVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m20997j(webView).m8387e(null, abstractC7118v);
        }
    }

    /* renamed from: r */
    public static void m21005r(Context context, ValueCallback<Boolean> valueCallback) {
        AbstractC1431a.f fVar = C1460j1.f6430e;
        if (fVar.mo8259c()) {
            C1479q.m8410f(context, valueCallback);
        } else {
            if (!fVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m20994g().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
