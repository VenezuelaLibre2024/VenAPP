package e2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.internal.a;
import androidx.webkit.internal.b1;
import androidx.webkit.internal.f1;
import androidx.webkit.internal.j1;
import androidx.webkit.internal.k0;
import androidx.webkit.internal.k1;
import androidx.webkit.internal.l1;
import androidx.webkit.internal.m1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f14465a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f14466b = Uri.parse("");

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
        void onPostMessage(WebView webView, m mVar, Uri uri, boolean z10, e2.b bVar);
    }

    @Deprecated
    public static g a(WebView webView, String str, Set<String> set) {
        if (j1.W.d()) {
            return j(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw j1.a();
    }

    public static void b(WebView webView, String str, Set<String> set, b bVar) {
        if (!j1.V.d()) {
            throw j1.a();
        }
        j(webView).b(str, (String[]) set.toArray(new String[0]), bVar);
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return g().createWebView(webView);
    }

    public static n[] d(WebView webView) {
        a.b bVar = j1.E;
        if (bVar.c()) {
            return f1.k(androidx.webkit.internal.c.c(webView));
        }
        if (bVar.d()) {
            return j(webView).c();
        }
        throw j1.a();
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.webkit.internal.j.a();
        }
        try {
            return h();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo f(Context context) {
        PackageInfo e10 = e();
        return e10 != null ? e10 : i(context);
    }

    private static m1 g() {
        return k1.d();
    }

    private static PackageInfo h() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static PackageInfo i(Context context) {
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

    private static l1 j(WebView webView) {
        return new l1(c(webView));
    }

    public static Uri k() {
        a.f fVar = j1.f5584j;
        if (fVar.c()) {
            return androidx.webkit.internal.q.b();
        }
        if (fVar.d()) {
            return g().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw j1.a();
    }

    public static String l() {
        if (j1.Y.d()) {
            return g().getStatics().getVariationsHeader();
        }
        throw j1.a();
    }

    public static boolean m() {
        if (j1.S.d()) {
            return g().getStatics().isMultiProcessEnabled();
        }
        throw j1.a();
    }

    public static void n(WebView webView, m mVar, Uri uri) {
        if (f14465a.equals(uri)) {
            uri = f14466b;
        }
        a.b bVar = j1.F;
        if (bVar.c() && mVar.e() == 0) {
            androidx.webkit.internal.c.j(webView, f1.f(mVar), uri);
        } else {
            if (!bVar.d() || !b1.a(mVar.e())) {
                throw j1.a();
            }
            j(webView).d(mVar, uri);
        }
    }

    public static void o(Set<String> set, ValueCallback<Boolean> valueCallback) {
        a.f fVar = j1.f5583i;
        a.f fVar2 = j1.f5582h;
        if (fVar.d()) {
            g().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.c()) {
            androidx.webkit.internal.q.d(arrayList, valueCallback);
        } else {
            if (!fVar2.d()) {
                throw j1.a();
            }
            g().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void p(List<String> list, ValueCallback<Boolean> valueCallback) {
        o(new HashSet(list), valueCallback);
    }

    public static void q(WebView webView, v vVar) {
        a.h hVar = j1.O;
        if (hVar.c()) {
            k0.e(webView, vVar);
        } else {
            if (!hVar.d()) {
                throw j1.a();
            }
            j(webView).e(null, vVar);
        }
    }

    public static void r(Context context, ValueCallback<Boolean> valueCallback) {
        a.f fVar = j1.f5579e;
        if (fVar.c()) {
            androidx.webkit.internal.q.f(context, valueCallback);
        } else {
            if (!fVar.d()) {
                throw j1.a();
            }
            g().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }
}
