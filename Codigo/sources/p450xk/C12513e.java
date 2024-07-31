package p450xk;

import ck.C2028m;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC10002p;
import p427wk.InterfaceC12228d;
import pk.InterfaceC10201a;
import uk.C11579f;
import uk.C11585l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.e */
/* loaded from: classes3.dex */
public final class C12513e implements InterfaceC12228d<C11579f> {

    /* renamed from: a */
    private final CharSequence f33921a;

    /* renamed from: b */
    private final int f33922b;

    /* renamed from: c */
    private final int f33923c;

    /* renamed from: d */
    private final InterfaceC10002p<CharSequence, Integer, C2028m<Integer, Integer>> f33924d;

    /* renamed from: xk.e$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<C11579f>, InterfaceC10201a {

        /* renamed from: a */
        private int f33925a = -1;

        /* renamed from: b */
        private int f33926b;

        /* renamed from: c */
        private int f33927c;

        /* renamed from: d */
        private C11579f f33928d;

        /* renamed from: e */
        private int f33929e;

        a() {
            int m36297f;
            m36297f = C11585l.m36297f(C12513e.this.f33922b, 0, C12513e.this.f33921a.length());
            this.f33926b = m36297f;
            this.f33927c = m36297f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f33930f.f33923c) goto L9;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m40967a() {
            /*
                r6 = this;
                int r0 = r6.f33927c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f33925a = r1
                r0 = 0
                r6.f33928d = r0
                goto L99
            Lc:
                xk.e r0 = p450xk.C12513e.this
                int r0 = p450xk.C12513e.m40965d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f33929e
                int r0 = r0 + r3
                r6.f33929e = r0
                xk.e r4 = p450xk.C12513e.this
                int r4 = p450xk.C12513e.m40965d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f33927c
                xk.e r4 = p450xk.C12513e.this
                java.lang.CharSequence r4 = p450xk.C12513e.m40964c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                uk.f r0 = new uk.f
                int r1 = r6.f33926b
                xk.e r4 = p450xk.C12513e.this
                java.lang.CharSequence r4 = p450xk.C12513e.m40964c(r4)
                int r4 = p450xk.C12525q.m41066O(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f33928d = r0
            L44:
                r6.f33927c = r2
                goto L97
            L47:
                xk.e r0 = p450xk.C12513e.this
                ok.p r0 = p450xk.C12513e.m40963b(r0)
                xk.e r4 = p450xk.C12513e.this
                java.lang.CharSequence r4 = p450xk.C12513e.m40964c(r4)
                int r5 = r6.f33927c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                ck.m r0 = (ck.C2028m) r0
                if (r0 != 0) goto L73
                uk.f r0 = new uk.f
                int r1 = r6.f33926b
                xk.e r4 = p450xk.C12513e.this
                java.lang.CharSequence r4 = p450xk.C12513e.m40964c(r4)
                int r4 = p450xk.C12525q.m41066O(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.m10335a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m10336b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f33926b
                uk.f r4 = uk.C11583j.m36291k(r4, r2)
                r6.f33928d = r4
                int r2 = r2 + r0
                r6.f33926b = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f33925a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p450xk.C12513e.a.m40967a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C11579f next() {
            if (this.f33925a == -1) {
                m40967a();
            }
            if (this.f33925a == 0) {
                throw new NoSuchElementException();
            }
            C11579f c11579f = this.f33928d;
            C9322n.m27779c(c11579f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f33928d = null;
            this.f33925a = -1;
            return c11579f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33925a == -1) {
                m40967a();
            }
            return this.f33925a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12513e(CharSequence input, int i10, int i11, InterfaceC10002p<? super CharSequence, ? super Integer, C2028m<Integer, Integer>> getNextMatch) {
        C9322n.m27781e(input, "input");
        C9322n.m27781e(getNextMatch, "getNextMatch");
        this.f33921a = input;
        this.f33922b = i10;
        this.f33923c = i11;
        this.f33924d = getNextMatch;
    }

    @Override // p427wk.InterfaceC12228d
    public Iterator<C11579f> iterator() {
        return new a();
    }
}
