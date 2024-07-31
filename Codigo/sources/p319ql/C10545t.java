package p319ql;

import ck.C2028m;
import ck.C2033r;
import dk.C7031r;
import dk.C7039w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9309b;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p187jk.C9082c;
import p341rl.C10727d;
import p450xk.C12524p;
import p450xk.C12525q;
import pk.InterfaceC10201a;

/* renamed from: ql.t */
/* loaded from: classes3.dex */
public final class C10545t implements Iterable<C2028m<? extends String, ? extends String>>, InterfaceC10201a {

    /* renamed from: b */
    public static final b f26452b = new b(null);

    /* renamed from: a */
    private final String[] f26453a;

    /* renamed from: ql.t$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List<String> f26454a = new ArrayList(20);

        /* renamed from: a */
        public final a m31851a(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            b bVar = C10545t.f26452b;
            bVar.m31862d(name);
            bVar.m31863e(value, name);
            m31853c(name, value);
            return this;
        }

        /* renamed from: b */
        public final a m31852b(String line) {
            int m41071T;
            C9322n.m27781e(line, "line");
            m41071T = C12525q.m41071T(line, ':', 1, false, 4, null);
            if (m41071T != -1) {
                String substring = line.substring(0, m41071T);
                C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(m41071T + 1);
                C9322n.m27780d(substring2, "this as java.lang.String).substring(startIndex)");
                m31853c(substring, substring2);
            } else {
                if (line.charAt(0) == ':') {
                    line = line.substring(1);
                    C9322n.m27780d(line, "this as java.lang.String).substring(startIndex)");
                }
                m31853c("", line);
            }
            return this;
        }

        /* renamed from: c */
        public final a m31853c(String name, String value) {
            CharSequence m41062K0;
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31856f().add(name);
            List<String> m31856f = m31856f();
            m41062K0 = C12525q.m41062K0(value);
            m31856f.add(m41062K0.toString());
            return this;
        }

        /* renamed from: d */
        public final a m31854d(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            C10545t.f26452b.m31862d(name);
            m31853c(name, value);
            return this;
        }

        /* renamed from: e */
        public final C10545t m31855e() {
            Object[] array = this.f26454a.toArray(new String[0]);
            if (array != null) {
                return new C10545t((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: f */
        public final List<String> m31856f() {
            return this.f26454a;
        }

        /* renamed from: g */
        public final a m31857g(String name) {
            boolean m41037r;
            C9322n.m27781e(name, "name");
            int i10 = 0;
            while (i10 < m31856f().size()) {
                m41037r = C12524p.m41037r(name, m31856f().get(i10), true);
                if (m41037r) {
                    m31856f().remove(i10);
                    m31856f().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: h */
        public final a m31858h(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            b bVar = C10545t.f26452b;
            bVar.m31862d(name);
            bVar.m31863e(value, name);
            m31857g(name);
            m31853c(name, value);
            return this;
        }
    }

    /* renamed from: ql.t$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m31862d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (!('!' <= charAt && charAt < 127)) {
                    throw new IllegalArgumentException(C10727d.m32660t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:2:0x0006->B:13:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m31863e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = p341rl.C10727d.m32660t(r1, r0)
                boolean r9 = p341rl.C10727d.m32621G(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.C9322n.m27787k(r9, r8)
            L4d:
                java.lang.String r8 = kotlin.jvm.internal.C9322n.m27787k(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10545t.b.m31863e(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m31864f(String[] strArr, String str) {
            boolean m41037r;
            int length = strArr.length - 2;
            int m26687c = C9082c.m26687c(length, 0, -2);
            if (m26687c > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                m41037r = C12524p.m41037r(str, strArr[length], true);
                if (m41037r) {
                    return strArr[length + 1];
                }
                if (length == m26687c) {
                    return null;
                }
                length = i10;
            }
        }

        /* renamed from: g */
        public final C10545t m31865g(String... namesAndValues) {
            CharSequence m41062K0;
            C9322n.m27781e(namesAndValues, "namesAndValues");
            int i10 = 0;
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr[i11];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                m41062K0 = C12525q.m41062K0(str);
                strArr[i11] = m41062K0.toString();
                i11 = i12;
            }
            int m26687c = C9082c.m26687c(0, strArr.length - 1, 2);
            if (m26687c >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    m31862d(str2);
                    m31863e(str3, str2);
                    if (i10 == m26687c) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new C10545t(strArr, null);
        }
    }

    private C10545t(String[] strArr) {
        this.f26453a = strArr;
    }

    public /* synthetic */ C10545t(String[] strArr, C9315g c9315g) {
        this(strArr);
    }

    /* renamed from: c */
    public final String m31845c(String name) {
        C9322n.m27781e(name, "name");
        return f26452b.m31864f(this.f26453a, name);
    }

    /* renamed from: d */
    public final String m31846d(int i10) {
        return this.f26453a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10545t) && Arrays.equals(this.f26453a, ((C10545t) obj).f26453a);
    }

    /* renamed from: f */
    public final Set<String> m31847f() {
        Comparator m41038s;
        m41038s = C12524p.m41038s(C9308a0.f22565a);
        TreeSet treeSet = new TreeSet(m41038s);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(m31846d(i10));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C9322n.m27780d(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f26453a);
    }

    @Override // java.lang.Iterable
    public Iterator<C2028m<? extends String, ? extends String>> iterator() {
        int size = size();
        C2028m[] c2028mArr = new C2028m[size];
        for (int i10 = 0; i10 < size; i10++) {
            c2028mArr[i10] = C2033r.m10353a(m31846d(i10), m31849l(i10));
        }
        return C9309b.m27756a(c2028mArr);
    }

    /* renamed from: k */
    public final a m31848k() {
        a aVar = new a();
        C7039w.m20598v(aVar.m31856f(), this.f26453a);
        return aVar;
    }

    /* renamed from: l */
    public final String m31849l(int i10) {
        return this.f26453a[(i10 * 2) + 1];
    }

    /* renamed from: m */
    public final List<String> m31850m(String name) {
        List<String> m20582j;
        boolean m41037r;
        C9322n.m27781e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            m41037r = C12524p.m41037r(name, m31846d(i10), true);
            if (m41037r) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m31849l(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C9322n.m27780d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f26453a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String m31846d = m31846d(i10);
            String m31849l = m31849l(i10);
            sb2.append(m31846d);
            sb2.append(": ");
            if (C10727d.m32621G(m31846d)) {
                m31849l = "██";
            }
            sb2.append(m31849l);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
