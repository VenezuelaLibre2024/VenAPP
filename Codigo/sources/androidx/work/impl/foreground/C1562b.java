package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.C1553e0;
import androidx.work.impl.InterfaceC1552e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p094f2.AbstractC7277j;
import p094f2.C7272e;
import p128h2.C7615e;
import p128h2.InterfaceC7613c;
import p128h2.InterfaceC7614d;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;
import p230m2.InterfaceC9536b;

/* renamed from: androidx.work.impl.foreground.b */
/* loaded from: classes.dex */
public class C1562b implements InterfaceC7613c, InterfaceC1552e {

    /* renamed from: v */
    static final String f6683v = AbstractC7277j.m21769i("SystemFgDispatcher");

    /* renamed from: a */
    private Context f6684a;

    /* renamed from: b */
    private C1553e0 f6685b;

    /* renamed from: c */
    private final InterfaceC9536b f6686c;

    /* renamed from: d */
    final Object f6687d = new Object();

    /* renamed from: e */
    C9124m f6688e;

    /* renamed from: f */
    final Map<C9124m, C7272e> f6689f;

    /* renamed from: r */
    final Map<C9124m, C9132u> f6690r;

    /* renamed from: s */
    final Set<C9132u> f6691s;

    /* renamed from: t */
    final InterfaceC7614d f6692t;

    /* renamed from: u */
    private b f6693u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6694a;

        a(String str) {
            this.f6694a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9132u m8755h = C1562b.this.f6685b.m8689o().m8755h(this.f6694a);
            if (m8755h == null || !m8755h.m26897h()) {
                return;
            }
            synchronized (C1562b.this.f6687d) {
                C1562b.this.f6690r.put(C9135x.m26934a(m8755h), m8755h);
                C1562b.this.f6691s.add(m8755h);
                C1562b c1562b = C1562b.this;
                c1562b.f6692t.mo23132a(c1562b.f6691s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo8703a(int i10, Notification notification);

        /* renamed from: c */
        void mo8704c(int i10, int i11, Notification notification);

        /* renamed from: d */
        void mo8705d(int i10);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1562b(Context context) {
        this.f6684a = context;
        C1553e0 m8677m = C1553e0.m8677m(context);
        this.f6685b = m8677m;
        this.f6686c = m8677m.m8693s();
        this.f6688e = null;
        this.f6689f = new LinkedHashMap();
        this.f6691s = new HashSet();
        this.f6690r = new HashMap();
        this.f6692t = new C7615e(this.f6685b.m8691q(), this);
        this.f6685b.m8689o().m8754g(this);
    }

    /* renamed from: c */
    public static Intent m8712c(Context context, C9124m c9124m, C7272e c7272e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c7272e.m21758c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7272e.m21756a());
        intent.putExtra("KEY_NOTIFICATION", c7272e.m21757b());
        intent.putExtra("KEY_WORKSPEC_ID", c9124m.m26876b());
        intent.putExtra("KEY_GENERATION", c9124m.m26875a());
        return intent;
    }

    /* renamed from: e */
    public static Intent m8713e(Context context, C9124m c9124m, C7272e c7272e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c9124m.m26876b());
        intent.putExtra("KEY_GENERATION", c9124m.m26875a());
        intent.putExtra("KEY_NOTIFICATION_ID", c7272e.m21758c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7272e.m21756a());
        intent.putExtra("KEY_NOTIFICATION", c7272e.m21757b());
        return intent;
    }

    /* renamed from: g */
    public static Intent m8714g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: h */
    private void m8715h(Intent intent) {
        AbstractC7277j.m21767e().mo21774f(f6683v, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f6685b.mo8681b(UUID.fromString(stringExtra));
    }

    /* renamed from: i */
    private void m8716i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C9124m c9124m = new C9124m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC7277j.m21767e().mo21770a(f6683v, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f6693u == null) {
            return;
        }
        this.f6689f.put(c9124m, new C7272e(intExtra, notification, intExtra2));
        if (this.f6688e == null) {
            this.f6688e = c9124m;
            this.f6693u.mo8704c(intExtra, intExtra2, notification);
            return;
        }
        this.f6693u.mo8703a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<C9124m, C7272e>> it = this.f6689f.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().m21756a();
        }
        C7272e c7272e = this.f6689f.get(this.f6688e);
        if (c7272e != null) {
            this.f6693u.mo8704c(c7272e.m21758c(), i10, c7272e.m21757b());
        }
    }

    /* renamed from: j */
    private void m8717j(Intent intent) {
        AbstractC7277j.m21767e().mo21774f(f6683v, "Started foreground service " + intent);
        this.f6686c.m28365c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: b */
    public void mo8630b(List<C9132u> list) {
        if (list.isEmpty()) {
            return;
        }
        for (C9132u c9132u : list) {
            String str = c9132u.f22005a;
            AbstractC7277j.m21767e().mo21770a(f6683v, "Constraints unmet for WorkSpec " + str);
            this.f6685b.m8699z(C9135x.m26934a(c9132u));
        }
    }

    @Override // androidx.work.impl.InterfaceC1552e
    /* renamed from: d */
    public void m8750l(C9124m c9124m, boolean z10) {
        Map.Entry<C9124m, C7272e> next;
        synchronized (this.f6687d) {
            C9132u remove = this.f6690r.remove(c9124m);
            if (remove != null ? this.f6691s.remove(remove) : false) {
                this.f6692t.mo23132a(this.f6691s);
            }
        }
        C7272e remove2 = this.f6689f.remove(c9124m);
        if (c9124m.equals(this.f6688e) && this.f6689f.size() > 0) {
            Iterator<Map.Entry<C9124m, C7272e>> it = this.f6689f.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f6688e = next.getKey();
            if (this.f6693u != null) {
                C7272e value = next.getValue();
                this.f6693u.mo8704c(value.m21758c(), value.m21756a(), value.m21757b());
                this.f6693u.mo8705d(value.m21758c());
            }
        }
        b bVar = this.f6693u;
        if (remove2 == null || bVar == null) {
            return;
        }
        AbstractC7277j.m21767e().mo21770a(f6683v, "Removing Notification (id: " + remove2.m21758c() + ", workSpecId: " + c9124m + ", notificationType: " + remove2.m21756a());
        bVar.mo8705d(remove2.m21758c());
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: f */
    public void mo8631f(List<C9132u> list) {
    }

    /* renamed from: k */
    void m8718k(Intent intent) {
        AbstractC7277j.m21767e().mo21774f(f6683v, "Stopping foreground service");
        b bVar = this.f6693u;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m8719l() {
        this.f6693u = null;
        synchronized (this.f6687d) {
            this.f6692t.reset();
        }
        this.f6685b.m8689o().m8758n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m8720m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m8717j(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m8715h(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    m8718k(intent);
                    return;
                }
                return;
            }
        }
        m8716i(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m8721n(b bVar) {
        if (this.f6693u != null) {
            AbstractC7277j.m21767e().mo21772c(f6683v, "A callback already exists.");
        } else {
            this.f6693u = bVar;
        }
    }
}
