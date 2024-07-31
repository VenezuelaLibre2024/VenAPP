package p309qb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p179jb.C9010b;
import p179jb.C9011c;
import p179jb.C9020l;
import p179jb.C9022n;
import p179jb.C9023o;
import p179jb.InterfaceC9009a;
import p179jb.InterfaceC9025q;
import p419wb.C12139k;

/* renamed from: qb.a */
/* loaded from: classes2.dex */
public final class C10415a {

    /* renamed from: d */
    private static final Object f25945d = new Object();

    /* renamed from: e */
    private static final String f25946e = "a";

    /* renamed from: a */
    private final InterfaceC9025q f25947a;

    /* renamed from: b */
    private final InterfaceC9009a f25948b;

    /* renamed from: c */
    private C9023o f25949c;

    /* renamed from: qb.a$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Context f25950a = null;

        /* renamed from: b */
        private String f25951b = null;

        /* renamed from: c */
        private String f25952c = null;

        /* renamed from: d */
        private String f25953d = null;

        /* renamed from: e */
        private InterfaceC9009a f25954e = null;

        /* renamed from: f */
        private boolean f25955f = true;

        /* renamed from: g */
        private C9020l f25956g = null;

        /* renamed from: h */
        private C9023o f25957h;

        /* renamed from: g */
        private C9023o m31208g() {
            if (this.f25956g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            C9023o m26486a = C9023o.m26484i().m26486a(this.f25956g);
            C9023o m26489h = m26486a.m26489h(m26486a.m26488d().m26474i().m37381a0(0).m37394a0());
            C10418d c10418d = new C10418d(this.f25950a, this.f25951b, this.f25952c);
            if (this.f25954e != null) {
                m26489h.m26488d().m26477r(c10418d, this.f25954e);
            } else {
                C9011c.m26429b(m26489h.m26488d(), c10418d);
            }
            return m26489h;
        }

        /* renamed from: h */
        private static byte[] m31209h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return C12139k.m38898a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        /* renamed from: i */
        private C9023o m31210i(byte[] bArr) {
            return C9023o.m26485j(C9011c.m26428a(C9010b.m26426b(bArr)));
        }

        /* renamed from: j */
        private C9023o m31211j(byte[] bArr) {
            try {
                this.f25954e = new C10417c().mo26493b(this.f25953d);
                try {
                    return C9023o.m26485j(C9022n.m26470n(C9010b.m26426b(bArr), this.f25954e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return m31210i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    C9023o m31210i = m31210i(bArr);
                    Log.w(C10415a.f25946e, "cannot use Android Keystore, it'll be disabled", e11);
                    return m31210i;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        /* renamed from: k */
        private InterfaceC9009a m31212k() {
            if (!C10415a.m31199b()) {
                Log.w(C10415a.f25946e, "Android Keystore requires at least Android M");
                return null;
            }
            C10417c c10417c = new C10417c();
            try {
                boolean m31221d = C10417c.m31221d(this.f25953d);
                try {
                    return c10417c.mo26493b(this.f25953d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!m31221d) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f25953d), e10);
                    }
                    Log.w(C10415a.f25946e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(C10415a.f25946e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        /* renamed from: f */
        public synchronized C10415a m31213f() {
            C9023o m31210i;
            C10415a c10415a;
            if (this.f25951b == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C10415a.f25945d) {
                byte[] m31209h = m31209h(this.f25950a, this.f25951b, this.f25952c);
                if (m31209h == null) {
                    if (this.f25953d != null) {
                        this.f25954e = m31212k();
                    }
                    m31210i = m31208g();
                } else {
                    if (this.f25953d != null && C10415a.m31199b()) {
                        m31210i = m31211j(m31209h);
                    }
                    m31210i = m31210i(m31209h);
                }
                this.f25957h = m31210i;
                c10415a = new C10415a(this);
            }
            return c10415a;
        }

        /* renamed from: l */
        public b m31214l(C9020l c9020l) {
            this.f25956g = c9020l;
            return this;
        }

        /* renamed from: m */
        public b m31215m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f25955f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f25953d = str;
            return this;
        }

        /* renamed from: n */
        public b m31216n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f25950a = context;
            this.f25951b = str;
            this.f25952c = str2;
            return this;
        }
    }

    private C10415a(b bVar) {
        this.f25947a = new C10418d(bVar.f25950a, bVar.f25951b, bVar.f25952c);
        this.f25948b = bVar.f25954e;
        this.f25949c = bVar.f25957h;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m31199b() {
        return m31201e();
    }

    /* renamed from: e */
    private static boolean m31201e() {
        return true;
    }

    /* renamed from: d */
    public synchronized C9022n m31202d() {
        return this.f25949c.m26488d();
    }
}
