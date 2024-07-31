package w5;

import dk.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import x5.g;
import xk.q;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<?, ?> f29633a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29634b;

    /* loaded from: classes.dex */
    static final class a extends o implements l<Object, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29635a = new a();

        a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("column");
            n.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map.get("isAsc");
            n.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) obj2);
            sb2.append(' ');
            sb2.append(booleanValue ? "ASC" : "DESC");
            return sb2.toString();
        }
    }

    public b(Map<?, ?> map) {
        n.e(map, "map");
        this.f29633a = map;
        Object obj = map.get("containsPathModified");
        n.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        this.f29634b = ((Boolean) obj).booleanValue();
    }

    @Override // w5.e
    public boolean a() {
        return this.f29634b;
    }

    @Override // w5.e
    public String b(int i10, ArrayList<String> args, boolean z10) {
        CharSequence K0;
        CharSequence K02;
        n.e(args, "args");
        Object obj = this.f29633a.get("where");
        n.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        String e10 = g.f30426a.e(i10);
        K0 = q.K0(str);
        if (K0.toString().length() == 0) {
            if (!z10) {
                return e10;
            }
            return "AND " + e10;
        }
        if (z10) {
            K02 = q.K0(str);
            if (K02.toString().length() > 0) {
                return "AND ( " + str + " )";
            }
        }
        return "( " + str + " )";
    }

    @Override // w5.e
    public String d() {
        String M;
        Object obj = this.f29633a.get("orderBy");
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        M = z.M(list, ",", null, null, 0, null, a.f29635a, 30, null);
        return M;
    }
}
