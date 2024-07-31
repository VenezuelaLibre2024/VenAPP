package r1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x implements v1.l, v1.k {

    /* renamed from: t, reason: collision with root package name */
    public static final a f24685t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final TreeMap<Integer, x> f24686u = new TreeMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f24687a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f24688b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f24689c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f24690d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f24691e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f24692f;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f24693r;

    /* renamed from: s, reason: collision with root package name */
    private int f24694s;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final x a(String query, int i10) {
            kotlin.jvm.internal.n.e(query, "query");
            TreeMap<Integer, x> treeMap = x.f24686u;
            synchronized (treeMap) {
                Map.Entry<Integer, x> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry == null) {
                    ck.v vVar = ck.v.f7137a;
                    x xVar = new x(i10, null);
                    xVar.g(query, i10);
                    return xVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                x sqliteQuery = ceilingEntry.getValue();
                sqliteQuery.g(query, i10);
                kotlin.jvm.internal.n.d(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap<Integer, x> treeMap = x.f24686u;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.n.d(it, "queryPool.descendingKeySet().iterator()");
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

    private x(int i10) {
        this.f24687a = i10;
        int i11 = i10 + 1;
        this.f24693r = new int[i11];
        this.f24689c = new long[i11];
        this.f24690d = new double[i11];
        this.f24691e = new String[i11];
        this.f24692f = new byte[i11];
    }

    public /* synthetic */ x(int i10, kotlin.jvm.internal.g gVar) {
        this(i10);
    }

    public static final x e(String str, int i10) {
        return f24685t.a(str, i10);
    }

    @Override // v1.k
    public void C(int i10, double d10) {
        this.f24693r[i10] = 3;
        this.f24690d[i10] = d10;
    }

    @Override // v1.k
    public void M0(int i10, long j10) {
        this.f24693r[i10] = 2;
        this.f24689c[i10] = j10;
    }

    @Override // v1.k
    public void O0(int i10, byte[] value) {
        kotlin.jvm.internal.n.e(value, "value");
        this.f24693r[i10] = 5;
        this.f24692f[i10] = value;
    }

    @Override // v1.l
    public void a(v1.k statement) {
        kotlin.jvm.internal.n.e(statement, "statement");
        int f10 = f();
        if (1 > f10) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f24693r[i10];
            if (i11 == 1) {
                statement.g1(i10);
            } else if (i11 == 2) {
                statement.M0(i10, this.f24689c[i10]);
            } else if (i11 == 3) {
                statement.C(i10, this.f24690d[i10]);
            } else if (i11 == 4) {
                String str = this.f24691e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.x0(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f24692f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.O0(i10, bArr);
            }
            if (i10 == f10) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // v1.l
    public String b() {
        String str = this.f24688b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int f() {
        return this.f24694s;
    }

    public final void g(String query, int i10) {
        kotlin.jvm.internal.n.e(query, "query");
        this.f24688b = query;
        this.f24694s = i10;
    }

    @Override // v1.k
    public void g1(int i10) {
        this.f24693r[i10] = 1;
    }

    public final void i() {
        TreeMap<Integer, x> treeMap = f24686u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f24687a), this);
            f24685t.b();
            ck.v vVar = ck.v.f7137a;
        }
    }

    @Override // v1.k
    public void x0(int i10, String value) {
        kotlin.jvm.internal.n.e(value, "value");
        this.f24693r[i10] = 4;
        this.f24691e[i10] = value;
    }
}
