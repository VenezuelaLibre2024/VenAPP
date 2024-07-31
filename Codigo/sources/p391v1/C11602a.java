package p391v1;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C11602a implements InterfaceC11613l {

    /* renamed from: c */
    public static final a f30179c = new a(null);

    /* renamed from: a */
    private final String f30180a;

    /* renamed from: b */
    private final Object[] f30181b;

    /* renamed from: v1.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final void m36375a(InterfaceC11612k interfaceC11612k, int i10, Object obj) {
            long j10;
            int byteValue;
            double doubleValue;
            if (obj == null) {
                interfaceC11612k.mo32161g1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                interfaceC11612k.mo32160O0(i10, (byte[]) obj);
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
                                interfaceC11612k.mo32163x0(i10, (String) obj);
                                return;
                            }
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        j10 = byteValue;
                    }
                    interfaceC11612k.mo32159M0(i10, j10);
                    return;
                }
                doubleValue = ((Number) obj).doubleValue();
            }
            interfaceC11612k.mo32158C(i10, doubleValue);
        }

        /* renamed from: b */
        public final void m36376b(InterfaceC11612k statement, Object[] objArr) {
            C9322n.m27781e(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                m36375a(statement, i10, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11602a(String query) {
        this(query, null);
        C9322n.m27781e(query, "query");
    }

    public C11602a(String query, Object[] objArr) {
        C9322n.m27781e(query, "query");
        this.f30180a = query;
        this.f30181b = objArr;
    }

    @Override // p391v1.InterfaceC11613l
    /* renamed from: a */
    public void mo32299a(InterfaceC11612k statement) {
        C9322n.m27781e(statement, "statement");
        f30179c.m36376b(statement, this.f30181b);
    }

    @Override // p391v1.InterfaceC11613l
    /* renamed from: b */
    public String mo32300b() {
        return this.f30180a;
    }
}
