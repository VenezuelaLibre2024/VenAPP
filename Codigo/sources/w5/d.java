package w5;

import dk.m;
import dk.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29639d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f29640a;

    /* renamed from: b, reason: collision with root package name */
    public c f29641b;

    /* renamed from: c, reason: collision with root package name */
    public b f29642c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f29643a;

        /* renamed from: b, reason: collision with root package name */
        private long f29644b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29645c;

        public final boolean a() {
            return this.f29645c;
        }

        public final long b() {
            return this.f29644b;
        }

        public final long c() {
            return this.f29643a;
        }

        public final void d(boolean z10) {
            this.f29645c = z10;
        }

        public final void e(long j10) {
            this.f29644b = j10;
        }

        public final void f(long j10) {
            this.f29643a = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private int f29646a;

        /* renamed from: b, reason: collision with root package name */
        private int f29647b;

        /* renamed from: c, reason: collision with root package name */
        private int f29648c;

        /* renamed from: d, reason: collision with root package name */
        private int f29649d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29650e;

        public final boolean a() {
            return this.f29650e;
        }

        public final int b() {
            return this.f29649d;
        }

        public final int c() {
            return this.f29647b;
        }

        public final int d() {
            return this.f29648c;
        }

        public final int e() {
            return this.f29646a;
        }

        public final void f(boolean z10) {
            this.f29650e = z10;
        }

        public final void g(int i10) {
            this.f29649d = i10;
        }

        public final void h(int i10) {
            this.f29647b = i10;
        }

        public final void i(int i10) {
            this.f29648c = i10;
        }

        public final void j(int i10) {
            this.f29646a = i10;
        }
    }

    public final String[] a() {
        Long[] lArr = {Long.valueOf(c().c()), Long.valueOf(c().b())};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(String.valueOf(lArr[i10].longValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String b() {
        if (!c().a()) {
            return "duration >=? AND duration <=?";
        }
        return "( duration IS NULL OR ( duration >=? AND duration <=? ) )";
    }

    public final b c() {
        b bVar = this.f29642c;
        if (bVar != null) {
            return bVar;
        }
        n.p("durationConstraint");
        return null;
    }

    public final c d() {
        c cVar = this.f29641b;
        if (cVar != null) {
            return cVar;
        }
        n.p("sizeConstraint");
        return null;
    }

    public final void e(b bVar) {
        n.e(bVar, "<set-?>");
        this.f29642c = bVar;
    }

    public final void f(boolean z10) {
        this.f29640a = z10;
    }

    public final void g(c cVar) {
        n.e(cVar, "<set-?>");
        this.f29641b = cVar;
    }

    public final String[] h() {
        List e02;
        int r10;
        e02 = m.e0(new Integer[]{Integer.valueOf(d().e()), Integer.valueOf(d().c()), Integer.valueOf(d().d()), Integer.valueOf(d().b())});
        List list = e02;
        r10 = s.r(list, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String i() {
        return "width >= ? AND width <= ? AND height >= ? AND height <=?";
    }
}
