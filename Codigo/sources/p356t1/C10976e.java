package p356t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p322r1.EnumC10595l;
import p391v1.InterfaceC11610i;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: t1.e */
/* loaded from: classes.dex */
public final class C10976e {

    /* renamed from: e */
    public static final b f27880e = new b(null);

    /* renamed from: a */
    public final String f27881a;

    /* renamed from: b */
    public final Map<String, a> f27882b;

    /* renamed from: c */
    public final Set<c> f27883c;

    /* renamed from: d */
    public final Set<e> f27884d;

    /* renamed from: t1.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: h */
        public static final C13254a f27885h = new C13254a(null);

        /* renamed from: a */
        public final String f27886a;

        /* renamed from: b */
        public final String f27887b;

        /* renamed from: c */
        public final boolean f27888c;

        /* renamed from: d */
        public final int f27889d;

        /* renamed from: e */
        public final String f27890e;

        /* renamed from: f */
        public final int f27891f;

        /* renamed from: g */
        public final int f27892g;

        /* renamed from: t1.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13254a {
            private C13254a() {
            }

            public /* synthetic */ C13254a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            private final boolean m33495a(String str) {
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

            /* renamed from: b */
            public final boolean m33496b(String current, String str) {
                CharSequence m41062K0;
                C9322n.m27781e(current, "current");
                if (C9322n.m27777a(current, str)) {
                    return true;
                }
                if (!m33495a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                m41062K0 = C12525q.m41062K0(substring);
                return C9322n.m27777a(m41062K0.toString(), str);
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(type, "type");
            this.f27886a = name;
            this.f27887b = type;
            this.f27888c = z10;
            this.f27889d = i10;
            this.f27890e = str;
            this.f27891f = i11;
            this.f27892g = m33494a(type);
        }

        /* renamed from: a */
        private final int m33494a(String str) {
            boolean m41059J;
            boolean m41059J2;
            boolean m41059J3;
            boolean m41059J4;
            boolean m41059J5;
            boolean m41059J6;
            boolean m41059J7;
            boolean m41059J8;
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String upperCase = str.toUpperCase(US);
            C9322n.m27780d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            m41059J = C12525q.m41059J(upperCase, "INT", false, 2, null);
            if (m41059J) {
                return 3;
            }
            m41059J2 = C12525q.m41059J(upperCase, "CHAR", false, 2, null);
            if (!m41059J2) {
                m41059J3 = C12525q.m41059J(upperCase, "CLOB", false, 2, null);
                if (!m41059J3) {
                    m41059J4 = C12525q.m41059J(upperCase, "TEXT", false, 2, null);
                    if (!m41059J4) {
                        m41059J5 = C12525q.m41059J(upperCase, "BLOB", false, 2, null);
                        if (m41059J5) {
                            return 5;
                        }
                        m41059J6 = C12525q.m41059J(upperCase, "REAL", false, 2, null);
                        if (m41059J6) {
                            return 4;
                        }
                        m41059J7 = C12525q.m41059J(upperCase, "FLOA", false, 2, null);
                        if (m41059J7) {
                            return 4;
                        }
                        m41059J8 = C12525q.m41059J(upperCase, "DOUB", false, 2, null);
                        return m41059J8 ? 4 : 1;
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
                boolean r1 = r7 instanceof p356t1.C10976e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.f27889d
                r3 = r7
                t1.e$a r3 = (p356t1.C10976e.a) r3
                int r3 = r3.f27889d
                if (r1 == r3) goto L14
                return r2
            L14:
                java.lang.String r1 = r6.f27886a
                t1.e$a r7 = (p356t1.C10976e.a) r7
                java.lang.String r3 = r7.f27886a
                boolean r1 = kotlin.jvm.internal.C9322n.m27777a(r1, r3)
                if (r1 != 0) goto L21
                return r2
            L21:
                boolean r1 = r6.f27888c
                boolean r3 = r7.f27888c
                if (r1 == r3) goto L28
                return r2
            L28:
                int r1 = r6.f27891f
                r3 = 2
                if (r1 != r0) goto L40
                int r1 = r7.f27891f
                if (r1 != r3) goto L40
                java.lang.String r1 = r6.f27890e
                if (r1 == 0) goto L40
                t1.e$a$a r4 = p356t1.C10976e.a.f27885h
                java.lang.String r5 = r7.f27890e
                boolean r1 = r4.m33496b(r1, r5)
                if (r1 != 0) goto L40
                return r2
            L40:
                int r1 = r6.f27891f
                if (r1 != r3) goto L57
                int r1 = r7.f27891f
                if (r1 != r0) goto L57
                java.lang.String r1 = r7.f27890e
                if (r1 == 0) goto L57
                t1.e$a$a r3 = p356t1.C10976e.a.f27885h
                java.lang.String r4 = r6.f27890e
                boolean r1 = r3.m33496b(r1, r4)
                if (r1 != 0) goto L57
                return r2
            L57:
                int r1 = r6.f27891f
                if (r1 == 0) goto L78
                int r3 = r7.f27891f
                if (r1 != r3) goto L78
                java.lang.String r1 = r6.f27890e
                if (r1 == 0) goto L6e
                t1.e$a$a r3 = p356t1.C10976e.a.f27885h
                java.lang.String r4 = r7.f27890e
                boolean r1 = r3.m33496b(r1, r4)
                if (r1 != 0) goto L74
                goto L72
            L6e:
                java.lang.String r1 = r7.f27890e
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
                int r1 = r6.f27892g
                int r7 = r7.f27892g
                if (r1 != r7) goto L7f
                goto L80
            L7f:
                r0 = r2
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p356t1.C10976e.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.f27886a.hashCode() * 31) + this.f27892g) * 31) + (this.f27888c ? 1231 : 1237)) * 31) + this.f27889d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f27886a);
            sb2.append("', type='");
            sb2.append(this.f27887b);
            sb2.append("', affinity='");
            sb2.append(this.f27892g);
            sb2.append("', notNull=");
            sb2.append(this.f27888c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f27889d);
            sb2.append(", defaultValue='");
            String str = this.f27890e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* renamed from: t1.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C10976e m33497a(InterfaceC11610i database, String tableName) {
            C9322n.m27781e(database, "database");
            C9322n.m27781e(tableName, "tableName");
            return C10977f.m33507f(database, tableName);
        }
    }

    /* renamed from: t1.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final String f27893a;

        /* renamed from: b */
        public final String f27894b;

        /* renamed from: c */
        public final String f27895c;

        /* renamed from: d */
        public final List<String> f27896d;

        /* renamed from: e */
        public final List<String> f27897e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            C9322n.m27781e(referenceTable, "referenceTable");
            C9322n.m27781e(onDelete, "onDelete");
            C9322n.m27781e(onUpdate, "onUpdate");
            C9322n.m27781e(columnNames, "columnNames");
            C9322n.m27781e(referenceColumnNames, "referenceColumnNames");
            this.f27893a = referenceTable;
            this.f27894b = onDelete;
            this.f27895c = onUpdate;
            this.f27896d = columnNames;
            this.f27897e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C9322n.m27777a(this.f27893a, cVar.f27893a) && C9322n.m27777a(this.f27894b, cVar.f27894b) && C9322n.m27777a(this.f27895c, cVar.f27895c) && C9322n.m27777a(this.f27896d, cVar.f27896d)) {
                return C9322n.m27777a(this.f27897e, cVar.f27897e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27893a.hashCode() * 31) + this.f27894b.hashCode()) * 31) + this.f27895c.hashCode()) * 31) + this.f27896d.hashCode()) * 31) + this.f27897e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f27893a + "', onDelete='" + this.f27894b + " +', onUpdate='" + this.f27895c + "', columnNames=" + this.f27896d + ", referenceColumnNames=" + this.f27897e + '}';
        }
    }

    /* renamed from: t1.e$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        private final int f27898a;

        /* renamed from: b */
        private final int f27899b;

        /* renamed from: c */
        private final String f27900c;

        /* renamed from: d */
        private final String f27901d;

        public d(int i10, int i11, String from, String to) {
            C9322n.m27781e(from, "from");
            C9322n.m27781e(to, "to");
            this.f27898a = i10;
            this.f27899b = i11;
            this.f27900c = from;
            this.f27901d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            C9322n.m27781e(other, "other");
            int i10 = this.f27898a - other.f27898a;
            return i10 == 0 ? this.f27899b - other.f27899b : i10;
        }

        /* renamed from: h */
        public final String m33499h() {
            return this.f27900c;
        }

        /* renamed from: i */
        public final int m33500i() {
            return this.f27898a;
        }

        /* renamed from: l */
        public final String m33501l() {
            return this.f27901d;
        }
    }

    /* renamed from: t1.e$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: e */
        public static final a f27902e = new a(null);

        /* renamed from: a */
        public final String f27903a;

        /* renamed from: b */
        public final boolean f27904b;

        /* renamed from: c */
        public final List<String> f27905c;

        /* renamed from: d */
        public List<String> f27906d;

        /* renamed from: t1.e$e$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z10, List<String> columns, List<String> orders) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(columns, "columns");
            C9322n.m27781e(orders, "orders");
            this.f27903a = name;
            this.f27904b = z10;
            this.f27905c = columns;
            this.f27906d = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    list.add(EnumC10595l.ASC.name());
                }
            }
            this.f27906d = (List) list;
        }

        public boolean equals(Object obj) {
            boolean m41031E;
            boolean m41031E2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f27904b != eVar.f27904b || !C9322n.m27777a(this.f27905c, eVar.f27905c) || !C9322n.m27777a(this.f27906d, eVar.f27906d)) {
                return false;
            }
            m41031E = C12524p.m41031E(this.f27903a, "index_", false, 2, null);
            if (!m41031E) {
                return C9322n.m27777a(this.f27903a, eVar.f27903a);
            }
            m41031E2 = C12524p.m41031E(eVar.f27903a, "index_", false, 2, null);
            return m41031E2;
        }

        public int hashCode() {
            boolean m41031E;
            m41031E = C12524p.m41031E(this.f27903a, "index_", false, 2, null);
            return ((((((m41031E ? -1184239155 : this.f27903a.hashCode()) * 31) + (this.f27904b ? 1 : 0)) * 31) + this.f27905c.hashCode()) * 31) + this.f27906d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f27903a + "', unique=" + this.f27904b + ", columns=" + this.f27905c + ", orders=" + this.f27906d + "'}";
        }
    }

    public C10976e(String name, Map<String, a> columns, Set<c> foreignKeys, Set<e> set) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(columns, "columns");
        C9322n.m27781e(foreignKeys, "foreignKeys");
        this.f27881a = name;
        this.f27882b = columns;
        this.f27883c = foreignKeys;
        this.f27884d = set;
    }

    /* renamed from: a */
    public static final C10976e m33493a(InterfaceC11610i interfaceC11610i, String str) {
        return f27880e.m33497a(interfaceC11610i, str);
    }

    public boolean equals(Object obj) {
        Set<e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10976e)) {
            return false;
        }
        C10976e c10976e = (C10976e) obj;
        if (!C9322n.m27777a(this.f27881a, c10976e.f27881a) || !C9322n.m27777a(this.f27882b, c10976e.f27882b) || !C9322n.m27777a(this.f27883c, c10976e.f27883c)) {
            return false;
        }
        Set<e> set2 = this.f27884d;
        if (set2 == null || (set = c10976e.f27884d) == null) {
            return true;
        }
        return C9322n.m27777a(set2, set);
    }

    public int hashCode() {
        return (((this.f27881a.hashCode() * 31) + this.f27882b.hashCode()) * 31) + this.f27883c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f27881a + "', columns=" + this.f27882b + ", foreignKeys=" + this.f27883c + ", indices=" + this.f27884d + '}';
    }
}
