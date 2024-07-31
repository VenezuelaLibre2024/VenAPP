package v1;

import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final C0452a f27855c = new C0452a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f27856a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f27857b;

    /* renamed from: v1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0452a {
        private C0452a() {
        }

        public /* synthetic */ C0452a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final void a(k kVar, int i10, Object obj) {
            long j10;
            int byteValue;
            double doubleValue;
            if (obj == null) {
                kVar.g1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                kVar.O0(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                doubleValue = ((Number) obj).floatValue();
            } else {
                if (!(obj instanceof Double)) {
                    if (obj instanceof Long) {
                        j10 = ((Number) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            byteValue = ((Number) obj).intValue();
                        } else if (obj instanceof Short) {
                            byteValue = ((Number) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            byteValue = ((Number) obj).byteValue();
                        } else {
                            if (obj instanceof String) {
                                kVar.x0(i10, (String) obj);
                                return;
                            }
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        j10 = byteValue;
                    }
                    kVar.M0(i10, j10);
                    return;
                }
                doubleValue = ((Number) obj).doubleValue();
            }
            kVar.C(i10, doubleValue);
        }

        public final void b(k statement, Object[] objArr) {
            n.e(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        n.e(query, "query");
    }

    public a(String query, Object[] objArr) {
        n.e(query, "query");
        this.f27856a = query;
        this.f27857b = objArr;
    }

    @Override // v1.l
    public void a(k statement) {
        n.e(statement, "statement");
        f27855c.b(statement, this.f27857b);
    }

    @Override // v1.l
    public String b() {
        return this.f27856a;
    }
}
