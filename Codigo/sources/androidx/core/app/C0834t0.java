package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p031c.InterfaceC1825a;

/* renamed from: androidx.core.app.t0 */
/* loaded from: classes.dex */
public final class C0834t0 {

    /* renamed from: d */
    private static String f4286d;

    /* renamed from: g */
    private static e f4289g;

    /* renamed from: a */
    private final Context f4290a;

    /* renamed from: b */
    private final NotificationManager f4291b;

    /* renamed from: c */
    private static final Object f4285c = new Object();

    /* renamed from: e */
    private static Set<String> f4287e = new HashSet();

    /* renamed from: f */
    private static final Object f4288f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.t0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static boolean m4291a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* renamed from: b */
        static int m4292b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* renamed from: androidx.core.app.t0$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m4293a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        /* renamed from: b */
        static void m4294b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        /* renamed from: c */
        static void m4295c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        /* renamed from: d */
        static void m4296d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        /* renamed from: e */
        static void m4297e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        /* renamed from: f */
        static void m4298f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        /* renamed from: g */
        static String m4299g(NotificationChannel notificationChannel) {
            String id2;
            id2 = notificationChannel.getId();
            return id2;
        }

        /* renamed from: h */
        static String m4300h(NotificationChannelGroup notificationChannelGroup) {
            String id2;
            id2 = notificationChannelGroup.getId();
            return id2;
        }

        /* renamed from: i */
        static NotificationChannel m4301i(NotificationManager notificationManager, String str) {
            NotificationChannel notificationChannel;
            notificationChannel = notificationManager.getNotificationChannel(str);
            return notificationChannel;
        }

        /* renamed from: j */
        static List<NotificationChannelGroup> m4302j(NotificationManager notificationManager) {
            List<NotificationChannelGroup> notificationChannelGroups;
            notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            return notificationChannelGroups;
        }

