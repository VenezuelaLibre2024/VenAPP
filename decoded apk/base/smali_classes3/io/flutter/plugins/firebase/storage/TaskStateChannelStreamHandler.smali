.class public Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final TASK_APP_NAME:Ljava/lang/String;

.field private final TASK_SNAPSHOT:Ljava/lang/String;

.field private final TASK_STATE_NAME:Ljava/lang/String;

.field private final androidStorage:Lcom/google/firebase/storage/f;

.field private final androidTask:Lcom/google/firebase/storage/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/e0<",
            "*>;"
        }
    .end annotation
.end field

.field private final flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;Lcom/google/firebase/storage/f;Lcom/google/firebase/storage/e0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "taskState"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_STATE_NAME:Ljava/lang/String;

    const-string v0, "appName"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_APP_NAME:Ljava/lang/String;

    const-string v0, "snapshot"

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->TASK_SNAPSHOT:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    iput-object p2, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidStorage:Lcom/google/firebase/storage/f;

    iput-object p3, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$4(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V

    return-void
.end method

.method private getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidStorage:Lcom/google/firebase/storage/f;

    invoke-virtual {v1}, Lcom/google/firebase/storage/f;->a()Lzb/g;

    move-result-object v1

    invoke-virtual {v1}, Lzb/g;->q()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appName"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    const-string v1, "snapshot"

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p2, :cond_1

    const-string p1, "error"

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getExceptionDetails(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->RUNNING:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyResumeObjects()V

    return-void
.end method

.method private synthetic lambda$onListen$1(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->PAUSED:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyPauseObjects()V

    return-void
.end method

.method private synthetic lambda$onListen$2(Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/storage/e0$a;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    sget-object v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->SUCCESS:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v0, v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "taskState"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method

.method private synthetic lambda$onListen$3(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->CANCELED:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v1, v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "taskState"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->notifyCancelObjects()V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method

.method private synthetic lambda$onListen$4(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {v0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->getTaskEventMap(Ljava/lang/Object;Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->ERROR:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;

    iget v1, v1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageTaskState;->index:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "taskState"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "firebase_storage"

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->flutterTask:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->destroy()V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/d0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/d0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/storage/e0;->s(Lcom/google/firebase/storage/m;)Lcom/google/firebase/storage/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/e0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/e0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/storage/e0;->r(Lcom/google/firebase/storage/l;)Lcom/google/firebase/storage/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/f0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/f0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/storage/e0;->u(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/firebase/storage/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/g0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/g0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/storage/e0;->j(Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/firebase/storage/e0;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->androidTask:Lcom/google/firebase/storage/e0;

    new-instance v0, Lio/flutter/plugins/firebase/storage/h0;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/storage/h0;-><init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/storage/e0;->p(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/firebase/storage/e0;

    return-void
.end method
