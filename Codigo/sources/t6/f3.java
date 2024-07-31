package t6;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import t6.o;

/* loaded from: classes.dex */
public class f3 extends Exception implements o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26084c = t8.r0.r0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f26085d = t8.r0.r0(1);

    /* renamed from: e, reason: collision with root package name */
    private static final String f26086e = t8.r0.r0(2);

    /* renamed from: f, reason: collision with root package name */
    private static final String f26087f = t8.r0.r0(3);

    /* renamed from: r, reason: collision with root package name */
    private static final String f26088r = t8.r0.r0(4);

    /* renamed from: s, reason: collision with root package name */
    public static final o.a<f3> f26089s = new o.a() { // from class: t6.e3
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            return new f3(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f26090a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26091b;

    /* JADX INFO: Access modifiers changed from: protected */
    public f3(Bundle bundle) {
        this(bundle.getString(f26086e), d(bundle), bundle.getInt(f26084c, AdError.NETWORK_ERROR_CODE), bundle.getLong(f26085d, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f3(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f26090a = i10;
        this.f26091b = j10;
    }

    private static RemoteException b(String str) {
        return new RemoteException(str);
    }

    private static Throwable c(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable d(Bundle bundle) {
        String string = bundle.getString(f26087f);
        String string2 = bundle.getString(f26088r);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, f3.class.getClassLoader());
            Throwable c10 = Throwable.class.isAssignableFrom(cls) ? c(cls, string2) : null;
            if (c10 != null) {
                return c10;
            }
        } catch (Throwable unused) {
        }
        return b(string2);
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f26084c, this.f26090a);
        bundle.putLong(f26085d, this.f26091b);
        bundle.putString(f26086e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f26087f, cause.getClass().getName());
            bundle.putString(f26088r, cause.getMessage());
        }
        return bundle;
    }
}
