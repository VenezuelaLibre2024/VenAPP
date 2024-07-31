package p211l2;

import androidx.work.WorkerParameters;
import androidx.work.impl.C1553e0;
import androidx.work.impl.C1584v;

/* renamed from: l2.v */
/* loaded from: classes.dex */
public class RunnableC9370v implements Runnable {

    /* renamed from: a */
    private C1553e0 f22695a;

    /* renamed from: b */
    private C1584v f22696b;

    /* renamed from: c */
    private WorkerParameters.C1520a f22697c;

    public RunnableC9370v(C1553e0 c1553e0, C1584v c1584v, WorkerParameters.C1520a c1520a) {
        this.f22695a = c1553e0;
        this.f22696b = c1584v;
        this.f22697c = c1520a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22695a.m8689o().m8760q(this.f22696b, this.f22697c);
    }
}
