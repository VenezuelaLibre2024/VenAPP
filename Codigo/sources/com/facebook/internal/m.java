package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends s0 {
    public static final a B = new a(null);
    private static final String C = m.class.getName();
    private boolean A;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m a(Context context, String url, String expectedRedirectUrl) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(url, "url");
            kotlin.jvm.internal.n.e(expectedRedirectUrl, "expectedRedirectUrl");
            s0.s(context);
            return new m(context, url, expectedRedirectUrl, null);
        }
    }

    private m(Context context, String str, String str2) {
        super(context, str);
        A(str2);
    }

    public /* synthetic */ m(Context context, String str, String str2, kotlin.jvm.internal.g gVar) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(m this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.s0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView r10 = r();
        if (!u() || t() || r10 == null || !r10.isShown()) {
            super.cancel();
        } else {
            if (this.A) {
                return;
            }
            this.A = true;
            r10.loadUrl(kotlin.jvm.internal.n.k("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.F(m.this);
                }
            }, 1500L);
        }
    }

    @Override // com.facebook.internal.s0
    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        n0 n0Var = n0.f7780a;
        Bundle p02 = n0.p0(parse.getQuery());
        String string = p02.getString("bridge_args");
        p02.remove("bridge_args");
        if (!n0.d0(string)) {
            try {
                p02.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(string)));
            } catch (JSONException e10) {
                n0 n0Var2 = n0.f7780a;
                n0.l0(C, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = p02.getString("method_results");
        p02.remove("method_results");
        if (!n0.d0(string2)) {
            try {
                p02.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                n0 n0Var3 = n0.f7780a;
                n0.l0(C, "Unable to parse bridge_args JSON", e11);
            }
        }
        p02.remove("version");
        p02.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", e0.t());
        return p02;
    }
}
