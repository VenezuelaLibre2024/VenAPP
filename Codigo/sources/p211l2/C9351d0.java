package p211l2;

import android.content.Context;
import androidx.work.C1522b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.UUID;
import p094f2.AbstractC7277j;
import p094f2.C7286s;
import p094f2.InterfaceC7282o;
import p192k2.C9128q;
import p192k2.C9132u;
import p230m2.InterfaceC9536b;

/* renamed from: l2.d0 */
/* loaded from: classes.dex */
public class C9351d0 implements InterfaceC7282o {

    /* renamed from: c */
    static final String f22658c = AbstractC7277j.m21769i("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f22659a;

    /* renamed from: b */
    final InterfaceC9536b f22660b;

    /* renamed from: l2.d0$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UUID f22661a;

        /* renamed from: b */
        final /* synthetic */ C1522b f22662b;

        /* renamed from: c */
        final /* synthetic */ C1583c f22663c;

        a(UUID uuid, C1522b c1522b, C1583c c1583c) {
            this.f22661a = uuid;
            this.f22662b = c1522b;
            this.f22663c = c1583c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9132u mo26909h;
            String uuid = this.f22661a.toString();
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            String str = C9351d0.f22658c;
            m21767e.mo21770a(str, "Updating progress for " + this.f22661a + " (" + this.f22662b + ")");
            C9351d0.this.f22659a.m32253e();
            try {
                mo26909h = C9351d0.this.f22659a.mo8560J().mo26909h(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (mo26909h == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (mo26909h.f22006b == C7286s.a.RUNNING) {
                C9351d0.this.f22659a.mo8559I().mo26887c(new C9128q(uuid, this.f22662b));
            } else {
                AbstractC7277j.m21767e().mo21777k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
            }
            this.f22663c.mo8790o(null);
            C9351d0.this.f22659a.m32250B();
        }
    }

    public C9351d0(WorkDatabase workDatabase, InterfaceC9536b interfaceC9536b) {
        this.f22659a = workDatabase;
        this.f22660b = interfaceC9536b;
    }

    @Override // p094f2.InterfaceC7282o
    /* renamed from: a */
    public InterfaceFutureC5920f<Void> mo21788a(Context context, UUID uuid, C1522b c1522b) {
        C1583c m8801s = C1583c.m8801s();
        this.f22660b.m28365c(new a(uuid, c1522b, m8801s));
        return m8801s;
    }
}
