package p361t6;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import p361t6.InterfaceC11076o;
import p363t8.C11172r0;

/* renamed from: t6.f3 */
/* loaded from: classes.dex */
public class C11029f3 extends Exception implements InterfaceC11076o {

    /* renamed from: c */
    private static final String f28273c = C11172r0.m34945r0(0);

    /* renamed from: d */
    private static final String f28274d = C11172r0.m34945r0(1);

    /* renamed from: e */
    private static final String f28275e = C11172r0.m34945r0(2);

    /* renamed from: f */
    private static final String f28276f = C11172r0.m34945r0(3);

    /* renamed from: r */
    private static final String f28277r = C11172r0.m34945r0(4);

    /* renamed from: s */
    public static final InterfaceC11076o.a<C11029f3> f28278s = new InterfaceC11076o.a() { // from class: t6.e3
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            return new C11029f3(bundle);
        }
    };

    /* renamed from: a */
    public final int f28279a;

    /* renamed from: b */
    public final long f28280b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11029f3(Bundle bundle) {
        this(bundle.getString(f28275e), m34043d(bundle), bundle.getInt(f28273c, AdError.NETWORK_ERROR_CODE), bundle.getLong(f28274d, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C11029f3(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f28279a = i10;
        this.f28280b = j10;
    }

    /* renamed from: b */
    private static RemoteException m34041b(String str) {
        return new RemoteException(str);
    }

    /* renamed from: c */
    private static Throwable m34042c(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    /* renamed from: d */
    private static Throwable m34043d(Bundle bundle) {
        String string = bundle.getString(f28276f);
        String string2 = bundle.getString(f28277r);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C11029f3.class.getClassLoader());
            Throwable m34042c = Throwable.class.isAssignableFrom(cls) ? m34042c(cls, string2) : null;
            if (m34042c != null) {
                return m34042c;
            }
        } catch (Throwable unused) {
        }
        return m34041b(string2);
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f28273c, this.f28279a);
        bundle.putLong(f28274d, this.f28280b);
        bundle.putString(f28275e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f28276f, cause.getClass().getName());
            bundle.putString(f28277r, cause.getMessage());
        }
        return bundle;
    }
}
