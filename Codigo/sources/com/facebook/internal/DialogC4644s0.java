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
import com.facebook.common.C4601a;
import com.facebook.common.C4604d;
import com.facebook.common.C4605e;
import com.facebook.internal.DialogC4644s0;
import com.facebook.login.EnumC4670i0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7019l;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p117g5.C7448a;
import p152i4.AsyncTaskC7813l0;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7803g0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.C7820p;
import p152i4.C7824r;
import p152i4.C7826s;
import p152i4.C7828t;
import p152i4.C7830u;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: com.facebook.internal.s0 */
/* loaded from: classes.dex */
public class DialogC4644s0 extends Dialog {

    /* renamed from: x */
    public static final b f8819x = new b(null);

    /* renamed from: y */
    private static final int f8820y = C4605e.f8668a;

    /* renamed from: z */
    private static volatile int f8821z;

    /* renamed from: a */
    private String f8822a;

    /* renamed from: b */
    private String f8823b;

    /* renamed from: c */
    private d f8824c;

    /* renamed from: d */
    private WebView f8825d;

    /* renamed from: e */
    private ProgressDialog f8826e;

    /* renamed from: f */
    private ImageView f8827f;

    /* renamed from: r */
    private FrameLayout f8828r;

    /* renamed from: s */
    private e f8829s;

    /* renamed from: t */
    private boolean f8830t;

    /* renamed from: u */
    private boolean f8831u;

    /* renamed from: v */
    private boolean f8832v;

    /* renamed from: w */
    private WindowManager.LayoutParams f8833w;

    /* renamed from: com.facebook.internal.s0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private Context f8834a;

        /* renamed from: b */
        private String f8835b;

        /* renamed from: c */
        private String f8836c;

        /* renamed from: d */
        private int f8837d;

        /* renamed from: e */
        private d f8838e;

        /* renamed from: f */
        private Bundle f8839f;

        /* renamed from: g */
        private C7787a f8840g;

        public a(Context context, String action, Bundle bundle) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(action, "action");
            C7787a.c cVar = C7787a.f18552w;
            this.f8840g = cVar.m23782e();
            if (!cVar.m23784g()) {
                String m11278K = C4634n0.m11278K(context);
                if (m11278K == null) {
                    throw new C7824r("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f8835b = m11278K;
            }
            m11425b(context, action, bundle);
        }

        public a(Context context, String str, String action, Bundle bundle) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(action, "action");
            this.f8835b = C4636o0.m11360k(str == null ? C4634n0.m11278K(context) : str, "applicationId");
            m11425b(context, action, bundle);
        }

        /* renamed from: b */
        private final void m11425b(Context context, String str, Bundle bundle) {
            this.f8834a = context;
            this.f8836c = str;
            if (bundle != null) {
                this.f8839f = bundle;
            } else {
                this.f8839f = new Bundle();
            }
        }

