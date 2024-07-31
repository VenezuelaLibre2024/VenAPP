package rl;

import com.google.android.gms.common.api.a;
import dk.e0;
import dk.k0;
import dk.m;
import dk.s;
import dk.z;
import dm.e;
import dm.o;
import dm.x;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import ql.b0;
import ql.c0;
import ql.d0;
import ql.r;
import ql.t;
import ql.u;
import ql.y;
import uk.l;
import xk.f;
import xk.p;
import xk.q;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final byte[] f25039a;

    /* renamed from: b */
    public static final t f25040b = t.f24358b.g(new String[0]);

    /* renamed from: c */
    public static final d0 f25041c;

    /* renamed from: d */
    public static final b0 f25042d;

    /* renamed from: e */
    private static final o f25043e;

    /* renamed from: f */
    public static final TimeZone f25044f;

    /* renamed from: g */
    private static final f f25045g;

    /* renamed from: h */
    public static final boolean f25046h;

    /* renamed from: i */
    public static final String f25047i;

    static {
        String n02;
        String o02;
        byte[] bArr = new byte[0];
        f25039a = bArr;
        f25041c = d0.a.c(d0.f24214a, bArr, null, 1, null);
        f25042d = b0.a.e(b0.f24156a, bArr, null, 0, 0, 7, null);
        o.a aVar = o.f14311d;
        e.a aVar2 = e.f14291d;
        f25043e = aVar.d(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        n.b(timeZone);
        f25044f = timeZone;
        f25045g = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f25046h = false;
        String name = y.class.getName();
        n.d(name, "OkHttpClient::class.java.name");
        n02 = q.n0(name, "okhttp3.");
        o02 = q.o0(n02, "Client");
        f25047i = o02;
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        n.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char charAt = str.charAt(i12);
                if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12 = i13;
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        n.e(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator<? super String> comparator) {
        n.e(strArr, "<this>");
        n.e(other, "other");
        n.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = other.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = other[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean F(Socket socket, dm.d source) {
        n.e(socket, "<this>");
        n.e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.G0();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean G(String name) {
        boolean r10;
        boolean r11;
        boolean r12;
        boolean r13;
        n.e(name, "name");
        r10 = p.r(name, "Authorization", true);
        if (r10) {
            return true;
        }
        r11 = p.r(name, "Cookie", true);
        if (r11) {
            return true;
        }
        r12 = p.r(name, "Proxy-Authorization", true);
        if (r12) {
            return true;
        }
        r13 = p.r(name, "Set-Cookie", true);
        return r13;
    }

    public static final int H(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset I(dm.d dVar, Charset charset) {
        Charset charset2;
        String str;
        n.e(dVar, "<this>");
        n.e(charset, "default");
        int n12 = dVar.n1(f25043e);
        if (n12 == -1) {
            return charset;
        }
        if (n12 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (n12 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (n12 != 2) {
                if (n12 == 3) {
                    return xk.d.f31392a.a();
                }
                if (n12 == 4) {
                    return xk.d.f31392a.b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        n.d(charset2, str);
        return charset2;
    }

    public static final int J(dm.d dVar) {
        n.e(dVar, "<this>");
        return d(dVar.readByte(), 255) | (d(dVar.readByte(), 255) << 16) | (d(dVar.readByte(), 255) << 8);
    }

    public static final int K(dm.b bVar, byte b10) {
        n.e(bVar, "<this>");
        int i10 = 0;
        while (!bVar.G0() && bVar.l(0L) == b10) {
            i10++;
            bVar.readByte();
        }
        return i10;
    }

    public static final boolean L(x xVar, int i10, TimeUnit timeUnit) {
        n.e(xVar, "<this>");
        n.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = xVar.m().e() ? xVar.m().c() - nanoTime : Long.MAX_VALUE;
        xVar.m().d(Math.min(c10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            dm.b bVar = new dm.b();
            while (xVar.s1(bVar, 8192L) != -1) {
                bVar.b();
            }
            dm.y m10 = xVar.m();
            if (c10 == Long.MAX_VALUE) {
                m10.a();
            } else {
                m10.d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            dm.y m11 = xVar.m();
            if (c10 == Long.MAX_VALUE) {
                m11.a();
            } else {
                m11.d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th2) {
            dm.y m12 = xVar.m();
            if (c10 == Long.MAX_VALUE) {
                m12.a();
            } else {
                m12.d(nanoTime + c10);
            }
            throw th2;
        }
    }

    public static final ThreadFactory M(String name, boolean z10) {
        n.e(name, "name");
        return new ThreadFactory() { // from class: rl.b

            /* renamed from: a */
            public final /* synthetic */ String f25036a;

            /* renamed from: b */
            public final /* synthetic */ boolean f25037b;

            public /* synthetic */ b(String name2, boolean z102) {
                r1 = name2;
                r2 = z102;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread N;
                N = d.N(r1, r2, runnable);
                return N;
            }
        };
    }

    public static final Thread N(String name, boolean z10, Runnable runnable) {
        n.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<yl.c> O(t tVar) {
        uk.f k10;
        int r10;
        n.e(tVar, "<this>");
        k10 = l.k(0, tVar.size());
        r10 = s.r(k10, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator<Integer> it = k10.iterator();
        while (it.hasNext()) {
            int nextInt = ((e0) it).nextInt();
            arrayList.add(new yl.c(tVar.d(nextInt), tVar.l(nextInt)));
        }
        return arrayList;
    }

    public static final t P(List<yl.c> list) {
        n.e(list, "<this>");
        t.a aVar = new t.a();
        for (yl.c cVar : list) {
            aVar.c(cVar.a().F(), cVar.b().F());
        }
        return aVar.e();
    }

    public static final String Q(u uVar, boolean z10) {
        boolean J;
        String h10;
        n.e(uVar, "<this>");
        J = q.J(uVar.h(), ":", false, 2, null);
        if (J) {
            h10 = '[' + uVar.h() + ']';
        } else {
            h10 = uVar.h();
        }
        if (!z10 && uVar.m() == u.f24361k.c(uVar.q())) {
            return h10;
        }
        return h10 + ':' + uVar.m();
    }

    public static /* synthetic */ String R(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Q(uVar, z10);
    }

    public static final <T> List<T> S(List<? extends T> list) {
        List h02;
        n.e(list, "<this>");
        h02 = z.h0(list);
        List<T> unmodifiableList = Collections.unmodifiableList(h02);
        n.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> T(Map<K, ? extends V> map) {
        Map<K, V> h10;
        n.e(map, "<this>");
        if (map.isEmpty()) {
            h10 = k0.h();
            return h10;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        n.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long U(String str, long j10) {
        n.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int V(String str, int i10) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (valueOf == null) {
            return i10;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String W(String str, int i10, int i11) {
        n.e(str, "<this>");
        int z10 = z(str, i10, i11);
        String substring = str.substring(z10, B(str, z10, i11));
        n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String X(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return W(str, i10, i11);
    }

    public static final Throwable Y(Exception exc, List<? extends Exception> suppressed) {
        n.e(exc, "<this>");
        n.e(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ck.b.a(exc, it.next());
        }
        return exc;
    }

    public static final void Z(dm.c cVar, int i10) {
        n.e(cVar, "<this>");
        cVar.writeByte((i10 >>> 16) & 255);
        cVar.writeByte((i10 >>> 8) & 255);
        cVar.writeByte(i10 & 255);
    }

    public static final <E> void c(List<E> list, E e10) {
        n.e(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return i10 & j10;
    }

    public static final r.c g(r rVar) {
        n.e(rVar, "<this>");
        return new r.c() { // from class: rl.c
            public /* synthetic */ c() {
            }

            @Override // ql.r.c
            public final r a(ql.e eVar) {
                r h10;
                h10 = d.h(r.this, eVar);
                return h10;
            }
        };
    }

    public static final r h(r this_asFactory, ql.e it) {
        n.e(this_asFactory, "$this_asFactory");
        n.e(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        n.e(str, "<this>");
        return f25045g.a(str);
    }

    public static final boolean j(u uVar, u other) {
        n.e(uVar, "<this>");
        n.e(other, "other");
        return n.a(uVar.h(), other.h()) && uVar.m() == other.m() && n.a(uVar.q(), other.q());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        n.e(name, "name");
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(n.k(name, " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(n.k(name, " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(n.k(name, " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        n.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        n.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!n.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        int y10;
        n.e(strArr, "<this>");
        n.e(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        n.d(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        y10 = m.y(strArr2);
        strArr2[y10] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        n.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        boolean I;
        n.e(str, "<this>");
        n.e(delimiters, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            I = q.I(delimiters, str.charAt(i10), false, 2, null);
            if (I) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(x xVar, int i10, TimeUnit timeUnit) {
        n.e(xVar, "<this>");
        n.e(timeUnit, "timeUnit");
        try {
            return L(xVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        n.e(format, "format");
        n.e(args, "args");
        a0 a0Var = a0.f20743a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        n.d(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        n.e(strArr, "<this>");
        n.e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator a10 = kotlin.jvm.internal.b.a(strArr2);
                    while (a10.hasNext()) {
                        if (comparator.compare(str, (String) a10.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long v(c0 c0Var) {
        n.e(c0Var, "<this>");
        String c10 = c0Var.o().c("Content-Length");
        if (c10 == null) {
            return -1L;
        }
        return U(c10, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> w(T... elements) {
        List l10;
        n.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        l10 = dk.r.l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(l10);
        n.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator<String> comparator) {
        n.e(strArr, "<this>");
        n.e(value, "value");
        n.e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        n.e(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (n.f(charAt, 31) <= 0 || n.f(charAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        n.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            if (!((((charAt == '\t' || charAt == '\n') || charAt == '\f') || charAt == '\r') || charAt == ' ')) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }
}
