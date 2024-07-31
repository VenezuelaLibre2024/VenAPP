package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6987l;
import dj.InterfaceC6989n;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9284b;
import p224lj.C9513b;
import p317qj.C10508n;
import p471yj.C12727a;

/* renamed from: qj.v */
/* loaded from: classes3.dex */
public final class C10516v<T, R> extends AbstractC6985j<R> {

    /* renamed from: a */
    final InterfaceC6989n<? extends T>[] f26163a;

    /* renamed from: b */
    final InterfaceC9077e<? super Object[], ? extends R> f26164b;

    /* renamed from: qj.v$a */
    /* loaded from: classes3.dex */
    final class a implements InterfaceC9077e<T, R> {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // p186jj.InterfaceC9077e
        public R apply(T t10) {
            return (R) C9513b.m28324d(C10516v.this.f26164b.apply(new Object[]{t10}), "The zipper returned a null value");
        }
    }

    /* renamed from: qj.v$b */
    /* loaded from: classes3.dex */
    static final class b<T, R> extends AtomicInteger implements InterfaceC7578b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: a */
        final InterfaceC6987l<? super R> f26166a;

        /* renamed from: b */
        final InterfaceC9077e<? super Object[], ? extends R> f26167b;

        /* renamed from: c */
        final c<T>[] f26168c;

        /* renamed from: d */
        final Object[] f26169d;

        b(InterfaceC6987l<? super R> interfaceC6987l, int i10, InterfaceC9077e<? super Object[], ? extends R> interfaceC9077e) {
            super(i10);
            this.f26166a = interfaceC6987l;
            this.f26167b = interfaceC9077e;
            c<T>[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c<>(this, i11);
            }
            this.f26168c = cVarArr;
            this.f26169d = new Object[i10];
        }

        /* renamed from: a */
        void m31581a(int i10) {
            c<T>[] cVarArr = this.f26168c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].m31585c();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].m31585c();
                }
            }
        }

        /* renamed from: b */
        void m31582b(int i10) {
            if (getAndSet(0) > 0) {
                m31581a(i10);
                this.f26166a.mo20278a();
            }
        }

        /* renamed from: c */
        void m31583c(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                C12727a.m41995q(th2);
            } else {
                m31581a(i10);
                this.f26166a.onError(th2);
            }
        }

        /* renamed from: d */
        void m31584d(T t10, int i10) {
            this.f26169d[i10] = t10;
            if (decrementAndGet() == 0) {
                try {
                    this.f26166a.onSuccess(C9513b.m28324d(this.f26167b.apply(this.f26169d), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    this.f26166a.onError(th2);
                }
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f26168c) {
                    cVar.m31585c();
                }
            }
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return get() <= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qj.v$c */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: a */
        final b<T, ?> f26170a;

        /* renamed from: b */
        final int f26171b;

        c(b<T, ?> bVar, int i10) {
            this.f26170a = bVar;
            this.f26171b = i10;
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: a */
        public void mo20278a() {
            this.f26170a.m31582b(this.f26171b);
        }

        @Override // dj.InterfaceC6987l
        /* renamed from: b */
        public void mo20279b(InterfaceC7578b interfaceC7578b) {
            EnumC9284b.m27697o(this, interfaceC7578b);
        }

        /* renamed from: c */
        public void m31585c() {
            EnumC9284b.m27692b(this);
        }

        @Override // dj.InterfaceC6987l
        public void onError(Throwable th2) {
            this.f26170a.m31583c(th2, this.f26171b);
        }

        @Override // dj.InterfaceC6987l
        public void onSuccess(T t10) {
            this.f26170a.m31584d(t10, this.f26171b);
        }
    }

    public C10516v(InterfaceC6989n<? extends T>[] interfaceC6989nArr, InterfaceC9077e<? super Object[], ? extends R> interfaceC9077e) {
        this.f26163a = interfaceC6989nArr;
        this.f26164b = interfaceC9077e;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super R> interfaceC6987l) {
        InterfaceC6989n<? extends T>[] interfaceC6989nArr = this.f26163a;
        int length = interfaceC6989nArr.length;
        if (length == 1) {
            interfaceC6989nArr[0].mo20256a(new C10508n.a(interfaceC6987l, new a()));
            return;
        }
        b bVar = new b(interfaceC6987l, length, this.f26164b);
        interfaceC6987l.mo20279b(bVar);
        for (int i10 = 0; i10 < length && !bVar.mo616h(); i10++) {
            InterfaceC6989n<? extends T> interfaceC6989n = interfaceC6989nArr[i10];
            if (interfaceC6989n == null) {
                bVar.m31583c(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            interfaceC6989n.mo20256a(bVar.f26168c[i10]);
        }
    }
}
