package io.flutter.plugins.firebase.storage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.storage.e;
import com.google.firebase.storage.n0;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterFirebaseStorageTask {
    static final SparseArray<FlutterFirebaseStorageTask> inProgressTasks = new SparseArray<>();
    private final byte[] bytes;
    private final Uri fileUri;
    private final int handle;
    private final com.google.firebase.storage.o metadata;
    private final com.google.firebase.storage.p reference;
    private com.google.firebase.storage.e0<?> storageTask;
    private final FlutterFirebaseStorageTaskType type;
    private final Object pauseSyncObject = new Object();
    private final Object resumeSyncObject = new Object();
    private final Object cancelSyncObject = new Object();
    private Boolean destroyed = Boolean.FALSE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum FlutterFirebaseStorageTaskType {
        FILE,
        BYTES,
        DOWNLOAD
    }

    private FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType flutterFirebaseStorageTaskType, int i10, com.google.firebase.storage.p pVar, byte[] bArr, Uri uri, com.google.firebase.storage.o oVar) {
        this.type = flutterFirebaseStorageTaskType;
        this.handle = i10;
        this.reference = pVar;
        this.bytes = bArr;
        this.fileUri = uri;
        this.metadata = oVar;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            sparseArray.put(i10, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void cancelInProgressTasks() {
        synchronized (inProgressTasks) {
            int i10 = 0;
            while (true) {
                SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
                if (i10 < sparseArray.size()) {
                    FlutterFirebaseStorageTask valueAt = sparseArray.valueAt(i10);
                    if (valueAt != null) {
                        valueAt.destroy();
                    }
                    i10++;
                } else {
                    sparseArray.clear();
                }
            }
        }
    }

    public static FlutterFirebaseStorageTask downloadFile(int i10, com.google.firebase.storage.p pVar, File file) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.DOWNLOAD, i10, pVar, null, Uri.fromFile(file), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FlutterFirebaseStorageTask getInProgressTaskForHandle(int i10) {
        FlutterFirebaseStorageTask flutterFirebaseStorageTask;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            flutterFirebaseStorageTask = sparseArray.get(i10);
        }
        return flutterFirebaseStorageTask;
    }

    public static Map<String, Object> parseDownloadTaskSnapshot(e.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", aVar.b().u());
        hashMap.put("bytesTransferred", Long.valueOf(aVar.c().isSuccessful() ? aVar.e() : aVar.d()));
        hashMap.put("totalBytes", Long.valueOf(aVar.e()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> parseTaskSnapshot(Object obj) {
        return obj instanceof e.a ? parseDownloadTaskSnapshot((e.a) obj) : parseUploadTaskSnapshot((n0.b) obj);
    }

    public static Map<String, Object> parseUploadTaskSnapshot(n0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", bVar.b().u());
        hashMap.put("bytesTransferred", Long.valueOf(bVar.d()));
        hashMap.put("totalBytes", Long.valueOf(bVar.f()));
        if (bVar.e() != null) {
            hashMap.put("metadata", FlutterFirebaseStoragePlugin.parseMetadataToMap(bVar.e()));
        }
        return hashMap;
    }

    public static FlutterFirebaseStorageTask uploadBytes(int i10, com.google.firebase.storage.p pVar, byte[] bArr, com.google.firebase.storage.o oVar) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.BYTES, i10, pVar, bArr, null, oVar);
    }

    public static FlutterFirebaseStorageTask uploadFile(int i10, com.google.firebase.storage.p pVar, Uri uri, com.google.firebase.storage.o oVar) {
        return new FlutterFirebaseStorageTask(FlutterFirebaseStorageTaskType.FILE, i10, pVar, null, uri, oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void destroy() {
        if (this.destroyed.booleanValue()) {
            return;
        }
        this.destroyed = Boolean.TRUE;
        SparseArray<FlutterFirebaseStorageTask> sparseArray = inProgressTasks;
        synchronized (sparseArray) {
            if (this.storageTask.K() || this.storageTask.L()) {
                this.storageTask.w();
            }
            sparseArray.remove(this.handle);
        }
        synchronized (this.cancelSyncObject) {
            this.cancelSyncObject.notifyAll();
        }
        synchronized (this.pauseSyncObject) {
            this.pauseSyncObject.notifyAll();
        }
        synchronized (this.resumeSyncObject) {
            this.resumeSyncObject.notifyAll();
        }
    }

    public com.google.firebase.storage.e0<?> getAndroidTask() {
        return this.storageTask;
    }

    public Object getSnapshot() {
        return this.storageTask.F();
    }

    public boolean isDestroyed() {
        return this.destroyed.booleanValue();
    }

    public void notifyCancelObjects() {
        synchronized (this.cancelSyncObject) {
            this.cancelSyncObject.notifyAll();
        }
    }

    public void notifyPauseObjects() {
        synchronized (this.pauseSyncObject) {
            this.pauseSyncObject.notifyAll();
        }
    }

    public void notifyResumeObjects() {
        synchronized (this.resumeSyncObject) {
            this.resumeSyncObject.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskStateChannelStreamHandler startTaskWithMethodChannel(MethodChannel methodChannel) {
        Uri uri;
        com.google.firebase.storage.e0<?> q10;
        Uri uri2;
        byte[] bArr;
        FlutterFirebaseStorageTaskType flutterFirebaseStorageTaskType = this.type;
        if (flutterFirebaseStorageTaskType == FlutterFirebaseStorageTaskType.BYTES && (bArr = this.bytes) != null) {
            com.google.firebase.storage.o oVar = this.metadata;
            q10 = oVar == null ? this.reference.C(bArr) : this.reference.D(bArr, oVar);
        } else if (flutterFirebaseStorageTaskType == FlutterFirebaseStorageTaskType.FILE && (uri2 = this.fileUri) != null) {
            com.google.firebase.storage.o oVar2 = this.metadata;
            q10 = oVar2 == null ? this.reference.E(uri2) : this.reference.F(uri2, oVar2);
        } else {
            if (flutterFirebaseStorageTaskType != FlutterFirebaseStorageTaskType.DOWNLOAD || (uri = this.fileUri) == null) {
                throw new Exception("Unable to start task. Some arguments have no been initialized.");
            }
            q10 = this.reference.q(uri);
        }
        this.storageTask = q10;
        return new TaskStateChannelStreamHandler(this, this.reference.w(), this.storageTask);
    }
}
