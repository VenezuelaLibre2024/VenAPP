package eb;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final d f14613a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14614b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14615c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f14617a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: eb.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0226a extends b {
            C0226a(s sVar, CharSequence charSequence) {
                super(sVar, charSequence);
            }

            @Override // eb.s.b
            int f(int i10) {
                return i10 + 1;
            }

            @Override // eb.s.b
            int g(int i10) {
                return a.this.f14617a.c(this.f14619c, i10);
            }
        }

        a(d dVar) {
            this.f14617a = dVar;
        }

        @Override // eb.s.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(s sVar, CharSequence charSequence) {
            return new C0226a(sVar, charSequence);
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class b extends eb.b<String> {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f14619c;

        /* renamed from: d, reason: collision with root package name */
        final d f14620d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f14621e;

        /* renamed from: f, reason: collision with root package name */
        int f14622f = 0;

        /* renamed from: r, reason: collision with root package name */
        int f14623r;

        protected b(s sVar, CharSequence charSequence) {
            this.f14620d = sVar.f14613a;
            this.f14621e = sVar.f14614b;
            this.f14623r = sVar.f14616d;
            this.f14619c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r6.f14620d.e(r6.f14619c.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r6.f14620d.e(r6.f14619c.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r6.f14621e == false) goto L39;
         */
        @Override // eb.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String a() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f14622f
            L2:
                int r1 = r6.f14622f
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f14619c
                int r1 = r1.length()
                r6.f14622f = r2
                goto L1c
            L16:
                int r3 = r6.f(r1)
                r6.f14622f = r3
            L1c:
                int r3 = r6.f14622f
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f14622f = r3
                java.lang.CharSequence r1 = r6.f14619c
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f14622f = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                eb.d r3 = r6.f14620d
                java.lang.CharSequence r4 = r6.f14619c
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                eb.d r3 = r6.f14620d
                java.lang.CharSequence r4 = r6.f14619c
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f14621e
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f14623r
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f14619c
                int r1 = r1.length()
                r6.f14622f = r2
            L6b:
                if (r1 <= r0) goto L83
                eb.d r2 = r6.f14620d
                java.lang.CharSequence r3 = r6.f14619c
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f14623r = r3
            L83:
                java.lang.CharSequence r2 = r6.f14619c
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eb.s.b.a():java.lang.String");
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface c {
        Iterator<String> a(s sVar, CharSequence charSequence);
    }

    private s(c cVar) {
        this(cVar, false, d.f(), a.e.API_PRIORITY_OTHER);
    }

    private s(c cVar, boolean z10, d dVar, int i10) {
        this.f14615c = cVar;
        this.f14614b = z10;
        this.f14613a = dVar;
        this.f14616d = i10;
    }

    public static s d(char c10) {
        return e(d.d(c10));
    }

    public static s e(d dVar) {
        o.o(dVar);
        return new s(new a(dVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f14615c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        o.o(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public s h() {
        return i(d.h());
    }

    public s i(d dVar) {
        o.o(dVar);
        return new s(this.f14615c, this.f14614b, dVar, this.f14616d);
    }
}
