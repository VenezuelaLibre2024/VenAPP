package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.F1 */
/* loaded from: assets/audience_network.dex */
public final class C3126F1 {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final C3113Eo A01;
    public final long A02;
    public final CopyOnWriteArrayList<C3125F0> A03;

    public C3126F1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C3126F1(CopyOnWriteArrayList<C3125F0> copyOnWriteArrayList, int i10, C3113Eo c3113Eo, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = c3113Eo;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long A01 = AbstractC28079W.A01(j10);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final C3126F1 A02(int i10, C3113Eo c3113Eo, long j10) {
        return new C3126F1(this.A03, i10, c3113Eo, j10);
    }

    public final void A03() {
        AbstractC3281Ha.A04(this.A01 != null);
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3116Er(this, listener));
        }
    }

    public final void A04() {
        AbstractC3281Ha.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC3117Es(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        AbstractC3281Ha.A04(this.A01 != null);
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3122Ex(this, listener));
        }
    }

    public final void A06(int i10, Format format, int i11, Object obj, long j10) {
        A0C(new C3128F3(1, i10, format, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC3129F4 interfaceC3129F4) {
        AbstractC3281Ha.A03((handler == null || interfaceC3129F4 == null) ? false : true);
        this.A03.add(new C3125F0(handler, interfaceC3129F4));
    }

    public final void A08(C3127F2 c3127f2, C3128F3 c3128f3) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3120Ev(this, listener, c3127f2, c3128f3));
        }
    }

    public final void A09(C3127F2 c3127f2, C3128F3 c3128f3) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3119Eu(this, listener, c3127f2, c3128f3));
        }
    }

    public final void A0A(C3127F2 c3127f2, C3128F3 c3128f3) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3118Et(this, listener, c3127f2, c3128f3));
        }
    }

    public final void A0B(C3127F2 c3127f2, C3128F3 c3128f3, IOException iOException, boolean z10) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            A01(next.A00, new RunnableC3121Ew(this, next.A01, c3127f2, c3128f3, iOException, z10));
        }
    }

    public final void A0C(C3128F3 c3128f3) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 next = it.next();
            InterfaceC3129F4 listener = next.A01;
            A01(next.A00, new RunnableC3124Ez(this, listener, c3128f3));
        }
    }

    public final void A0D(InterfaceC3129F4 interfaceC3129F4) {
        Iterator<C3125F0> it = this.A03.iterator();
        while (it.hasNext()) {
            C3125F0 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC3129F4) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C3243Gy c3243Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12) {
        A0A(new C3127F2(c3243Gy, j12, 0L, 0L), new C3128F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(C3243Gy c3243Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new C3127F2(c3243Gy, j12, j13, j14), new C3128F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(C3243Gy c3243Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new C3127F2(c3243Gy, j12, j13, j14), new C3128F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(C3243Gy c3243Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new C3127F2(c3243Gy, j12, j13, j14), new C3128F3(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