        /* renamed from: a */
        public DialogC4644s0 mo11426a() {
            C7787a c7787a = this.f8840g;
            if (c7787a != null) {
                Bundle bundle = this.f8839f;
                if (bundle != null) {
                    bundle.putString("app_id", c7787a == null ? null : c7787a.m23761c());
                }
                Bundle bundle2 = this.f8839f;
                if (bundle2 != null) {
                    C7787a c7787a2 = this.f8840g;
                    bundle2.putString("access_token", c7787a2 != null ? c7787a2.m23770m() : null);
                }
            } else {
                Bundle bundle3 = this.f8839f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f8835b);
                }
            }
            b bVar = DialogC4644s0.f8819x;
            Context context = this.f8834a;
            if (context != null) {
                return bVar.m11435c(context, this.f8836c, this.f8839f, this.f8837d, this.f8838e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: c */
        public final String m11427c() {
            return this.f8835b;
        }

        /* renamed from: d */
        public final Context m11428d() {
            return this.f8834a;
        }

        /* renamed from: e */
        public final d m11429e() {
            return this.f8838e;
        }

        /* renamed from: f */
        public final Bundle m11430f() {
            return this.f8839f;
        }

        /* renamed from: g */
        public final int m11431g() {
            return this.f8837d;
        }

        /* renamed from: h */
        public final a m11432h(d dVar) {
            this.f8838e = dVar;
            return this;
        }
    }

    /* renamed from: com.facebook.internal.s0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final int m11433a() {
            C4636o0.m11361l();
            return DialogC4644s0.f8821z;
        }

        /* renamed from: b */
        protected final void m11434b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && DialogC4644s0.f8821z == 0) {
                    m11437e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        /* renamed from: c */
        public final DialogC4644s0 m11435c(Context context, String str, Bundle bundle, int i10, d dVar) {
            C9322n.m27781e(context, "context");
            DialogC4644s0.m11415s(context);
            return new DialogC4644s0(context, str, bundle, i10, EnumC4670i0.FACEBOOK, dVar, null);
        }

        /* renamed from: d */
        public final DialogC4644s0 m11436d(Context context, String str, Bundle bundle, int i10, EnumC4670i0 targetApp, d dVar) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(targetApp, "targetApp");
            DialogC4644s0.m11415s(context);
            return new DialogC4644s0(context, str, bundle, i10, targetApp, dVar, null);
        }

        /* renamed from: e */
        public final void m11437e(int i10) {
            if (i10 == 0) {
                i10 = DialogC4644s0.f8820y;
            }
            DialogC4644s0.f8821z = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.s0$c */
    /* loaded from: classes.dex */
    public final class c extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ DialogC4644s0 f8841a;

        public c(DialogC4644s0 this$0) {
            C9322n.m27781e(this$0, "this$0");
            this.f8841a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            C9322n.m27781e(view, "view");
            C9322n.m27781e(url, "url");
            super.onPageFinished(view, url);
            if (!this.f8841a.f8831u && (progressDialog = this.f8841a.f8826e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f8841a.f8828r;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView m11419r = this.f8841a.m11419r();
            if (m11419r != null) {
                m11419r.setVisibility(0);
            }
            ImageView imageView = this.f8841a.f8827f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f8841a.f8832v = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            C9322n.m27781e(view, "view");
            C9322n.m27781e(url, "url");
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11314k0("FacebookSDK.WebDialog", C9322n.m27787k("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f8841a.f8831u || (progressDialog = this.f8841a.f8826e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i10, String description, String failingUrl) {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(description, "description");
            C9322n.m27781e(failingUrl, "failingUrl");
            super.onReceivedError(view, i10, description, failingUrl);
            this.f8841a.m11423y(new C7820p(description, i10, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(handler, "handler");
            C9322n.m27781e(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f8841a.m11423y(new C7820p(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean m41031E;
            boolean m41031E2;
            boolean m41059J;
            int i10;
            C9322n.m27781e(view, "view");
            C9322n.m27781e(url, "url");
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11314k0("FacebookSDK.WebDialog", C9322n.m27787k("Redirect URL: ", url));
            Uri parse = Uri.parse(url);
            boolean z10 = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            m41031E = C12524p.m41031E(url, this.f8841a.f8823b, false, 2, null);
            if (!m41031E) {
                m41031E2 = C12524p.m41031E(url, "fbconnect://cancel", false, 2, null);
                if (m41031E2) {
                    this.f8841a.cancel();
                    return true;
                }
                if (!z10) {
                    m41059J = C12525q.m41059J(url, "touch", false, 2, null);
                    if (!m41059J) {
                        try {
                            this.f8841a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            return false;
                        }
                    }
                }
                return false;
            }
            Bundle mo11246w = this.f8841a.mo11246w(url);
            String string = mo11246w.getString("error");
            if (string == null) {
                string = mo11246w.getString("error_type");
            }
            String string2 = mo11246w.getString("error_msg");
            if (string2 == null) {
                string2 = mo11246w.getString("error_message");
            }
            if (string2 == null) {
                string2 = mo11246w.getString("error_description");
            }
            String string3 = mo11246w.getString("error_code");
            if (string3 != null && !C4634n0.m11300d0(string3)) {
                try {
                    i10 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!C4634n0.m11300d0(string) && C4634n0.m11300d0(string2) && i10 == -1) {
                    this.f8841a.m11424z(mo11246w);
                } else if ((string == null && (C9322n.m27777a(string, "access_denied") || C9322n.m27777a(string, "OAuthAccessDeniedException"))) || i10 == 4201) {
                    this.f8841a.cancel();
                } else {
                    this.f8841a.m11423y(new C7803g0(new C7830u(i10, string, string2), string2));
                }
                return true;
            }
            i10 = -1;
            if (!C4634n0.m11300d0(string)) {
            }
            if (string == null) {
            }
            this.f8841a.m11423y(new C7803g0(new C7830u(i10, string, string2), string2));
            return true;
        }
    }

    /* renamed from: com.facebook.internal.s0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo11207a(Bundle bundle, C7824r c7824r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.s0$e */
    /* loaded from: classes.dex */
    public final class e extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private final String f8842a;

        /* renamed from: b */
        private final Bundle f8843b;

        /* renamed from: c */
        private Exception[] f8844c;

        /* renamed from: d */
        final /* synthetic */ DialogC4644s0 f8845d;

        public e(DialogC4644s0 this$0, String action, Bundle parameters) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(action, "action");
            C9322n.m27781e(parameters, "parameters");
            this.f8845d = this$0;
            this.f8842a = action;
            this.f8843b = parameters;
            this.f8844c = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m11439c(String[] results, int i10, e this$0, CountDownLatch latch, C7817n0 response) {
            C7830u m24061b;
            String str;
            C9322n.m27781e(results, "$results");
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(latch, "$latch");
            C9322n.m27781e(response, "response");
            try {
                m24061b = response.m24061b();
                str = "Error staging photo.";
            } catch (Exception e10) {
                this$0.f8844c[i10] = e10;
            }
            if (m24061b != null) {
                String m24100c = m24061b.m24100c();
                if (m24100c != null) {
                    str = m24100c;
                }
                throw new C7826s(response, str);
            }
            JSONObject m24062c = response.m24062c();
            if (m24062c == null) {
                throw new C7824r("Error staging photo.");
            }
            String optString = m24062c.optString("uri");
            if (optString == null) {
                throw new C7824r("Error staging photo.");
            }
            results[i10] = optString;
            latch.countDown();
        }

        /* renamed from: b */
        protected String[] m11440b(Void... p02) {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    C9322n.m27781e(p02, "p0");
                    String[] stringArray = this.f8843b.getStringArray("media");
                    if (stringArray == null) {
                        return null;
                    }
                    final String[] strArr = new String[stringArray.length];
                    this.f8844c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    C7787a m23782e = C7787a.f18552w.m23782e();
                    try {
                        int length = stringArray.length - 1;
                        if (length >= 0) {
                            final int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (isCancelled()) {
                                    Iterator it = concurrentLinkedQueue.iterator();
                                    while (it.hasNext()) {
                                        ((AsyncTaskC7813l0) it.next()).cancel(true);
                                    }
                                    return null;
                                }
                                Uri uri = Uri.parse(stringArray[i10]);
                                if (C4634n0.m11304f0(uri)) {
                                    strArr[i10] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    C7807i0.b bVar = new C7807i0.b() { // from class: com.facebook.internal.t0
                                        @Override // p152i4.C7807i0.b
                                        /* renamed from: b */
                                        public final void mo9121b(C7817n0 c7817n0) {
                                            DialogC4644s0.e.m11439c(strArr, i10, this, countDownLatch, c7817n0);
                                        }
                                    };
                                    C7448a c7448a = C7448a.f17352a;
                                    C9322n.m27780d(uri, "uri");
                                    concurrentLinkedQueue.add(C7448a.m22498a(m23782e, uri, bVar).m23950l());
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
                            ((AsyncTaskC7813l0) it2.next()).cancel(true);
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        }

        /* renamed from: d */
        protected void m11441d(String[] strArr) {
            List m20435c;
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.f8845d.f8826e;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    Exception[] excArr = this.f8844c;
                    int length = excArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        Exception exc = excArr[i10];
                        i10++;
                        if (exc != null) {
                            this.f8845d.m11423y(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f8845d.m11423y(new C7824r("Failed to stage photos for web dialog"));
                        return;
                    }
                    m20435c = C7019l.m20435c(strArr);
                    if (m20435c.contains(null)) {
                        this.f8845d.m11423y(new C7824r("Failed to stage photos for web dialog"));
                        return;
                    }
                    C4634n0 c4634n0 = C4634n0.f8760a;
                    C4634n0.m11326q0(this.f8843b, "media", new JSONArray((Collection) m20435c));
                    this.f8845d.f8822a = C4634n0.m11305g(C4622h0.m11211b(), C7799e0.m23871w() + "/dialog/" + this.f8842a, this.f8843b).toString();
                    ImageView imageView = this.f8845d.f8827f;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    this.f8845d.m11396C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    return m11440b(voidArr);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    m11441d(strArr);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        }
    }

    /* renamed from: com.facebook.internal.s0$f */
    /* loaded from: classes.dex */
    public /* synthetic */ class f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8846a;

        static {
            int[] iArr = new int[EnumC4670i0.valuesCustom().length];
            iArr[EnumC4670i0.INSTAGRAM.ordinal()] = 1;
            f8846a = iArr;
        }
    }

    /* renamed from: com.facebook.internal.s0$g */
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
    public DialogC4644s0(Context context, String url) {
        this(context, url, f8819x.m11433a());
        C9322n.m27781e(context, "context");
        C9322n.m27781e(url, "url");
    }

    private DialogC4644s0(Context context, String str, int i10) {
        super(context, i10 == 0 ? f8819x.m11433a() : i10);
        this.f8823b = "fbconnect://success";
        this.f8822a = str;
    }

    private DialogC4644s0(Context context, String str, Bundle bundle, int i10, EnumC4670i0 enumC4670i0, d dVar) {
        super(context, i10 == 0 ? f8819x.m11433a() : i10);
        String m11211b;
        String str2;
        this.f8823b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str3 = C4634n0.m11290X(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f8823b = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C7799e0.m23861m());
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C7799e0.m23829B()}, 1));
        C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f8824c = dVar;
        if (C9322n.m27777a(str, "share") && bundle.containsKey("media")) {
            this.f8829s = new e(this, str, bundle);
            return;
        }
        if (f.f8846a[enumC4670i0.ordinal()] == 1) {
            m11211b = C4622h0.m11220k();
            str2 = "oauth/authorize";
        } else {
            m11211b = C4622h0.m11211b();
            str2 = C7799e0.m23871w() + "/dialog/" + ((Object) str);
        }
        this.f8822a = C4634n0.m11305g(m11211b, str2, bundle).toString();
    }

    public /* synthetic */ DialogC4644s0(Context context, String str, Bundle bundle, int i10, EnumC4670i0 enumC4670i0, d dVar, C9315g c9315g) {
        this(context, str, bundle, i10, enumC4670i0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m11396C(int i10) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f8825d = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f8825d;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f8825d;
        if (webView2 != null) {
            webView2.setWebViewClient(new c(this));
        }
        WebView webView3 = this.f8825d;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f8825d;
        if (webView4 != null) {
            String str = this.f8822a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.f8825d;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f8825d;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f8825d;
        WebSettings settings2 = webView7 == null ? null : webView7.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.f8825d;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.f8825d;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f8825d;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f8825d;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.q0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m11397D;
                    m11397D = DialogC4644s0.m11397D(view, motionEvent);
                    return m11397D;
                }
            });
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f8825d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f8828r;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final boolean m11397D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* renamed from: o */
    private final void m11412o() {
        ImageView imageView = new ImageView(getContext());
        this.f8827f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4644s0.m11413p(DialogC4644s0.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(C4601a.f8650a);
        ImageView imageView2 = this.f8827f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f8827f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m11413p(DialogC4644s0 this$0, View view) {
        C9322n.m27781e(this$0, "this$0");
        this$0.cancel();
    }

    /* renamed from: q */
    private final int m11414q(int i10, float f10, int i11, int i12) {
        int i13 = (int) (i10 / f10);
        return (int) (i10 * (i13 <= i11 ? 1.0d : i13 >= i12 ? 0.5d : (((i12 - i13) / (i12 - i11)) * 0.5d) + 0.5d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public static final void m11415s(Context context) {
        f8819x.m11434b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m11416v(DialogC4644s0 this$0, DialogInterface dialogInterface) {
        C9322n.m27781e(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final void m11417A(String expectedRedirectUrl) {
        C9322n.m27781e(expectedRedirectUrl, "expectedRedirectUrl");
        this.f8823b = expectedRedirectUrl;
    }

    /* renamed from: B */
    public final void m11418B(d dVar) {
        this.f8824c = dVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f8824c == null || this.f8830t) {
            return;
        }
        m11423y(new C7828t());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f8825d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f8831u && (progressDialog = this.f8826e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f8831u = false;
        C4634n0 c4634n0 = C4634n0.f8760a;
        Context context = getContext();
        C9322n.m27780d(context, "context");
        if (C4634n0.m11322o0(context) && (layoutParams = this.f8833w) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f8833w;
                C4634n0.m11314k0("FacebookSDK.WebDialog", C9322n.m27787k("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f8826e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f8826e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(C4604d.f8664d));
        }
        ProgressDialog progressDialog3 = this.f8826e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f8826e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.p0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    DialogC4644s0.m11416v(DialogC4644s0.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f8828r = new FrameLayout(getContext());
        m11422x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        m11412o();
        if (this.f8822a != null) {
            ImageView imageView = this.f8827f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m11396C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f8828r;
        if (frameLayout != null) {
            frameLayout.addView(this.f8827f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f8828r;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f8831u = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        C9322n.m27781e(event, "event");
        if (i10 == 4) {
            WebView webView = this.f8825d;
            if (webView != null) {
                if (C9322n.m27777a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f8825d;
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
        e eVar = this.f8829s;
        if (eVar != null) {
            if ((eVar == null ? null : eVar.getStatus()) == AsyncTask.Status.PENDING) {
                e eVar2 = this.f8829s;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f8826e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        m11422x();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        e eVar = this.f8829s;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f8826e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        C9322n.m27781e(params, "params");
        if (params.token == null) {
            this.f8833w = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final WebView m11419r() {
        return this.f8825d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean m11420t() {
        return this.f8830t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean m11421u() {
        return this.f8832v;
    }

    /* renamed from: w */
    public Bundle mo11246w(String str) {
        Uri parse = Uri.parse(str);
        C4634n0 c4634n0 = C4634n0.f8760a;
        Bundle m11324p0 = C4634n0.m11324p0(parse.getQuery());
        m11324p0.putAll(C4634n0.m11324p0(parse.getFragment()));
        return m11324p0;
    }

    /* renamed from: x */
    public final void m11422x() {
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
        int min = Math.min(m11414q(i12, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(m11414q(i10, displayMetrics.density, 800, PlatformPlugin.DEFAULT_SYSTEM_UI), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    /* renamed from: y */
    protected final void m11423y(Throwable th2) {
        if (this.f8824c == null || this.f8830t) {
            return;
        }
        this.f8830t = true;
        C7824r c7824r = th2 instanceof C7824r ? (C7824r) th2 : new C7824r(th2);
        d dVar = this.f8824c;
        if (dVar != null) {
            dVar.mo11207a(null, c7824r);
        }
        dismiss();
    }

    /* renamed from: z */
    protected final void m11424z(Bundle bundle) {
        d dVar = this.f8824c;
        if (dVar == null || this.f8830t) {
            return;
        }
        this.f8830t = true;
        if (dVar != null) {
            dVar.mo11207a(bundle, null);
        }
        dismiss();
    }
}
