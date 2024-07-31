package p413w5;

import dk.C7042z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p435x5.C12291g;
import p450xk.C12525q;

/* renamed from: w5.b */
/* loaded from: classes.dex */
public final class C12071b extends AbstractC12074e {

    /* renamed from: a */
    private final Map<?, ?> f32096a;

    /* renamed from: b */
    private final boolean f32097b;

    /* renamed from: w5.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Object, CharSequence> {

        /* renamed from: a */
        public static final a f32098a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("column");
            C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map.get("isAsc");
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) obj2);
            sb2.append(' ');
            sb2.append(booleanValue ? "ASC" : "DESC");
            return sb2.toString();
        }
    }

    public C12071b(Map<?, ?> map) {
        C9322n.m27781e(map, "map");
        this.f32096a = map;
        Object obj = map.get("containsPathModified");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        this.f32097b = ((Boolean) obj).booleanValue();
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: a */
    public boolean mo38754a() {
        return this.f32097b;
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: b */
    public String mo38755b(int i10, ArrayList<String> args, boolean z10) {
        CharSequence m41062K0;
        CharSequence m41062K02;
        C9322n.m27781e(args, "args");
        Object obj = this.f32096a.get("where");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        String m39686e = C12291g.f32938a.m39686e(i10);
        m41062K0 = C12525q.m41062K0(str);
        if (m41062K0.toString().length() == 0) {
            if (!z10) {
                return m39686e;
            }
            return "AND " + m39686e;
        }
        if (z10) {
            m41062K02 = C12525q.m41062K0(str);
            if (m41062K02.toString().length() > 0) {
                return "AND ( " + str + " )";
            }
        }
        return "( " + str + " )";
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: d */
    public String mo38756d() {
        String m20611M;
        Object obj = this.f32096a.get("orderBy");
        List list = obj instanceof List ? (List) obj : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        m20611M = C7042z.m20611M(list, ",", null, null, 0, null, a.f32098a, 30, null);
        return m20611M;
    }
}
