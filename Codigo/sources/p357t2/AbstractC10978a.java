package p357t2;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public abstract class AbstractC10978a {

    /* renamed from: f */
    static InterfaceC10981d f27912f;

    /* renamed from: a */
    static final Set<String> f27907a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    static final Set<String> f27908b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    static final Set<String> f27909c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    static final Set<String> f27910d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    static boolean f27911e = false;

    /* renamed from: g */
    static boolean f27913g = false;

    /* renamed from: h */
    static boolean f27914h = true;

    /* renamed from: i */
    static boolean f27915i = true;

    /* renamed from: a */
    public static int m33508a(StringBuilder sb2, String str, int i10, StackTraceElement stackTraceElement, boolean z10, boolean z11, String str2) {
        String mo33529c;
        if (i10 > 0) {
            if (f27912f == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            sb2.append(str2);
            if (i10 == 1) {
                mo33529c = f27912f.mo33528b(stackTraceElement, z10, z11);
            } else {
                sb2.append(String.format("%s%s ... %d more", f27912f.mo33527a(stackTraceElement), str, Integer.valueOf(i10 - 1)));
                if (z11) {
                    mo33529c = f27912f.mo33529c(stackTraceElement);
                }
            }
            sb2.append(mo33529c);
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m33509b(String str, Set<String> set) {
        return m33510c(str, set) != null;
    }

    /* renamed from: c */
    public static String m33510c(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static StackTraceElement[] m33511d(C10983f c10983f, int i10) {
        ArrayList arrayList = new ArrayList();
        if (c10983f != null) {
            C10982e[] m33534d = c10983f.m33534d();
            for (int i11 = 0; i11 < m33534d.length && i11 < i10; i11++) {
                arrayList.add(m33534d[i11].m33530a());
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    /* renamed from: e */
    public static StackTraceElement[] m33512e(C10983f c10983f, Set<String> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (c10983f != null) {
            for (C10982e c10982e : c10983f.m33534d()) {
                String className = c10982e.m33530a().getClassName();
                if (!m33518k(className)) {
                    if (m33509b(className, set)) {
                        arrayList.addAll(arrayList2);
                        arrayList.add(c10982e.m33530a());
                    } else if (!m33509b(className, set2)) {
                        arrayList2.add(c10982e.m33530a());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    /* renamed from: f */
    public static String m33513f(C10983f c10983f) {
        return m33515h(c10983f, f27907a, f27908b, f27909c, 0, f27911e, f27913g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[LOOP:1: B:42:0x0129->B:43:0x012b, LOOP_END] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m33514g(p357t2.C10983f r22, java.lang.String r23, boolean r24, boolean r25, java.util.Set<java.lang.String> r26, java.util.Set<java.lang.String> r27, java.util.Set<java.lang.String> r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p357t2.AbstractC10978a.m33514g(t2.f, java.lang.String, boolean, boolean, java.util.Set, java.util.Set, java.util.Set, int, boolean, boolean, boolean, boolean):java.lang.String");
    }

    /* renamed from: h */
    public static String m33515h(C10983f c10983f, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11) {
        return m33516i(c10983f, set, set2, set3, i10, z10, z11, f27914h);
    }

    /* renamed from: i */
    public static String m33516i(C10983f c10983f, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11, boolean z12) {
        return m33517j(c10983f, false, false, set, set2, set3, i10, z10, z11, z12, f27915i);
    }

    /* renamed from: j */
    public static String m33517j(C10983f c10983f, boolean z10, boolean z11, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        return m33514g(c10983f, "", z10, z11, set, set2, set3, i10, z12, z13, z14, z15);
    }

    /* renamed from: k */
    public static boolean m33518k(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: l */
    public static String m33519l(Class<?> cls) {
        String url;
        int lastIndexOf;
        if (cls == null) {
            return null;
        }
        try {
            URL resource = cls.getClassLoader().getResource(cls.getName().replace('.', '/') + ".class");
            if (resource == null || (lastIndexOf = (url = resource.toString()).lastIndexOf(33)) <= 0) {
                return null;
            }
            String substring = url.substring(0, lastIndexOf);
            int lastIndexOf2 = substring.lastIndexOf(47);
            if (lastIndexOf2 > 0) {
                substring = substring.substring(lastIndexOf2 + 1);
            }
            int lastIndexOf3 = substring.lastIndexOf(92);
            return lastIndexOf3 > 0 ? substring.substring(lastIndexOf3 + 1) : substring;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static String m33520m(String str, String str2) {
        boolean z10 = str != null;
        boolean z11 = str2 != null;
        if (!z10 && !z11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" [");
        if (z10) {
            sb2.append(str);
        }
        if (z11) {
            if (z10) {
                if (!str.contains(str2)) {
                    sb2.append(":");
                }
            }
            sb2.append(str2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: n */
    public static String m33521n(String str) {
        int lastIndexOf;
        return (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(0, lastIndexOf) : "";
    }

    /* renamed from: o */
    public static void m33522o(String str) {
        f27907a.add(str);
    }

    /* renamed from: p */
    public static void m33523p(InterfaceC10981d interfaceC10981d) {
        f27912f = interfaceC10981d;
    }

    /* renamed from: q */
    public static String m33524q(InterfaceC10980c interfaceC10980c, Class<?> cls, String str) {
        try {
            Package r02 = cls.getPackage();
            if (r02 != null) {
                return r02.getImplementationVersion();
            }
            Package mo33526a = interfaceC10980c.mo33526a(cls.getClassLoader(), str);
            if (mo33526a != null) {
                return mo33526a.getImplementationVersion();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
