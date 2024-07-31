package l2;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private androidx.work.impl.e0 f20873a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.impl.v f20874b;

    /* renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f20875c;

    public v(androidx.work.impl.e0 e0Var, androidx.work.impl.v vVar, WorkerParameters.a aVar) {
        this.f20873a = e0Var;
        this.f20874b = vVar;
        this.f20875c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20873a.o().q(this.f20874b, this.f20875c);
    }
}
