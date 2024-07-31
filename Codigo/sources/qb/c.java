package qb;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import jb.r;
import wb.p;

/* loaded from: classes2.dex */
public final class c implements r {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f23918c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final String f23919d = "c";

    /* renamed from: a, reason: collision with root package name */
    private final String f23920a;

    /* renamed from: b, reason: collision with root package name */
    private KeyStore f23921b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f23922a = null;

        /* renamed from: b, reason: collision with root package name */
        KeyStore f23923b;

        public a() {
            this.f23923b = null;
            if (!c.c()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f23923b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public c() {
        this(new a());
    }

    private c(a aVar) {
        this.f23920a = aVar.f23922a;
        this.f23921b = aVar.f23923b;
    }

    static /* synthetic */ boolean c() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        c cVar = new c();
        synchronized (f23918c) {
            if (cVar.f(str)) {
                return false;
            }
            e(str);
            return true;
        }
    }

    static void e(String str) {
        String b10 = wb.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(RecognitionOptions.QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    private static boolean g() {
        return true;
    }

    private static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static jb.a i(jb.a aVar) {
        byte[] c10 = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c10, aVar.b(aVar.a(c10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L15;
     */
    @Override // jb.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f23920a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.f23920a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.c.a(java.lang.String):boolean");
    }

    @Override // jb.r
    public synchronized jb.a b(String str) {
        String str2 = this.f23920a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f23920a, str));
        }
        return i(new b(wb.r.b("android-keystore://", str), this.f23921b));
    }

    synchronized boolean f(String str) {
        String b10;
        b10 = wb.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f23919d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f23921b = keyStore;
                keyStore.load(null);
                return this.f23921b.containsAlias(b10);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f23921b.containsAlias(b10);
    }
}
