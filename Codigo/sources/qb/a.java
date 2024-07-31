package qb;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import jb.l;
import jb.n;
import jb.o;
import jb.q;
import wb.k;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f23903d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f23904e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final q f23905a;

    /* renamed from: b, reason: collision with root package name */
    private final jb.a f23906b;

    /* renamed from: c, reason: collision with root package name */
    private o f23907c;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f23908a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f23909b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f23910c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f23911d = null;

        /* renamed from: e, reason: collision with root package name */
        private jb.a f23912e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f23913f = true;

        /* renamed from: g, reason: collision with root package name */
        private l f23914g = null;

        /* renamed from: h, reason: collision with root package name */
        private o f23915h;

        private o g() {
            if (this.f23914g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o a10 = o.i().a(this.f23914g);
            o h10 = a10.h(a10.d().i().a0(0).a0());
            d dVar = new d(this.f23908a, this.f23909b, this.f23910c);
            if (this.f23912e != null) {
                h10.d().r(dVar, this.f23912e);
            } else {
                jb.c.b(h10.d(), dVar);
            }
            return h10;
        }

        private static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private o i(byte[] bArr) {
            return o.j(jb.c.a(jb.b.b(bArr)));
        }

        private o j(byte[] bArr) {
            try {
                this.f23912e = new c().b(this.f23911d);
                try {
                    return o.j(n.n(jb.b.b(bArr), this.f23912e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    o i10 = i(bArr);
                    Log.w(a.f23904e, "cannot use Android Keystore, it'll be disabled", e11);
                    return i10;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private jb.a k() {
            if (!a.b()) {
                Log.w(a.f23904e, "Android Keystore requires at least Android M");
                return null;
            }
            c cVar = new c();
            try {
                boolean d10 = c.d(this.f23911d);
                try {
                    return cVar.b(this.f23911d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!d10) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f23911d), e10);
                    }
                    Log.w(a.f23904e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f23904e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public synchronized a f() {
            o i10;
            a aVar;
            if (this.f23909b == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (a.f23903d) {
                byte[] h10 = h(this.f23908a, this.f23909b, this.f23910c);
                if (h10 == null) {
                    if (this.f23911d != null) {
                        this.f23912e = k();
                    }
                    i10 = g();
                } else {
                    if (this.f23911d != null && a.b()) {
                        i10 = j(h10);
                    }
                    i10 = i(h10);
                }
                this.f23915h = i10;
                aVar = new a(this);
            }
            return aVar;
        }

        public b l(l lVar) {
            this.f23914g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f23913f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f23911d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f23908a = context;
            this.f23909b = str;
            this.f23910c = str2;
            return this;
        }
    }

    private a(b bVar) {
        this.f23905a = new d(bVar.f23908a, bVar.f23909b, bVar.f23910c);
        this.f23906b = bVar.f23912e;
        this.f23907c = bVar.f23915h;
    }

    static /* synthetic */ boolean b() {
        return e();
    }

    private static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f23907c.d();
    }
}
