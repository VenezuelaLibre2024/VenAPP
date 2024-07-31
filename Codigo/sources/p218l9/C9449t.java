package p218l9;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzcec;
import org.json.JSONException;
import org.json.JSONObject;
import p237m9.AbstractC9555b;
import p237m9.C9554a;

/* renamed from: l9.t */
/* loaded from: classes.dex */
final class C9449t extends AbstractC9555b {

    /* renamed from: a */
    final /* synthetic */ String f22983a;

    /* renamed from: b */
    final /* synthetic */ C9411a f22984b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9449t(C9411a c9411a, String str) {
        this.f22983a = str;
        this.f22984b = c9411a;
    }

    @Override // p237m9.AbstractC9555b
    public final void onFailure(String str) {
        WebView webView;
        zzcec.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f22983a, str);
        webView = this.f22984b.f22859b;
        webView.evaluateJavascript(format, null);
    }

    @Override // p237m9.AbstractC9555b
    public final void onSuccess(C9554a c9554a) {
        String format;
        WebView webView;
        String m28446b = c9554a.m28446b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f22983a);
            jSONObject.put("signal", m28446b);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f22983a, c9554a.m28446b());
        }
        webView = this.f22984b.f22859b;
        webView.evaluateJavascript(format, null);
    }
}
