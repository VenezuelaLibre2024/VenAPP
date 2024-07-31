package p030bl;

import ck.C2037v;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.internal.C9319k;
import p089el.C7223h0;
import p089el.C7229k0;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p405vk.InterfaceC11968e;
import p494zk.InterfaceC13083m;

/* renamed from: bl.c */
/* loaded from: classes3.dex */
public final class C1809c {

    /* renamed from: a */
    private static final C1815i<Object> f7689a = new C1815i<>(-1, null, null, 0);

    /* renamed from: b */
    public static final int f7690b;

    /* renamed from: c */
    private static final int f7691c;

    /* renamed from: d */
    public static final C7223h0 f7692d;

    /* renamed from: e */
    private static final C7223h0 f7693e;

    /* renamed from: f */
    private static final C7223h0 f7694f;

    /* renamed from: g */
    private static final C7223h0 f7695g;

    /* renamed from: h */
    private static final C7223h0 f7696h;

    /* renamed from: i */
    private static final C7223h0 f7697i;

    /* renamed from: j */
    private static final C7223h0 f7698j;

    /* renamed from: k */
    private static final C7223h0 f7699k;

    /* renamed from: l */
    private static final C7223h0 f7700l;

    /* renamed from: m */
    private static final C7223h0 f7701m;

    /* renamed from: n */
    private static final C7223h0 f7702n;

    /* renamed from: o */
    private static final C7223h0 f7703o;

    /* renamed from: p */
    private static final C7223h0 f7704p;

    /* renamed from: q */
    private static final C7223h0 f7705q;

    /* renamed from: r */
    private static final C7223h0 f7706r;

    /* renamed from: s */
    private static final C7223h0 f7707s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: bl.c$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class a<E> extends C9319k implements InterfaceC10002p<Long, C1815i<E>, C1815i<E>> {

        /* renamed from: a */
        public static final a f7708a = new a();

        a() {
            super(2, C1809c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* renamed from: a */
        public final C1815i<E> m9787a(long j10, C1815i<E> c1815i) {
            return C1809c.m9784x(j10, c1815i);
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return m9787a(l10.longValue(), (C1815i) obj);
        }
    }

    static {
        int m21602e;
        int m21602e2;
        m21602e = C7229k0.m21602e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f7690b = m21602e;
        m21602e2 = C7229k0.m21602e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12, null);
        f7691c = m21602e2;
        f7692d = new C7223h0("BUFFERED");
        f7693e = new C7223h0("SHOULD_BUFFER");
        f7694f = new C7223h0("S_RESUMING_BY_RCV");
        f7695g = new C7223h0("RESUMING_BY_EB");
        f7696h = new C7223h0("POISONED");
        f7697i = new C7223h0("DONE_RCV");
        f7698j = new C7223h0("INTERRUPTED_SEND");
        f7699k = new C7223h0("INTERRUPTED_RCV");
        f7700l = new C7223h0("CHANNEL_CLOSED");
        f7701m = new C7223h0("SUSPEND");
        f7702n = new C7223h0("SUSPEND_NO_WAITER");
        f7703o = new C7223h0("FAILED");
        f7704p = new C7223h0("NO_RECEIVE_RESULT");
        f7705q = new C7223h0("CLOSE_HANDLER_CLOSED");
        f7706r = new C7223h0("CLOSE_HANDLER_INVOKED");
        f7707s = new C7223h0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final long m9758A(int i10) {
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
    /* renamed from: B */
    public static final <T> boolean m9759B(InterfaceC13083m<? super T> interfaceC13083m, T t10, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Object mo24602l = interfaceC13083m.mo24602l(t10, null, interfaceC9998l);
        if (mo24602l == null) {
            return false;
        }
        interfaceC13083m.mo24603o(mo24602l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ boolean m9760C(InterfaceC13083m interfaceC13083m, Object obj, InterfaceC9998l interfaceC9998l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC9998l = null;
        }
        return m9759B(interfaceC13083m, obj, interfaceC9998l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final long m9782v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final long m9783w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final <E> C1815i<E> m9784x(long j10, C1815i<E> c1815i) {
        return new C1815i<>(j10, c1815i, c1815i.m9814u(), 0);
    }

    /* renamed from: y */
    public static final <E> InterfaceC11968e<C1815i<E>> m9785y() {
        return a.f7708a;
    }

    /* renamed from: z */
    public static final C7223h0 m9786z() {
        return f7700l;
    }
}
