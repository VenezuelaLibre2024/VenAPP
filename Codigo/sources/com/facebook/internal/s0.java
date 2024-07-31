package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.internal.s0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.a;
import i4.i0;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s0 extends Dialog {

    /* renamed from: x, reason: collision with root package name */
    public static final b f7839x = new b(null);

    /* renamed from: y, reason: collision with root package name */
    private static final int f7840y = com.facebook.common.e.f7693a;

    /* renamed from: z, reason: collision with root package name */
    private static volatile int f7841z;

    /* renamed from: a, reason: collision with root package name */
    private String f7842a;

    /* renamed from: b, reason: collision with root package name */
    private String f7843b;

    /* renamed from: c, reason: collision with root package name */
    private d f7844c;

    /* renamed from: d, reason: collision with root package name */
    private WebView f7845d;

    /* renamed from: e, reason: collision with root package name */
    private ProgressDialog f7846e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f7847f;

    /* renamed from: r, reason: collision with root package name */
    private FrameLayout f7848r;

    /* renamed from: s, reason: collision with root package name */
    private e f7849s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7850t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7851u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7852v;

    /* renamed from: w, reason: collision with root package name */
    private WindowManager.LayoutParams f7853w;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f7854a;

        /* renamed from: b, reason: collision with root package name */
        private String f7855b;

        /* renamed from: c, reason: collision with root package name */
        private String f7856c;

        /* renamed from: d, reason: collision with root package name */
        private int f7857d;

        /* renamed from: e, reason: collision with root package name */
        private d f7858e;

        /* renamed from: f, reason: collision with root package name */
        private Bundle f7859f;

        /* renamed from: g, reason: collision with root package name */
        private i4.a f7860g;

        public a(Context context, String action, Bundle bundle) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(action, "action");
            a.c cVar = i4.a.f16899w;
            this.f7860g = cVar.e();
            if (!cVar.g()) {
                String K = n0.K(context);
                if (K == null) {
                    throw new i4.r("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f7855b = K;
            }
            b(context, action, bundle);
        }

        public a(Context context, String str, String action, Bundle bundle) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(action, "action");
            this.f7855b = o0.k(str == null ? n0.K(context) : str, "applicationId");
            b(context, action, bundle);
        }

        private final void b(Context context, String str, Bundle bundle) {
            this.f7854a = context;
            this.f7856c = str;
            if (bundle != null) {
                this.f7859f = bundle;
            } else {
                this.f7859f = new Bundle();
            }
        }

        public s0 a() {
            i4.a aVar = this.f7860g;
            if (aVar != null) {
                Bundle bundle = this.f7859f;
                if (bundle != null) {
                    bundle.putString("app_id", aVar == null ? null : aVar.c());
                }
                Bundle bundle2 = this.f7859f;
                if (bundle2 != null) {
                    i4.a aVar2 = this.f7860g;
                    bundle2.putString("access_token", aVar2 != null ? aVar2.m() : null);
                }
            } else {
                Bundle bundle3 = this.f7859f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f7855b);
                }
            }
            b bVar = s0.f7839x;
            Context context = this.f7854a;
            if (context != null) {
                return bVar.c(context, this.f7856c, this.f7859f, this.f7857d, this.f7858e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String c() {
            return this.f7855b;
        }

        public final Context d() {
            return this.f7854a;
        }

        public final d e() {
            return this.f7858e;
        }

        public final Bundle f() {
            return this.f7859f;
        }

        public final int g() {
            return this.f7857d;
        }

        public final a h(d dVar) {
            this.f7858e = dVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a() {
            o0.l();
            return s0.f7841z;
        }

        protected final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && s0.f7841z == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final s0 c(Context context, String str, Bundle bundle, int i10, d dVar) {
            kotlin.jvm.internal.n.e(context, "context");
            s0.s(context);
            return new s0(context, str, bundle, i10, com.facebook.login.i0.FACEBOOK, dVar, null);
        }

        public final s0 d(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 targetApp, d dVar) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(targetApp, "targetApp");
            s0.s(context);
            return new s0(context, str, bundle, i10, targetApp, dVar, null);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                i10 = s0.f7840y;
            }
            s0.f7841z = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s0 f7861a;

        public c(s0 this$0) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            this.f7861a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.n.e(view, "view");
            kotlin.jvm.internal.n.e(url, "url");
            super.onPageFinished(view, url);
            if (!this.f7861a.f7851u && (progressDialog = this.f7861a.f7846e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f7861a.f7848r;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView r10 = this.f7861a.r();
            if (r10 != null) {
                r10.setVisibility(0);
            }
            ImageView imageView = this.f7861a.f7847f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f7861a.f7852v = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            kotlin.jvm.internal.n.e(view, "view");
            kotlin.jvm.internal.n.e(url, "url");
            n0 n0Var = n0.f7780a;
            n0.k0("FacebookSDK.WebDialog", kotlin.jvm.internal.n.k("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f7861a.f7851u || (progressDialog = this.f7861a.f7846e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            kotlin.jvm.internal.n.e(view, "view");
            kotlin.jvm.internal.n.e(description, "description");
            kotlin.jvm.internal.n.e(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f7861a.y(new i4.p(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            kotlin.jvm.internal.n.e(view, "view");
            kotlin.jvm.internal.n.e(handler, "handler");
            kotlin.jvm.internal.n.e(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f7861a.y(new i4.p(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean E;
            boolean E2;
            boolean J;
            int i10;
            kotlin.jvm.internal.n.e(view, "view");
            kotlin.jvm.internal.n.e(url, "url");
            n0 n0Var = n0.f7780a;
            n0.k0("FacebookSDK.WebDialog", kotlin.jvm.internal.n.k("Redirect URL: ", url));
            Uri parse = Uri.parse(url);
            boolean z10 = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            E = xk.p.E(url, this.f7861a.f7843b, false, 2, null);
            if (!E) {
                E2 = xk.p.E(url, "fbconnect://cancel", false, 2, null);
                if (E2) {
                    this.f7861a.cancel();
                    return true;
                }
                if (!z10) {
                    J = xk.q.J(url, "touch", false, 2, null);
                    if (!J) {
                        try {
                            this.f7861a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            return false;
                        }
                    }
                }
                return false;
            }
            Bundle w10 = this.f7861a.w(url);
            String string = w10.getString("error");
            if (string == null) {
                string = w10.getString("error_type");
            }
            String string2 = w10.getString("error_msg");
            if (string2 == null) {
                string2 = w10.getString("error_message");
            }
            if (string2 == null) {
                string2 = w10.getString("error_description");
            }
            String string3 = w10.getString("error_code");
            if (string3 != null && !n0.d0(string3)) {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!n0.d0(string) && n0.d0(string2) && i10 == -1) {
                    this.f7861a.z(w10);
                } else if ((string == null && (kotlin.jvm.internal.n.a(string, "access_denied") || kotlin.jvm.internal.n.a(string, "OAuthAccessDeniedException"))) || i10 == 4201) {
                    this.f7861a.cancel();
                } else {
                    this.f7861a.y(new i4.g0(new i4.u(i10, string, string2), string2));
                }
                return true;
            }
            i10 = -1;
            if (!n0.d0(string)) {
            }
            if (string == null) {
            }
            this.f7861a.y(new i4.g0(new i4.u(i10, string, string2), string2));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Bundle bundle, i4.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a, reason: collision with root package name */
        private final String f7862a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f7863b;

        /* renamed from: c, reason: collision with root package name */
        private Exception[] f7864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s0 f7865d;

        public e(s0 this$0, String action, Bundle parameters) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(action, "action");
            kotlin.jvm.internal.n.e(parameters, "parameters");
            this.f7865d = this$0;
            this.f7862a = action;
            this.f7863b = parameters;
            this.f7864c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(String[] results, int i10, e this$0, CountDownLatch latch, i4.n0 response) {
            i4.u b10;
            String str;
            kotlin.jvm.internal.n.e(results, "$results");
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(latch, "$latch");
            kotlin.jvm.internal.n.e(response, "response");
            try {
                b10 = response.b();
                str = "Error staging photo.";
            } catch (Exception e10) {
                this$0.f7864c[i10] = e10;
            }
            if (b10 != null) {
                String c10 = b10.c();
                if (c10 != null) {
                    str = c10;
                }
                throw new i4.s(response, str);
            }
            JSONObject c11 = response.c();
            if (c11 == null) {
                throw new i4.r("Error staging photo.");
            }
            String optString = c11.optString("uri");
            if (optString == null) {
                throw new i4.r("Error staging photo.");
            }
            results[i10] = optString;
            latch.countDown();
        }

        protected String[] b(Void... p02) {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.n.e(p02, "p0");
                    String[] stringArray = this.f7863b.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.f7864c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    i4.a e10 = i4.a.f16899w.e();
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            final int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (isCancelled()) {
                                    Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((i4.l0) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                Uri uri = Uri.parse(stringArray[i10]);
                                if (n0.f0(uri)) {
                                    strArr[i10] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    i0.b bVar = new i0.b() { // from class: com.facebook.internal.t0
                                        @Override // i4.i0.b
                                        public final void b(i4.n0 n0Var) {
                                            s0.e.c(strArr, i10, this, countDownLatch, n0Var);
                                        }
                                    };
                                    g5.a aVar = g5.a.f15770a;
                                    kotlin.jvm.internal.n.d(uri, "uri");
                                    concurrentLinkedQueue.add(g5.a.a(e10, uri, bVar).l());
                                }
                                if (i11 > length) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((i4.l0) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        }

        protected void d(String[] strArr) {
            List c10;
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.f7865d.f7846e;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    Exception[] excArr = this.f7864c;
                    int length = excArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        Exception exc = excArr[i10];
                        i10++;
                        if (exc != null) {
                            this.f7865d.y(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f7865d.y(new i4.r("Failed to stage photos for web dialog"));
                        return;
                    }
                    c10 = dk.l.c(strArr);
                    if (c10.contains(null)) {
                        this.f7865d.y(new i4.r("Failed to stage photos for web dialog"));
                        return;
                    }
                    n0 n0Var = n0.f7780a;
                    n0.q0(this.f7863b, "media", new JSONArray((Collection) c10));
                    this.f7865d.f7842a = n0.g(h0.b(), i4.e0.w() + "/dialog/" + this.f7862a, this.f7863b).toString();
                    ImageView imageView = this.f7865d.f7847f;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    this.f7865d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    return b(voidArr);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    d(strArr);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7866a;

        static {
            int[] iArr = new int[com.facebook.login.i0.valuesCustom().length];
            iArr[com.facebook.login.i0.INSTAGRAM.ordinal()] = 1;
            f7866a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends WebView {
        g(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(Context context, String url) {
        this(context, url, f7839x.a());
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(url, "url");
    }

    private s0(Context context, String str, int i10) {
        super(context, i10 == 0 ? f7839x.a() : i10);
        this.f7843b = "fbconnect://success";
        this.f7842a = str;
    }

    private s0(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 i0Var, d dVar) {
        super(context, i10 == 0 ? f7839x.a() : i10);
        String b10;
        String str2;
        this.f7843b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str3 = n0.X(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f7843b = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        bundle.putString("client_id", i4.e0.m());
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{i4.e0.B()}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f7844c = dVar;
        if (kotlin.jvm.internal.n.a(str, "share") && bundle.containsKey("media")) {
            this.f7849s = new e(this, str, bundle);
            return;
        }
        if (f.f7866a[i0Var.ordinal()] == 1) {
            b10 = h0.k();
            str2 = "oauth/authorize";
        } else {
            b10 = h0.b();
            str2 = i4.e0.w() + "/dialog/" + ((Object) str);
        }
        this.f7842a = n0.g(b10, str2, bundle).toString();
    }

    public /* synthetic */ s0(Context context, String str, Bundle bundle, int i10, com.facebook.login.i0 i0Var, d dVar, kotlin.jvm.internal.g gVar) {
        this(context, str, bundle, i10, i0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f7845d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f7845d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f7845d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c(this));
        }
        WebView webView3 = this.f7845d;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f7845d;
        if (webView4 != null) {
            String str = this.f7842a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.f7845d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f7845d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f7845d;
        WebSettings settings2 = webView7 == null ? null : webView7.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.f7845d;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.f7845d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f7845d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f7845d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.q0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean D;
                    D = s0.D(view, motionEvent);
                    return D;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f7845d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f7848r;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f7847f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s0.p(s0.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.a.f7675a);
        ImageView imageView2 = this.f7847f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f7847f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(s0 this$0, View view) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.cancel();
    }

    private final int q(int i10, float f10, int i11, int i12) {
        int i13 = (int) (i10 / f10);
        return (int) (i10 * (i13 <= i11 ? 1.0d : i13 >= i12 ? 0.5d : (((i12 - i13) / (i12 - i11)) * 0.5d) + 0.5d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void s(Context context) {
        f7839x.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(s0 this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(String expectedRedirectUrl) {
        kotlin.jvm.internal.n.e(expectedRedirectUrl, "expectedRedirectUrl");
        this.f7843b = expectedRedirectUrl;
    }

    public final void B(d dVar) {
        this.f7844c = dVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f7844c == null || this.f7850t) {
            return;
        }
        y(new i4.t());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f7845d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f7851u && (progressDialog = this.f7846e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f7851u = false;
        n0 n0Var = n0.f7780a;
        Context context = getContext();
        kotlin.jvm.internal.n.d(context, "context");
        if (n0.o0(context) && (layoutParams = this.f7853w) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f7853w;
                n0.k0("FacebookSDK.WebDialog", kotlin.jvm.internal.n.k("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f7846e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f7846e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.d.f7689d));
        }
        ProgressDialog progressDialog3 = this.f7846e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f7846e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.p0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    s0.v(s0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f7848r = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f7842a != null) {
            ImageView imageView = this.f7847f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f7848r;
        if (frameLayout != null) {
            frameLayout.addView(this.f7847f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f7848r;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f7851u = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.n.e(event, "event");
        if (i10 == 4) {
            WebView webView = this.f7845d;
            if (webView != null) {
                if (kotlin.jvm.internal.n.a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f7845d;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        e eVar = this.f7849s;
        if (eVar != null) {
            if ((eVar == null ? null : eVar.getStatus()) == AsyncTask.Status.PENDING) {
                e eVar2 = this.f7849s;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f7846e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e eVar = this.f7849s;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f7846e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.n.e(params, "params");
        if (params.token == null) {
            this.f7853w = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebView r() {
        return this.f7845d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        return this.f7850t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u() {
        return this.f7852v;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        n0 n0Var = n0.f7780a;
        Bundle p02 = n0.p0(parse.getQuery());
        p02.putAll(n0.p0(parse.getFragment()));
        return p02;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 < i11) {
            i10 = i11;
        }
        int min = Math.min(q(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i10, displayMetrics.density, 800, PlatformPlugin.DEFAULT_SYSTEM_UI), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    protected final void y(Throwable th2) {
        if (this.f7844c == null || this.f7850t) {
            return;
        }
        this.f7850t = true;
        i4.r rVar = th2 instanceof i4.r ? (i4.r) th2 : new i4.r(th2);
        d dVar = this.f7844c;
        if (dVar != null) {
            dVar.a(null, rVar);
        }
        dismiss();
    }

    protected final void z(Bundle bundle) {
        d dVar = this.f7844c;
        if (dVar == null || this.f7850t) {
            return;
        }
        this.f7850t = true;
        if (dVar != null) {
            dVar.a(bundle, null);
        }
        dismiss();
    }
}
