package p082eb;

import com.google.android.gms.common.api.C5101a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eb.s */
/* loaded from: classes2.dex */
public final class C7163s {

    /* renamed from: a */
    private final AbstractC7148d f16036a;

    /* renamed from: b */
    private final boolean f16037b;

    /* renamed from: c */
    private final c f16038c;

    /* renamed from: d */
    private final int f16039d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eb.s$a */
    /* loaded from: classes2.dex */
    public class a implements c {

        /* renamed from: a */
        final /* synthetic */ AbstractC7148d f16040a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: eb.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C13204a extends b {
            C13204a(C7163s c7163s, CharSequence charSequence) {
                super(c7163s, charSequence);
            }

            @Override // p082eb.C7163s.b
            /* renamed from: f */
            int mo21338f(int i10) {
                return i10 + 1;
            }

            @Override // p082eb.C7163s.b
            /* renamed from: g */
            int mo21339g(int i10) {
                return a.this.f16040a.mo21262c(this.f16042c, i10);
            }
        }

        a(AbstractC7148d abstractC7148d) {
            this.f16040a = abstractC7148d;
        }

        @Override // p082eb.C7163s.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo21336a(C7163s c7163s, CharSequence charSequence) {
            return new C13204a(c7163s, charSequence);
        }
    }

    /* renamed from: eb.s$b */
    /* loaded from: classes2.dex */
    private static abstract class b extends AbstractC7145b<String> {

        /* renamed from: c */
        final CharSequence f16042c;

        /* renamed from: d */
        final AbstractC7148d f16043d;

        /* renamed from: e */
        final boolean f16044e;

        /* renamed from: f */
        int f16045f = 0;

        /* renamed from: r */
        int f16046r;

        protected b(C7163s c7163s, CharSequence charSequence) {
            this.f16043d = c7163s.f16036a;
            this.f16044e = c7163s.f16037b;
            this.f16046r = c7163s.f16039d;
            this.f16042c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r0 >= r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r6.f16043d.mo21263e(r6.f16042c.charAt(r0)) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        
            if (r1 <= r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            if (r6.f16043d.mo21263e(r6.f16042c.charAt(r1 - 1)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r6.f16044e == false) goto L39;
         */
        @Override // p082eb.AbstractC7145b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String mo21246a() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f16045f
            L2:
                int r1 = r6.f16045f
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.mo21339g(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f16042c
                int r1 = r1.length()
                r6.f16045f = r2
                goto L1c
            L16:
                int r3 = r6.mo21338f(r1)
                r6.f16045f = r3
            L1c:
                int r3 = r6.f16045f
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f16045f = r3
                java.lang.CharSequence r1 = r6.f16042c
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f16045f = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                eb.d r3 = r6.f16043d
                java.lang.CharSequence r4 = r6.f16042c
                char r4 = r4.charAt(r0)
                boolean r3 = r3.mo21263e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                eb.d r3 = r6.f16043d
                java.lang.CharSequence r4 = r6.f16042c
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.mo21263e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f16044e
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f16046r
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f16042c
                int r1 = r1.length()
                r6.f16045f = r2
            L6b:
                if (r1 <= r0) goto L83
                eb.d r2 = r6.f16043d
                java.lang.CharSequence r3 = r6.f16042c
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.mo21263e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f16046r = r3
            L83:
                java.lang.CharSequence r2 = r6.f16042c
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.m21247c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082eb.C7163s.b.mo21246a():java.lang.String");
        }

        /* renamed from: f */
        abstract int mo21338f(int i10);

        /* renamed from: g */
        abstract int mo21339g(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eb.s$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        Iterator<String> mo21336a(C7163s c7163s, CharSequence charSequence);
    }

    private C7163s(c cVar) {
        this(cVar, false, AbstractC7148d.m21258f(), C5101a.e.API_PRIORITY_OTHER);
    }

    private C7163s(c cVar, boolean z10, AbstractC7148d abstractC7148d, int i10) {
        this.f16038c = cVar;
        this.f16037b = z10;
        this.f16036a = abstractC7148d;
        this.f16039d = i10;
    }

    /* renamed from: d */
    public static C7163s m21330d(char c10) {
        return m21331e(AbstractC7148d.m21257d(c10));
    }

    /* renamed from: e */
    public static C7163s m21331e(AbstractC7148d abstractC7148d) {
        C7159o.m21312o(abstractC7148d);
        return new C7163s(new a(abstractC7148d));
    }

    /* renamed from: g */
    private Iterator<String> m21332g(CharSequence charSequence) {
        return this.f16038c.mo21336a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> m21333f(CharSequence charSequence) {
        C7159o.m21312o(charSequence);
        Iterator<String> m21332g = m21332g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m21332g.hasNext()) {
            arrayList.add(m21332g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public C7163s m21334h() {
        return m21335i(AbstractC7148d.m21260h());
    }

    /* renamed from: i */
    public C7163s m21335i(AbstractC7148d abstractC7148d) {
        C7159o.m21312o(abstractC7148d);
        return new C7163s(this.f16038c, this.f16037b, abstractC7148d, this.f16039d);
    }
}
