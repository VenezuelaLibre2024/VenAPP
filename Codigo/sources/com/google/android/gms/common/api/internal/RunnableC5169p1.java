package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.AbstractC5207q;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.internal.C5276s;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.p1 */
/* loaded from: classes.dex */
final class RunnableC5169p1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC5204n f10562a;

    /* renamed from: b */
    final /* synthetic */ C5178s1 f10563b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5169p1(C5178s1 c5178s1, InterfaceC5204n interfaceC5204n) {
        this.f10563b = c5178s1;
        this.f10562a = interfaceC5204n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        HandlerC5172q1 handlerC5172q1;
        HandlerC5172q1 handlerC5172q12;
        WeakReference weakReference2;
        AbstractC5106f abstractC5106f;
        AbstractC5207q abstractC5207q;
        HandlerC5172q1 handlerC5172q13;
        HandlerC5172q1 handlerC5172q14;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                abstractC5207q = this.f10563b.f10579a;
                AbstractC5109i m13218b = ((AbstractC5207q) C5276s.m13324j(abstractC5207q)).m13218b(this.f10562a);
                C5178s1 c5178s1 = this.f10563b;
                handlerC5172q13 = c5178s1.f10586h;
                handlerC5172q14 = c5178s1.f10586h;
                handlerC5172q13.sendMessage(handlerC5172q14.obtainMessage(0, m13218b));
                threadLocal.set(Boolean.FALSE);
                C5178s1 c5178s12 = this.f10563b;
                C5178s1.m13183o(this.f10562a);
                weakReference3 = this.f10563b.f10585g;
                abstractC5106f = (AbstractC5106f) weakReference3.get();
                if (abstractC5106f == null) {
                    return;
                }
            } catch (RuntimeException e10) {
                C5178s1 c5178s13 = this.f10563b;
                handlerC5172q1 = c5178s13.f10586h;
                handlerC5172q12 = c5178s13.f10586h;
                handlerC5172q1.sendMessage(handlerC5172q12.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                C5178s1 c5178s14 = this.f10563b;
                C5178s1.m13183o(this.f10562a);
                weakReference2 = this.f10563b.f10585g;
                abstractC5106f = (AbstractC5106f) weakReference2.get();
                if (abstractC5106f == null) {
                    return;
                }
            }
            abstractC5106f.mo12992j(this.f10563b);
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            C5178s1 c5178s15 = this.f10563b;
            C5178s1.m13183o(this.f10562a);
            weakReference = this.f10563b.f10585g;
            AbstractC5106f abstractC5106f2 = (AbstractC5106f) weakReference.get();
            if (abstractC5106f2 != null) {
                abstractC5106f2.mo12992j(this.f10563b);
            }
            throw th2;
        }
    }
}
