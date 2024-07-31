package p036c4;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p246n3.InterfaceC9647m;

/* renamed from: c4.l */
/* loaded from: classes.dex */
public final class C1871l {

    /* renamed from: a */
    private static final char[] f7804a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f7805b = new char[64];

    /* renamed from: c */
    private static volatile Handler f7806c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c4.l$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7807a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f7807a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7807a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7807a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f7807a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7807a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private C1871l() {
    }

    /* renamed from: a */
    public static void m9952a() {
        if (!m9968q()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m9953b() {
        if (!m9969r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m9954c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof InterfaceC9647m ? ((InterfaceC9647m) obj).m28909a(obj2) : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m9955d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m9956e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f7804a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m9957f(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: g */
    public static int m9958g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m9960i(config);
    }

    /* renamed from: h */
    public static int m9959h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    public static int m9960i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f7807a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    /* renamed from: j */
    public static <T> List<T> m9961j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static Handler m9962k() {
        if (f7806c == null) {
            synchronized (C1871l.class) {
                if (f7806c == null) {
                    f7806c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f7806c;
    }

    /* renamed from: l */
    public static int m9963l(float f10) {
        return m9964m(f10, 17);
    }

    /* renamed from: m */
    public static int m9964m(float f10, int i10) {
        return m9965n(Float.floatToIntBits(f10), i10);
    }

    /* renamed from: n */
    public static int m9965n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    /* renamed from: o */
    public static int m9966o(Object obj, int i10) {
        return m9965n(obj == null ? 0 : obj.hashCode(), i10);
    }

    /* renamed from: p */
    public static int m9967p(boolean z10, int i10) {
        return m9965n(z10 ? 1 : 0, i10);
    }

    /* renamed from: q */
    public static boolean m9968q() {
        return !m9969r();
    }

    /* renamed from: r */
    public static boolean m9969r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    public static boolean m9970s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m9971t(int i10, int i11) {
        return m9970s(i10) && m9970s(i11);
    }

    /* renamed from: u */
    public static void m9972u(Runnable runnable) {
        m9962k().post(runnable);
    }

    /* renamed from: v */
    public static void m9973v(Runnable runnable) {
        m9962k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m9974w(byte[] bArr) {
        String m9956e;
        char[] cArr = f7805b;
        synchronized (cArr) {
            m9956e = m9956e(bArr, cArr);
        }
        return m9956e;
    }
}
