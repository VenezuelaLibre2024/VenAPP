package e5;

import android.util.Base64;
import android.util.Log;
import ck.v;
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
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import mk.m;
import org.json.JSONObject;
import xk.d;
import xk.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f14487a = new c();

    /* renamed from: b */
    private static final String f14488b = "/.well-known/oauth/openid/keys/";

    private c() {
    }

    public static final PublicKey b(String key) {
        String A;
        String A2;
        String A3;
        n.e(key, "key");
        A = p.A(key, "\n", "", false, 4, null);
        A2 = p.A(A, "-----BEGIN PUBLIC KEY-----", "", false, 4, null);
        A3 = p.A(A2, "-----END PUBLIC KEY-----", "", false, 4, null);
        byte[] decode = Base64.decode(A3, 0);
        n.d(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        n.d(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: e5.b.<init>(java.net.URL, kotlin.jvm.internal.x, java.lang.String, java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Condition):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String c(java.lang.String r11) {
        /*
            java.lang.String r0 = "kid"
            kotlin.jvm.internal.n.e(r11, r0)
            java.lang.String r0 = "www."
            java.lang.String r1 = i4.e0.u()
            java.lang.String r0 = kotlin.jvm.internal.n.k(r0, r1)
            java.net.URL r2 = new java.net.URL
            java.lang.String r1 = "https"
            java.lang.String r3 = e5.c.f14488b
            r2.<init>(r1, r0, r3)
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            java.util.concurrent.locks.Condition r7 = r0.newCondition()
            kotlin.jvm.internal.x r8 = new kotlin.jvm.internal.x
            r8.<init>()
            java.util.concurrent.Executor r9 = i4.e0.t()
            e5.b r10 = new e5.b
            r1 = r10
            r3 = r8
            r4 = r11
            r5 = r0
            r6 = r7
            r1.<init>()
            r9.execute(r10)
            r0.lock()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L49
            r1 = 5000(0x1388, double:2.4703E-320)
            r7.await(r1, r11)     // Catch: java.lang.Throwable -> L49
            r0.unlock()
            T r11 = r8.f20759a
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L49:
            r11 = move-exception
            r0.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.c(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void d(URL openIdKeyUrl, x result, String kid, ReentrantLock lock, Condition condition) {
        n.e(openIdKeyUrl, "$openIdKeyUrl");
        n.e(result, "$result");
        n.e(kid, "$kid");
        n.e(lock, "$lock");
        URLConnection openConnection = openIdKeyUrl.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                n.d(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, d.f31393b);
                String d10 = m.d(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.f20759a = new JSONObject(d10).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
            } catch (Exception e10) {
                String name = f14487a.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    v vVar = v.f7137a;
                } finally {
                }
            }
            try {
                condition.signal();
                v vVar2 = v.f7137a;
            } finally {
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                v vVar3 = v.f7137a;
                throw th2;
            } finally {
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String data, String signature) {
        n.e(publicKey, "publicKey");
        n.e(data, "data");
        n.e(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(d.f31393b);
            n.d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            n.d(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
