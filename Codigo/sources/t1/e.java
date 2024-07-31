package t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import r1.l;
import v1.i;
import xk.p;
import xk.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e */
    public static final b f25736e = new b(null);

    /* renamed from: a */
    public final String f25737a;

    /* renamed from: b */
    public final Map<String, a> f25738b;

    /* renamed from: c */
    public final Set<c> f25739c;

    /* renamed from: d */
    public final Set<C0434e> f25740d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: h */
        public static final C0433a f25741h = new C0433a(null);

        /* renamed from: a */
        public final String f25742a;

        /* renamed from: b */
        public final String f25743b;

        /* renamed from: c */
        public final boolean f25744c;

        /* renamed from: d */
        public final int f25745d;

        /* renamed from: e */
        public final String f25746e;

        /* renamed from: f */
        public final int f25747f;

        /* renamed from: g */
        public final int f25748g;

        /* renamed from: t1.e$a$a */
        /* loaded from: classes.dex */
        public static final class C0433a {
            private C0433a() {
            }

            public /* synthetic */ C0433a(g gVar) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                CharSequence K0;
                n.e(current, "current");
                if (n.a(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                K0 = q.K0(substring);
                return n.a(K0.toString(), str);
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            n.e(name, "name");
            n.e(type, "type");
            this.f25742a = name;
            this.f25743b = type;
            this.f25744c = z10;
            this.f25745d = i10;
            this.f25746e = str;
            this.f25747f = i11;
            this.f25748g = a(type);
        }

        private final int a(String str) {
            boolean J;
            boolean J2;
            boolean J3;
            boolean J4;
            boolean J5;
            boolean J6;
            boolean J7;
            boolean J8;
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            n.d(US, "US");
            String upperCase = str.toUpperCase(US);
            n.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            J = q.J(upperCase, "INT", false, 2, null);
            if (J) {
                return 3;
            }
            J2 = q.J(upperCase, "CHAR", false, 2, null);
            if (!J2) {
                J3 = q.J(upperCase, "CLOB", false, 2, null);
                if (!J3) {
                    J4 = q.J(upperCase, "TEXT", false, 2, null);
                    if (!J4) {
                        J5 = q.J(upperCase, "BLOB", false, 2, null);
                        if (J5) {
                            return 5;
                        }
                        J6 = q.J(upperCase, "REAL", false, 2, null);
                        if (J6) {
                            return 4;
                        }
                        J7 = q.J(upperCase, "FLOA", false, 2, null);
                        if (J7) {
                            return 4;
                        }
                        J8 = q.J(upperCase, "DOUB", false, 2, null);
                        return J8 ? 4 : 1;
                    }
                }
            }
            return 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
        
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof t1.e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.f25745d
                r3 = r7
                t1.e$a r3 = (t1.e.a) r3
                int r3 = r3.f25745d
                if (r1 == r3) goto L14
                return r2
            L14:
                java.lang.String r1 = r6.f25742a
                t1.e$a r7 = (t1.e.a) r7
                java.lang.String r3 = r7.f25742a
                boolean r1 = kotlin.jvm.internal.n.a(r1, r3)
                if (r1 != 0) goto L21
                return r2
            L21:
                boolean r1 = r6.f25744c
                boolean r3 = r7.f25744c
                if (r1 == r3) goto L28
                return r2
            L28:
                int r1 = r6.f25747f
                r3 = 2
                if (r1 != r0) goto L40
                int r1 = r7.f25747f
                if (r1 != r3) goto L40
                java.lang.String r1 = r6.f25746e
                if (r1 == 0) goto L40
                t1.e$a$a r4 = t1.e.a.f25741h
                java.lang.String r5 = r7.f25746e
                boolean r1 = r4.b(r1, r5)
                if (r1 != 0) goto L40
                return r2
            L40:
                int r1 = r6.f25747f
                if (r1 != r3) goto L57
                int r1 = r7.f25747f
                if (r1 != r0) goto L57
                java.lang.String r1 = r7.f25746e
                if (r1 == 0) goto L57
                t1.e$a$a r3 = t1.e.a.f25741h
                java.lang.String r4 = r6.f25746e
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L57
                return r2
            L57:
                int r1 = r6.f25747f
                if (r1 == 0) goto L78
                int r3 = r7.f25747f
                if (r1 != r3) goto L78
                java.lang.String r1 = r6.f25746e
                if (r1 == 0) goto L6e
                t1.e$a$a r3 = t1.e.a.f25741h
                java.lang.String r4 = r7.f25746e
                boolean r1 = r3.b(r1, r4)
                if (r1 != 0) goto L74
                goto L72
            L6e:
                java.lang.String r1 = r7.f25746e
                if (r1 == 0) goto L74
            L72:
                r1 = r0
                goto L75
            L74:
                r1 = r2
            L75:
                if (r1 == 0) goto L78
                return r2
            L78:
                int r1 = r6.f25748g
                int r7 = r7.f25748g
                if (r1 != r7) goto L7f
                goto L80
            L7f:
                r0 = r2
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.e.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.f25742a.hashCode() * 31) + this.f25748g) * 31) + (this.f25744c ? 1231 : 1237)) * 31) + this.f25745d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f25742a);
            sb2.append("', type='");
            sb2.append(this.f25743b);
            sb2.append("', affinity='");
            sb2.append(this.f25748g);
            sb2.append("', notNull=");
            sb2.append(this.f25744c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f25745d);
            sb2.append(", defaultValue='");
            String str = this.f25746e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final e a(i database, String tableName) {
            n.e(database, "database");
            n.e(tableName, "tableName");
            return f.f(database, tableName);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final String f25749a;

        /* renamed from: b */
        public final String f25750b;

        /* renamed from: c */
        public final String f25751c;

        /* renamed from: d */
        public final List<String> f25752d;

        /* renamed from: e */
        public final List<String> f25753e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            n.e(referenceTable, "referenceTable");
            n.e(onDelete, "onDelete");
            n.e(onUpdate, "onUpdate");
            n.e(columnNames, "columnNames");
            n.e(referenceColumnNames, "referenceColumnNames");
            this.f25749a = referenceTable;
            this.f25750b = onDelete;
            this.f25751c = onUpdate;
            this.f25752d = columnNames;
            this.f25753e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (n.a(this.f25749a, cVar.f25749a) && n.a(this.f25750b, cVar.f25750b) && n.a(this.f25751c, cVar.f25751c) && n.a(this.f25752d, cVar.f25752d)) {
                return n.a(this.f25753e, cVar.f25753e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f25749a.hashCode() * 31) + this.f25750b.hashCode()) * 31) + this.f25751c.hashCode()) * 31) + this.f25752d.hashCode()) * 31) + this.f25753e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f25749a + "', onDelete='" + this.f25750b + " +', onUpdate='" + this.f25751c + "', columnNames=" + this.f25752d + ", referenceColumnNames=" + this.f25753e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        private final int f25754a;

        /* renamed from: b */
        private final int f25755b;

        /* renamed from: c */
        private final String f25756c;

        /* renamed from: d */
        private final String f25757d;

        public d(int i10, int i11, String from, String to) {
            n.e(from, "from");
            n.e(to, "to");
            this.f25754a = i10;
            this.f25755b = i11;
            this.f25756c = from;
            this.f25757d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d other) {
            n.e(other, "other");
            int i10 = this.f25754a - other.f25754a;
            return i10 == 0 ? this.f25755b - other.f25755b : i10;
        }

        public final String h() {
            return this.f25756c;
        }

        public final int i() {
            return this.f25754a;
        }

        public final String l() {
            return this.f25757d;
        }
    }

    /* renamed from: t1.e$e */
    /* loaded from: classes.dex */
    public static final class C0434e {

        /* renamed from: e */
        public static final a f25758e = new a(null);

        /* renamed from: a */
        public final String f25759a;

        /* renamed from: b */
        public final boolean f25760b;

        /* renamed from: c */
        public final List<String> f25761c;

        /* renamed from: d */
        public List<String> f25762d;

        /* renamed from: t1.e$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C0434e(String name, boolean z10, List<String> columns, List<String> orders) {
            n.e(name, "name");
            n.e(columns, "columns");
            n.e(orders, "orders");
            this.f25759a = name;
            this.f25760b = z10;
            this.f25761c = columns;
            this.f25762d = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list.add(l.ASC.name());
                }
            }
            this.f25762d = (List) list;
        }

        public boolean equals(Object obj) {
            boolean E;
            boolean E2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0434e)) {
                return false;
            }
            C0434e c0434e = (C0434e) obj;
            if (this.f25760b != c0434e.f25760b || !n.a(this.f25761c, c0434e.f25761c) || !n.a(this.f25762d, c0434e.f25762d)) {
                return false;
            }
            E = p.E(this.f25759a, "index_", false, 2, null);
            if (!E) {
                return n.a(this.f25759a, c0434e.f25759a);
            }
            E2 = p.E(c0434e.f25759a, "index_", false, 2, null);
            return E2;
        }

        public int hashCode() {
            boolean E;
            E = p.E(this.f25759a, "index_", false, 2, null);
            return ((((((E ? -1184239155 : this.f25759a.hashCode()) * 31) + (this.f25760b ? 1 : 0)) * 31) + this.f25761c.hashCode()) * 31) + this.f25762d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f25759a + "', unique=" + this.f25760b + ", columns=" + this.f25761c + ", orders=" + this.f25762d + "'}";
        }
    }

    public e(String name, Map<String, a> columns, Set<c> foreignKeys, Set<C0434e> set) {
        n.e(name, "name");
        n.e(columns, "columns");
        n.e(foreignKeys, "foreignKeys");
        this.f25737a = name;
        this.f25738b = columns;
        this.f25739c = foreignKeys;
        this.f25740d = set;
    }

    public static final e a(i iVar, String str) {
        return f25736e.a(iVar, str);
    }

    public boolean equals(Object obj) {
        Set<C0434e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!n.a(this.f25737a, eVar.f25737a) || !n.a(this.f25738b, eVar.f25738b) || !n.a(this.f25739c, eVar.f25739c)) {
            return false;
        }
        Set<C0434e> set2 = this.f25740d;
        if (set2 == null || (set = eVar.f25740d) == null) {
            return true;
        }
        return n.a(set2, set);
    }

    public int hashCode() {
        return (((this.f25737a.hashCode() * 31) + this.f25738b.hashCode()) * 31) + this.f25739c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f25737a + "', columns=" + this.f25738b + ", foreignKeys=" + this.f25739c + ", indices=" + this.f25740d + '}';
    }
}