        /* renamed from: k */
        static List<NotificationChannel> m4303k(NotificationManager notificationManager) {
            List<NotificationChannel> notificationChannels;
            notificationChannels = notificationManager.getNotificationChannels();
            return notificationChannels;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.t0$c */
    /* loaded from: classes.dex */
    public static class c implements f {

        /* renamed from: a */
        final String f4292a;

        /* renamed from: b */
        final int f4293b;

        /* renamed from: c */
        final String f4294c;

        /* renamed from: d */
        final Notification f4295d;

        c(String str, int i10, String str2, Notification notification) {
            this.f4292a = str;
            this.f4293b = i10;
            this.f4294c = str2;
            this.f4295d = notification;
        }

        @Override // androidx.core.app.C0834t0.f
        /* renamed from: a */
        public void mo4304a(InterfaceC1825a interfaceC1825a) {
            interfaceC1825a.mo9824Y1(this.f4292a, this.f4293b, this.f4294c, this.f4295d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f4292a + ", id:" + this.f4293b + ", tag:" + this.f4294c + "]";
        }
    }

    /* renamed from: androidx.core.app.t0$d */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        final ComponentName f4296a;

        /* renamed from: b */
        final IBinder f4297b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f4296a = componentName;
            this.f4297b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.t0$e */
    /* loaded from: classes.dex */
    public static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f4298a;

        /* renamed from: b */
        private final HandlerThread f4299b;

        /* renamed from: c */
        private final Handler f4300c;

        /* renamed from: d */
        private final Map<ComponentName, a> f4301d = new HashMap();

        /* renamed from: e */
        private Set<String> f4302e = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.t0$e$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ComponentName f4303a;

            /* renamed from: c */
            InterfaceC1825a f4305c;

            /* renamed from: b */
            boolean f4304b = false;

            /* renamed from: d */
            ArrayDeque<f> f4306d = new ArrayDeque<>();

            /* renamed from: e */
            int f4307e = 0;

            a(ComponentName componentName) {
                this.f4303a = componentName;
            }
        }

        e(Context context) {
            this.f4298a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f4299b = handlerThread;
            handlerThread.start();
            this.f4300c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m4305a(a aVar) {
            if (aVar.f4304b) {
                return true;
            }
            boolean bindService = this.f4298a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f4303a), this, 33);
            aVar.f4304b = bindService;
            if (bindService) {
                aVar.f4307e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f4303a);
                this.f4298a.unbindService(this);
            }
            return aVar.f4304b;
        }

        /* renamed from: b */
        private void m4306b(a aVar) {
            if (aVar.f4304b) {
                this.f4298a.unbindService(this);
                aVar.f4304b = false;
            }
            aVar.f4305c = null;
        }

        /* renamed from: c */
        private void m4307c(f fVar) {
            m4313j();
            for (a aVar : this.f4301d.values()) {
                aVar.f4306d.add(fVar);
                m4311g(aVar);
            }
        }

        /* renamed from: d */
        private void m4308d(ComponentName componentName) {
            a aVar = this.f4301d.get(componentName);
            if (aVar != null) {
                m4311g(aVar);
            }
        }

        /* renamed from: e */
        private void m4309e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f4301d.get(componentName);
            if (aVar != null) {
                aVar.f4305c = InterfaceC1825a.a.m9825f2(iBinder);
                aVar.f4307e = 0;
                m4311g(aVar);
            }
        }

        /* renamed from: f */
        private void m4310f(ComponentName componentName) {
            a aVar = this.f4301d.get(componentName);
            if (aVar != null) {
                m4306b(aVar);
            }
        }

        /* renamed from: g */
        private void m4311g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f4303a + ", " + aVar.f4306d.size() + " queued tasks");
            }
            if (aVar.f4306d.isEmpty()) {
                return;
            }
            if (!m4305a(aVar) || aVar.f4305c == null) {
                m4312i(aVar);
                return;
            }
            while (true) {
                f peek = aVar.f4306d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.mo4304a(aVar.f4305c);
                    aVar.f4306d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f4303a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f4303a, e10);
                }
            }
            if (aVar.f4306d.isEmpty()) {
                return;
            }
            m4312i(aVar);
        }

        /* renamed from: i */
        private void m4312i(a aVar) {
            if (this.f4300c.hasMessages(3, aVar.f4303a)) {
                return;
            }
            int i10 = aVar.f4307e + 1;
            aVar.f4307e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * AdError.NETWORK_ERROR_CODE;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f4300c.sendMessageDelayed(this.f4300c.obtainMessage(3, aVar.f4303a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f4306d.size() + " tasks to " + aVar.f4303a + " after " + aVar.f4307e + " retries");
            aVar.f4306d.clear();
        }

        /* renamed from: j */
        private void m4313j() {
            Set<String> m4280g = C0834t0.m4280g(this.f4298a);
            if (m4280g.equals(this.f4302e)) {
                return;
            }
            this.f4302e = m4280g;
            List<ResolveInfo> queryIntentServices = this.f4298a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m4280g.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f4301d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f4301d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f4301d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m4306b(next.getValue());
                    it.remove();
                }
            }
        }

        /* renamed from: h */
        public void m4314h(f fVar) {
            this.f4300c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m4307c((f) message.obj);
                return true;
            }
            if (i10 == 1) {
                d dVar = (d) message.obj;
                m4309e(dVar.f4296a, dVar.f4297b);
                return true;
            }
            if (i10 == 2) {
                m4310f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            m4308d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f4300c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f4300c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.t0$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo4304a(InterfaceC1825a interfaceC1825a);
    }

    private C0834t0(Context context) {
        this.f4290a = context;
        this.f4291b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: f */
    public static C0834t0 m4279f(Context context) {
        return new C0834t0(context);
    }

    /* renamed from: g */
    public static Set<String> m4280g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f4285c) {
            if (string != null) {
                if (!string.equals(f4286d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f4287e = hashSet;
                    f4286d = string;
                }
            }
            set = f4287e;
        }
        return set;
    }

    /* renamed from: k */
    private void m4281k(f fVar) {
        synchronized (f4288f) {
            if (f4289g == null) {
                f4289g = new e(this.f4290a.getApplicationContext());
            }
            f4289g.m4314h(fVar);
        }
    }

    /* renamed from: l */
    private static boolean m4282l(Notification notification) {
        Bundle m4073a = C0818o.m4073a(notification);
        return m4073a != null && m4073a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m4283a() {
        return a.m4291a(this.f4291b);
    }

    /* renamed from: b */
    public void m4284b(int i10) {
        m4285c(null, i10);
    }

    /* renamed from: c */
    public void m4285c(String str, int i10) {
        this.f4291b.cancel(str, i10);
    }

    /* renamed from: d */
    public void m4286d() {
        this.f4291b.cancelAll();
    }

    /* renamed from: e */
    public void m4287e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.m4293a(this.f4291b, notificationChannel);
        }
    }

    /* renamed from: h */
    public List<NotificationChannel> m4288h() {
        return Build.VERSION.SDK_INT >= 26 ? b.m4303k(this.f4291b) : Collections.emptyList();
    }

    /* renamed from: i */
    public void m4289i(int i10, Notification notification) {
        m4290j(null, i10, notification);
    }

    /* renamed from: j */
    public void m4290j(String str, int i10, Notification notification) {
        if (!m4282l(notification)) {
            this.f4291b.notify(str, i10, notification);
        } else {
            m4281k(new c(this.f4290a.getPackageName(), i10, str, notification));
            this.f4291b.cancel(str, i10);
        }
    }
}
