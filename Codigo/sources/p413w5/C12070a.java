package p413w5;

import com.facebook.ads.AdError;
import dk.C7039w;
import dk.C7042z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p348s5.EnumC10799a;
import p435x5.C12287c;
import p435x5.C12291g;
import p450xk.C12525q;

/* renamed from: w5.a */
/* loaded from: classes.dex */
public final class C12070a extends AbstractC12074e {

    /* renamed from: a */
    private final C12073d f32088a;

    /* renamed from: b */
    private final C12073d f32089b;

    /* renamed from: c */
    private final C12073d f32090c;

    /* renamed from: d */
    private final C12072c f32091d;

    /* renamed from: e */
    private final C12072c f32092e;

    /* renamed from: f */
    private final boolean f32093f;

    /* renamed from: g */
    private final List<C12075f> f32094g;

    /* renamed from: w5.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<C12075f, CharSequence> {

        /* renamed from: a */
        public static final a f32095a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(C12075f it) {
            C9322n.m27781e(it, "it");
            return it.m38788a();
        }
    }

    public C12070a(Map<?, ?> map) {
        C9322n.m27781e(map, "map");
        C12287c c12287c = C12287c.f32921a;
        this.f32088a = c12287c.m39623h(map, EnumC10799a.Video);
        this.f32089b = c12287c.m39623h(map, EnumC10799a.Image);
        this.f32090c = c12287c.m39623h(map, EnumC10799a.Audio);
        Object obj = map.get("createDate");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f32091d = c12287c.m39620d((Map) obj);
        Object obj2 = map.get("updateDate");
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        this.f32092e = c12287c.m39620d((Map) obj2);
        Object obj3 = map.get("containsPathModified");
        C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        this.f32093f = ((Boolean) obj3).booleanValue();
        Object obj4 = map.get("orders");
        C9322n.m27779c(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
        this.f32094g = c12287c.m39622g((List) obj4);
    }

    /* renamed from: e */
    private final String m38749e(ArrayList<String> arrayList, C12072c c12072c, String str) {
        if (c12072c.m38759a()) {
            return "";
        }
        long m38761c = c12072c.m38761c();
        long m38760b = c12072c.m38760b();
        String str2 = "AND ( " + str + " >= ? AND " + str + " <= ? )";
        long j10 = AdError.NETWORK_ERROR_CODE;
        arrayList.add(String.valueOf(m38761c / j10));
        arrayList.add(String.valueOf(m38760b / j10));
        return str2;
    }

    /* renamed from: f */
    private final String m38750f(int i10, C12070a c12070a, ArrayList<String> arrayList) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        C12291g c12291g = C12291g.f32938a;
        boolean m39684c = c12291g.m39684c(i10);
        boolean m39685d = c12291g.m39685d(i10);
        boolean m39683b = c12291g.m39683b(i10);
        String str3 = "";
        if (m39684c) {
            C12073d c12073d = c12070a.f32089b;
            str = "media_type = ? ";
            arrayList.add("1");
            if (!c12073d.m38765d().m38777a()) {
                String m38770i = c12073d.m38770i();
                str = str + " AND " + m38770i;
                C7039w.m20598v(arrayList, c12073d.m38769h());
            }
        } else {
            str = "";
        }
        if (m39685d) {
            C12073d c12073d2 = c12070a.f32088a;
            String m38763b = c12073d2.m38763b();
            String[] m38762a = c12073d2.m38762a();
            str2 = "media_type = ? AND " + m38763b;
            arrayList.add("3");
            C7039w.m20598v(arrayList, m38762a);
        } else {
            str2 = "";
        }
        if (m39683b) {
            C12073d c12073d3 = c12070a.f32090c;
            String m38763b2 = c12073d3.m38763b();
            String[] m38762a2 = c12073d3.m38762a();
            str3 = "media_type = ? AND " + m38763b2;
            arrayList.add("2");
            C7039w.m20598v(arrayList, m38762a2);
        }
        if (m39684c) {
            sb2.append("( " + str + " )");
        }
        if (m39685d) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + str2 + " )");
        }
        if (m39683b) {
            if (sb2.length() > 0) {
                sb2.append("OR ");
            }
            sb2.append("( " + str3 + " )");
        }
        return "( " + ((Object) sb2) + " )";
    }

    /* renamed from: g */
    private final String m38751g(ArrayList<String> arrayList, C12070a c12070a) {
        return m38749e(arrayList, c12070a.f32091d, "date_added") + ' ' + m38749e(arrayList, c12070a.f32092e, "date_modified");
    }

    /* renamed from: h */
    private final C12291g m38752h() {
        return C12291g.f32938a;
    }

    /* renamed from: i */
    private final String m38753i(Integer num, C12070a c12070a) {
        String str = "";
        if (c12070a.f32089b.m38765d().m38777a() || num == null || !m38752h().m39684c(num.intValue())) {
            return "";
        }
        if (m38752h().m39685d(num.intValue())) {
            str = "OR ( media_type = 3 )";
        }
        if (m38752h().m39683b(num.intValue())) {
            str = str + " OR ( media_type = 2 )";
        }
        return "AND (" + ("( media_type = 1 AND width > 0 AND height > 0 )") + ' ' + str + ')';
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: a */
    public boolean mo38754a() {
        return this.f32093f;
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: b */
    public String mo38755b(int i10, ArrayList<String> args, boolean z10) {
        CharSequence m41062K0;
        StringBuilder sb2;
        String str;
        C9322n.m27781e(args, "args");
        String str2 = m38750f(i10, this, args) + ' ' + m38751g(args, this) + ' ' + m38753i(Integer.valueOf(i10), this);
        m41062K0 = C12525q.m41062K0(str2);
        if (m41062K0.toString().length() == 0) {
            return "";
        }
        if (z10) {
            sb2 = new StringBuilder();
            sb2.append(" AND ( ");
            sb2.append(str2);
            str = " )";
        } else {
            sb2 = new StringBuilder();
            sb2.append(" ( ");
            sb2.append(str2);
            str = " ) ";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // p413w5.AbstractC12074e
    /* renamed from: d */
    public String mo38756d() {
        String m20611M;
        if (this.f32094g.isEmpty()) {
            return null;
        }
        m20611M = C7042z.m20611M(this.f32094g, ",", null, null, 0, null, a.f32095a, 30, null);
        return m20611M;
    }
}
