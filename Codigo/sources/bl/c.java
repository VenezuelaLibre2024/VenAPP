package bl;

import ck.v;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import el.h0;
import el.k0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final i<Object> f6740a = new i<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f6741b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6742c;

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f6743d;

    /* renamed from: e, reason: collision with root package name */
    private static final h0 f6744e;

    /* renamed from: f, reason: collision with root package name */
    private static final h0 f6745f;

    /* renamed from: g, reason: collision with root package name */
    private static final h0 f6746g;

    /* renamed from: h, reason: collision with root package name */
    private static final h0 f6747h;

    /* renamed from: i, reason: collision with root package name */
    private static final h0 f6748i;

    /* renamed from: j, reason: collision with root package name */
    private static final h0 f6749j;

    /* renamed from: k, reason: collision with root package name */
    private static final h0 f6750k;

    /* renamed from: l, reason: collision with root package name */
    private static final h0 f6751l;

    /* renamed from: m, reason: collision with root package name */
    private static final h0 f6752m;

    /* renamed from: n, reason: collision with root package name */
    private static final h0 f6753n;

    /* renamed from: o, reason: collision with root package name */
    private static final h0 f6754o;

    /* renamed from: p, reason: collision with root package name */
    private static final h0 f6755p;

    /* renamed from: q, reason: collision with root package name */
    private static final h0 f6756q;

    /* renamed from: r, reason: collision with root package name */
    private static final h0 f6757r;

    /* renamed from: s, reason: collision with root package name */
    private static final h0 f6758s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes3.dex */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.k implements ok.p<Long, i<E>, i<E>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6759a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i<E> a(long j10, i<E> iVar) {
            return c.x(j10, iVar);
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return a(l10.longValue(), (i) obj);
        }
    }

    static {
        int e10;
        int e11;
        e10 = k0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f6741b = e10;
        e11 = k0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12, null);
        f6742c = e11;
        f6743d = new h0("BUFFERED");
        f6744e = new h0("SHOULD_BUFFER");
        f6745f = new h0("S_RESUMING_BY_RCV");
        f6746g = new h0("RESUMING_BY_EB");
        f6747h = new h0("POISONED");
        f6748i = new h0("DONE_RCV");
        f6749j = new h0("INTERRUPTED_SEND");
        f6750k = new h0("INTERRUPTED_RCV");
        f6751l = new h0("CHANNEL_CLOSED");
        f6752m = new h0("SUSPEND");
        f6753n = new h0("SUSPEND_NO_WAITER");
        f6754o = new h0("FAILED");
        f6755p = new h0("NO_RECEIVE_RESULT");
        f6756q = new h0("CLOSE_HANDLER_CLOSED");
        f6757r = new h0("CLOSE_HANDLER_INVOKED");
        f6758s = new h0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(zk.m<? super T> mVar, T t10, ok.l<? super Throwable, v> lVar) {
        Object l10 = mVar.l(t10, null, lVar);
        if (l10 == null) {
            return false;
        }
        mVar.o(l10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(zk.m mVar, Object obj, ok.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(mVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> i<E> x(long j10, i<E> iVar) {
        return new i<>(j10, iVar, iVar.u(), 0);
    }

    public static final <E> vk.e<i<E>> y() {
        return a.f6759a;
    }

    public static final h0 z() {
        return f6751l;
    }
}
