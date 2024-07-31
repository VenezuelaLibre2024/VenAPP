package ie;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C6197d;
import ee.InterfaceC7183b;
import ie.AbstractC7964d;
import ie.AbstractC7966f;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import la.C9456a;
import la.C9466k;
import org.json.JSONException;
import org.json.JSONObject;
import p273od.InterfaceC9919i;

/* renamed from: ie.c */
/* loaded from: classes.dex */
public class C7963c {

    /* renamed from: d */
    private static final Pattern f19346d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    private static final Charset f19347e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f19348a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC9919i> f19349b;

    /* renamed from: c */
    private final C7965e f19350c = new C7965e();

    public C7963c(Context context, InterfaceC7183b<InterfaceC9919i> interfaceC7183b) {
        this.f19348a = context;
        this.f19349b = interfaceC7183b;
    }

    /* renamed from: a */
    private static String m24473a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m24474b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: c */
    private static JSONObject m24475c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: g */
    private String m24476g() {
        try {
            Context context = this.f19348a;
            byte[] m28113a = C9456a.m28113a(context, context.getPackageName());
            if (m28113a != null) {
                return C9466k.m28155c(m28113a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f19348a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f19348a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: h */
    private URL m24477h(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C6197d(e10.getMessage(), C6197d.a.UNAVAILABLE);
        }
    }

    /* renamed from: i */
    private static byte[] m24478i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: j */
    private static boolean m24479j(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: k */
    private static void m24480k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: l */
    private static void m24481l(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String m24485p = m24485p(httpURLConnection);
        if (TextUtils.isEmpty(m24485p)) {
            return;
        }
        Log.w("Firebase-Installations", m24485p);
        Log.w("Firebase-Installations", m24473a(str, str2, str3));
    }

    /* renamed from: m */
    private HttpURLConnection m24482m(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f19348a.getPackageName());
            InterfaceC9919i interfaceC9919i = this.f19349b.get();
            if (interfaceC9919i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(interfaceC9919i.mo29636a()));
                } catch (InterruptedException e10) {
                    e = e10;
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", m24476g());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                } catch (ExecutionException e11) {
                    e = e11;
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", m24476g());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m24476g());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
        }
    }

    /* renamed from: n */
    static long m24483n(String str) {
        C5276s.m13316b(f19346d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: o */
    private AbstractC7964d m24484o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f19347e));
        AbstractC7966f.a m24500a = AbstractC7966f.m24500a();
        AbstractC7964d.a m24493a = AbstractC7964d.m24493a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                m24493a.mo24465f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                m24493a.mo24462c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                m24493a.mo24463d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(Constants.TOKEN)) {
                        m24500a.mo24471c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        m24500a.mo24472d(m24483n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                m24493a.mo24461b(m24500a.mo24469a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m24493a.mo24464e(AbstractC7964d.b.OK).mo24460a();
    }

    /* renamed from: p */
    private static String m24485p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f19347e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th2;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    /* renamed from: q */
    private AbstractC7966f m24486q(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f19347e));
        AbstractC7966f.a m24500a = AbstractC7966f.m24500a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(Constants.TOKEN)) {
                m24500a.mo24471c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                m24500a.mo24472d(m24483n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return m24500a.mo24470b(AbstractC7966f.b.OK).mo24469a();
    }

    /* renamed from: r */
    private void m24487r(HttpURLConnection httpURLConnection, String str, String str2) {
        m24489t(httpURLConnection, m24478i(m24474b(str, str2)));
    }

    /* renamed from: s */
    private void m24488s(HttpURLConnection httpURLConnection) {
        m24489t(httpURLConnection, m24478i(m24475c()));
    }

    /* renamed from: t */
    private static void m24489t(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public AbstractC7964d m24490d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC7964d m24484o;
        if (!this.f19350c.m24498b()) {
            throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
        }
        URL m24477h = m24477h(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m24482m = m24482m(m24477h, str);
            try {
                try {
                    m24482m.setRequestMethod("POST");
                    m24482m.setDoOutput(true);
                    if (str5 != null) {
                        m24482m.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m24487r(m24482m, str2, str4);
                    responseCode = m24482m.getResponseCode();
                    this.f19350c.m24499f(responseCode);
                } finally {
                    m24482m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (m24479j(responseCode)) {
                m24484o = m24484o(m24482m);
            } else {
                m24481l(m24482m, str4, str, str3);
                if (responseCode == 429) {
                    throw new C6197d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C6197d.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    m24480k();
                    m24484o = AbstractC7964d.m24493a().mo24464e(AbstractC7964d.b.BAD_CONFIG).mo24460a();
                } else {
                    m24482m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            return m24484o;
        }
        throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
    }

    /* renamed from: e */
    public void m24491e(String str, String str2, String str3, String str4) {
        int responseCode;
        int i10 = 0;
        URL m24477h = m24477h(String.format("projects/%s/installations/%s", str3, str2));
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection m24482m = m24482m(m24477h, str);
            try {
                m24482m.setRequestMethod("DELETE");
                m24482m.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = m24482m.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                m24482m.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                m24481l(m24482m, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    m24480k();
                    throw new C6197d("Bad config while trying to delete FID", C6197d.a.BAD_CONFIG);
                    break;
                }
                i10++;
                m24482m.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m24482m.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
    }

    /* renamed from: f */
    public AbstractC7966f m24492f(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC7966f m24486q;
        AbstractC7966f.a mo24470b;
        if (!this.f19350c.m24498b()) {
            throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
        }
        URL m24477h = m24477h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m24482m = m24482m(m24477h, str);
            try {
                try {
                    m24482m.setRequestMethod("POST");
                    m24482m.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m24482m.setDoOutput(true);
                    m24488s(m24482m);
                    responseCode = m24482m.getResponseCode();
                    this.f19350c.m24499f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (m24479j(responseCode)) {
                    m24486q = m24486q(m24482m);
                } else {
                    m24481l(m24482m, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new C6197d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C6197d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m24480k();
                            mo24470b = AbstractC7966f.m24500a().mo24470b(AbstractC7966f.b.BAD_CONFIG);
                            m24486q = mo24470b.mo24469a();
                        } else {
                            m24482m.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    mo24470b = AbstractC7966f.m24500a().mo24470b(AbstractC7966f.b.AUTH_ERROR);
                    m24486q = mo24470b.mo24469a();
                }
                return m24486q;
            } finally {
                m24482m.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C6197d("Firebase Installations Service is unavailable. Please try again later.", C6197d.a.UNAVAILABLE);
    }
}
