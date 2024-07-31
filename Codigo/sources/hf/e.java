package hf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.n;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Uri f16736k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l, reason: collision with root package name */
    static p003if.a f16737l = new p003if.b();

    /* renamed from: a, reason: collision with root package name */
    protected Exception f16738a;

    /* renamed from: b, reason: collision with root package name */
    private gf.h f16739b;

    /* renamed from: c, reason: collision with root package name */
    private Context f16740c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f16741d;

    /* renamed from: e, reason: collision with root package name */
    private int f16742e;

    /* renamed from: f, reason: collision with root package name */
    private String f16743f;

    /* renamed from: g, reason: collision with root package name */
    private int f16744g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f16745h;

    /* renamed from: i, reason: collision with root package name */
    private HttpURLConnection f16746i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, String> f16747j = new HashMap();

    public e(gf.h hVar, zb.g gVar) {
        s.j(hVar);
        s.j(gVar);
        this.f16739b = hVar;
        this.f16740c = gVar.m();
        G("x-firebase-gmpid", gVar.r().c());
    }

    private final void A(String str, String str2) {
        D(str, str2);
        try {
            E();
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + u(), e10);
            this.f16738a = e10;
            this.f16742e = -2;
        }
        C();
    }

    private void E() {
        if (v()) {
            z(this.f16745h);
        } else {
            w(this.f16745h);
        }
    }

    private void b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] h10;
        int i10;
        String str3;
        s.j(httpURLConnection);
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        }
        if (TextUtils.isEmpty(str2)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/20.3.0");
        for (Map.Entry<String, String> entry : this.f16747j.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject g10 = g();
        if (g10 != null) {
            h10 = g10.toString().getBytes("UTF-8");
            i10 = h10.length;
        } else {
            h10 = h();
            i10 = i();
            if (i10 == 0 && h10 != null) {
                i10 = h10.length;
            }
        }
        if (h10 == null || h10.length <= 0) {
            str3 = "0";
        } else {
            if (g10 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            str3 = Integer.toString(i10);
        }
        httpURLConnection.setRequestProperty("Content-Length", str3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (h10 == null || h10.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(h10, 0, i10);
        } finally {
            bufferedOutputStream.close();
        }
    }

    private HttpURLConnection c() {
        Uri u10 = u();
        Map<String, String> l10 = l();
        if (l10 != null) {
            Uri.Builder buildUpon = u10.buildUpon();
            for (Map.Entry<String, String> entry : l10.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            u10 = buildUpon.build();
        }
        return f16737l.a(new URL(u10.toString()));
    }

    private boolean d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f16738a = new SocketException("Network subsystem is unavailable");
        this.f16742e = -2;
        return false;
    }

    private static String k(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    private void x(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb2.append(readLine);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f16743f = sb2.toString();
        if (v()) {
            return;
        }
        this.f16738a = new IOException(this.f16743f);
    }

    private void y(HttpURLConnection httpURLConnection) {
        s.j(httpURLConnection);
        this.f16742e = httpURLConnection.getResponseCode();
        this.f16741d = httpURLConnection.getHeaderFields();
        this.f16744g = httpURLConnection.getContentLength();
        this.f16745h = v() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    public void B(String str, String str2, Context context) {
        if (d(context)) {
            A(str, str2);
        }
    }

    public void C() {
        HttpURLConnection httpURLConnection = this.f16746i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void D(String str, String str2) {
        if (this.f16738a != null) {
            this.f16742e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + e() + " " + u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16740c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f16742e = -2;
            this.f16738a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection c10 = c();
            this.f16746i = c10;
            c10.setRequestMethod(e());
            b(this.f16746i, str, str2);
            y(this.f16746i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f16742e);
            }
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + e() + " " + u(), e10);
            this.f16738a = e10;
            this.f16742e = -2;
        }
    }

    public final void F() {
        this.f16738a = null;
        this.f16742e = 0;
    }

    public void G(String str, String str2) {
        this.f16747j.put(str, str2);
    }

    public <TResult> void a(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception f10 = f();
        if (v() && f10 == null) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(n.e(f10, o()));
        }
    }

    protected abstract String e();

    public Exception f() {
        return this.f16738a;
    }

    protected JSONObject g() {
        return null;
    }

    protected byte[] h() {
        return null;
    }

    protected int i() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        return k(this.f16739b.a());
    }

    protected Map<String, String> l() {
        return null;
    }

    public String m() {
        return this.f16743f;
    }

    public JSONObject n() {
        if (TextUtils.isEmpty(this.f16743f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f16743f);
        } catch (JSONException e10) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f16743f, e10);
            return new JSONObject();
        }
    }

    public int o() {
        return this.f16742e;
    }

    public Map<String, List<String>> p() {
        return this.f16741d;
    }

    public String q(String str) {
        List<String> list;
        Map<String, List<String>> p10 = p();
        if (p10 == null || (list = p10.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public int r() {
        return this.f16744g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gf.h s() {
        return this.f16739b;
    }

    public InputStream t() {
        return this.f16745h;
    }

    public Uri u() {
        return this.f16739b.c();
    }

    public boolean v() {
        int i10 = this.f16742e;
        return i10 >= 200 && i10 < 300;
    }

    protected void w(InputStream inputStream) {
        x(inputStream);
    }

    protected void z(InputStream inputStream) {
        x(inputStream);
    }
}
