package p065df;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ck.C2030o;
import ck.C2037v;
import dk.C7031r;
import dk.C7042z;
import fk.C7368b;
import hk.C7752d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p084ef.C7184a;
import p084ef.InterfaceC7185b;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p494zk.C13071j;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;
import p494zk.InterfaceC13125w1;

/* renamed from: df.f0 */
/* loaded from: classes2.dex */
public final class C6914f0 {

    /* renamed from: f */
    public static final b f15404f = new b(null);

    /* renamed from: a */
    private final InterfaceC7587f f15405a;

    /* renamed from: b */
    private Messenger f15406b;

    /* renamed from: c */
    private boolean f15407c;

    /* renamed from: d */
    private final LinkedBlockingDeque<Message> f15408d;

    /* renamed from: e */
    private final d f15409e;

    /* renamed from: df.f0$a */
    /* loaded from: classes2.dex */
    public static final class a extends Handler {

        /* renamed from: a */
        private final InterfaceC7587f f15410a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", m27743f = "SessionLifecycleClient.kt", m27744l = {73}, m27745m = "invokeSuspend")
        /* renamed from: df.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C13200a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f15411a;

            /* renamed from: b */
            final /* synthetic */ String f15412b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13200a(String str, Continuation<? super C13200a> continuation) {
                super(2, continuation);
                this.f15412b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new C13200a(this.f15412b, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((C13200a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f15411a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    C7184a c7184a = C7184a.f16067a;
                    this.f15411a = 1;
                    obj = c7184a.m21384c(this);
                    if (obj == m23655c) {
                        return m23655c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2030o.m10349b(obj);
                }
                Collection<InterfaceC7185b> values = ((Map) obj).values();
                String str = this.f15412b;
                for (InterfaceC7185b interfaceC7185b : values) {
                    interfaceC7185b.mo21390b(new InterfaceC7185b.b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC7185b.mo21391c() + " of new session " + str);
                }
                return C2037v.f8089a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7587f backgroundDispatcher) {
            super(Looper.getMainLooper());
            C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
            this.f15410a = backgroundDispatcher;
        }

        /* renamed from: a */
        private final void m20028a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C13071j.m43218d(C13080l0.m43227a(this.f15410a), null, null, new C13200a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            C9322n.m27781e(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                m20028a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* renamed from: df.f0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m27743f = "SessionLifecycleClient.kt", m27744l = {149}, m27745m = "invokeSuspend")
    /* renamed from: df.f0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f15413a;

        /* renamed from: c */
        final /* synthetic */ List<Message> f15415c;

        /* renamed from: df.f0$c$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int m22236a;
                m22236a = C7368b.m22236a(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
                return m22236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15415c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15415c, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((c) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            boolean z10;
            List m20586n;
            List m20602D;
            List m20625a0;
            String str;
            m23655c = C7752d.m23655c();
            int i10 = this.f15413a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                C7184a c7184a = C7184a.f16067a;
                this.f15413a = 1;
                obj = c7184a.m21384c(this);
                if (obj == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC7185b) it.next()).mo21389a()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    m20586n = C7031r.m20586n(C6914f0.this.m20020l(this.f15415c, 2), C6914f0.this.m20020l(this.f15415c, 1));
                    m20602D = C7042z.m20602D(m20586n);
                    m20625a0 = C7042z.m20625a0(m20602D, new a());
                    C6914f0 c6914f0 = C6914f0.this;
                    Iterator it2 = m20625a0.iterator();
                    while (it2.hasNext()) {
                        c6914f0.m20024p((Message) it2.next());
                    }
                    return C2037v.f8089a;
                }
                str = "Data Collection is disabled for all subscribers. Skipping this Event";
            }
            Log.d("SessionLifecycleClient", str);
            return C2037v.f8089a;
        }
    }

    /* renamed from: df.f0$d */
    /* loaded from: classes2.dex */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C6914f0.this.f15408d.size());
            C6914f0.this.f15406b = new Messenger(iBinder);
            C6914f0.this.f15407c = true;
            C6914f0 c6914f0 = C6914f0.this;
            c6914f0.m20023o(c6914f0.m20019j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C6914f0.this.f15406b = null;
            C6914f0.this.f15407c = false;
        }
    }

    public C6914f0(InterfaceC7587f backgroundDispatcher) {
        C9322n.m27781e(backgroundDispatcher, "backgroundDispatcher");
        this.f15405a = backgroundDispatcher;
        this.f15408d = new LinkedBlockingDeque<>(20);
        this.f15409e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final List<Message> m20019j() {
        ArrayList arrayList = new ArrayList();
        this.f15408d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final Message m20020l(List<Message> list, int i10) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i10) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* renamed from: m */
    private final void m20021m(Message message) {
        StringBuilder sb2;
        if (this.f15408d.offer(message)) {
            sb2 = new StringBuilder();
            sb2.append("Queued message ");
            sb2.append(message.what);
            sb2.append(". Queue size ");
            sb2.append(this.f15408d.size());
        } else {
            sb2 = new StringBuilder();
            sb2.append("Failed to enqueue message ");
            sb2.append(message.what);
            sb2.append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", sb2.toString());
    }

    /* renamed from: n */
    private final void m20022n(int i10) {
        List<Message> m20019j = m20019j();
        Message obtain = Message.obtain(null, i10, 0, 0);
        C9322n.m27780d(obtain, "obtain(null, messageCode, 0, 0)");
        m20019j.add(obtain);
        m20023o(m20019j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final InterfaceC13125w1 m20023o(List<Message> list) {
        InterfaceC13125w1 m43218d;
        m43218d = C13071j.m43218d(C13080l0.m43227a(this.f15405a), null, null, new c(list, null), 3, null);
        return m43218d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m20024p(Message message) {
        if (this.f15406b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f15406b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
            }
        }
        m20021m(message);
    }

    /* renamed from: h */
    public final void m20025h() {
        m20022n(2);
    }

    /* renamed from: i */
    public final void m20026i() {
        InterfaceC6916g0.f15419a.m20033a().mo20032a(new Messenger(new a(this.f15405a)), this.f15409e);
    }

    /* renamed from: k */
    public final void m20027k() {
        m20022n(1);
    }
}
