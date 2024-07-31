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
import c.a;
import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: d */
    private static String f3614d;

    /* renamed from: g */
    private static e f3617g;

    /* renamed from: a */
    private final Context f3618a;

    /* renamed from: b */
    private final NotificationManager f3619b;

    /* renamed from: c */
    private static final Object f3613c = new Object();

    /* renamed from: e */
    private static Set<String> f3615e = new HashSet();

    /* renamed from: f */
    private static final Object f3616f = new Object();

    /* loaded from: classes.dex */
    public static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            String id2;
            id2 = notificationChannel.getId();
            return id2;
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            String id2;
            id2 = notificationChannelGroup.getId();
            return id2;
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            NotificationChannel notificationChannel;
            notificationChannel = notificationManager.getNotificationChannel(str);
            return notificationChannel;
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            List<NotificationChannelGroup> notificationChannelGroups;
            notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            return notificationChannelGroups;
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            List<NotificationChannel> notificationChannels;
            notificationChannels = notificationManager.getNotificationChannels();
            return notificationChannels;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements f {

        /* renamed from: a */
        final String f3620a;

        /* renamed from: b */
        final int f3621b;

        /* renamed from: c */
        final String f3622c;

        /* renamed from: d */
        final Notification f3623d;

        c(String str, int i10, String str2, Notification notification) {
            this.f3620a = str;
            this.f3621b = i10;
            this.f3622c = str2;
            this.f3623d = notification;
        }

        @Override // androidx.core.app.t0.f
        public void a(c.a aVar) {
            aVar.Y1(this.f3620a, this.f3621b, this.f3622c, this.f3623d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f3620a + ", id:" + this.f3621b + ", tag:" + this.f3622c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a */
        final ComponentName f3624a;

        /* renamed from: b */
        final IBinder f3625b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f3624a = componentName;
            this.f3625b = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f3626a;

        /* renamed from: b */
        private final HandlerThread f3627b;

        /* renamed from: c */
        private final Handler f3628c;

        /* renamed from: d */
        private final Map<ComponentName, a> f3629d = new HashMap();

        /* renamed from: e */
        private Set<String> f3630e = new HashSet();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ComponentName f3631a;

            /* renamed from: c */
            c.a f3633c;

            /* renamed from: b */
            boolean f3632b = false;

            /* renamed from: d */
            ArrayDeque<f> f3634d = new ArrayDeque<>();

            /* renamed from: e */
            int f3635e = 0;

            a(ComponentName componentName) {
                this.f3631a = componentName;
            }
        }

        e(Context context) {
            this.f3626a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3627b = handlerThread;
            handlerThread.start();
            this.f3628c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f3632b) {
                return true;
            }
            boolean bindService = this.f3626a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f3631a), this, 33);
            aVar.f3632b = bindService;
            if (bindService) {
                aVar.f3635e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f3631a);
                this.f3626a.unbindService(this);
            }
            return aVar.f3632b;
        }

        private void b(a aVar) {
            if (aVar.f3632b) {
                this.f3626a.unbindService(this);
                aVar.f3632b = false;
            }
            aVar.f3633c = null;
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f3629d.values()) {
                aVar.f3634d.add(fVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f3629d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f3629d.get(componentName);
            if (aVar != null) {
                aVar.f3633c = a.AbstractBinderC0111a.f2(iBinder);
                aVar.f3635e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f3629d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f3631a + ", " + aVar.f3634d.size() + " queued tasks");
            }
            if (aVar.f3634d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f3633c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f peek = aVar.f3634d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f3633c);
                    aVar.f3634d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f3631a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f3631a, e10);
                }
            }
            if (aVar.f3634d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f3628c.hasMessages(3, aVar.f3631a)) {
                return;
            }
            int i10 = aVar.f3635e + 1;
            aVar.f3635e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * AdError.NETWORK_ERROR_CODE;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f3628c.sendMessageDelayed(this.f3628c.obtainMessage(3, aVar.f3631a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f3634d.size() + " tasks to " + aVar.f3631a + " after " + aVar.f3635e + " retries");
            aVar.f3634d.clear();
        }

        private void j() {
            Set<String> g10 = t0.g(this.f3626a);
            if (g10.equals(this.f3630e)) {
                return;
            }
            this.f3630e = g10;
            List<ResolveInfo> queryIntentServices = this.f3626a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (g10.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f3629d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f3629d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f3629d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(f fVar) {
            this.f3628c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            }
            if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f3624a, dVar.f3625b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3628c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3628c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(c.a aVar);
    }

    private t0(Context context) {
        this.f3618a = context;
        this.f3619b = (NotificationManager) context.getSystemService("notification");
    }

    public static t0 f(Context context) {
        return new t0(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f3613c) {
            if (string != null) {
                if (!string.equals(f3614d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f3615e = hashSet;
                    f3614d = string;
                }
            }
            set = f3615e;
        }
        return set;
    }

    private void k(f fVar) {
        synchronized (f3616f) {
            if (f3617g == null) {
                f3617g = new e(this.f3618a.getApplicationContext());
            }
            f3617g.h(fVar);
        }
    }

    private static boolean l(Notification notification) {
        Bundle a10 = o.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f3619b);
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f3619b.cancel(str, i10);
    }

    public void d() {
        this.f3619b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f3619b, notificationChannel);
        }
    }

    public List<NotificationChannel> h() {
        return Build.VERSION.SDK_INT >= 26 ? b.k(this.f3619b) : Collections.emptyList();
    }

    public void i(int i10, Notification notification) {
        j(null, i10, notification);
    }

    public void j(String str, int i10, Notification notification) {
        if (!l(notification)) {
            this.f3619b.notify(str, i10, notification);
        } else {
            k(new c(this.f3618a.getPackageName(), i10, str, notification));
            this.f3619b.cancel(str, i10);
        }
    }
}
