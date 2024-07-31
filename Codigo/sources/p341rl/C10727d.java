package p341rl;

import ck.C2017b;
import com.google.android.gms.common.api.C5101a;
import dk.AbstractC7006e0;
import dk.C7018k0;
import dk.C7021m;
import dk.C7031r;
import dk.C7033s;
import dk.C7042z;
import dm.C7056b;
import dm.C7061e;
import dm.C7071o;
import dm.C7081y;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
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
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9309b;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10523b0;
import p319ql.AbstractC10527d0;
import p319ql.AbstractC10543r;
import p319ql.C10525c0;
import p319ql.C10545t;
import p319ql.C10546u;
import p319ql.C10550y;
import p319ql.InterfaceC10528e;
import p450xk.C12512d;
import p450xk.C12514f;
import p450xk.C12524p;
import p450xk.C12525q;
import p473yl.C12735c;
import uk.C11579f;
import uk.C11585l;

/* renamed from: rl.d */
/* loaded from: classes3.dex */
public final class C10727d {

    /* renamed from: a */
    public static final byte[] f27158a;

    /* renamed from: b */
    public static final C10545t f27159b = C10545t.f26452b.m31865g(new String[0]);

    /* renamed from: c */
    public static final AbstractC10527d0 f27160c;

    /* renamed from: d */
    public static final AbstractC10523b0 f27161d;

    /* renamed from: e */
    private static final C7071o f27162e;

    /* renamed from: f */
    public static final TimeZone f27163f;

    /* renamed from: g */
    private static final C12514f f27164g;

    /* renamed from: h */
    public static final boolean f27165h;

    /* renamed from: i */
    public static final String f27166i;

    static {
        String m41091n0;
        String m41092o0;
        byte[] bArr = new byte[0];
        f27158a = bArr;
        f27160c = AbstractC10527d0.a.m31709c(AbstractC10527d0.f26256a, bArr, null, 1, null);
        f27161d = AbstractC10523b0.a.m31630e(AbstractC10523b0.f26198a, bArr, null, 0, 0, 7, null);
        C7071o.a aVar = C7071o.f15669d;
        C7061e.a aVar2 = C7061e.f15649d;
        f27162e = aVar.m20828d(aVar2.m20779a("efbbbf"), aVar2.m20779a("feff"), aVar2.m20779a("fffe"), aVar2.m20779a("0000ffff"), aVar2.m20779a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C9322n.m27778b(timeZone);
        f27163f = timeZone;
        f27164g = new C12514f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f27165h = false;
        String name = C10550y.class.getName();
        C9322n.m27780d(name, "OkHttpClient::class.java.name");
        m41091n0 = C12525q.m41091n0(name, "okhttp3.");
        m41092o0 = C12525q.m41092o0(m41091n0, "Client");
        f27166i = m41092o0;
    }

    /* renamed from: A */
    public static /* synthetic */ int m32615A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m32666z(str, i10, i11);
    }

    /* renamed from: B */
    public static final int m32616B(String str, int i10, int i11) {
        C9322n.m27781e(str, "<this>");
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

    /* renamed from: C */
    public static /* synthetic */ int m32617C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m32616B(str, i10, i11);
    }

