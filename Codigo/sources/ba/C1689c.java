package ba;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C0738h;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ba.c */
/* loaded from: classes.dex */
public class C1689c {

    /* renamed from: h */
    private static int f7244h;

    /* renamed from: i */
    private static PendingIntent f7245i;

    /* renamed from: j */
    private static final Executor f7246j = new Executor() { // from class: ba.d0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k */
    private static final Pattern f7247k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f7249b;

    /* renamed from: c */
    private final C1712x f7250c;

    /* renamed from: d */
    private final ScheduledExecutorService f7251d;

    /* renamed from: f */
    private Messenger f7253f;

    /* renamed from: g */
    private C1696h f7254g;

    /* renamed from: a */
    private final C0738h<String, TaskCompletionSource<Bundle>> f7248a = new C0738h<>();

    /* renamed from: e */
    private Messenger f7252e = new Messenger(new HandlerC1693e(this, Looper.getMainLooper()));

    public C1689c(Context context) {
        this.f7249b = context;
        this.f7250c = new C1712x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7251d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ Task m9287b(Bundle bundle) {
        return m9293j(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m9288d(C1689c c1689c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1695g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1696h) {
                        c1689c.f7254g = (C1696h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1689c.f7253f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f7247k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c1689c.m9292i(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                    sb2.append("Unexpected response, no error or registration id ");
                    sb2.append(valueOf2);
                    Log.w("Rpc", sb2.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1689c.f7248a) {
                        for (int i10 = 0; i10 < c1689c.f7248a.size(); i10++) {
                            c1689c.m9292i(c1689c.f7248a.m3711j(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c1689c.m9292i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final Task<Bundle> m9289f(Bundle bundle) {
        final String m9290g = m9290g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f7248a) {
            this.f7248a.put(m9290g, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f7250c.m9319b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        m9291h(this.f7249b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m9290g).length() + 5);
        sb2.append("|ID|");
        sb2.append(m9290g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f7252e);
        if (this.f7253f != null || this.f7254g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f7253f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f7254g.m9298b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f7251d.schedule(new Runnable() { // from class: ba.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f7246j, new OnCompleteListener() { // from class: ba.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C1689c.this.m9296e(m9290g, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f7250c.m9319b() == 2) {
            this.f7249b.sendBroadcast(intent);
        } else {
            this.f7249b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f7251d.schedule(new Runnable() { // from class: ba.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f7246j, new OnCompleteListener() { // from class: ba.a0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C1689c.this.m9296e(m9290g, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    private static synchronized String m9290g() {
        String num;
        synchronized (C1689c.class) {
            int i10 = f7244h;
            f7244h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m9291h(Context context, Intent intent) {
        synchronized (C1689c.class) {
            if (f7245i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f7245i = zza.zza(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f7245i);
        }
    }

    /* renamed from: i */
    private final void m9292i(String str, Bundle bundle) {
        synchronized (this.f7248a) {
            TaskCompletionSource<Bundle> remove = this.f7248a.remove(str);
            if (remove != null) {
                remove.setResult(bundle);
            } else {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            }
        }
    }

    /* renamed from: j */
    private static boolean m9293j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public Task<Bundle> m9294a(final Bundle bundle) {
        return this.f7250c.m9318a() < 12000000 ? this.f7250c.m9319b() != 0 ? m9289f(bundle).continueWithTask(f7246j, new Continuation() { // from class: ba.y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C1689c.this.m9295c(bundle, task);
            }
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : C1711w.m9312b(this.f7249b).m9317d(1, bundle).continueWith(f7246j, new Continuation() { // from class: ba.z
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(task.getException());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf);
                    Log.d("Rpc", sb2.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ Task m9295c(Bundle bundle, Task task) {
        return (task.isSuccessful() && m9293j((Bundle) task.getResult())) ? m9289f(bundle).onSuccessTask(f7246j, new SuccessContinuation() { // from class: ba.b0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C1689c.m9287b((Bundle) obj);
            }
        }) : task;
    }

    /* renamed from: e */
    public final /* synthetic */ void m9296e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f7248a) {
            this.f7248a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
