package p141hf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.C6398n;
import gf.C7566h;
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
import p161if.C7968b;
import p161if.InterfaceC7967a;
import p485zb.C12867g;

/* renamed from: hf.e */
/* loaded from: classes2.dex */
public abstract class AbstractC7722e {

    /* renamed from: k */
    public static final Uri f18386k = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: l */
    static InterfaceC7967a f18387l = new C7968b();

    /* renamed from: a */
    protected Exception f18388a;

    /* renamed from: b */
    private C7566h f18389b;

    /* renamed from: c */
    private Context f18390c;

    /* renamed from: d */
    private Map<String, List<String>> f18391d;

    /* renamed from: e */
    private int f18392e;

    /* renamed from: f */
    private String f18393f;

    /* renamed from: g */
    private int f18394g;

    /* renamed from: h */
    private InputStream f18395h;

    /* renamed from: i */
    private HttpURLConnection f18396i;

    /* renamed from: j */
    private Map<String, String> f18397j = new HashMap();

    public AbstractC7722e(C7566h c7566h, C12867g c12867g) {
        C5276s.m13324j(c7566h);
        C5276s.m13324j(c12867g);
        this.f18389b = c7566h;
        this.f18390c = c12867g.m42630m();
        m23553G("x-firebase-gmpid", c12867g.m42632r().m42644c());
    }

