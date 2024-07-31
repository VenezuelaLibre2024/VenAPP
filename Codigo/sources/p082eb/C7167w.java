package p082eb;

import java.io.Serializable;
import p082eb.C7167w;

/* renamed from: eb.w */
/* loaded from: classes2.dex */
public final class C7167w {

    /* renamed from: eb.w$a */
    /* loaded from: classes2.dex */
    static class a<T> implements InterfaceC7166v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final InterfaceC7166v<T> f16052a;

        /* renamed from: b */
        volatile transient boolean f16053b;

        /* renamed from: c */
        transient T f16054c;

        a(InterfaceC7166v<T> interfaceC7166v) {
            this.f16052a = (InterfaceC7166v) C7159o.m21312o(interfaceC7166v);
        }

        @Override // p082eb.InterfaceC7166v
        public T get() {
            if (!this.f16053b) {
                synchronized (this) {
                    if (!this.f16053b) {
                        T t10 = this.f16052a.get();
                        this.f16054c = t10;
                        this.f16053b = true;
                        return t10;
                    }
                }
            }
            return (T) C7154j.m21288a(this.f16054c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f16053b) {
                obj = "<supplier that returned " + this.f16054c + ">";
            } else {
                obj = this.f16052a;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: eb.w$b */
    /* loaded from: classes2.dex */
    static class b<T> implements InterfaceC7166v<T> {

        /* renamed from: c */
        private static final InterfaceC7166v<Void> f16055c = new InterfaceC7166v() { // from class: eb.x
            @Override // p082eb.InterfaceC7166v
            public final Object get() {
                Void m21356b;
                m21356b = C7167w.b.m21356b();
                return m21356b;
            }
        };

        /* renamed from: a */
        private volatile InterfaceC7166v<T> f16056a;

        /* renamed from: b */
        private T f16057b;

        b(InterfaceC7166v<T> interfaceC7166v) {
            this.f16056a = (InterfaceC7166v) C7159o.m21312o(interfaceC7166v);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ Void m21356b() {
            throw new IllegalStateException();
        }

        @Override // p082eb.InterfaceC7166v
        public T get() {
            InterfaceC7166v<T> interfaceC7166v = this.f16056a;
            InterfaceC7166v<T> interfaceC7166v2 = (InterfaceC7166v<T>) f16055c;
            if (interfaceC7166v != interfaceC7166v2) {
                synchronized (this) {
                    if (this.f16056a != interfaceC7166v2) {
                        T t10 = this.f16056a.get();
                        this.f16057b = t10;
                        this.f16056a = interfaceC7166v2;
                        return t10;
                    }
                }
            }
            return (T) C7154j.m21288a(this.f16057b);
        }

        public String toString() {
            Object obj = this.f16056a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f16055c) {
                obj = "<supplier that returned " + this.f16057b + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: eb.w$c */
    /* loaded from: classes2.dex */
    private static class c<T> implements InterfaceC7166v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final T f16058a;

        c(T t10) {
            this.f16058a = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C7155k.m21289a(this.f16058a, ((c) obj).f16058a);
            }
            return false;
        }

        @Override // p082eb.InterfaceC7166v
        public T get() {
            return this.f16058a;
        }

        public int hashCode() {
            return C7155k.m21290b(this.f16058a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f16058a + ")";
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC7166v<T> m21353a(InterfaceC7166v<T> interfaceC7166v) {
        return ((interfaceC7166v instanceof b) || (interfaceC7166v instanceof a)) ? interfaceC7166v : interfaceC7166v instanceof Serializable ? new a(interfaceC7166v) : new b(interfaceC7166v);
    }

    /* renamed from: b */
    public static <T> InterfaceC7166v<T> m21354b(T t10) {
        return new c(t10);
    }
}
