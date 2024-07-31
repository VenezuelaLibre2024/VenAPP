package p1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import ck.v;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22743a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final MeasurementManager f22744b;

        public a(MeasurementManager mMeasurementManager) {
            n.e(mMeasurementManager, "mMeasurementManager");
            this.f22744b = mMeasurementManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.n.e(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.n.d(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.c.a.<init>(android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(p1.a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(d dVar) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(e eVar) {
            throw null;
        }

        @Override // p1.c
        public Object a(p1.a aVar, Continuation<? super v> continuation) {
            Continuation b10;
            Object c10;
            Object c11;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.deleteRegistrations(k(aVar), new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        }

        @Override // p1.c
        public Object b(Continuation<? super Integer> continuation) {
            Continuation b10;
            Object c10;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.getMeasurementApiStatus(new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            return w10;
        }

        @Override // p1.c
        public Object c(Uri uri, InputEvent inputEvent, Continuation<? super v> continuation) {
            Continuation b10;
            Object c10;
            Object c11;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.registerSource(uri, inputEvent, new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        }

        @Override // p1.c
        public Object d(Uri uri, Continuation<? super v> continuation) {
            Continuation b10;
            Object c10;
            Object c11;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.registerTrigger(uri, new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        }

        @Override // p1.c
        public Object e(d dVar, Continuation<? super v> continuation) {
            Continuation b10;
            Object c10;
            Object c11;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.registerWebSource(l(dVar), new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        }

        @Override // p1.c
        public Object f(e eVar, Continuation<? super v> continuation) {
            Continuation b10;
            Object c10;
            Object c11;
            b10 = hk.c.b(continuation);
            zk.n nVar = new zk.n(b10, 1);
            nVar.z();
            this.f22744b.registerWebTrigger(m(eVar), new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
            Object w10 = nVar.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                h.c(continuation);
            }
            c11 = hk.d.c();
            return w10 == c11 ? w10 : v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final c a(Context context) {
            n.e(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            l1.a aVar = l1.a.f20802a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(p1.a aVar, Continuation<? super v> continuation);

    public abstract Object b(Continuation<? super Integer> continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation<? super v> continuation);

    public abstract Object d(Uri uri, Continuation<? super v> continuation);

    public abstract Object e(d dVar, Continuation<? super v> continuation);

    public abstract Object f(e eVar, Continuation<? super v> continuation);
}
