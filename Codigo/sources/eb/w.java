package eb;

import eb.w;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w {

    /* loaded from: classes2.dex */
    static class a<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        final v<T> f14629a;

        /* renamed from: b, reason: collision with root package name */
        volatile transient boolean f14630b;

        /* renamed from: c, reason: collision with root package name */
        transient T f14631c;

        a(v<T> vVar) {
            this.f14629a = (v) o.o(vVar);
        }

        @Override // eb.v
        public T get() {
            if (!this.f14630b) {
                synchronized (this) {
                    if (!this.f14630b) {
                        T t10 = this.f14629a.get();
                        this.f14631c = t10;
                        this.f14630b = true;
                        return t10;
                    }
                }
            }
            return (T) j.a(this.f14631c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f14630b) {
                obj = "<supplier that returned " + this.f14631c + ">";
            } else {
                obj = this.f14629a;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    static class b<T> implements v<T> {

        /* renamed from: c, reason: collision with root package name */
        private static final v<Void> f14632c = new v() { // from class: eb.x
            @Override // eb.v
            public final Object get() {
                Void b10;
                b10 = w.b.b();
                return b10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private volatile v<T> f14633a;

        /* renamed from: b, reason: collision with root package name */
        private T f14634b;

        b(v<T> vVar) {
            this.f14633a = (v) o.o(vVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // eb.v
        public T get() {
            v<T> vVar = this.f14633a;
            v<T> vVar2 = (v<T>) f14632c;
            if (vVar != vVar2) {
                synchronized (this) {
                    if (this.f14633a != vVar2) {
                        T t10 = this.f14633a.get();
                        this.f14634b = t10;
                        this.f14633a = vVar2;
                        return t10;
                    }
                }
            }
            return (T) j.a(this.f14634b);
        }

        public String toString() {
            Object obj = this.f14633a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f14632c) {
                obj = "<supplier that returned " + this.f14634b + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    private static class c<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        final T f14635a;

        c(T t10) {
            this.f14635a = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.f14635a, ((c) obj).f14635a);
            }
            return false;
        }

        @Override // eb.v
        public T get() {
            return this.f14635a;
        }

        public int hashCode() {
            return k.b(this.f14635a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f14635a + ")";
        }
    }

    public static <T> v<T> a(v<T> vVar) {
        return ((vVar instanceof b) || (vVar instanceof a)) ? vVar : vVar instanceof Serializable ? new a(vVar) : new b(vVar);
    }

    public static <T> v<T> b(T t10) {
        return new c(t10);
    }
}
