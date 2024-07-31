package z7;

import android.net.Uri;
import com.google.common.collect.w;
import java.util.Collections;
import java.util.List;
import t6.u1;
import z7.k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    public final long f32408a;

    /* renamed from: b */
    public final u1 f32409b;

    /* renamed from: c */
    public final w<z7.b> f32410c;

    /* renamed from: d */
    public final long f32411d;

    /* renamed from: e */
    public final List<e> f32412e;

    /* renamed from: f */
    public final List<e> f32413f;

    /* renamed from: g */
    public final List<e> f32414g;

    /* renamed from: h */
    private final i f32415h;

    /* loaded from: classes.dex */
    public static class b extends j implements y7.f {

        /* renamed from: i */
        final k.a f32416i;

        public b(long j10, u1 u1Var, List<z7.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, u1Var, list, aVar, list2, list3, list4);
            this.f32416i = aVar;
        }

        @Override // y7.f
        public long a(long j10, long j11) {
            return this.f32416i.h(j10, j11);
        }

        @Override // y7.f
        public long b(long j10, long j11) {
            return this.f32416i.d(j10, j11);
        }

        @Override // y7.f
        public long c(long j10) {
            return this.f32416i.j(j10);
        }

        @Override // y7.f
        public long d(long j10, long j11) {
            return this.f32416i.f(j10, j11);
        }

        @Override // y7.f
        public i e(long j10) {
            return this.f32416i.k(this, j10);
        }

        @Override // y7.f
        public long f(long j10, long j11) {
            return this.f32416i.i(j10, j11);
        }

        @Override // y7.f
        public long g(long j10) {
            return this.f32416i.g(j10);
        }

        @Override // y7.f
        public boolean h() {
            return this.f32416i.l();
        }

        @Override // y7.f
        public long i() {
            return this.f32416i.e();
        }

        @Override // y7.f
        public long j(long j10, long j11) {
            return this.f32416i.c(j10, j11);
        }

        @Override // z7.j
        public String k() {
            return null;
        }

        @Override // z7.j
        public y7.f l() {
            return this;
        }

        @Override // z7.j
        public i m() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: i */
        public final Uri f32417i;

        /* renamed from: j */
        public final long f32418j;

        /* renamed from: k */
        private final String f32419k;

        /* renamed from: l */
        private final i f32420l;

        /* renamed from: m */
        private final m f32421m;

        public c(long j10, u1 u1Var, List<z7.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, u1Var, list, eVar, list2, list3, list4);
            this.f32417i = Uri.parse(list.get(0).f32355a);
            i c10 = eVar.c();
            this.f32420l = c10;
            this.f32419k = str;
            this.f32418j = j11;
            this.f32421m = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // z7.j
        public String k() {
            return this.f32419k;
        }

        @Override // z7.j
        public y7.f l() {
            return this.f32421m;
        }

        @Override // z7.j
        public i m() {
            return this.f32420l;
        }
    }

    private j(long j10, u1 u1Var, List<z7.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        t8.a.a(!list.isEmpty());
        this.f32408a = j10;
        this.f32409b = u1Var;
        this.f32410c = w.r(list);
        this.f32412e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f32413f = list3;
        this.f32414g = list4;
        this.f32415h = kVar.a(this);
        this.f32411d = kVar.b();
    }

    /* synthetic */ j(long j10, u1 u1Var, List list, k kVar, List list2, List list3, List list4, a aVar) {
        this(j10, u1Var, list, kVar, list2, list3, list4);
    }

    public static j o(long j10, u1 u1Var, List<z7.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, u1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, u1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract y7.f l();

    public abstract i m();

    public i n() {
        return this.f32415h;
    }
}
