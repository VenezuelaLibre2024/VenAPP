package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f19410a = Logger.getLogger(z0.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19411a;

        static {
            int[] iArr = new int[nf.b.values().length];
            f19411a = iArr;
            try {
                iArr[nf.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19411a[nf.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19411a[nf.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19411a[nf.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19411a[nf.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19411a[nf.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private z0() {
    }

    public static Object a(String str) {
        nf.a aVar = new nf.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e10) {
                f19410a.log(Level.WARNING, "Failed to close", (Throwable) e10);
            }
        }
    }

    private static List<?> b(nf.a aVar) {
        aVar.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.q()) {
            arrayList.add(e(aVar));
        }
        eb.o.v(aVar.h0() == nf.b.END_ARRAY, "Bad token: " + aVar.f0());
        aVar.i();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(nf.a aVar) {
        aVar.S();
        return null;
    }

    private static Map<String, ?> d(nf.a aVar) {
        aVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.q()) {
            linkedHashMap.put(aVar.Q(), e(aVar));
        }
        eb.o.v(aVar.h0() == nf.b.END_OBJECT, "Bad token: " + aVar.f0());
        aVar.j();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(nf.a aVar) {
        eb.o.v(aVar.q(), "unexpected end of JSON");
        switch (a.f19411a[aVar.h0().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.a0();
            case 4:
                return Double.valueOf(aVar.H());
            case 5:
                return Boolean.valueOf(aVar.E());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.f0());
        }
    }
}