    /* renamed from: D */
    public static final int m32618D(String str, int i10) {
        C9322n.m27781e(str, "<this>");
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

    /* renamed from: E */
    public static final String[] m32619E(String[] strArr, String[] other, Comparator<? super String> comparator) {
        C9322n.m27781e(strArr, "<this>");
        C9322n.m27781e(other, "other");
        C9322n.m27781e(comparator, "comparator");
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

    /* renamed from: F */
    public static final boolean m32620F(Socket socket, InterfaceC7060d source) {
        C9322n.m27781e(socket, "<this>");
        C9322n.m27781e(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !source.mo20695G0();
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

    /* renamed from: G */
    public static final boolean m32621G(String name) {
        boolean m41037r;
        boolean m41037r2;
        boolean m41037r3;
        boolean m41037r4;
        C9322n.m27781e(name, "name");
        m41037r = C12524p.m41037r(name, "Authorization", true);
        if (m41037r) {
            return true;
        }
        m41037r2 = C12524p.m41037r(name, "Cookie", true);
        if (m41037r2) {
            return true;
        }
        m41037r3 = C12524p.m41037r(name, "Proxy-Authorization", true);
        if (m41037r3) {
            return true;
        }
        m41037r4 = C12524p.m41037r(name, "Set-Cookie", true);
        return m41037r4;
    }

    /* renamed from: H */
    public static final int m32622H(char c10) {
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

    /* renamed from: I */
    public static final Charset m32623I(InterfaceC7060d interfaceC7060d, Charset charset) {
        Charset charset2;
        String str;
        C9322n.m27781e(interfaceC7060d, "<this>");
        C9322n.m27781e(charset, "default");
        int mo20731n1 = interfaceC7060d.mo20731n1(f27162e);
        if (mo20731n1 == -1) {
            return charset;
        }
        if (mo20731n1 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (mo20731n1 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (mo20731n1 != 2) {
                if (mo20731n1 == 3) {
                    return C12512d.f33912a.m40961a();
                }
                if (mo20731n1 == 4) {
                    return C12512d.f33912a.m40962b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        C9322n.m27780d(charset2, str);
        return charset2;
    }

    /* renamed from: J */
    public static final int m32624J(InterfaceC7060d interfaceC7060d) {
        C9322n.m27781e(interfaceC7060d, "<this>");
        return m32644d(interfaceC7060d.readByte(), 255) | (m32644d(interfaceC7060d.readByte(), 255) << 16) | (m32644d(interfaceC7060d.readByte(), 255) << 8);
    }

    /* renamed from: K */
    public static final int m32625K(C7056b c7056b, byte b10) {
        C9322n.m27781e(c7056b, "<this>");
        int i10 = 0;
        while (!c7056b.mo20695G0() && c7056b.m20729l(0L) == b10) {
            i10++;
            c7056b.readByte();
        }
        return i10;
    }

    /* renamed from: L */
    public static final boolean m32626L(InterfaceC7080x interfaceC7080x, int i10, TimeUnit timeUnit) {
        C9322n.m27781e(interfaceC7080x, "<this>");
        C9322n.m27781e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long mo20788c = interfaceC7080x.mo20685m().mo20790e() ? interfaceC7080x.mo20685m().mo20788c() - nanoTime : Long.MAX_VALUE;
        interfaceC7080x.mo20685m().mo20789d(Math.min(mo20788c, timeUnit.toNanos(i10)) + nanoTime);
        try {
            C7056b c7056b = new C7056b();
            while (interfaceC7080x.mo20686s1(c7056b, 8192L) != -1) {
                c7056b.m20714b();
            }
            C7081y mo20685m = interfaceC7080x.mo20685m();
            if (mo20788c == Long.MAX_VALUE) {
                mo20685m.mo20786a();
            } else {
                mo20685m.mo20789d(nanoTime + mo20788c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            C7081y mo20685m2 = interfaceC7080x.mo20685m();
            if (mo20788c == Long.MAX_VALUE) {
                mo20685m2.mo20786a();
            } else {
                mo20685m2.mo20789d(nanoTime + mo20788c);
            }
            return false;
        } catch (Throwable th2) {
            C7081y mo20685m3 = interfaceC7080x.mo20685m();
            if (mo20788c == Long.MAX_VALUE) {
                mo20685m3.mo20786a();
            } else {
                mo20685m3.mo20789d(nanoTime + mo20788c);
            }
            throw th2;
        }
    }

    /* renamed from: M */
    public static final ThreadFactory m32627M(final String name, final boolean z10) {
        C9322n.m27781e(name, "name");
        return new ThreadFactory() { // from class: rl.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m32628N;
                m32628N = C10727d.m32628N(name, z10, runnable);
                return m32628N;
            }
        };
    }

    /* renamed from: N */
    public static final Thread m32628N(String name, boolean z10, Runnable runnable) {
        C9322n.m27781e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    /* renamed from: O */
    public static final List<C12735c> m32629O(C10545t c10545t) {
        C11579f m36302k;
        int m20590r;
        C9322n.m27781e(c10545t, "<this>");
        m36302k = C11585l.m36302k(0, c10545t.size());
        m20590r = C7033s.m20590r(m36302k, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator<Integer> it = m36302k.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC7006e0) it).nextInt();
            arrayList.add(new C12735c(c10545t.m31846d(nextInt), c10545t.m31849l(nextInt)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final C10545t m32630P(List<C12735c> list) {
        C9322n.m27781e(list, "<this>");
        C10545t.a aVar = new C10545t.a();
        for (C12735c c12735c : list) {
            aVar.m31853c(c12735c.m42050a().m20760F(), c12735c.m42051b().m20760F());
        }
        return aVar.m31855e();
    }

    /* renamed from: Q */
    public static final String m32631Q(C10546u c10546u, boolean z10) {
        boolean m41059J;
        String m31874h;
        C9322n.m27781e(c10546u, "<this>");
        m41059J = C12525q.m41059J(c10546u.m31874h(), ":", false, 2, null);
        if (m41059J) {
            m31874h = '[' + c10546u.m31874h() + ']';
        } else {
            m31874h = c10546u.m31874h();
        }
        if (!z10 && c10546u.m31878m() == C10546u.f26455k.m31931c(c10546u.m31882q())) {
            return m31874h;
        }
        return m31874h + ':' + c10546u.m31878m();
    }

    /* renamed from: R */
    public static /* synthetic */ String m32632R(C10546u c10546u, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m32631Q(c10546u, z10);
    }

    /* renamed from: S */
    public static final <T> List<T> m32633S(List<? extends T> list) {
        List m20632h0;
        C9322n.m27781e(list, "<this>");
        m20632h0 = C7042z.m20632h0(list);
        List<T> unmodifiableList = Collections.unmodifiableList(m20632h0);
        C9322n.m27780d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: T */
    public static final <K, V> Map<K, V> m32634T(Map<K, ? extends V> map) {
        Map<K, V> m20421h;
        C9322n.m27781e(map, "<this>");
        if (map.isEmpty()) {
            m20421h = C7018k0.m20421h();
            return m20421h;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C9322n.m27780d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    /* renamed from: U */
    public static final long m32635U(String str, long j10) {
        C9322n.m27781e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    /* renamed from: V */
    public static final int m32636V(String str, int i10) {
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
            return C5101a.e.API_PRIORITY_OTHER;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    /* renamed from: W */
    public static final String m32637W(String str, int i10, int i11) {
        C9322n.m27781e(str, "<this>");
        int m32666z = m32666z(str, i10, i11);
        String substring = str.substring(m32666z, m32616B(str, m32666z, i11));
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: X */
    public static /* synthetic */ String m32638X(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m32637W(str, i10, i11);
    }

    /* renamed from: Y */
    public static final Throwable m32639Y(Exception exc, List<? extends Exception> suppressed) {
        C9322n.m27781e(exc, "<this>");
        C9322n.m27781e(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            C2017b.m10328a(exc, it.next());
        }
        return exc;
    }

    /* renamed from: Z */
    public static final void m32640Z(InterfaceC7058c interfaceC7058c, int i10) {
        C9322n.m27781e(interfaceC7058c, "<this>");
        interfaceC7058c.writeByte((i10 >>> 16) & 255);
        interfaceC7058c.writeByte((i10 >>> 8) & 255);
        interfaceC7058c.writeByte(i10 & 255);
    }

    /* renamed from: c */
    public static final <E> void m32643c(List<E> list, E e10) {
        C9322n.m27781e(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    /* renamed from: d */
    public static final int m32644d(byte b10, int i10) {
        return b10 & i10;
    }

    /* renamed from: e */
    public static final int m32645e(short s10, int i10) {
        return s10 & i10;
    }

    /* renamed from: f */
    public static final long m32646f(int i10, long j10) {
        return i10 & j10;
    }

    /* renamed from: g */
    public static final AbstractC10543r.c m32647g(final AbstractC10543r abstractC10543r) {
        C9322n.m27781e(abstractC10543r, "<this>");
        return new AbstractC10543r.c() { // from class: rl.c
            @Override // p319ql.AbstractC10543r.c
            /* renamed from: a */
            public final AbstractC10543r mo31835a(InterfaceC10528e interfaceC10528e) {
                AbstractC10543r m32648h;
                m32648h = C10727d.m32648h(AbstractC10543r.this, interfaceC10528e);
                return m32648h;
            }
        };
    }

    /* renamed from: h */
    public static final AbstractC10543r m32648h(AbstractC10543r this_asFactory, InterfaceC10528e it) {
        C9322n.m27781e(this_asFactory, "$this_asFactory");
        C9322n.m27781e(it, "it");
        return this_asFactory;
    }

    /* renamed from: i */
    public static final boolean m32649i(String str) {
        C9322n.m27781e(str, "<this>");
        return f27164g.m40969a(str);
    }

    /* renamed from: j */
    public static final boolean m32650j(C10546u c10546u, C10546u other) {
        C9322n.m27781e(c10546u, "<this>");
        C9322n.m27781e(other, "other");
        return C9322n.m27777a(c10546u.m31874h(), other.m31874h()) && c10546u.m31878m() == other.m31878m() && C9322n.m27777a(c10546u.m31882q(), other.m31882q());
    }

    /* renamed from: k */
    public static final int m32651k(String name, long j10, TimeUnit timeUnit) {
        C9322n.m27781e(name, "name");
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(C9322n.m27787k(name, " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(C9322n.m27787k(name, " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(C9322n.m27787k(name, " too small.").toString());
    }

    /* renamed from: l */
    public static final void m32652l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m32653m(Closeable closeable) {
        C9322n.m27781e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m32654n(Socket socket) {
        C9322n.m27781e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C9322n.m27777a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static final String[] m32655o(String[] strArr, String value) {
        int m20497y;
        C9322n.m27781e(strArr, "<this>");
        C9322n.m27781e(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C9322n.m27780d(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        m20497y = C7021m.m20497y(strArr2);
        strArr2[m20497y] = value;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m32656p(String str, char c10, int i10, int i11) {
        C9322n.m27781e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    /* renamed from: q */
    public static final int m32657q(String str, String delimiters, int i10, int i11) {
        boolean m41057I;
        C9322n.m27781e(str, "<this>");
        C9322n.m27781e(delimiters, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            m41057I = C12525q.m41057I(delimiters, str.charAt(i10), false, 2, null);
            if (m41057I) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    /* renamed from: r */
    public static /* synthetic */ int m32658r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return m32656p(str, c10, i10, i11);
    }

    /* renamed from: s */
    public static final boolean m32659s(InterfaceC7080x interfaceC7080x, int i10, TimeUnit timeUnit) {
        C9322n.m27781e(interfaceC7080x, "<this>");
        C9322n.m27781e(timeUnit, "timeUnit");
        try {
            return m32626L(interfaceC7080x, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m32660t(String format, Object... args) {
        C9322n.m27781e(format, "format");
        C9322n.m27781e(args, "args");
        C9308a0 c9308a0 = C9308a0.f22565a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        C9322n.m27780d(format2, "format(locale, format, *args)");
        return format2;
    }

    /* renamed from: u */
    public static final boolean m32661u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C9322n.m27781e(strArr, "<this>");
        C9322n.m27781e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator m27756a = C9309b.m27756a(strArr2);
                    while (m27756a.hasNext()) {
                        if (comparator.compare(str, (String) m27756a.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static final long m32662v(C10525c0 c10525c0) {
        C9322n.m27781e(c10525c0, "<this>");
        String m31845c = c10525c0.m31649o().m31845c("Content-Length");
        if (m31845c == null) {
            return -1L;
        }
        return m32635U(m31845c, -1L);
    }

    @SafeVarargs
    /* renamed from: w */
    public static final <T> List<T> m32663w(T... elements) {
        List m20584l;
        C9322n.m27781e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        m20584l = C7031r.m20584l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(m20584l);
        C9322n.m27780d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: x */
    public static final int m32664x(String[] strArr, String value, Comparator<String> comparator) {
        C9322n.m27781e(strArr, "<this>");
        C9322n.m27781e(value, "value");
        C9322n.m27781e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m32665y(String str) {
        C9322n.m27781e(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (C9322n.m27782f(charAt, 31) <= 0 || C9322n.m27782f(charAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m32666z(String str, int i10, int i11) {
        C9322n.m27781e(str, "<this>");
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
