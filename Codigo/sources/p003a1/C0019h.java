package p003a1;

import ck.C2027l;
import ck.C2037v;
import dk.C7042z;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p003a1.AbstractC0015d;
import p124gk.Continuation;
import p430x0.C12250a;
import p430x0.InterfaceC12260k;
import p475z0.C12757d;
import p475z0.C12759f;
import p475z0.C12760g;
import p475z0.C12761h;

/* renamed from: a1.h */
/* loaded from: classes.dex */
public final class C0019h implements InterfaceC12260k<AbstractC0015d> {

    /* renamed from: a */
    public static final C0019h f51a = new C0019h();

    /* renamed from: b */
    private static final String f52b = "preferences_pb";

    /* renamed from: a1.h$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53a;

        static {
            int[] iArr = new int[C12761h.b.values().length];
            iArr[C12761h.b.BOOLEAN.ordinal()] = 1;
            iArr[C12761h.b.FLOAT.ordinal()] = 2;
            iArr[C12761h.b.DOUBLE.ordinal()] = 3;
            iArr[C12761h.b.INTEGER.ordinal()] = 4;
            iArr[C12761h.b.LONG.ordinal()] = 5;
            iArr[C12761h.b.STRING.ordinal()] = 6;
            iArr[C12761h.b.STRING_SET.ordinal()] = 7;
            iArr[C12761h.b.VALUE_NOT_SET.ordinal()] = 8;
            f53a = iArr;
        }
    }

    private C0019h() {
    }

    /* renamed from: d */
    private final void m67d(String str, C12761h c12761h, C0012a c0012a) {
        Object m58a;
        Object valueOf;
        C12761h.b m42345Z = c12761h.m42345Z();
        switch (m42345Z == null ? -1 : a.f53a[m42345Z.ordinal()]) {
            case -1:
                throw new C12250a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C2027l();
            case 1:
                m58a = C0017f.m58a(str);
                valueOf = Boolean.valueOf(c12761h.m42338R());
                break;
            case 2:
                m58a = C0017f.m60c(str);
                valueOf = Float.valueOf(c12761h.m42340U());
                break;
            case 3:
                m58a = C0017f.m59b(str);
                valueOf = Double.valueOf(c12761h.m42339T());
                break;
            case 4:
                m58a = C0017f.m61d(str);
                valueOf = Integer.valueOf(c12761h.m42341V());
                break;
            case 5:
                m58a = C0017f.m62e(str);
                valueOf = Long.valueOf(c12761h.m42342W());
                break;
            case 6:
                m58a = C0017f.m63f(str);
                valueOf = c12761h.m42343X();
                C9322n.m27780d(valueOf, "value.string");
                break;
            case 7:
                m58a = C0017f.m64g(str);
                List<String> m42319O = c12761h.m42344Y().m42319O();
                C9322n.m27780d(m42319O, "value.stringSet.stringsList");
                valueOf = C7042z.m20634j0(m42319O);
                break;
            case 8:
                throw new C12250a("Value not set.", null, 2, null);
        }
        c0012a.m44i(m58a, valueOf);
    }

    /* renamed from: g */
    private final C12761h m68g(Object obj) {
        C12761h build;
        String str;
        if (obj instanceof Boolean) {
            build = C12761h.m42330a0().m42351x(((Boolean) obj).booleanValue()).build();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            build = C12761h.m42330a0().m42346A(((Number) obj).floatValue()).build();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            build = C12761h.m42330a0().m42352z(((Number) obj).doubleValue()).build();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            build = C12761h.m42330a0().m42347B(((Number) obj).intValue()).build();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            build = C12761h.m42330a0().m42348C(((Number) obj).longValue()).build();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            build = C12761h.m42330a0().m42349D((String) obj).build();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(C9322n.m27787k("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            build = C12761h.m42330a0().m42350E(C12760g.m42318P().m42320x((Set) obj)).build();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        C9322n.m27780d(build, str);
        return build;
    }

    @Override // p430x0.InterfaceC12260k
    /* renamed from: a */
    public Object mo69a(InputStream inputStream, Continuation<? super AbstractC0015d> continuation) {
        C12759f m42303a = C12757d.f34798a.m42303a(inputStream);
        C0012a m57b = C0016e.m57b(new AbstractC0015d.b[0]);
        Map<String, C12761h> m42311M = m42303a.m42311M();
        C9322n.m27780d(m42311M, "preferencesProto.preferencesMap");
        for (Map.Entry<String, C12761h> entry : m42311M.entrySet()) {
            String name = entry.getKey();
            C12761h value = entry.getValue();
            C0019h c0019h = f51a;
            C9322n.m27780d(name, "name");
            C9322n.m27780d(value, "value");
            c0019h.m67d(name, value, m57b);
        }
        return m57b.m52d();
    }

    @Override // p430x0.InterfaceC12260k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC0015d mo70b() {
        return C0016e.m56a();
    }

    /* renamed from: f */
    public final String m73f() {
        return f52b;
    }

    @Override // p430x0.InterfaceC12260k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo71c(AbstractC0015d abstractC0015d, OutputStream outputStream, Continuation<? super C2037v> continuation) {
        Map<AbstractC0015d.a<?>, Object> mo38a = abstractC0015d.mo38a();
        C12759f.a m42309P = C12759f.m42309P();
        for (Map.Entry<AbstractC0015d.a<?>, Object> entry : mo38a.entrySet()) {
            m42309P.m42312x(entry.getKey().m53a(), m68g(entry.getValue()));
        }
        m42309P.build().m5636o(outputStream);
        return C2037v.f8089a;
    }
}
