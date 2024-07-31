package androidx.webkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.internal.AbstractC1431a;
import androidx.webkit.internal.AbstractC1500z0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p073e2.C7115s;

/* renamed from: androidx.webkit.internal.j1 */
/* loaded from: classes.dex */
public class C1460j1 {

    /* renamed from: a */
    public static final AbstractC1431a.b f6424a = new AbstractC1431a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b */
    public static final AbstractC1431a.b f6426b = new AbstractC1431a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c */
    public static final AbstractC1431a.e f6428c = new AbstractC1431a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d */
    public static final AbstractC1431a.c f6429d = new AbstractC1431a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e */
    public static final AbstractC1431a.f f6430e = new AbstractC1431a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f */
    @Deprecated
    public static final AbstractC1431a.f f6431f = new AbstractC1431a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g */
    @Deprecated
    public static final AbstractC1431a.f f6432g = new AbstractC1431a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h */
    public static final AbstractC1431a.f f6433h = new AbstractC1431a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i */
    public static final AbstractC1431a.f f6434i = new AbstractC1431a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j */
    public static final AbstractC1431a.f f6435j = new AbstractC1431a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k */
    public static final AbstractC1431a.c f6436k = new AbstractC1431a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l */
    public static final AbstractC1431a.c f6437l = new AbstractC1431a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m */
    public static final AbstractC1431a.c f6438m = new AbstractC1431a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n */
    public static final AbstractC1431a.c f6439n = new AbstractC1431a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o */
    public static final AbstractC1431a.c f6440o = new AbstractC1431a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p */
    public static final AbstractC1431a.c f6441p = new AbstractC1431a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q */
    public static final AbstractC1431a.b f6442q = new AbstractC1431a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r */
    public static final AbstractC1431a.b f6443r = new AbstractC1431a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s */
    public static final AbstractC1431a.c f6444s = new AbstractC1431a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t */
    public static final AbstractC1431a.f f6445t = new AbstractC1431a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u */
    public static final AbstractC1431a.c f6446u = new AbstractC1431a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v */
    public static final AbstractC1431a.b f6447v = new AbstractC1431a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w */
    public static final AbstractC1431a.b f6448w = new AbstractC1431a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x */
    public static final AbstractC1431a.f f6449x = new AbstractC1431a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y */
    public static final AbstractC1431a.f f6450y = new AbstractC1431a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z */
    public static final AbstractC1431a.f f6451z = new AbstractC1431a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: A */
    public static final AbstractC1431a.b f6398A = new AbstractC1431a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B */
    public static final AbstractC1431a.b f6399B = new AbstractC1431a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C */
    public static final AbstractC1431a.d f6400C = new AbstractC1431a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D */
    public static final AbstractC1431a.b f6401D = new AbstractC1431a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E */
    public static final AbstractC1431a.b f6402E = new AbstractC1431a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F */
    public static final AbstractC1431a.b f6403F = new AbstractC1431a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G */
    public static final AbstractC1431a.b f6404G = new AbstractC1431a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H */
    public static final AbstractC1431a.e f6405H = new AbstractC1431a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I */
    public static final AbstractC1431a.e f6406I = new AbstractC1431a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J */
    public static final AbstractC1431a.h f6407J = new AbstractC1431a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K */
    public static final AbstractC1431a.h f6408K = new AbstractC1431a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L */
    public static final AbstractC1431a.g f6409L = new AbstractC1431a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M */
    public static final AbstractC1500z0.b f6410M = new AbstractC1500z0.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N */
    public static final AbstractC1500z0.a f6411N = new AbstractC1500z0.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O */
    public static final AbstractC1431a.h f6412O = new AbstractC1431a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: P */
    public static final AbstractC1431a.i f6413P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: Q */
    public static final AbstractC1431a.d f6414Q = new AbstractC1431a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: R */
    public static final AbstractC1431a.d f6415R = new AbstractC1431a.d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");

    /* renamed from: S */
    public static final AbstractC1431a.d f6416S = new AbstractC1431a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: T */
    public static final AbstractC1431a.h f6417T = new AbstractC1431a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: U */
    public static final AbstractC1431a.d f6418U = new AbstractC1431a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: V */
    public static final AbstractC1431a.d f6419V = new AbstractC1431a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: W */
    public static final AbstractC1431a.d f6420W = new AbstractC1431a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: X */
    public static final AbstractC1431a.d f6421X = new AbstractC1431a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: Y */
    public static final AbstractC1431a.d f6422Y = new AbstractC1431a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Z */
    public static final AbstractC1431a.d f6423Z = new AbstractC1431a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a0 */
    public static final AbstractC1431a.d f6425a0 = new AbstractC1431a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: b0 */
    public static final AbstractC1431a.d f6427b0 = new AbstractC1431a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: androidx.webkit.internal.j1$a */
    /* loaded from: classes.dex */
    class a extends AbstractC1431a.i {

        /* renamed from: d */
        private final Pattern f6452d;

        a(String str, String str2) {
            super(str, str2);
            this.f6452d = Pattern.compile("\\A\\d+");
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: d */
        public boolean mo8260d() {
            boolean mo8260d = super.mo8260d();
            if (!mo8260d || Build.VERSION.SDK_INT >= 29) {
                return mo8260d;
            }
            PackageInfo m20992e = C7115s.m20992e();
            if (m20992e == null) {
                return false;
            }
            Matcher matcher = this.f6452d.matcher(m20992e.versionName);
            return matcher.find() && Integer.parseInt(m20992e.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* renamed from: a */
    public static UnsupportedOperationException m8361a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: b */
    public static boolean m8362b(String str, Context context) {
        return m8363c(str, AbstractC1500z0.m8466g(), context);
    }

    /* renamed from: c */
    public static boolean m8363c(String str, Collection<AbstractC1500z0> collection, Context context) {
        HashSet hashSet = new HashSet();
        for (AbstractC1500z0 abstractC1500z0 : collection) {
            if (abstractC1500z0.m8467b().equals(str)) {
                hashSet.add(abstractC1500z0);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((AbstractC1500z0) it.next()).m8468d(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m8364d(String str) {
        return m8365e(str, AbstractC1431a.m8256e());
    }

    /* renamed from: e */
    public static <T extends InterfaceC1471n0> boolean m8365e(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.mo8258b().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1471n0) it.next()).mo8257a()) {
                return true;
            }
        }
        return false;
    }
}
