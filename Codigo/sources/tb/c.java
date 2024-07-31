package tb;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jb.k;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final tb.a f26854a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C0440c> f26855b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f26856c;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<C0440c> f26857a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private tb.a f26858b = tb.a.f26851b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f26859c = null;

        private boolean c(int i10) {
            Iterator<C0440c> it = this.f26857a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i10, String str, String str2) {
            ArrayList<C0440c> arrayList = this.f26857a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0440c(kVar, i10, str, str2));
            return this;
        }

        public c b() {
            if (this.f26857a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f26859c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f26858b, Collections.unmodifiableList(this.f26857a), this.f26859c);
            this.f26857a = null;
            return cVar;
        }

        public b d(tb.a aVar) {
            if (this.f26857a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f26858b = aVar;
            return this;
        }

        public b e(int i10) {
            if (this.f26857a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f26859c = Integer.valueOf(i10);
            return this;
        }
    }

    /* renamed from: tb.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0440c {

        /* renamed from: a, reason: collision with root package name */
        private final k f26860a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26861b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26862c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26863d;

        private C0440c(k kVar, int i10, String str, String str2) {
            this.f26860a = kVar;
            this.f26861b = i10;
            this.f26862c = str;
            this.f26863d = str2;
        }

        public int a() {
            return this.f26861b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0440c)) {
                return false;
            }
            C0440c c0440c = (C0440c) obj;
            return this.f26860a == c0440c.f26860a && this.f26861b == c0440c.f26861b && this.f26862c.equals(c0440c.f26862c) && this.f26863d.equals(c0440c.f26863d);
        }

        public int hashCode() {
            return Objects.hash(this.f26860a, Integer.valueOf(this.f26861b), this.f26862c, this.f26863d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f26860a, Integer.valueOf(this.f26861b), this.f26862c, this.f26863d);
        }
    }

    private c(tb.a aVar, List<C0440c> list, Integer num) {
        this.f26854a = aVar;
        this.f26855b = list;
        this.f26856c = num;
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26854a.equals(cVar.f26854a) && this.f26855b.equals(cVar.f26855b) && Objects.equals(this.f26856c, cVar.f26856c);
    }

    public int hashCode() {
        return Objects.hash(this.f26854a, this.f26855b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f26854a, this.f26855b, this.f26856c);
    }
}
