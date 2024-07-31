package p138hc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Tasks;
import ec.AbstractC7175e;
import ee.InterfaceC7183b;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import la.C9456a;
import la.C9466k;
import p273od.InterfaceC9919i;
import p485zb.C12867g;
import p485zb.C12873m;
import p485zb.C12876p;

/* renamed from: hc.o */
/* loaded from: classes.dex */
public class C7708o {

    /* renamed from: f */
    private static final String f18341f = "hc.o";

    /* renamed from: a */
    private final Context f18342a;

    /* renamed from: b */
    private final String f18343b;

    /* renamed from: c */
    private final String f18344c;

    /* renamed from: d */
    private final String f18345d;

    /* renamed from: e */
    private final InterfaceC7183b<InterfaceC9919i> f18346e;

    C7708o(Context context, C12876p c12876p, InterfaceC7183b<InterfaceC9919i> interfaceC7183b) {
        C5276s.m13324j(context);
        C5276s.m13324j(c12876p);
        C5276s.m13324j(interfaceC7183b);
        this.f18342a = context;
        this.f18343b = c12876p.m42643b();
        this.f18344c = c12876p.m42644c();
        String m42648g = c12876p.m42648g();
        this.f18345d = m42648g;
        if (m42648g == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f18346e = interfaceC7183b;
    }

    public C7708o(C12867g c12867g) {
        this(c12867g.m42630m(), c12867g.m42632r(), ((C7703j) AbstractC7175e.m21371e(c12867g)).m23460q());
    }

    /* renamed from: d */
    private String m23473d() {
        try {
            Context context = this.f18342a;
            byte[] m28113a = C9456a.m28113a(context, context.getPackageName());
            if (m28113a != null) {
                return C9466k.m28155c(m28113a, false);
            }
            Log.e(f18341f, "Could not get fingerprint hash for package: " + this.f18342a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f18341f, "No such package: " + this.f18342a.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: f */
    private static String m23474f(int i10) {
        if (i10 == 1) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeSafetyNetToken?key=%s";
        }
        if (i10 == 2) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        if (i10 == 3) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        throw new IllegalArgumentException("Unknown token type.");
    }

    /* renamed from: g */
    private static final boolean m23475g(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: h */
    private String m23476h(URL url, byte[] bArr, C7709p c7709p, boolean z10) {
        HttpURLConnection m23477a = m23477a(url);
        try {
            m23477a.setDoOutput(true);
            m23477a.setFixedLengthStreamingMode(bArr.length);
            m23477a.setRequestProperty("Content-Type", "application/json");
            String m23480e = m23480e();
            if (m23480e != null) {
                m23477a.setRequestProperty("X-Firebase-Client", m23480e);
            }
            m23477a.setRequestProperty("X-Android-Package", this.f18342a.getPackageName());
            m23477a.setRequestProperty("X-Android-Cert", m23473d());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m23477a.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = m23477a.getResponseCode();
                InputStream inputStream = m23475g(responseCode) ? m23477a.getInputStream() : m23477a.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } finally {
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (m23475g(responseCode)) {
                    if (z10) {
                        c7709p.m23483c();
                    }
                    return sb3;
                }
                c7709p.m23484d(responseCode);
                C7707n m23470a = C7707n.m23470a(sb3);
                throw new C12873m("Error returned from API. code: " + m23470a.m23471b() + " body: " + m23470a.m23472c());
            } finally {
            }
        } finally {
            m23477a.disconnect();
        }
    }

    /* renamed from: a */
    HttpURLConnection m23477a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: b */
    public C7694a m23478b(byte[] bArr, int i10, C7709p c7709p) {
        if (c7709p.m23482a()) {
            return C7694a.m23429a(m23476h(new URL(String.format(m23474f(i10), this.f18345d, this.f18344c, this.f18343b)), bArr, c7709p, true));
        }
        throw new C12873m("Too many attempts.");
    }

    /* renamed from: c */
    public String m23479c(byte[] bArr, C7709p c7709p) {
        if (c7709p.m23482a()) {
            return m23476h(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f18345d, this.f18344c, this.f18343b)), bArr, c7709p, false);
        }
        throw new C12873m("Too many attempts.");
    }

    /* renamed from: e */
    String m23480e() {
        InterfaceC9919i interfaceC9919i = this.f18346e.get();
        if (interfaceC9919i != null) {
            try {
                return (String) Tasks.await(interfaceC9919i.mo29636a());
            } catch (Exception unused) {
                Log.w(f18341f, "Unable to get heartbeats!");
            }
        }
        return null;
    }
}
