package p124gk;

import ck.C2037v;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9331w;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: gk.c */
/* loaded from: classes3.dex */
public final class C7584c implements InterfaceC7587f, Serializable {

    /* renamed from: a */
    private final InterfaceC7587f f17921a;

    /* renamed from: b */
    private final InterfaceC7587f.b f17922b;

    /* renamed from: gk.c$a */
    /* loaded from: classes3.dex */
    private static final class a implements Serializable {

        /* renamed from: b */
        public static final C13210a f17923b = new C13210a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final InterfaceC7587f[] f17924a;

        /* renamed from: gk.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13210a {
            private C13210a() {
            }

            public /* synthetic */ C13210a(C9315g c9315g) {
                this();
            }
        }

        public a(InterfaceC7587f[] elements) {
            C9322n.m27781e(elements, "elements");
            this.f17924a = elements;
        }

        private final Object readResolve() {
            InterfaceC7587f[] interfaceC7587fArr = this.f17924a;
            InterfaceC7587f interfaceC7587f = C7588g.f17931a;
            for (InterfaceC7587f interfaceC7587f2 : interfaceC7587fArr) {
                interfaceC7587f = interfaceC7587f.mo20646U(interfaceC7587f2);
            }
            return interfaceC7587f;
        }
    }

    /* renamed from: gk.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC10002p<String, InterfaceC7587f.b, String> {

        /* renamed from: a */
        public static final b f17925a = new b();

        b() {
            super(2);
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, InterfaceC7587f.b element) {
            C9322n.m27781e(acc, "acc");
            C9322n.m27781e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* renamed from: gk.c$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC9323o implements InterfaceC10002p<C2037v, InterfaceC7587f.b, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7587f[] f17926a;

        /* renamed from: b */
        final /* synthetic */ C9331w f17927b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC7587f[] interfaceC7587fArr, C9331w c9331w) {
            super(2);
            this.f17926a = interfaceC7587fArr;
            this.f17927b = c9331w;
        }

        /* renamed from: a */
        public final void m23035a(C2037v c2037v, InterfaceC7587f.b element) {
            C9322n.m27781e(c2037v, "<anonymous parameter 0>");
            C9322n.m27781e(element, "element");
            InterfaceC7587f[] interfaceC7587fArr = this.f17926a;
            C9331w c9331w = this.f17927b;
            int i10 = c9331w.f22580a;
            c9331w.f22580a = i10 + 1;
            interfaceC7587fArr[i10] = element;
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C2037v invoke(C2037v c2037v, InterfaceC7587f.b bVar) {
            m23035a(c2037v, bVar);
            return C2037v.f8089a;
        }
    }

    public C7584c(InterfaceC7587f left, InterfaceC7587f.b element) {
        C9322n.m27781e(left, "left");
        C9322n.m27781e(element, "element");
        this.f17921a = left;
        this.f17922b = element;
    }

    /* renamed from: c */
    private final boolean m23031c(InterfaceC7587f.b bVar) {
        return C9322n.m27777a(mo20647b(bVar.getKey()), bVar);
    }

    /* renamed from: d */
    private final boolean m23032d(C7584c c7584c) {
        while (m23031c(c7584c.f17922b)) {
            InterfaceC7587f interfaceC7587f = c7584c.f17921a;
            if (!(interfaceC7587f instanceof C7584c)) {
                C9322n.m27779c(interfaceC7587f, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m23031c((InterfaceC7587f.b) interfaceC7587f);
            }
            c7584c = (C7584c) interfaceC7587f;
        }
        return false;
    }

    /* renamed from: h */
    private final int m23033h() {
        int i10 = 2;
        C7584c c7584c = this;
        while (true) {
            InterfaceC7587f interfaceC7587f = c7584c.f17921a;
            c7584c = interfaceC7587f instanceof C7584c ? (C7584c) interfaceC7587f : null;
            if (c7584c == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int m23033h = m23033h();
        InterfaceC7587f[] interfaceC7587fArr = new InterfaceC7587f[m23033h];
        C9331w c9331w = new C9331w();
        mo20648z0(C2037v.f8089a, new c(interfaceC7587fArr, c9331w));
        if (c9331w.f22580a == m23033h) {
            return new a(interfaceC7587fArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> key) {
        C9322n.m27781e(key, "key");
        if (this.f17922b.mo20647b(key) != null) {
            return this.f17921a;
        }
        InterfaceC7587f mo20645Q = this.f17921a.mo20645Q(key);
        return mo20645Q == this.f17921a ? this : mo20645Q == C7588g.f17931a ? this.f17922b : new C7584c(mo20645Q, this.f17922b);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: U */
    public InterfaceC7587f mo20646U(InterfaceC7587f interfaceC7587f) {
        return InterfaceC7587f.a.m23041a(this, interfaceC7587f);
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> key) {
        C9322n.m27781e(key, "key");
        C7584c c7584c = this;
        while (true) {
            E e10 = (E) c7584c.f17922b.mo20647b(key);
            if (e10 != null) {
                return e10;
            }
            InterfaceC7587f interfaceC7587f = c7584c.f17921a;
            if (!(interfaceC7587f instanceof C7584c)) {
                return (E) interfaceC7587f.mo20647b(key);
            }
            c7584c = (C7584c) interfaceC7587f;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7584c) {
                C7584c c7584c = (C7584c) obj;
                if (c7584c.m23033h() != m23033h() || !c7584c.m23032d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f17921a.hashCode() + this.f17922b.hashCode();
    }

    public String toString() {
        return '[' + ((String) mo20648z0("", b.f17925a)) + ']';
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: z0 */
    public <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> operation) {
        C9322n.m27781e(operation, "operation");
        return operation.invoke((Object) this.f17921a.mo20648z0(r10, operation), this.f17922b);
    }
}
