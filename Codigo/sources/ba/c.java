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

/* loaded from: classes.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static int f6322h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f6323i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f6324j = new Executor() { // from class: ba.d0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f6325k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f6327b;

    /* renamed from: c, reason: collision with root package name */
    private final x f6328c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f6329d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f6331f;

    /* renamed from: g, reason: collision with root package name */
    private h f6332g;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.h<String, TaskCompletionSource<Bundle>> f6326a = new androidx.collection.h<>();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f6330e = new Messenger(new e(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f6327b = context;
        this.f6328c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6329d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task b(Bundle bundle) {
        return j(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        cVar.f6332g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f6331f = (Messenger) parcelableExtra;
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
                    Matcher matcher = f6325k.matcher(stringExtra);
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
                        cVar.i(group, extras);
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
                    synchronized (cVar.f6326a) {
                        for (int i10 = 0; i10 < cVar.f6326a.size(); i10++) {
                            cVar.i(cVar.f6326a.j(i10), intent2.getExtras());
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
                cVar.i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task<Bundle> f(Bundle bundle) {
        final String g10 = g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f6326a) {
            this.f6326a.put(g10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f6328c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.f6327b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 5);
        sb2.append("|ID|");
        sb2.append(g10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f6330e);
        if (this.f6331f != null || this.f6332g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f6331f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f6332g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f6329d.schedule(new Runnable() { // from class: ba.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f6324j, new OnCompleteListener() { // from class: ba.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c.this.e(g10, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f6328c.b() == 2) {
            this.f6327b.sendBroadcast(intent);
        } else {
            this.f6327b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f6329d.schedule(new Runnable() { // from class: ba.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f6324j, new OnCompleteListener() { // from class: ba.a0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                c.this.e(g10, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static synchronized String g() {
        String num;
        synchronized (c.class) {
            int i10 = f6322h;
            f6322h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (c.class) {
            if (f6323i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6323i = zza.zza(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f6323i);
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f6326a) {
            TaskCompletionSource<Bundle> remove = this.f6326a.remove(str);
            if (remove != null) {
                remove.setResult(bundle);
            } else {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            }
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<Bundle> a(final Bundle bundle) {
        return this.f6328c.a() < 12000000 ? this.f6328c.b() != 0 ? f(bundle).continueWithTask(f6324j, new Continuation() { // from class: ba.y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return c.this.c(bundle, task);
            }
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : w.b(this.f6327b).d(1, bundle).continueWith(f6324j, new Continuation() { // from class: ba.z
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

    public final /* synthetic */ Task c(Bundle bundle, Task task) {
        return (task.isSuccessful() && j((Bundle) task.getResult())) ? f(bundle).onSuccessTask(f6324j, new SuccessContinuation() { // from class: ba.b0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return c.b((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f6326a) {
            this.f6326a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
