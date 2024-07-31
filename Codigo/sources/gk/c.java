package gk;

import ck.v;
import gk.f;
import java.io.Serializable;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import ok.p;

/* loaded from: classes3.dex */
public final class c implements f, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final f f16284a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b f16285b;

    /* loaded from: classes3.dex */
    private static final class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final C0266a f16286b = new C0266a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        private final f[] f16287a;

        /* renamed from: gk.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0266a {
            private C0266a() {
            }

            public /* synthetic */ C0266a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(f[] elements) {
            n.e(elements, "elements");
            this.f16287a = elements;
        }

        private final Object readResolve() {
            f[] fVarArr = this.f16287a;
            f fVar = g.f16294a;
            for (f fVar2 : fVarArr) {
                fVar = fVar.U(fVar2);
            }
            return fVar;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends o implements p<String, f.b, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16288a = new b();

        b() {
            super(2);
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, f.b element) {
            n.e(acc, "acc");
            n.e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* renamed from: gk.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0267c extends o implements p<v, f.b, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f[] f16289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f16290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0267c(f[] fVarArr, w wVar) {
            super(2);
            this.f16289a = fVarArr;
            this.f16290b = wVar;
        }

        public final void a(v vVar, f.b element) {
            n.e(vVar, "<anonymous parameter 0>");
            n.e(element, "element");
            f[] fVarArr = this.f16289a;
            w wVar = this.f16290b;
            int i10 = wVar.f20758a;
            wVar.f20758a = i10 + 1;
            fVarArr[i10] = element;
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ v invoke(v vVar, f.b bVar) {
            a(vVar, bVar);
            return v.f7137a;
        }
    }

    public c(f left, f.b element) {
        n.e(left, "left");
        n.e(element, "element");
        this.f16284a = left;
        this.f16285b = element;
    }

    private final boolean c(f.b bVar) {
        return n.a(b(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f16285b)) {
            f fVar = cVar.f16284a;
            if (!(fVar instanceof c)) {
                n.c(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((f.b) fVar);
            }
            cVar = (c) fVar;
        }
        return false;
    }

    private final int h() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f16284a;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int h10 = h();
        f[] fVarArr = new f[h10];
        w wVar = new w();
        z0(v.f7137a, new C0267c(fVarArr, wVar));
        if (wVar.f20758a == h10) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // gk.f
    public f Q(f.c<?> key) {
        n.e(key, "key");
        if (this.f16285b.b(key) != null) {
            return this.f16284a;
        }
        f Q = this.f16284a.Q(key);
        return Q == this.f16284a ? this : Q == g.f16294a ? this.f16285b : new c(Q, this.f16285b);
    }

    @Override // gk.f
    public f U(f fVar) {
        return f.a.a(this, fVar);
    }

    @Override // gk.f
    public <E extends f.b> E b(f.c<E> key) {
        n.e(key, "key");
        c cVar = this;
        while (true) {
            E e10 = (E) cVar.f16285b.b(key);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar.f16284a;
            if (!(fVar instanceof c)) {
                return (E) fVar.b(key);
            }
            cVar = (c) fVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.h() != h() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f16284a.hashCode() + this.f16285b.hashCode();
    }

    public String toString() {
        return '[' + ((String) z0("", b.f16288a)) + ']';
    }

    @Override // gk.f
    public <R> R z0(R r10, p<? super R, ? super f.b, ? extends R> operation) {
        n.e(operation, "operation");
        return operation.invoke((Object) this.f16284a.z0(r10, operation), this.f16285b);
    }
}
