package df;

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
import ef.b;
import gk.Continuation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import zk.l0;
import zk.w1;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final b f14050f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final gk.f f14051a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f14052b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14053c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque<Message> f14054d;

    /* renamed from: e, reason: collision with root package name */
    private final d f14055e;

    /* loaded from: classes2.dex */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final gk.f f14056a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {73}, m = "invokeSuspend")
        /* renamed from: df.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0210a extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f14057a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f14058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0210a(String str, Continuation<? super C0210a> continuation) {
                super(2, continuation);
                this.f14058b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
                return new C0210a(this.f14058b, continuation);
            }

            @Override // ok.p
            public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
                return ((C0210a) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f14057a;
                if (i10 == 0) {
                    ck.o.b(obj);
                    ef.a aVar = ef.a.f14644a;
                    this.f14057a = 1;
                    obj = aVar.c(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ck.o.b(obj);
                }
                Collection<ef.b> values = ((Map) obj).values();
                String str = this.f14058b;
                for (ef.b bVar : values) {
                    bVar.b(new b.C0229b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.c() + " of new session " + str);
                }
                return ck.v.f7137a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gk.f backgroundDispatcher) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.n.e(backgroundDispatcher, "backgroundDispatcher");
            this.f14056a = backgroundDispatcher;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            zk.j.d(l0.a(this.f14056a), null, null, new C0210a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            kotlin.jvm.internal.n.e(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements ok.p<zk.k0, Continuation<? super ck.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14059a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Message> f14061c;

        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int a10;
                a10 = fk.b.a(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
                return a10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f14061c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            return new c(this.f14061c, continuation);
        }

        @Override // ok.p
        public final Object invoke(zk.k0 k0Var, Continuation<? super ck.v> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            boolean z10;
            List n10;
            List D;
            List a02;
            String str;
            c10 = hk.d.c();
            int i10 = this.f14059a;
            if (i10 == 0) {
                ck.o.b(obj);
                ef.a aVar = ef.a.f14644a;
                this.f14059a = 1;
                obj = aVar.c(this);
                if (obj == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ck.o.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((ef.b) it.next()).a()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    n10 = dk.r.n(f0.this.l(this.f14061c, 2), f0.this.l(this.f14061c, 1));
                    D = dk.z.D(n10);
                    a02 = dk.z.a0(D, new a());
                    f0 f0Var = f0.this;
                    Iterator it2 = a02.iterator();
                    while (it2.hasNext()) {
                        f0Var.p((Message) it2.next());
                    }
                    return ck.v.f7137a;
                }
                str = "Data Collection is disabled for all subscribers. Skipping this Event";
            }
            Log.d("SessionLifecycleClient", str);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + f0.this.f14054d.size());
            f0.this.f14052b = new Messenger(iBinder);
            f0.this.f14053c = true;
            f0 f0Var = f0.this;
            f0Var.o(f0Var.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            f0.this.f14052b = null;
            f0.this.f14053c = false;
        }
    }

    public f0(gk.f backgroundDispatcher) {
        kotlin.jvm.internal.n.e(backgroundDispatcher, "backgroundDispatcher");
        this.f14051a = backgroundDispatcher;
        this.f14054d = new LinkedBlockingDeque<>(20);
        this.f14055e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.f14054d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List<Message> list, int i10) {
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

    private final void m(Message message) {
        StringBuilder sb2;
        if (this.f14054d.offer(message)) {
            sb2 = new StringBuilder();
            sb2.append("Queued message ");
            sb2.append(message.what);
            sb2.append(". Queue size ");
            sb2.append(this.f14054d.size());
        } else {
            sb2 = new StringBuilder();
            sb2.append("Failed to enqueue message ");
            sb2.append(message.what);
            sb2.append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", sb2.toString());
    }

    private final void n(int i10) {
        List<Message> j10 = j();
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.n.d(obtain, "obtain(null, messageCode, 0, 0)");
        j10.add(obtain);
        o(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w1 o(List<Message> list) {
        w1 d10;
        d10 = zk.j.d(l0.a(this.f14051a), null, null, new c(list, null), 3, null);
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f14052b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f14052b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e10) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i() {
        g0.f14065a.a().a(new Messenger(new a(this.f14051a)), this.f14055e);
    }

    public final void k() {
        n(1);
    }
}
