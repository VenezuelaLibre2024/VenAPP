package ba;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f6320a;

    public b() {
        zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ma.b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6320a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    private final int e(Context context, Intent intent) {
        Task<Void> c10;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            c10 = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            c10 = w.b(context).c(2, bundle);
        }
        int b10 = b(context, new a(intent));
        try {
            Tasks.await(c10, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return b10;
    }

    private final int f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        return this.f6320a;
    }

    protected abstract int b(Context context, a aVar);

    protected void c(Context context, Bundle bundle) {
    }

    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int f10 = intent2 != null ? f(context, intent2) : e(context, intent);
            if (z10) {
                pendingResult.setResultCode(f10);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: ba.i
            @Override // java.lang.Runnable
            public final void run() {
                b.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}