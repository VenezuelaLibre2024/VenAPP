package hc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class o {

    /* renamed from: f */
    private static final String f16691f = "hc.o";

    /* renamed from: a */
    private final Context f16692a;

    /* renamed from: b */
    private final String f16693b;

    /* renamed from: c */
    private final String f16694c;

    /* renamed from: d */
    private final String f16695d;

    /* renamed from: e */
    private final ee.b<od.i> f16696e;

    o(Context context, zb.p pVar, ee.b<od.i> bVar) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(bVar);
        this.f16692a = context;
        this.f16693b = pVar.b();
        this.f16694c = pVar.c();
        String g10 = pVar.g();
        this.f16695d = g10;
        if (g10 == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f16696e = bVar;
    }

    public o(zb.g gVar) {
        this(gVar.m(), gVar.r(), ((j) ec.e.e(gVar)).q());
    }

    private String d() {
        try {
            Context context = this.f16692a;
            byte[] a10 = la.a.a(context, context.getPackageName());
            if (a10 != null) {
                return la.k.c(a10, false);
            }
            Log.e(f16691f, "Could not get fingerprint hash for package: " + this.f16692a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f16691f, "No such package: " + this.f16692a.getPackageName(), e10);
            return null;
        }
    }

    private static String f(int i10) {
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

    private static final boolean g(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private String h(URL url, byte[] bArr, p pVar, boolean z10) {
        HttpURLConnection a10 = a(url);
        try {
            a10.setDoOutput(true);
            a10.setFixedLengthStreamingMode(bArr.length);
            a10.setRequestProperty("Content-Type", "application/json");
            String e10 = e();
            if (e10 != null) {
                a10.setRequestProperty("X-Firebase-Client", e10);
            }
            a10.setRequestProperty("X-Android-Package", this.f16692a.getPackageName());
            a10.setRequestProperty("X-Android-Cert", d());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a10.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = a10.getResponseCode();
                InputStream inputStream = g(responseCode) ? a10.getInputStream() : a10.getErrorStream();
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
                if (g(responseCode)) {
                    if (z10) {
                        pVar.c();
                    }
                    return sb3;
                }
                pVar.d(responseCode);
                n a11 = n.a(sb3);
                throw new zb.m("Error returned from API. code: " + a11.b() + " body: " + a11.c());
            } finally {
            }
        } finally {
            a10.disconnect();
        }
    }

    HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public a b(byte[] bArr, int i10, p pVar) {
        if (pVar.a()) {
            return a.a(h(new URL(String.format(f(i10), this.f16695d, this.f16694c, this.f16693b)), bArr, pVar, true));
        }
        throw new zb.m("Too many attempts.");
    }

    public String c(byte[] bArr, p pVar) {
        if (pVar.a()) {
            return h(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f16695d, this.f16694c, this.f16693b)), bArr, pVar, false);
        }
        throw new zb.m("Too many attempts.");
    }

    String e() {
        od.i iVar = this.f16696e.get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (Exception unused) {
                Log.w(f16691f, "Unable to get heartbeats!");
            }
        }
        return null;
    }
}
