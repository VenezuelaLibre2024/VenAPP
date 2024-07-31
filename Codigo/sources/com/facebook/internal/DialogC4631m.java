package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
/* loaded from: classes.dex */
public final class DialogC4631m extends DialogC4644s0 {

    /* renamed from: B */
    public static final a f8751B = new a(null);

    /* renamed from: C */
    private static final String f8752C = DialogC4631m.class.getName();

    /* renamed from: A */
    private boolean f8753A;

    /* renamed from: com.facebook.internal.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final DialogC4631m m11247a(Context context, String url, String expectedRedirectUrl) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(url, "url");
            C9322n.m27781e(expectedRedirectUrl, "expectedRedirectUrl");
            DialogC4644s0.m11415s(context);
            return new DialogC4631m(context, url, expectedRedirectUrl, null);
        }
    }

    private DialogC4631m(Context context, String str, String str2) {
        super(context, str);
        m11417A(str2);
    }

    public /* synthetic */ DialogC4631m(Context context, String str, String str2, C9315g c9315g) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m11245F(DialogC4631m this$0) {
        C9322n.m27781e(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.DialogC4644s0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView m11419r = m11419r();
        if (!m11421u() || m11420t() || m11419r == null || !m11419r.isShown()) {
            super.cancel();
        } else {
            if (this.f8753A) {
                return;
            }
            this.f8753A = true;
            m11419r.loadUrl(C9322n.m27787k("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC4631m.m11245F(DialogC4631m.this);
                }
            }, 1500L);
        }
    }

    @Override // com.facebook.internal.DialogC4644s0
    /* renamed from: w */
    public Bundle mo11246w(String str) {
        Uri parse = Uri.parse(str);
        C4634n0 c4634n0 = C4634n0.f8760a;
        Bundle m11324p0 = C4634n0.m11324p0(parse.getQuery());
        String string = m11324p0.getString("bridge_args");
        m11324p0.remove("bridge_args");
        if (!C4634n0.m11300d0(string)) {
            try {
                m11324p0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C4611c.m11127a(new JSONObject(string)));
            } catch (JSONException e10) {
                C4634n0 c4634n02 = C4634n0.f8760a;
                C4634n0.m11316l0(f8752C, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = m11324p0.getString("method_results");
        m11324p0.remove("method_results");
        if (!C4634n0.m11300d0(string2)) {
            try {
                m11324p0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C4611c.m11127a(new JSONObject(string2)));
            } catch (JSONException e11) {
                C4634n0 c4634n03 = C4634n0.f8760a;
                C4634n0.m11316l0(f8752C, "Unable to parse bridge_args JSON", e11);
            }
        }
        m11324p0.remove("version");
        m11324p0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C4616e0.m11174t());
        return m11324p0;
    }
}
