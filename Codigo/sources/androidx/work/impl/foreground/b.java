package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.e0;
import f2.j;
import h2.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k2.m;
import k2.u;
import k2.x;

/* loaded from: classes.dex */
public class b implements h2.c, e {

    /* renamed from: v, reason: collision with root package name */
    static final String f5832v = j.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private Context f5833a;

    /* renamed from: b, reason: collision with root package name */
    private e0 f5834b;

    /* renamed from: c, reason: collision with root package name */
    private final m2.b f5835c;

    /* renamed from: d, reason: collision with root package name */
    final Object f5836d = new Object();

    /* renamed from: e, reason: collision with root package name */
    m f5837e;

    /* renamed from: f, reason: collision with root package name */
    final Map<m, f2.e> f5838f;

    /* renamed from: r, reason: collision with root package name */
    final Map<m, u> f5839r;

    /* renamed from: s, reason: collision with root package name */
    final Set<u> f5840s;

    /* renamed from: t, reason: collision with root package name */
    final d f5841t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC0096b f5842u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5843a;

        a(String str) {
            this.f5843a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u h10 = b.this.f5834b.o().h(this.f5843a);
            if (h10 == null || !h10.h()) {
                return;
            }
            synchronized (b.this.f5836d) {
                b.this.f5839r.put(x.a(h10), h10);
                b.this.f5840s.add(h10);
                b bVar = b.this;
                bVar.f5841t.a(bVar.f5840s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0096b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f5833a = context;
        e0 m10 = e0.m(context);
        this.f5834b = m10;
        this.f5835c = m10.s();
        this.f5837e = null;
        this.f5838f = new LinkedHashMap();
        this.f5840s = new HashSet();
        this.f5839r = new HashMap();
        this.f5841t = new h2.e(this.f5834b.q(), this);
        this.f5834b.o().g(this);
    }

    public static Intent c(Context context, m mVar, f2.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent e(Context context, m mVar, f2.e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        j.e().f(f5832v, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f5834b.b(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.e().a(f5832v, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f5842u == null) {
            return;
        }
        this.f5838f.put(mVar, new f2.e(intExtra, notification, intExtra2));
        if (this.f5837e == null) {
            this.f5837e = mVar;
            this.f5842u.c(intExtra, intExtra2, notification);
            return;
        }
        this.f5842u.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<m, f2.e>> it = this.f5838f.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().a();
        }
        f2.e eVar = this.f5838f.get(this.f5837e);
        if (eVar != null) {
            this.f5842u.c(eVar.c(), i10, eVar.b());
        }
    }

    private void j(Intent intent) {
        j.e().f(f5832v, "Started foreground service " + intent);
        this.f5835c.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // h2.c
    public void b(List<u> list) {
        if (list.isEmpty()) {
            return;
        }
        for (u uVar : list) {
            String str = uVar.f20223a;
            j.e().a(f5832v, "Constraints unmet for WorkSpec " + str);
            this.f5834b.z(x.a(uVar));
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        Map.Entry<m, f2.e> next;
        synchronized (this.f5836d) {
            u remove = this.f5839r.remove(mVar);
            if (remove != null ? this.f5840s.remove(remove) : false) {
                this.f5841t.a(this.f5840s);
            }
        }
        f2.e remove2 = this.f5838f.remove(mVar);
        if (mVar.equals(this.f5837e) && this.f5838f.size() > 0) {
            Iterator<Map.Entry<m, f2.e>> it = this.f5838f.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f5837e = next.getKey();
            if (this.f5842u != null) {
                f2.e value = next.getValue();
                this.f5842u.c(value.c(), value.a(), value.b());
                this.f5842u.d(value.c());
            }
        }
        InterfaceC0096b interfaceC0096b = this.f5842u;
        if (remove2 == null || interfaceC0096b == null) {
            return;
        }
        j.e().a(f5832v, "Removing Notification (id: " + remove2.c() + ", workSpecId: " + mVar + ", notificationType: " + remove2.a());
        interfaceC0096b.d(remove2.c());
    }

    @Override // h2.c
    public void f(List<u> list) {
    }

    void k(Intent intent) {
        j.e().f(f5832v, "Stopping foreground service");
        InterfaceC0096b interfaceC0096b = this.f5842u;
        if (interfaceC0096b != null) {
            interfaceC0096b.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f5842u = null;
        synchronized (this.f5836d) {
            this.f5841t.reset();
        }
        this.f5834b.o().n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                h(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    k(intent);
                    return;
                }
                return;
            }
        }
        i(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(InterfaceC0096b interfaceC0096b) {
        if (this.f5842u != null) {
            j.e().c(f5832v, "A callback already exists.");
        } else {
            this.f5842u = interfaceC0096b;
        }
    }
}
