package p366tb;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p179jb.C9019k;

/* renamed from: tb.c */
/* loaded from: classes2.dex */
public final class C11236c {

    /* renamed from: a */
    private final C11234a f29150a;

    /* renamed from: b */
    private final List<c> f29151b;

    /* renamed from: c */
    private final Integer f29152c;

    /* renamed from: tb.c$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private ArrayList<c> f29153a = new ArrayList<>();

        /* renamed from: b */
        private C11234a f29154b = C11234a.f29147b;

        /* renamed from: c */
        private Integer f29155c = null;

        /* renamed from: c */
        private boolean m35114c(int i10) {
            Iterator<c> it = this.f29153a.iterator();
            while (it.hasNext()) {
                if (it.next().m35119a() == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public b m35115a(C9019k c9019k, int i10, String str, String str2) {
            ArrayList<c> arrayList = this.f29153a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(c9019k, i10, str, str2));
            return this;
        }

        /* renamed from: b */
        public C11236c m35116b() {
            if (this.f29153a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f29155c;
            if (num != null && !m35114c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            C11236c c11236c = new C11236c(this.f29154b, Collections.unmodifiableList(this.f29153a), this.f29155c);
            this.f29153a = null;
            return c11236c;
        }

        /* renamed from: d */
        public b m35117d(C11234a c11234a) {
            if (this.f29153a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f29154b = c11234a;
            return this;
        }

        /* renamed from: e */
        public b m35118e(int i10) {
            if (this.f29153a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f29155c = Integer.valueOf(i10);
            return this;
        }
    }

    /* renamed from: tb.c$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final C9019k f29156a;

        /* renamed from: b */
        private final int f29157b;

        /* renamed from: c */
        private final String f29158c;

        /* renamed from: d */
        private final String f29159d;

        private c(C9019k c9019k, int i10, String str, String str2) {
            this.f29156a = c9019k;
            this.f29157b = i10;
            this.f29158c = str;
            this.f29159d = str2;
        }

        /* renamed from: a */
        public int m35119a() {
            return this.f29157b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29156a == cVar.f29156a && this.f29157b == cVar.f29157b && this.f29158c.equals(cVar.f29158c) && this.f29159d.equals(cVar.f29159d);
        }

        public int hashCode() {
            return Objects.hash(this.f29156a, Integer.valueOf(this.f29157b), this.f29158c, this.f29159d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f29156a, Integer.valueOf(this.f29157b), this.f29158c, this.f29159d);
        }
    }

    private C11236c(C11234a c11234a, List<c> list, Integer num) {
        this.f29150a = c11234a;
        this.f29151b = list;
        this.f29152c = num;
    }

    /* renamed from: a */
    public static b m35113a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11236c)) {
            return false;
        }
        C11236c c11236c = (C11236c) obj;
        return this.f29150a.equals(c11236c.f29150a) && this.f29151b.equals(c11236c.f29151b) && Objects.equals(this.f29152c, c11236c.f29152c);
    }

    public int hashCode() {
        return Objects.hash(this.f29150a, this.f29151b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f29150a, this.f29151b, this.f29152c);
    }
}