    /* renamed from: A */
    private final void m23541A(String str, String str2) {
        m23551D(str, str2);
        try {
            m23542E();
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + mo23538e() + " " + mo23540u(), e10);
            this.f18388a = e10;
            this.f18392e = -2;
        }
        m23550C();
    }

    /* renamed from: E */
    private void m23542E() {
        if (m23568v()) {
            m23570z(this.f18395h);
        } else {
            m23569w(this.f18395h);
        }
    }

    /* renamed from: b */
    private void m23543b(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] mo23557h;
        int mo23558i;
        String str3;
        C5276s.m13324j(httpURLConnection);
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
        for (Map.Entry<String, String> entry : this.f18397j.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject mo23556g = mo23556g();
        if (mo23556g != null) {
            mo23557h = mo23556g.toString().getBytes("UTF-8");
            mo23558i = mo23557h.length;
        } else {
            mo23557h = mo23557h();
            mo23558i = mo23558i();
            if (mo23558i == 0 && mo23557h != null) {
                mo23558i = mo23557h.length;
            }
        }
        if (mo23557h == null || mo23557h.length <= 0) {
            str3 = "0";
        } else {
            if (mo23556g != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            str3 = Integer.toString(mo23558i);
        }
        httpURLConnection.setRequestProperty("Content-Length", str3);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (mo23557h == null || mo23557h.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(mo23557h, 0, mo23558i);
        } finally {
            bufferedOutputStream.close();
        }
    }

    /* renamed from: c */
    private HttpURLConnection m23544c() {
        Uri mo23540u = mo23540u();
        Map<String, String> mo23539l = mo23539l();
        if (mo23539l != null) {
            Uri.Builder buildUpon = mo23540u.buildUpon();
            for (Map.Entry<String, String> entry : mo23539l.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            mo23540u = buildUpon.build();
        }
        return f18387l.mo24501a(new URL(mo23540u.toString()));
    }

    /* renamed from: d */
    private boolean m23545d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f18388a = new SocketException("Network subsystem is unavailable");
        this.f18392e = -2;
        return false;
    }

    /* renamed from: k */
    private static String m23546k(Uri uri) {
        String path = uri.getPath();
        return path == null ? "" : path.startsWith("/") ? path.substring(1) : path;
    }

    /* renamed from: x */
    private void m23547x(InputStream inputStream) {
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
        this.f18393f = sb2.toString();
        if (m23568v()) {
            return;
        }
        this.f18388a = new IOException(this.f18393f);
    }

    /* renamed from: y */
    private void m23548y(HttpURLConnection httpURLConnection) {
        C5276s.m13324j(httpURLConnection);
        this.f18392e = httpURLConnection.getResponseCode();
        this.f18391d = httpURLConnection.getHeaderFields();
        this.f18394g = httpURLConnection.getContentLength();
        this.f18395h = m23568v() ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    /* renamed from: B */
    public void m23549B(String str, String str2, Context context) {
        if (m23545d(context)) {
            m23541A(str, str2);
        }
    }

    /* renamed from: C */
    public void m23550C() {
        HttpURLConnection httpURLConnection = this.f18396i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: D */
    public void m23551D(String str, String str2) {
        if (this.f18388a != null) {
            this.f18392e = -1;
            return;
        }
        if (Log.isLoggable("NetworkRequest", 3)) {
            Log.d("NetworkRequest", "sending network request " + mo23538e() + " " + mo23540u());
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f18390c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f18392e = -2;
            this.f18388a = new SocketException("Network subsystem is unavailable");
            return;
        }
        try {
            HttpURLConnection m23544c = m23544c();
            this.f18396i = m23544c;
            m23544c.setRequestMethod(mo23538e());
            m23543b(this.f18396i, str, str2);
            m23548y(this.f18396i);
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "network request result " + this.f18392e);
            }
        } catch (IOException e10) {
            Log.w("NetworkRequest", "error sending network request " + mo23538e() + " " + mo23540u(), e10);
            this.f18388a = e10;
            this.f18392e = -2;
        }
    }

    /* renamed from: F */
    public final void m23552F() {
        this.f18388a = null;
        this.f18392e = 0;
    }

    /* renamed from: G */
    public void m23553G(String str, String str2) {
        this.f18397j.put(str, str2);
    }

    /* renamed from: a */
    public <TResult> void m23554a(TaskCompletionSource<TResult> taskCompletionSource, TResult tresult) {
        Exception m23555f = m23555f();
        if (m23568v() && m23555f == null) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(C6398n.m17920e(m23555f, m23562o()));
        }
    }

    /* renamed from: e */
    protected abstract String mo23538e();

    /* renamed from: f */
    public Exception m23555f() {
        return this.f18388a;
    }

    /* renamed from: g */
    protected JSONObject mo23556g() {
        return null;
    }

    /* renamed from: h */
    protected byte[] mo23557h() {
        return null;
    }

    /* renamed from: i */
    protected int mo23558i() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public String m23559j() {
        return m23546k(this.f18389b.m22966a());
    }

    /* renamed from: l */
    protected Map<String, String> mo23539l() {
        return null;
    }

    /* renamed from: m */
    public String m23560m() {
        return this.f18393f;
    }

    /* renamed from: n */
    public JSONObject m23561n() {
        if (TextUtils.isEmpty(this.f18393f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f18393f);
        } catch (JSONException e10) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f18393f, e10);
            return new JSONObject();
        }
    }

    /* renamed from: o */
    public int m23562o() {
        return this.f18392e;
    }

    /* renamed from: p */
    public Map<String, List<String>> m23563p() {
        return this.f18391d;
    }

    /* renamed from: q */
    public String m23564q(String str) {
        List<String> list;
        Map<String, List<String>> m23563p = m23563p();
        if (m23563p == null || (list = m23563p.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: r */
    public int m23565r() {
        return this.f18394g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public C7566h m23566s() {
        return this.f18389b;
    }

    /* renamed from: t */
    public InputStream m23567t() {
        return this.f18395h;
    }

    /* renamed from: u */
    public Uri mo23540u() {
        return this.f18389b.m22968c();
    }

    /* renamed from: v */
    public boolean m23568v() {
        int i10 = this.f18392e;
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: w */
    protected void m23569w(InputStream inputStream) {
        m23547x(inputStream);
    }

    /* renamed from: z */
    protected void m23570z(InputStream inputStream) {
        m23547x(inputStream);
    }
}
