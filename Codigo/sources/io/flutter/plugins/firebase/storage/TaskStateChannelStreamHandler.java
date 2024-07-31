package io.flutter.plugins.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.e0;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TaskStateChannelStreamHandler implements EventChannel.StreamHandler {
    private final com.google.firebase.storage.f androidStorage;
    private final com.google.firebase.storage.e0<?> androidTask;
    private final FlutterFirebaseStorageTask flutterTask;
    private final String TASK_STATE_NAME = "taskState";
    private final String TASK_APP_NAME = "appName";
    private final String TASK_SNAPSHOT = "snapshot";

    public TaskStateChannelStreamHandler(FlutterFirebaseStorageTask flutterFirebaseStorageTask, com.google.firebase.storage.f fVar, com.google.firebase.storage.e0 e0Var) {
        this.flutterTask = flutterFirebaseStorageTask;
        this.androidStorage = fVar;
        this.androidTask = e0Var;
    }

    private Map<String, Object> getTaskEventMap(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.androidStorage.a().q());
        if (obj != null) {
            hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(obj));
        }
        if (exc != null) {
            hashMap.put("error", FlutterFirebaseStoragePlugin.getExceptionDetails(exc));
        }
        return hashMap;
    }

    public /* synthetic */ void lambda$onListen$0(EventChannel.EventSink eventSink, e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.RUNNING.index));
        eventSink.success(taskEventMap);
        this.flutterTask.notifyResumeObjects();
    }

    public /* synthetic */ void lambda$onListen$1(EventChannel.EventSink eventSink, e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.PAUSED.index));
        eventSink.success(taskEventMap);
        this.flutterTask.notifyPauseObjects();
    }

    public /* synthetic */ void lambda$onListen$2(EventChannel.EventSink eventSink, e0.a aVar) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(aVar, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.SUCCESS.index));
        eventSink.success(taskEventMap);
        this.flutterTask.destroy();
    }

    public /* synthetic */ void lambda$onListen$3(EventChannel.EventSink eventSink) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(null, null);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.CANCELED.index));
        eventSink.success(taskEventMap);
        this.flutterTask.notifyCancelObjects();
        this.flutterTask.destroy();
    }

    public /* synthetic */ void lambda$onListen$4(EventChannel.EventSink eventSink, Exception exc) {
        if (this.flutterTask.isDestroyed()) {
            return;
        }
        Map<String, Object> taskEventMap = getTaskEventMap(null, exc);
        taskEventMap.put("taskState", Integer.valueOf(GeneratedAndroidFirebaseStorage.PigeonStorageTaskState.ERROR.index));
        eventSink.error("firebase_storage", exc.getMessage(), taskEventMap);
        this.flutterTask.destroy();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.androidTask.s(new com.google.firebase.storage.m() { // from class: io.flutter.plugins.firebase.storage.d0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f18250b;

            public /* synthetic */ d0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.firebase.storage.m
            public final void a(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$0(r2, (e0.a) obj2);
            }
        });
        this.androidTask.r(new com.google.firebase.storage.l() { // from class: io.flutter.plugins.firebase.storage.e0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f18254b;

            public /* synthetic */ e0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.firebase.storage.l
            public final void a(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$1(r2, (e0.a) obj2);
            }
        });
        this.androidTask.addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.plugins.firebase.storage.f0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f18258b;

            public /* synthetic */ f0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                TaskStateChannelStreamHandler.this.lambda$onListen$2(r2, (e0.a) obj2);
            }
        });
        this.androidTask.addOnCanceledListener(new OnCanceledListener() { // from class: io.flutter.plugins.firebase.storage.g0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f18262b;

            public /* synthetic */ g0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                TaskStateChannelStreamHandler.this.lambda$onListen$3(r2);
            }
        });
        this.androidTask.addOnFailureListener(new OnFailureListener() { // from class: io.flutter.plugins.firebase.storage.h0

            /* renamed from: b */
            public final /* synthetic */ EventChannel.EventSink f18265b;

            public /* synthetic */ h0(EventChannel.EventSink eventSink2) {
                r2 = eventSink2;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                TaskStateChannelStreamHandler.this.lambda$onListen$4(r2, exc);
            }
        });
    }
}
