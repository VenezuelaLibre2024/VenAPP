package p482z7;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import java.util.Collections;
import java.util.List;
import p361t6.C11108u1;
import p363t8.C11137a;
import p460y7.InterfaceC12642f;
import p482z7.AbstractC12819k;

/* renamed from: z7.j */
/* loaded from: classes.dex */
public abstract class AbstractC12818j {

    /* renamed from: a */
    public final long f34959a;

    /* renamed from: b */
    public final C11108u1 f34960b;

    /* renamed from: c */
    public final AbstractC5907w<C12810b> f34961c;

    /* renamed from: d */
    public final long f34962d;

    /* renamed from: e */
    public final List<C12813e> f34963e;

    /* renamed from: f */
    public final List<C12813e> f34964f;

    /* renamed from: g */
    public final List<C12813e> f34965g;

    /* renamed from: h */
    private final C12817i f34966h;

    /* renamed from: z7.j$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC12818j implements InterfaceC12642f {

        /* renamed from: i */
        final AbstractC12819k.a f34967i;

        public b(long j10, C11108u1 c11108u1, List<C12810b> list, AbstractC12819k.a aVar, List<C12813e> list2, List<C12813e> list3, List<C12813e> list4) {
            super(j10, c11108u1, list, aVar, list2, list3, list4);
            this.f34967i = aVar;
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: a */
        public long mo41618a(long j10, long j11) {
            return this.f34967i.m42554h(j10, j11);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: b */
        public long mo41619b(long j10, long j11) {
            return this.f34967i.m42550d(j10, j11);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: c */
        public long mo41620c(long j10) {
            return this.f34967i.m42556j(j10);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: d */
        public long mo41621d(long j10, long j11) {
            return this.f34967i.m42552f(j10, j11);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: e */
        public C12817i mo41622e(long j10) {
            return this.f34967i.mo42557k(this, j10);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: f */
        public long mo41623f(long j10, long j11) {
            return this.f34967i.m42555i(j10, j11);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: g */
        public long mo41624g(long j10) {
            return this.f34967i.mo42553g(j10);
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: h */
        public boolean mo41625h() {
            return this.f34967i.mo42558l();
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: i */
        public long mo41626i() {
            return this.f34967i.m42551e();
        }

        @Override // p460y7.InterfaceC12642f
        /* renamed from: j */
        public long mo41627j(long j10, long j11) {
            return this.f34967i.m42549c(j10, j11);
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: k */
        public String mo42543k() {
            return null;
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: l */
        public InterfaceC12642f mo42544l() {
            return this;
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: m */
        public C12817i mo42545m() {
            return null;
        }
    }

    /* renamed from: z7.j$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC12818j {

        /* renamed from: i */
        public final Uri f34968i;

        /* renamed from: j */
        public final long f34969j;

        /* renamed from: k */
        private final String f34970k;

        /* renamed from: l */
        private final C12817i f34971l;

        /* renamed from: m */
        private final C12821m f34972m;

        public c(long j10, C11108u1 c11108u1, List<C12810b> list, AbstractC12819k.e eVar, List<C12813e> list2, List<C12813e> list3, List<C12813e> list4, String str, long j11) {
            super(j10, c11108u1, list, eVar, list2, list3, list4);
            this.f34968i = Uri.parse(list.get(0).f34906a);
            C12817i m42559c = eVar.m42559c();
            this.f34971l = m42559c;
            this.f34970k = str;
            this.f34969j = j11;
            this.f34972m = m42559c != null ? null : new C12821m(new C12817i(null, 0L, j11));
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: k */
        public String mo42543k() {
            return this.f34970k;
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: l */
        public InterfaceC12642f mo42544l() {
            return this.f34972m;
        }

        @Override // p482z7.AbstractC12818j
        /* renamed from: m */
        public C12817i mo42545m() {
            return this.f34971l;
        }
    }

    private AbstractC12818j(long j10, C11108u1 c11108u1, List<C12810b> list, AbstractC12819k abstractC12819k, List<C12813e> list2, List<C12813e> list3, List<C12813e> list4) {
        C11137a.m34599a(!list.isEmpty());
        this.f34959a = j10;
        this.f34960b = c11108u1;
        this.f34961c = AbstractC5907w.m15079r(list);
        this.f34963e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f34964f = list3;
        this.f34965g = list4;
        this.f34966h = abstractC12819k.mo42547a(this);
        this.f34962d = abstractC12819k.m42548b();
    }

    /* renamed from: o */
    public static AbstractC12818j m42542o(long j10, C11108u1 c11108u1, List<C12810b> list, AbstractC12819k abstractC12819k, List<C12813e> list2, List<C12813e> list3, List<C12813e> list4, String str) {
        if (abstractC12819k instanceof AbstractC12819k.e) {
            return new c(j10, c11108u1, list, (AbstractC12819k.e) abstractC12819k, list2, list3, list4, str, -1L);
        }
        if (abstractC12819k instanceof AbstractC12819k.a) {
            return new b(j10, c11108u1, list, (AbstractC12819k.a) abstractC12819k, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: k */
    public abstract String mo42543k();

    /* renamed from: l */
    public abstract InterfaceC12642f mo42544l();

    /* renamed from: m */
    public abstract C12817i mo42545m();

    /* renamed from: n */
    public C12817i m42546n() {
        return this.f34966h;
    }
}
