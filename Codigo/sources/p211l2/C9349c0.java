package p211l2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1562b;
import androidx.work.impl.foreground.InterfaceC1561a;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.UUID;
import p094f2.AbstractC7277j;
import p094f2.C7272e;
import p094f2.InterfaceC7273f;
import p192k2.C9132u;
import p192k2.C9135x;
import p192k2.InterfaceC9133v;
import p230m2.InterfaceC9536b;

/* renamed from: l2.c0 */
/* loaded from: classes.dex */
public class C9349c0 implements InterfaceC7273f {

    /* renamed from: d */
    private static final String f22646d = AbstractC7277j.m21769i("WMFgUpdater");

    /* renamed from: a */
    private final InterfaceC9536b f22647a;

    /* renamed from: b */
    final InterfaceC1561a f22648b;

    /* renamed from: c */
    final InterfaceC9133v f22649c;

    /* renamed from: l2.c0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1583c f22650a;

        /* renamed from: b */
        final /* synthetic */ UUID f22651b;

        /* renamed from: c */
        final /* synthetic */ C7272e f22652c;

        /* renamed from: d */
        final /* synthetic */ Context f22653d;

        a(C1583c c1583c, UUID uuid, C7272e c7272e, Context context) {
            this.f22650a = c1583c;
            this.f22651b = uuid;
            this.f22652c = c7272e;
            this.f22653d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f22650a.isCancelled()) {
                    String uuid = this.f22651b.toString();
                    C9132u mo26909h = C9349c0.this.f22649c.mo26909h(uuid);
                    if (mo26909h == null || mo26909h.f22006b.m21794h()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C9349c0.this.f22648b.mo8710c(uuid, this.f22652c);
                    this.f22653d.startService(C1562b.m8712c(this.f22653d, C9135x.m26934a(mo26909h), this.f22652c));
                }
                this.f22650a.mo8790o(null);
            } catch (Throwable th2) {
                this.f22650a.mo8791p(th2);
            }
        }
    }

    public C9349c0(WorkDatabase workDatabase, InterfaceC1561a interfaceC1561a, InterfaceC9536b interfaceC9536b) {
        this.f22648b = interfaceC1561a;
        this.f22647a = interfaceC9536b;
        this.f22649c = workDatabase.mo8560J();
    }

    @Override // p094f2.InterfaceC7273f
    /* renamed from: a */
    public InterfaceFutureC5920f<Void> mo21759a(Context context, UUID uuid, C7272e c7272e) {
        C1583c m8801s = C1583c.m8801s();
        this.f22647a.m28365c(new a(m8801s, uuid, c7272e, context));
        return m8801s;
    }
}
