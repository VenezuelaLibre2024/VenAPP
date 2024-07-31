package p361t6;

import p307q8.InterfaceC10312r;
import p351s8.C10837o;
import p351s8.InterfaceC10811b;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p397v7.C11700f1;

/* renamed from: t6.r */
/* loaded from: classes.dex */
public class C11091r implements InterfaceC10998a2 {

    /* renamed from: a */
    private final C10837o f28684a;

    /* renamed from: b */
    private final long f28685b;

    /* renamed from: c */
    private final long f28686c;

    /* renamed from: d */
    private final long f28687d;

    /* renamed from: e */
    private final long f28688e;

    /* renamed from: f */
    private final int f28689f;

    /* renamed from: g */
    private final boolean f28690g;

    /* renamed from: h */
    private final long f28691h;

    /* renamed from: i */
    private final boolean f28692i;

    /* renamed from: j */
    private int f28693j;

    /* renamed from: k */
    private boolean f28694k;

    public C11091r() {
        this(new C10837o(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected C11091r(C10837o c10837o, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        m34448i(i12, 0, "bufferForPlaybackMs", "0");
        m34448i(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m34448i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        m34448i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m34448i(i11, i10, "maxBufferMs", "minBufferMs");
        m34448i(i15, 0, "backBufferDurationMs", "0");
        this.f28684a = c10837o;
        this.f28685b = C11172r0.m34861C0(i10);
        this.f28686c = C11172r0.m34861C0(i11);
        this.f28687d = C11172r0.m34861C0(i12);
        this.f28688e = C11172r0.m34861C0(i13);
        this.f28689f = i14;
        this.f28693j = i14 == -1 ? 13107200 : i14;
        this.f28690g = z10;
        this.f28691h = C11172r0.m34861C0(i15);
        this.f28692i = z11;
    }

    /* renamed from: i */
    private static void m34448i(int i10, int i11, String str, String str2) {
        C11137a.m34600b(i10 >= i11, str + " cannot be less than " + str2);
    }

    /* renamed from: k */
    private static int m34449k(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    /* renamed from: l */
    private void m34450l(boolean z10) {
        int i10 = this.f28689f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f28693j = i10;
        this.f28694k = false;
        if (z10) {
            this.f28684a.m33042g();
        }
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: a */
    public boolean mo33633a() {
        return this.f28692i;
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: b */
    public long mo33634b() {
        return this.f28691h;
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: c */
    public boolean mo33635c(long j10, float f10, boolean z10, long j11) {
        long m34921f0 = C11172r0.m34921f0(j10, f10);
        long j12 = z10 ? this.f28688e : this.f28687d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || m34921f0 >= j12 || (!this.f28690g && this.f28684a.m33041f() >= this.f28693j);
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: d */
    public InterfaceC10811b mo33636d() {
        return this.f28684a;
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: e */
    public void mo33637e() {
        m34450l(true);
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: f */
    public void mo33638f(InterfaceC11090q3[] interfaceC11090q3Arr, C11700f1 c11700f1, InterfaceC10312r[] interfaceC10312rArr) {
        int i10 = this.f28689f;
        if (i10 == -1) {
            i10 = m34451j(interfaceC11090q3Arr, interfaceC10312rArr);
        }
        this.f28693j = i10;
        this.f28684a.m33043h(i10);
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: g */
    public void mo33639g() {
        m34450l(true);
    }

    @Override // p361t6.InterfaceC10998a2
    /* renamed from: h */
    public boolean mo33640h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f28684a.m33041f() >= this.f28693j;
        long j12 = this.f28685b;
        if (f10 > 1.0f) {
            j12 = Math.min(C11172r0.m34909a0(j12, f10), this.f28686c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f28690g && z11) {
                z10 = false;
            }
            this.f28694k = z10;
            if (!z10 && j11 < 500000) {
                C11173s.m34970i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f28686c || z11) {
            this.f28694k = false;
        }
        return this.f28694k;
    }

    /* renamed from: j */
    protected int m34451j(InterfaceC11090q3[] interfaceC11090q3Arr, InterfaceC10312r[] interfaceC10312rArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC11090q3Arr.length; i11++) {
            if (interfaceC10312rArr[i11] != null) {
                i10 += m34449k(interfaceC11090q3Arr[i11].mo34245g());
            }
        }
        return Math.max(13107200, i10);
    }

    @Override // p361t6.InterfaceC10998a2
    public void onPrepared() {
        m34450l(false);
    }
}
