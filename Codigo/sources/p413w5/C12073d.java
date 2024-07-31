package p413w5;

import dk.C7021m;
import dk.C7033s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: w5.d */
/* loaded from: classes.dex */
public final class C12073d {

    /* renamed from: d */
    public static final a f32102d = new a(null);

    /* renamed from: a */
    private boolean f32103a;

    /* renamed from: b */
    public c f32104b;

    /* renamed from: c */
    public b f32105c;

    /* renamed from: w5.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: w5.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private long f32106a;

        /* renamed from: b */
        private long f32107b;

        /* renamed from: c */
        private boolean f32108c;

        /* renamed from: a */
        public final boolean m38771a() {
            return this.f32108c;
        }

        /* renamed from: b */
        public final long m38772b() {
            return this.f32107b;
        }

        /* renamed from: c */
        public final long m38773c() {
            return this.f32106a;
        }

        /* renamed from: d */
        public final void m38774d(boolean z10) {
            this.f32108c = z10;
        }

        /* renamed from: e */
        public final void m38775e(long j10) {
            this.f32107b = j10;
        }

        /* renamed from: f */
        public final void m38776f(long j10) {
            this.f32106a = j10;
        }
    }

    /* renamed from: w5.d$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private int f32109a;

        /* renamed from: b */
        private int f32110b;

        /* renamed from: c */
        private int f32111c;

        /* renamed from: d */
        private int f32112d;

        /* renamed from: e */
        private boolean f32113e;

        /* renamed from: a */
        public final boolean m38777a() {
            return this.f32113e;
        }

        /* renamed from: b */
        public final int m38778b() {
            return this.f32112d;
        }

        /* renamed from: c */
        public final int m38779c() {
            return this.f32110b;
        }

        /* renamed from: d */
        public final int m38780d() {
            return this.f32111c;
        }

        /* renamed from: e */
        public final int m38781e() {
            return this.f32109a;
        }

        /* renamed from: f */
        public final void m38782f(boolean z10) {
            this.f32113e = z10;
        }

        /* renamed from: g */
        public final void m38783g(int i10) {
            this.f32112d = i10;
        }

        /* renamed from: h */
        public final void m38784h(int i10) {
            this.f32110b = i10;
        }

        /* renamed from: i */
        public final void m38785i(int i10) {
            this.f32111c = i10;
        }

        /* renamed from: j */
        public final void m38786j(int i10) {
            this.f32109a = i10;
        }
    }

    /* renamed from: a */
    public final String[] m38762a() {
        Long[] lArr = {Long.valueOf(m38764c().m38773c()), Long.valueOf(m38764c().m38772b())};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(String.valueOf(lArr[i10].longValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: b */
    public final String m38763b() {
        if (!m38764c().m38771a()) {
            return "duration >=? AND duration <=?";
        }
        return "( duration IS NULL OR ( duration >=? AND duration <=? ) )";
    }

    /* renamed from: c */
    public final b m38764c() {
        b bVar = this.f32105c;
        if (bVar != null) {
            return bVar;
        }
        C9322n.m27792p("durationConstraint");
        return null;
    }

    /* renamed from: d */
    public final c m38765d() {
        c cVar = this.f32104b;
        if (cVar != null) {
            return cVar;
        }
        C9322n.m27792p("sizeConstraint");
        return null;
    }

    /* renamed from: e */
    public final void m38766e(b bVar) {
        C9322n.m27781e(bVar, "<set-?>");
        this.f32105c = bVar;
    }

    /* renamed from: f */
    public final void m38767f(boolean z10) {
        this.f32103a = z10;
    }

    /* renamed from: g */
    public final void m38768g(c cVar) {
        C9322n.m27781e(cVar, "<set-?>");
        this.f32104b = cVar;
    }

    /* renamed from: h */
    public final String[] m38769h() {
        List m20478e0;
        int m20590r;
        m20478e0 = C7021m.m20478e0(new Integer[]{Integer.valueOf(m38765d().m38781e()), Integer.valueOf(m38765d().m38779c()), Integer.valueOf(m38765d().m38780d()), Integer.valueOf(m38765d().m38778b())});
        List list = m20478e0;
        m20590r = C7033s.m20590r(list, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: i */
    public final String m38770i() {
        return "width >= ? AND width <= ? AND height >= ? AND height <=?";
    }
}
