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
import nf.C9712a;
import nf.EnumC9713b;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.z0 */
/* loaded from: classes3.dex */
public final class C8917z0 {

    /* renamed from: a */
    private static final Logger f21161a = Logger.getLogger(C8917z0.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.z0$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21162a;

        static {
            int[] iArr = new int[EnumC9713b.values().length];
            f21162a = iArr;
            try {
                iArr[EnumC9713b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21162a[EnumC9713b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21162a[EnumC9713b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21162a[EnumC9713b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21162a[EnumC9713b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21162a[EnumC9713b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private C8917z0() {
    }

    /* renamed from: a */
    public static Object m26030a(String str) {
        C9712a c9712a = new C9712a(new StringReader(str));
        try {
            return m26034e(c9712a);
        } finally {
            try {
                c9712a.close();
            } catch (IOException e10) {
                f21161a.log(Level.WARNING, "Failed to close", (Throwable) e10);
            }
        }
    }

    /* renamed from: b */
    private static List<?> m26031b(C9712a c9712a) {
        c9712a.mo18208a();
        ArrayList arrayList = new ArrayList();
        while (c9712a.mo18216q()) {
            arrayList.add(m26034e(c9712a));
        }
        C7159o.m21319v(c9712a.mo18212h0() == EnumC9713b.END_ARRAY, "Bad token: " + c9712a.mo18211f0());
        c9712a.mo18213i();
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static Void m26032c(C9712a c9712a) {
        c9712a.mo18206S();
        return null;
    }

    /* renamed from: d */
    private static Map<String, ?> m26033d(C9712a c9712a) {
        c9712a.mo18210b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (c9712a.mo18216q()) {
            linkedHashMap.put(c9712a.mo18204Q(), m26034e(c9712a));
        }
        C7159o.m21319v(c9712a.mo18212h0() == EnumC9713b.END_OBJECT, "Bad token: " + c9712a.mo18211f0());
        c9712a.mo18214j();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    private static Object m26034e(C9712a c9712a) {
        C7159o.m21319v(c9712a.mo18216q(), "unexpected end of JSON");
        switch (a.f21162a[c9712a.mo18212h0().ordinal()]) {
            case 1:
                return m26031b(c9712a);
            case 2:
                return m26033d(c9712a);
            case 3:
                return c9712a.mo18209a0();
            case 4:
                return Double.valueOf(c9712a.mo18200H());
            case 5:
                return Boolean.valueOf(c9712a.mo18199E());
            case 6:
                return m26032c(c9712a);
            default:
                throw new IllegalStateException("Bad token: " + c9712a.mo18211f0());
        }
    }
}
