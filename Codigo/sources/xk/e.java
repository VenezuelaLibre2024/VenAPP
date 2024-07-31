package xk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements wk.d<uk.f> {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f31401a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31402b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31403c;

    /* renamed from: d, reason: collision with root package name */
    private final ok.p<CharSequence, Integer, ck.m<Integer, Integer>> f31404d;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<uk.f>, pk.a {

        /* renamed from: a, reason: collision with root package name */
        private int f31405a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f31406b;

        /* renamed from: c, reason: collision with root package name */
        private int f31407c;

        /* renamed from: d, reason: collision with root package name */
        private uk.f f31408d;

        /* renamed from: e, reason: collision with root package name */
        private int f31409e;

        a() {
            int f10;
            f10 = uk.l.f(e.this.f31402b, 0, e.this.f31401a.length());
            this.f31406b = f10;
            this.f31407c = f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f31410f.f31403c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f31407c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f31405a = r1
                r0 = 0
                r6.f31408d = r0
                goto L99
            Lc:
                xk.e r0 = xk.e.this
                int r0 = xk.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f31409e
                int r0 = r0 + r3
                r6.f31409e = r0
                xk.e r4 = xk.e.this
                int r4 = xk.e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f31407c
                xk.e r4 = xk.e.this
                java.lang.CharSequence r4 = xk.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                uk.f r0 = new uk.f
                int r1 = r6.f31406b
                xk.e r4 = xk.e.this
                java.lang.CharSequence r4 = xk.e.c(r4)
                int r4 = xk.q.O(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f31408d = r0
            L44:
                r6.f31407c = r2
                goto L97
            L47:
                xk.e r0 = xk.e.this
                ok.p r0 = xk.e.b(r0)
                xk.e r4 = xk.e.this
                java.lang.CharSequence r4 = xk.e.c(r4)
                int r5 = r6.f31407c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                ck.m r0 = (ck.m) r0
                if (r0 != 0) goto L73
                uk.f r0 = new uk.f
                int r1 = r6.f31406b
                xk.e r4 = xk.e.this
                java.lang.CharSequence r4 = xk.e.c(r4)
                int r4 = xk.q.O(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f31406b
                uk.f r4 = uk.j.k(r4, r2)
                r6.f31408d = r4
                int r2 = r2 + r0
                r6.f31406b = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f31405a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xk.e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public uk.f next() {
            if (this.f31405a == -1) {
                a();
            }
            if (this.f31405a == 0) {
                throw new NoSuchElementException();
            }
            uk.f fVar = this.f31408d;
            kotlin.jvm.internal.n.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f31408d = null;
            this.f31405a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31405a == -1) {
                a();
            }
            return this.f31405a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence input, int i10, int i11, ok.p<? super CharSequence, ? super Integer, ck.m<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.n.e(input, "input");
        kotlin.jvm.internal.n.e(getNextMatch, "getNextMatch");
        this.f31401a = input;
        this.f31402b = i10;
        this.f31403c = i11;
        this.f31404d = getNextMatch;
    }

    @Override // wk.d
    public Iterator<uk.f> iterator() {
        return new a();
    }
}
