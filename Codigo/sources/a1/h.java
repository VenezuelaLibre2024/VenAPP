package a1;

import a1.d;
import ck.l;
import ck.v;
import dk.z;
import gk.Continuation;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import x0.k;
import z0.f;
import z0.h;

/* loaded from: classes.dex */
public final class h implements k<d> {

    /* renamed from: a */
    public static final h f51a = new h();

    /* renamed from: b */
    private static final String f52b = "preferences_pb";

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f53a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, z0.h hVar, a1.a aVar) {
        Object a10;
        Object valueOf;
        h.b Z = hVar.Z();
        switch (Z == null ? -1 : a.f53a[Z.ordinal()]) {
            case -1:
                throw new x0.a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new l();
            case 1:
                a10 = f.a(str);
                valueOf = Boolean.valueOf(hVar.R());
                break;
            case 2:
                a10 = f.c(str);
                valueOf = Float.valueOf(hVar.U());
                break;
            case 3:
                a10 = f.b(str);
                valueOf = Double.valueOf(hVar.T());
                break;
            case 4:
                a10 = f.d(str);
                valueOf = Integer.valueOf(hVar.V());
                break;
            case 5:
                a10 = f.e(str);
                valueOf = Long.valueOf(hVar.W());
                break;
            case 6:
                a10 = f.f(str);
                valueOf = hVar.X();
                n.d(valueOf, "value.string");
                break;
            case 7:
                a10 = f.g(str);
                List<String> O = hVar.Y().O();
                n.d(O, "value.stringSet.stringsList");
                valueOf = z.j0(O);
                break;
            case 8:
                throw new x0.a("Value not set.", null, 2, null);
        }
        aVar.i(a10, valueOf);
    }

    private final z0.h g(Object obj) {
        z0.h build;
        String str;
        if (obj instanceof Boolean) {
            build = z0.h.a0().x(((Boolean) obj).booleanValue()).build();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            build = z0.h.a0().A(((Number) obj).floatValue()).build();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            build = z0.h.a0().z(((Number) obj).doubleValue()).build();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            build = z0.h.a0().B(((Number) obj).intValue()).build();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            build = z0.h.a0().C(((Number) obj).longValue()).build();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            build = z0.h.a0().D((String) obj).build();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(n.k("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            build = z0.h.a0().E(z0.g.P().x((Set) obj)).build();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        n.d(build, str);
        return build;
    }

    @Override // x0.k
    public Object a(InputStream inputStream, Continuation<? super d> continuation) {
        z0.f a10 = z0.d.f32247a.a(inputStream);
        a1.a b10 = e.b(new d.b[0]);
        Map<String, z0.h> M = a10.M();
        n.d(M, "preferencesProto.preferencesMap");
        for (Map.Entry<String, z0.h> entry : M.entrySet()) {
            String name = entry.getKey();
            z0.h value = entry.getValue();
            h hVar = f51a;
            n.d(name, "name");
            n.d(value, "value");
            hVar.d(name, value, b10);
        }
        return b10.d();
    }

    @Override // x0.k
    /* renamed from: e */
    public d b() {
        return e.a();
    }

    public final String f() {
        return f52b;
    }

    @Override // x0.k
    /* renamed from: h */
    public Object c(d dVar, OutputStream outputStream, Continuation<? super v> continuation) {
        Map<d.a<?>, Object> a10 = dVar.a();
        f.a P = z0.f.P();
        for (Map.Entry<d.a<?>, Object> entry : a10.entrySet()) {
            P.x(entry.getKey().a(), g(entry.getValue()));
        }
        P.build().o(outputStream);
        return v.f7137a;
    }
}
