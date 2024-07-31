package p322r1;

import ck.C2037v;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11612k;
import p391v1.InterfaceC11613l;

/* renamed from: r1.x */
/* loaded from: classes.dex */
public final class C10607x implements InterfaceC11613l, InterfaceC11612k {

    /* renamed from: t */
    public static final a f26799t = new a(null);

    /* renamed from: u */
    public static final TreeMap<Integer, C10607x> f26800u = new TreeMap<>();

    /* renamed from: a */
    private final int f26801a;

    /* renamed from: b */
    private volatile String f26802b;

    /* renamed from: c */
    public final long[] f26803c;

    /* renamed from: d */
    public final double[] f26804d;

    /* renamed from: e */
    public final String[] f26805e;

    /* renamed from: f */
    public final byte[][] f26806f;

    /* renamed from: r */
    private final int[] f26807r;

    /* renamed from: s */
    private int f26808s;

    /* renamed from: r1.x$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C10607x m32304a(String query, int i10) {
            C9322n.m27781e(query, "query");
            TreeMap<Integer, C10607x> treeMap = C10607x.f26800u;
            synchronized (treeMap) {
                Map.Entry<Integer, C10607x> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry == null) {
                    C2037v c2037v = C2037v.f8089a;
                    C10607x c10607x = new C10607x(i10, null);
                    c10607x.m32302g(query, i10);
                    return c10607x;
                }
                treeMap.remove(ceilingEntry.getKey());
                C10607x sqliteQuery = ceilingEntry.getValue();
                sqliteQuery.m32302g(query, i10);
                C9322n.m27780d(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        /* renamed from: b */
        public final void m32305b() {
            TreeMap<Integer, C10607x> treeMap = C10607x.f26800u;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            C9322n.m27780d(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    private C10607x(int i10) {
        this.f26801a = i10;
        int i11 = i10 + 1;
        this.f26807r = new int[i11];
        this.f26803c = new long[i11];
        this.f26804d = new double[i11];
        this.f26805e = new String[i11];
        this.f26806f = new byte[i11];
    }

    public /* synthetic */ C10607x(int i10, C9315g c9315g) {
        this(i10);
    }

    /* renamed from: e */
    public static final C10607x m32298e(String str, int i10) {
        return f26799t.m32304a(str, i10);
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: C */
    public void mo32158C(int i10, double d10) {
        this.f26807r[i10] = 3;
        this.f26804d[i10] = d10;
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: M0 */
    public void mo32159M0(int i10, long j10) {
        this.f26807r[i10] = 2;
        this.f26803c[i10] = j10;
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: O0 */
    public void mo32160O0(int i10, byte[] value) {
        C9322n.m27781e(value, "value");
        this.f26807r[i10] = 5;
        this.f26806f[i10] = value;
    }

    @Override // p391v1.InterfaceC11613l
    /* renamed from: a */
    public void mo32299a(InterfaceC11612k statement) {
        C9322n.m27781e(statement, "statement");
        int m32301f = m32301f();
        if (1 > m32301f) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f26807r[i10];
            if (i11 == 1) {
                statement.mo32161g1(i10);
            } else if (i11 == 2) {
                statement.mo32159M0(i10, this.f26803c[i10]);
            } else if (i11 == 3) {
                statement.mo32158C(i10, this.f26804d[i10]);
            } else if (i11 == 4) {
                String str = this.f26805e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.mo32163x0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f26806f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.mo32160O0(i10, bArr);
            }
            if (i10 == m32301f) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // p391v1.InterfaceC11613l
    /* renamed from: b */
    public String mo32300b() {
        String str = this.f26802b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: f */
    public int m32301f() {
        return this.f26808s;
    }

    /* renamed from: g */
    public final void m32302g(String query, int i10) {
        C9322n.m27781e(query, "query");
        this.f26802b = query;
        this.f26808s = i10;
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: g1 */
    public void mo32161g1(int i10) {
        this.f26807r[i10] = 1;
    }

    /* renamed from: i */
    public final void m32303i() {
        TreeMap<Integer, C10607x> treeMap = f26800u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f26801a), this);
            f26799t.m32305b();
            C2037v c2037v = C2037v.f8089a;
        }
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: x0 */
    public void mo32163x0(int i10, String value) {
        C9322n.m27781e(value, "value");
        this.f26807r[i10] = 4;
        this.f26805e[i10] = value;
    }
}
