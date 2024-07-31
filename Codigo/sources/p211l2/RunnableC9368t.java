package p211l2;

import androidx.work.impl.C1553e0;
import androidx.work.impl.C1574o;
import p094f2.InterfaceC7280m;

/* renamed from: l2.t */
/* loaded from: classes.dex */
public class RunnableC9368t implements Runnable {

    /* renamed from: a */
    private final C1553e0 f22687a;

    /* renamed from: b */
    private final C1574o f22688b = new C1574o();

    public RunnableC9368t(C1553e0 c1553e0) {
        this.f22687a = c1553e0;
    }

    /* renamed from: a */
    public InterfaceC7280m m27886a() {
        return this.f22688b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22687a.m8692r().mo8560J().mo26903b();
            this.f22688b.m8746a(InterfaceC7280m.f16314a);
        } catch (Throwable th2) {
            this.f22688b.m8746a(new InterfaceC7280m.b.a(th2));
        }
    }
}
