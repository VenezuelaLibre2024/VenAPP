package p309qb;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import p179jb.InterfaceC9009a;
import p179jb.InterfaceC9026r;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: qb.c */
/* loaded from: classes2.dex */
public final class C10417c implements InterfaceC9026r {

    /* renamed from: c */
    private static final Object f25960c = new Object();

    /* renamed from: d */
    private static final String f25961d = "c";

    /* renamed from: a */
    private final String f25962a;

    /* renamed from: b */
    private KeyStore f25963b;

    /* renamed from: qb.c$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        String f25964a = null;

        /* renamed from: b */
        KeyStore f25965b;

        public a() {
            this.f25965b = null;
            if (!C10417c.m31220c()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f25965b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C10417c() {
        this(new a());
    }

    private C10417c(a aVar) {
        this.f25962a = aVar.f25964a;
        this.f25963b = aVar.f25965b;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m31220c() {
        return m31223g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m31221d(String str) {
        C10417c c10417c = new C10417c();
        synchronized (f25960c) {
            if (c10417c.m31226f(str)) {
                return false;
            }
            m31222e(str);
            return true;
        }
    }

    /* renamed from: e */
    static void m31222e(String str) {
        String m38912b = C12146r.m38912b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(m38912b, 3).setKeySize(RecognitionOptions.QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* renamed from: g */
    private static boolean m31223g() {
        return true;
    }

    /* renamed from: h */
    private static void m31224h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: i */
    private static InterfaceC9009a m31225i(InterfaceC9009a interfaceC9009a) {
        byte[] m38907c = C12144p.m38907c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(m38907c, interfaceC9009a.mo26425b(interfaceC9009a.mo26424a(m38907c, bArr), bArr))) {
            return interfaceC9009a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L15;
     */
    @Override // p179jb.InterfaceC9026r
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean mo26492a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f25962a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.f25962a     // Catch: java.lang.Throwable -> L24
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
        throw new UnsupportedOperationException("Method not decompiled: p309qb.C10417c.mo26492a(java.lang.String):boolean");
    }

    @Override // p179jb.InterfaceC9026r
    /* renamed from: b */
    public synchronized InterfaceC9009a mo26493b(String str) {
        String str2 = this.f25962a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f25962a, str));
        }
        return m31225i(new C10416b(C12146r.m38912b("android-keystore://", str), this.f25963b));
    }

    /* renamed from: f */
    synchronized boolean m31226f(String str) {
        String m38912b;
        m38912b = C12146r.m38912b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f25961d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                m31224h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f25963b = keyStore;
                keyStore.load(null);
                return this.f25963b.containsAlias(m38912b);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f25963b.containsAlias(m38912b);
    }
}
