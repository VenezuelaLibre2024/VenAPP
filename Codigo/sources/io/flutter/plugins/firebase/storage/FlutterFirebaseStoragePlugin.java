package io.flutter.plugins.firebase.storage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.o;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseStoragePlugin implements FlutterFirebasePlugin, FlutterPlugin, GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String DEFAULT_ERROR_CODE = "firebase_storage";
    static final String STORAGE_METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_storage";
    static final String STORAGE_TASK_EVENT_NAME = "taskEvent";
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<String, EventChannel> eventChannels = new HashMap();
    private final Map<String, EventChannel.StreamHandler> streamHandlers = new HashMap();

    private GeneratedAndroidFirebaseStorage.PigeonStorageReference convertToPigeonReference(com.google.firebase.storage.p pVar) {
        return new GeneratedAndroidFirebaseStorage.PigeonStorageReference.Builder().setBucket(pVar.n()).setFullPath(pVar.u()).setName(pVar.s()).build();
    }

    public static Map<String, String> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        GeneratedAndroidFirebaseStorage.FlutterError parserExceptionToFlutter = FlutterFirebaseStorageException.parserExceptionToFlutter(exc);
        if (parserExceptionToFlutter != null) {
            hashMap.put("code", parserExceptionToFlutter.code);
            hashMap.put(Constants.MESSAGE, parserExceptionToFlutter.getMessage());
        }
        return hashMap;
    }

    private com.google.firebase.storage.p getReferenceFromPigeon(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference) {
        return getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath());
    }

    private com.google.firebase.storage.f getStorageFromPigeon(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp) {
        return com.google.firebase.storage.f.f(zb.g.p(pigeonStorageFirebaseApp.getAppName()), "gs://" + pigeonStorageFirebaseApp.getBucket());
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(STORAGE_METHOD_CHANNEL_NAME, this);
        this.channel = new MethodChannel(binaryMessenger, STORAGE_METHOD_CHANNEL_NAME);
        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.setup(binaryMessenger, this);
        this.messenger = binaryMessenger;
    }

    public /* synthetic */ void lambda$didReinitializeFirebaseCore$8(TaskCompletionSource taskCompletionSource) {
        FlutterFirebaseStorageTask.cancelInProgressTasks();
        taskCompletionSource.setResult(null);
        removeEventListeners();
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$7(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(new HashMap());
    }

    public static /* synthetic */ void lambda$referenceDelete$0(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$referenceGetData$2(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success((byte[]) task.getResult());
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$referenceGetDownloadURL$1(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(((Uri) task.getResult()).toString());
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceGetMetaData$3(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonMetaData((com.google.firebase.storage.o) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceList$4(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonListResult((com.google.firebase.storage.j) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceListAll$5(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonListResult((com.google.firebase.storage.j) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$referenceUpdateMetadata$6(GeneratedAndroidFirebaseStorage.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(convertToPigeonMetaData((com.google.firebase.storage.o) task.getResult()));
        } else {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static Map<String, Object> parseMetadataToMap(com.google.firebase.storage.o oVar) {
        String y10;
        if (oVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (oVar.D() != null) {
            hashMap.put("name", oVar.D());
        }
        if (oVar.r() != null) {
            hashMap.put("bucket", oVar.r());
        }
        if (oVar.A() != null) {
            hashMap.put("generation", oVar.A());
        }
        if (oVar.C() != null) {
            hashMap.put("metadataGeneration", oVar.C());
        }
        hashMap.put("fullPath", oVar.E());
        hashMap.put("size", Long.valueOf(oVar.F()));
        hashMap.put("creationTimeMillis", Long.valueOf(oVar.x()));
        hashMap.put("updatedTimeMillis", Long.valueOf(oVar.G()));
        if (oVar.B() != null) {
            hashMap.put("md5Hash", oVar.B());
        }
        if (oVar.s() != null) {
            hashMap.put("cacheControl", oVar.s());
        }
        if (oVar.t() != null) {
            hashMap.put("contentDisposition", oVar.t());
        }
        if (oVar.u() != null) {
            hashMap.put("contentEncoding", oVar.u());
        }
        if (oVar.v() != null) {
            hashMap.put("contentLanguage", oVar.v());
        }
        if (oVar.w() != null) {
            hashMap.put("contentType", oVar.w());
        }
        HashMap hashMap2 = new HashMap();
        for (String str : oVar.z()) {
            if (oVar.y(str) == null) {
                y10 = "";
            } else {
                y10 = oVar.y(str);
                Objects.requireNonNull(y10);
            }
            hashMap2.put(str, y10);
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    private String registerEventChannel(String str, EventChannel.StreamHandler streamHandler) {
        return registerEventChannel(str, UUID.randomUUID().toString().toLowerCase(Locale.US), streamHandler);
    }

    private String registerEventChannel(String str, String str2, EventChannel.StreamHandler streamHandler) {
        EventChannel eventChannel = new EventChannel(this.messenger, str + "/" + str2);
        eventChannel.setStreamHandler(streamHandler);
        this.eventChannels.put(str2, eventChannel);
        this.streamHandlers.put(str2, streamHandler);
        return str2;
    }

    private void removeEventListeners() {
        Iterator<String> it = this.eventChannels.keySet().iterator();
        while (it.hasNext()) {
            this.eventChannels.get(it.next()).setStreamHandler(null);
        }
        this.eventChannels.clear();
        Iterator<String> it2 = this.streamHandlers.keySet().iterator();
        while (it2.hasNext()) {
            this.streamHandlers.get(it2.next()).onCancel(null);
        }
        this.streamHandlers.clear();
    }

    private byte[] stringToByteData(String str, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 0;
        } else {
            if (i10 != 2) {
                return null;
            }
            i11 = 8;
        }
        return Base64.decode(str, i11);
    }

    GeneratedAndroidFirebaseStorage.PigeonListResult convertToPigeonListResult(com.google.firebase.storage.j jVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.firebase.storage.p> it = jVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(convertToPigeonReference(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.google.firebase.storage.p> it2 = jVar.d().iterator();
        while (it2.hasNext()) {
            arrayList2.add(convertToPigeonReference(it2.next()));
        }
        return new GeneratedAndroidFirebaseStorage.PigeonListResult.Builder().setItems(arrayList).setPageToken(jVar.c()).setPrefixs(arrayList2).build();
    }

    GeneratedAndroidFirebaseStorage.PigeonFullMetaData convertToPigeonMetaData(com.google.firebase.storage.o oVar) {
        return new GeneratedAndroidFirebaseStorage.PigeonFullMetaData.Builder().setMetadata(parseMetadataToMap(oVar)).build();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.storage.e

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18252b;

            public /* synthetic */ e(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseStoragePlugin.this.lambda$didReinitializeFirebaseCore$8(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    com.google.firebase.storage.o getMetaDataFromPigeon(GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata) {
        o.b h10 = new o.b().d(pigeonSettableMetadata.getCacheControl()).e(pigeonSettableMetadata.getContentDisposition()).f(pigeonSettableMetadata.getContentEncoding()).g(pigeonSettableMetadata.getContentLanguage()).h(pigeonSettableMetadata.getContentType());
        Map<String, String> customMetadata = pigeonSettableMetadata.getCustomMetadata();
        if (customMetadata != null) {
            for (Map.Entry<String, String> entry : customMetadata.entrySet()) {
                h10.i(entry.getKey(), entry.getValue());
            }
        }
        return h10.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.storage.a
            public /* synthetic */ a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseStoragePlugin.lambda$getPluginConstantsForFirebaseApp$7(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void getReferencebyPath(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, String str2, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonStorageReference> result) {
        result.success(convertToPigeonReference(getStorageFromPigeon(pigeonStorageFirebaseApp).n(str)));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterFirebaseStorageTask.cancelInProgressTasks();
        this.channel.setMethodCallHandler(null);
        GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi.setup(this.messenger, null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceDelete(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).l().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.b
            public /* synthetic */ b() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceDelete$0(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceDownloadFile(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.downloadFile(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), new File(str)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, Long l10, GeneratedAndroidFirebaseStorage.Result<byte[]> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).o(l10.longValue()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.h
            public /* synthetic */ h() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceGetData$2(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetDownloadURL(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<String> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).p().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.i
            public /* synthetic */ i() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.lambda$referenceGetDownloadURL$1(GeneratedAndroidFirebaseStorage.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceGetMetaData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonFullMetaData> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).r().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.c

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f18245b;

            public /* synthetic */ c(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceGetMetaData$3(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceList(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.PigeonListOptions pigeonListOptions, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonListResult> result) {
        com.google.firebase.storage.p n10 = getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath());
        (pigeonListOptions.getPageToken() != null ? n10.z(pigeonListOptions.getMaxResults().intValue(), pigeonListOptions.getPageToken()) : n10.y(pigeonListOptions.getMaxResults().intValue())).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.d

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f18248b;

            public /* synthetic */ d(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceList$4(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceListAll(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonListResult> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).A().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.f

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f18256b;

            public /* synthetic */ f(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceListAll$5(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutData(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, byte[] bArr, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadBytes(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), bArr, getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutFile(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l10, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadFile(l10.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), Uri.fromFile(new File(str)), getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referencePutString(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, String str, Long l10, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, Long l11, GeneratedAndroidFirebaseStorage.Result<String> result) {
        try {
            result.success(registerEventChannel("plugins.flutter.io/firebase_storage/taskEvent", FlutterFirebaseStorageTask.uploadBytes(l11.intValue(), getReferenceFromPigeon(pigeonStorageFirebaseApp, pigeonStorageReference), stringToByteData(str, l10.intValue()), getMetaDataFromPigeon(pigeonSettableMetadata)).startTaskWithMethodChannel(this.channel)));
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void referenceUpdateMetadata(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, GeneratedAndroidFirebaseStorage.PigeonStorageReference pigeonStorageReference, GeneratedAndroidFirebaseStorage.PigeonSettableMetadata pigeonSettableMetadata, GeneratedAndroidFirebaseStorage.Result<GeneratedAndroidFirebaseStorage.PigeonFullMetaData> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).n(pigeonStorageReference.getFullPath()).G(getMetaDataFromPigeon(pigeonSettableMetadata)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.storage.g

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseStorage.Result f18260b;

            public /* synthetic */ g(GeneratedAndroidFirebaseStorage.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseStoragePlugin.this.lambda$referenceUpdateMetadata$6(r2, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxDownloadRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).o(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxOperationRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).p(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void setMaxUploadRetryTime(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        getStorageFromPigeon(pigeonStorageFirebaseApp).q(l10.longValue());
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskCancel(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Cancel operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean w10 = inProgressTaskForHandle.getAndroidTask().w();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(w10));
            if (w10) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskPause(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Pause operation was called on a task which does not exist.", null));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            boolean a02 = inProgressTaskForHandle.getAndroidTask().a0();
            hashMap.put("status", Boolean.valueOf(a02));
            if (a02) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void taskResume(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, Long l10, GeneratedAndroidFirebaseStorage.Result<Map<String, Object>> result) {
        FlutterFirebaseStorageTask inProgressTaskForHandle = FlutterFirebaseStorageTask.getInProgressTaskForHandle(l10.intValue());
        if (inProgressTaskForHandle == null) {
            result.error(new GeneratedAndroidFirebaseStorage.FlutterError("unknown", "Resume operation was called on a task which does not exist.", null));
            return;
        }
        try {
            boolean d02 = inProgressTaskForHandle.getAndroidTask().d0();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(d02));
            if (d02) {
                hashMap.put("snapshot", FlutterFirebaseStorageTask.parseTaskSnapshot(inProgressTaskForHandle.getSnapshot()));
            }
            result.success(hashMap);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }

    @Override // io.flutter.plugins.firebase.storage.GeneratedAndroidFirebaseStorage.FirebaseStorageHostApi
    public void useStorageEmulator(GeneratedAndroidFirebaseStorage.PigeonStorageFirebaseApp pigeonStorageFirebaseApp, String str, Long l10, GeneratedAndroidFirebaseStorage.Result<Void> result) {
        try {
            getStorageFromPigeon(pigeonStorageFirebaseApp).r(str, l10.intValue());
            result.success(null);
        } catch (Exception e10) {
            result.error(FlutterFirebaseStorageException.parserExceptionToFlutter(e10));
        }
    }
}
