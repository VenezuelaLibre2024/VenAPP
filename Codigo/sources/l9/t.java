package l9;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzcec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class t extends m9.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f21130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f21131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar, String str) {
        this.f21130a = str;
        this.f21131b = aVar;
    }

    @Override // m9.b
    public final void onFailure(String str) {
        WebView webView;
        zzcec.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f21130a, str);
        webView = this.f21131b.f21028b;
        webView.evaluateJavascript(format, null);
    }

    @Override // m9.b
    public final void onSuccess(m9.a aVar) {
        String format;
        WebView webView;
        String b10 = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f21130a);
            jSONObject.put("signal", b10);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f21130a, aVar.b());
        }
        webView = this.f21131b.f21028b;
        webView.evaluateJavascript(format, null);
    }
}
