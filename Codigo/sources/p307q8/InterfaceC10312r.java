package p307q8;

import java.util.List;
import p351s8.InterfaceC10817e;
import p361t6.AbstractC11018d4;
import p361t6.C11108u1;
import p363t8.C11173s;
import p397v7.C11694d1;
import p397v7.InterfaceC11684a0;
import p437x7.AbstractC12340f;
import p437x7.AbstractC12348n;
import p437x7.InterfaceC12349o;

/* renamed from: q8.r */
/* loaded from: classes.dex */
public interface InterfaceC10312r extends InterfaceC10315u {

    /* renamed from: q8.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C11694d1 f25733a;

        /* renamed from: b */
        public final int[] f25734b;

        /* renamed from: c */
        public final int f25735c;

        public a(C11694d1 c11694d1, int... iArr) {
            this(c11694d1, iArr, 0);
        }

        public a(C11694d1 c11694d1, int[] iArr, int i10) {
            if (iArr.length == 0) {
                C11173s.m34965d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f25733a = c11694d1;
            this.f25734b = iArr;
            this.f25735c = i10;
        }
    }

    /* renamed from: q8.r$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceC10312r[] mo30865a(a[] aVarArr, InterfaceC10817e interfaceC10817e, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4);
    }

    /* renamed from: f */
    void mo30860f();

    /* renamed from: g */
    void mo209g(long j10, long j11, long j12, List<? extends AbstractC12348n> list, InterfaceC12349o[] interfaceC12349oArr);

    /* renamed from: h */
    int mo210h();

    /* renamed from: i */
    boolean mo30886i(int i10, long j10);

    /* renamed from: j */
    boolean mo30887j(int i10, long j10);

    /* renamed from: k */
    default boolean mo31033k(long j10, AbstractC12340f abstractC12340f, List<? extends AbstractC12348n> list) {
        return false;
    }

    /* renamed from: l */
    void mo30861l(float f10);

    /* renamed from: m */
    Object mo211m();

    /* renamed from: n */
    default void mo31034n() {
    }

    /* renamed from: o */
    default void mo31035o(boolean z10) {
    }

    /* renamed from: p */
    void mo30862p();

    /* renamed from: q */
    int mo30863q(long j10, List<? extends AbstractC12348n> list);

    /* renamed from: r */
    int mo30888r();

    /* renamed from: s */
    C11108u1 mo30889s();

    /* renamed from: t */
    int mo212t();

    /* renamed from: u */
    default void mo31036u() {
    }
}
