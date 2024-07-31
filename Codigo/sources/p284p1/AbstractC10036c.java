package p284p1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import ck.C2037v;
import hk.C7751c;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p210l1.C9343a;
import p494zk.C13087n;

/* renamed from: p1.c */
/* loaded from: classes.dex */
public abstract class AbstractC10036c {

    /* renamed from: a */
    public static final b f24676a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC10036c {

        /* renamed from: b */
        private final MeasurementManager f24677b;

        public a(MeasurementManager mMeasurementManager) {
            C9322n.m27781e(mMeasurementManager, "mMeasurementManager");
            this.f24677b = mMeasurementManager;
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
                kotlin.jvm.internal.C9322n.m27781e(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.C9322n.m27780d(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p284p1.AbstractC10036c.a.<init>(android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public final DeletionRequest m29956k(C10034a c10034a) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final WebSourceRegistrationRequest m29957l(C10037d c10037d) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final WebTriggerRegistrationRequest m29958m(C10038e c10038e) {
            throw null;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: a */
        public Object mo29946a(C10034a c10034a, Continuation<? super C2037v> continuation) {
            Continuation m23654b;
            Object m23655c;
            Object m23655c2;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.deleteRegistrations(m29956k(c10034a), new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: b */
        public Object mo29947b(Continuation<? super Integer> continuation) {
            Continuation m23654b;
            Object m23655c;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.getMeasurementApiStatus(new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            return m43267w;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: c */
        public Object mo29948c(Uri uri, InputEvent inputEvent, Continuation<? super C2037v> continuation) {
            Continuation m23654b;
            Object m23655c;
            Object m23655c2;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.registerSource(uri, inputEvent, new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: d */
        public Object mo29949d(Uri uri, Continuation<? super C2037v> continuation) {
            Continuation m23654b;
            Object m23655c;
            Object m23655c2;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.registerTrigger(uri, new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: e */
        public Object mo29950e(C10037d c10037d, Continuation<? super C2037v> continuation) {
            Continuation m23654b;
            Object m23655c;
            Object m23655c2;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.registerWebSource(m29957l(c10037d), new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        }

        @Override // p284p1.AbstractC10036c
        /* renamed from: f */
        public Object mo29951f(C10038e c10038e, Continuation<? super C2037v> continuation) {
            Continuation m23654b;
            Object m23655c;
            Object m23655c2;
            m23654b = C7751c.m23654b(continuation);
            C13087n c13087n = new C13087n(m23654b, 1);
            c13087n.m43269z();
            this.f24677b.registerWebTrigger(m29958m(c10038e), new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
            Object m43267w = c13087n.m43267w();
            m23655c = C7752d.m23655c();
            if (m43267w == m23655c) {
                C9302h.m27753c(continuation);
            }
            m23655c2 = C7752d.m23655c();
            return m43267w == m23655c2 ? m43267w : C2037v.f8089a;
        }
    }

    /* renamed from: p1.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10036c m29959a(Context context) {
            C9322n.m27781e(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C9343a c9343a = C9343a.f22624a;
            sb2.append(c9343a.m27833a());
            Log.d("MeasurementManager", sb2.toString());
            if (c9343a.m27833a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo29946a(C10034a c10034a, Continuation<? super C2037v> continuation);

    /* renamed from: b */
    public abstract Object mo29947b(Continuation<? super Integer> continuation);

    /* renamed from: c */
    public abstract Object mo29948c(Uri uri, InputEvent inputEvent, Continuation<? super C2037v> continuation);

    /* renamed from: d */
    public abstract Object mo29949d(Uri uri, Continuation<? super C2037v> continuation);

    /* renamed from: e */
    public abstract Object mo29950e(C10037d c10037d, Continuation<? super C2037v> continuation);

    /* renamed from: f */
    public abstract Object mo29951f(C10038e c10038e, Continuation<? super C2037v> continuation);
}
