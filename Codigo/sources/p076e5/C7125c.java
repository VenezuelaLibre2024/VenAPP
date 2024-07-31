package p076e5;

import android.util.Base64;
import android.util.Log;
import ck.C2037v;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import mk.C9613m;
import org.json.JSONObject;
import p152i4.C7799e0;
import p450xk.C12512d;
import p450xk.C12524p;

/* renamed from: e5.c */
/* loaded from: classes.dex */
public final class C7125c {

    /* renamed from: a */
    public static final C7125c f15859a = new C7125c();

    /* renamed from: b */
    private static final String f15860b = "/.well-known/oauth/openid/keys/";

    private C7125c() {
    }

    /* renamed from: b */
    public static final PublicKey m21023b(String key) {
        String m41027A;
        String m41027A2;
        String m41027A3;
        C9322n.m27781e(key, "key");
        m41027A = C12524p.m41027A(key, "\n", "", false, 4, null);
        m41027A2 = C12524p.m41027A(m41027A, "-----BEGIN PUBLIC KEY-----", "", false, 4, null);
        m41027A3 = C12524p.m41027A(m41027A2, "-----END PUBLIC KEY-----", "", false, 4, null);
        byte[] decode = Base64.decode(m41027A3, 0);
        C9322n.m27780d(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        C9322n.m27780d(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final String m21024c(final String kid) {
        C9322n.m27781e(kid, "kid");
        final URL url = new URL("https", C9322n.m27787k("www.", C7799e0.m23869u()), f15860b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final C9332x c9332x = new C9332x();
        C7799e0.m23868t().execute(new Runnable() { // from class: e5.b
            @Override // java.lang.Runnable
            public final void run() {
                C7125c.m21025d(url, c9332x, kid, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c9332x.f22581a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* renamed from: d */
    public static final void m21025d(URL openIdKeyUrl, C9332x result, String kid, ReentrantLock lock, Condition condition) {
        C9322n.m27781e(openIdKeyUrl, "$openIdKeyUrl");
        C9322n.m27781e(result, "$result");
        C9322n.m27781e(kid, "$kid");
        C9322n.m27781e(lock, "$lock");
        URLConnection openConnection = openIdKeyUrl.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                C9322n.m27780d(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, C12512d.f33913b);
                String m28609d = C9613m.m28609d(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.f22581a = new JSONObject(m28609d).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
            } catch (Exception e10) {
                String name = f15859a.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    C2037v c2037v = C2037v.f8089a;
                } finally {
                }
            }
            try {
                condition.signal();
                C2037v c2037v2 = C2037v.f8089a;
            } finally {
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                C2037v c2037v3 = C2037v.f8089a;
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static final boolean m21026e(PublicKey publicKey, String data, String signature) {
        C9322n.m27781e(publicKey, "publicKey");
        C9322n.m27781e(data, "data");
        C9322n.m27781e(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(C12512d.f33913b);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            C9322n.m27780d(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
