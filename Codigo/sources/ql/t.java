package ql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class t implements Iterable<ck.m<? extends String, ? extends String>>, pk.a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f24358b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String[] f24359a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f24360a = new ArrayList(20);

        public final a a(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            b bVar = t.f24358b;
            bVar.d(name);
            bVar.e(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            int T;
            kotlin.jvm.internal.n.e(line, "line");
            T = xk.q.T(line, ':', 1, false, 4, null);
            if (T != -1) {
                String substring = line.substring(0, T);
                kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(T + 1);
                kotlin.jvm.internal.n.d(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else {
                if (line.charAt(0) == ':') {
                    line = line.substring(1);
                    kotlin.jvm.internal.n.d(line, "this as java.lang.String).substring(startIndex)");
                }
                c("", line);
            }
            return this;
        }

        public final a c(String name, String value) {
            CharSequence K0;
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            f().add(name);
            List<String> f10 = f();
            K0 = xk.q.K0(value);
            f10.add(K0.toString());
            return this;
        }

        public final a d(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            t.f24358b.d(name);
            c(name, value);
            return this;
        }

        public final t e() {
            Object[] array = this.f24360a.toArray(new String[0]);
            if (array != null) {
                return new t((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final List<String> f() {
            return this.f24360a;
        }

        public final a g(String name) {
            boolean r10;
            kotlin.jvm.internal.n.e(name, "name");
            int i10 = 0;
            while (i10 < f().size()) {
                r10 = xk.p.r(name, f().get(i10), true);
                if (r10) {
                    f().remove(i10);
                    f().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a h(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            b bVar = t.f24358b;
            bVar.d(name);
            bVar.e(value, name);
            g(name);
            c(name, value);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if (!('!' <= charAt && charAt < 127)) {
                    throw new IllegalArgumentException(rl.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
                i10 = i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:2:0x0006->B:13:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(java.lang.String r8, java.lang.String r9) {
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
                java.lang.String r0 = rl.d.t(r1, r0)
                boolean r9 = rl.d.G(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.n.k(r9, r8)
            L4d:
                java.lang.String r8 = kotlin.jvm.internal.n.k(r0, r8)
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
            throw new UnsupportedOperationException("Method not decompiled: ql.t.b.e(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            boolean r10;
            int length = strArr.length - 2;
            int c10 = jk.c.c(length, 0, -2);
            if (c10 > length) {
                return null;
            }
            while (true) {
                int i10 = length - 2;
                r10 = xk.p.r(str, strArr[length], true);
                if (r10) {
                    return strArr[length + 1];
                }
                if (length == c10) {
                    return null;
                }
                length = i10;
            }
        }

        public final t g(String... namesAndValues) {
            CharSequence K0;
            kotlin.jvm.internal.n.e(namesAndValues, "namesAndValues");
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
                K0 = xk.q.K0(str);
                strArr[i11] = K0.toString();
                i11 = i12;
            }
            int c10 = jk.c.c(0, strArr.length - 1, 2);
            if (c10 >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == c10) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new t(strArr, null);
        }
    }

    private t(String[] strArr) {
        this.f24359a = strArr;
    }

    public /* synthetic */ t(String[] strArr, kotlin.jvm.internal.g gVar) {
        this(strArr);
    }

    public final String c(String name) {
        kotlin.jvm.internal.n.e(name, "name");
        return f24358b.f(this.f24359a, name);
    }

    public final String d(int i10) {
        return this.f24359a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f24359a, ((t) obj).f24359a);
    }

    public final Set<String> f() {
        Comparator s10;
        s10 = xk.p.s(kotlin.jvm.internal.a0.f20743a);
        TreeSet treeSet = new TreeSet(s10);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(d(i10));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.n.d(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24359a);
    }

    @Override // java.lang.Iterable
    public Iterator<ck.m<? extends String, ? extends String>> iterator() {
        int size = size();
        ck.m[] mVarArr = new ck.m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = ck.r.a(d(i10), l(i10));
        }
        return kotlin.jvm.internal.b.a(mVarArr);
    }

    public final a k() {
        a aVar = new a();
        dk.w.v(aVar.f(), this.f24359a);
        return aVar;
    }

    public final String l(int i10) {
        return this.f24359a[(i10 * 2) + 1];
    }

    public final List<String> m(String name) {
        List<String> j10;
        boolean r10;
        kotlin.jvm.internal.n.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            r10 = xk.p.r(name, d(i10), true);
            if (r10) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(l(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            j10 = dk.r.j();
            return j10;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.n.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f24359a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String d10 = d(i10);
            String l10 = l(i10);
            sb2.append(d10);
            sb2.append(": ");
            if (rl.d.G(d10)) {
                l10 = "██";
            }
            sb2.append(l10);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
