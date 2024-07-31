package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.r0;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class FlutterFirebaseMessagingBackgroundService extends JobIntentService {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "FLTFireMsgService";
    private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
    private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());

    public static void enqueueMessageProcessing(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        JobIntentService.enqueueWork(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, ((r0) extras.get("notification")).B1() == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onHandleWork$0(Intent intent, CountDownLatch countDownLatch) {
        flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(intent, countDownLatch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onInitialized() {
        Log.i(TAG, "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = messagingQueue;
        synchronized (list) {
            Iterator<Intent> it = list.iterator();
            while (it.hasNext()) {
                flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(it.next(), null);
            }
            messagingQueue.clear();
        }
    }

    public static void setCallbackDispatcher(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(j10);
    }

    public static void setUserCallbackHandle(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(j10);
    }

    public static void startBackgroundIsolate(long j10, FlutterShellArgs flutterShellArgs) {
        if (flutterBackgroundExecutor != null) {
            Log.w(TAG, "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        flutterBackgroundExecutor = flutterFirebaseMessagingBackgroundExecutor;
        flutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(j10, flutterShellArgs);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (flutterBackgroundExecutor == null) {
            flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        }
        flutterBackgroundExecutor.startBackgroundIsolate();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    protected void onHandleWork(final Intent intent) {
        if (!flutterBackgroundExecutor.isDartBackgroundHandlerRegistered()) {
            Log.w(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = messagingQueue;
        synchronized (list) {
            if (flutterBackgroundExecutor.isNotRunning()) {
                Log.i(TAG, "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.c
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterFirebaseMessagingBackgroundService.lambda$onHandleWork$0(intent, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                Log.i(TAG, "Exception waiting to execute Dart callback", e10);
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ void setInterruptIfStopped(boolean z10) {
        super.setInterruptIfStopped(z10);
    }
}
