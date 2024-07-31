package l2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f2.s;
import java.util.UUID;

/* loaded from: classes.dex */
public class d0 implements f2.o {

    /* renamed from: c, reason: collision with root package name */
    static final String f20836c = f2.j.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f20837a;

    /* renamed from: b, reason: collision with root package name */
    final m2.b f20838b;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f20839a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f20840b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20841c;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f20839a = uuid;
            this.f20840b = bVar;
            this.f20841c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k2.u h10;
            String uuid = this.f20839a.toString();
            f2.j e10 = f2.j.e();
            String str = d0.f20836c;
            e10.a(str, "Updating progress for " + this.f20839a + " (" + this.f20840b + ")");
            d0.this.f20837a.e();
            try {
                h10 = d0.this.f20837a.J().h(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (h10 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (h10.f20224b == s.a.RUNNING) {
                d0.this.f20837a.I().c(new k2.q(uuid, this.f20840b));
            } else {
                f2.j.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
            }
            this.f20841c.o(null);
            d0.this.f20837a.B();
        }
    }

    public d0(WorkDatabase workDatabase, m2.b bVar) {
        this.f20837a = workDatabase;
        this.f20838b = bVar;
    }

    @Override // f2.o
    public com.google.common.util.concurrent.f<Void> a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f20838b.c(new a(uuid, bVar, s10));
        return s10;
    }
}
