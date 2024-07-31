.class public Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FirebaseStorageHostApi;


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field static final DEFAULT_ERROR_CODE:Ljava/lang/String; = "firebase_storage"

.field static final STORAGE_METHOD_CHANNEL_NAME:Ljava/lang/String; = "plugins.flutter.io/firebase_storage"

.field static final STORAGE_TASK_EVENT_NAME:Ljava/lang/String; = "taskEvent"


# instance fields
.field private channel:Lio/flutter/plugin/common/MethodChannel;

.field private final eventChannels:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugin/common/EventChannel;",
            ">;"
        }
    .end annotation
.end field

.field private messenger:Lio/flutter/plugin/common/BinaryMessenger;

.field private final streamHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugin/common/EventChannel$StreamHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->eventChannels:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->streamHandlers:Ljava/util/Map;

    return-void
.end method

.method public static synthetic A(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$didReinitializeFirebaseCore$8(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic B(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceGetMetaData$3(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private convertToPigeonReference(Lcom/google/firebase/storage/p;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;
    .locals 2

    new-instance v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;->setBucket(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;->setFullPath(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;->setName(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference$Builder;->build()Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;

    move-result-object p1

    return-object p1
.end method

.method static getExceptionDetails(Ljava/lang/Exception;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "code"

    iget-object v2, p0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;->code:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "message"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private getReferenceFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;)Lcom/google/firebase/storage/p;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    return-object p1
.end method

.method private getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;
    .locals 3

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;->getAppName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzb/g;->p(Ljava/lang/String;)Lzb/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gs://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;->getBucket()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/firebase/storage/f;->f(Lzb/g;Ljava/lang/String;)Lcom/google/firebase/storage/f;

    move-result-object p1

    return-object p1
.end method

.method private initInstance(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    const-string v0, "plugins.flutter.io/firebase_storage"

    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    new-instance v1, Lio/flutter/plugin/common/MethodChannel;

    invoke-direct {v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p1, p0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FirebaseStorageHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FirebaseStorageHostApi;)V

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    return-void
.end method

.method private synthetic lambda$didReinitializeFirebaseCore$8(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    invoke-static {}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelInProgressTasks()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->removeEventListeners()V

    return-void
.end method

.method private static synthetic lambda$getPluginConstantsForFirebaseApp$7(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic lambda$referenceDelete$0(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private static synthetic lambda$referenceGetData$2(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private static synthetic lambda$referenceGetDownloadURL$1(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$referenceGetMetaData$3(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/storage/o;

    invoke-virtual {p0, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonMetaData(Lcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$referenceList$4(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/storage/j;

    invoke-virtual {p0, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonListResult(Lcom/google/firebase/storage/j;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$referenceListAll$5(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/storage/j;

    invoke-virtual {p0, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonListResult(Lcom/google/firebase/storage/j;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$referenceUpdateMetadata$6(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/storage/o;

    invoke-virtual {p0, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonMetaData(Lcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p2

    invoke-static {p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method static parseMetadataToMap(Lcom/google/firebase/storage/o;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/o;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->D()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "name"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->D()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->r()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "bucket"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->r()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->A()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "generation"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->A()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->C()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "metadataGeneration"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->C()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const-string v1, "fullPath"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->E()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->F()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "size"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->x()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "creationTimeMillis"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->G()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "updatedTimeMillis"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->B()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v1, "md5Hash"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->B()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->s()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v1, "cacheControl"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->s()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->t()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v1, "contentDisposition"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->t()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->u()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    const-string v1, "contentEncoding"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->u()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->v()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    const-string v1, "contentLanguage"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->v()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->w()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string v1, "contentType"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->z()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/google/firebase/storage/o;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_b

    const-string v4, ""

    goto :goto_1

    :cond_b
    invoke-virtual {p0, v3}, Lcom/google/firebase/storage/o;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_c
    const-string p0, "customMetadata"

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private registerEventChannel(Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->registerEventChannel(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private registerEventChannel(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->eventChannels:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->streamHandlers:Ljava/util/Map;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private removeEventListeners()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->eventChannels:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->eventChannels:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v1, v2}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->eventChannels:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->streamHandlers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->streamHandlers:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugin/common/EventChannel$StreamHandler;

    invoke-interface {v1, v2}, Lio/flutter/plugin/common/EventChannel$StreamHandler;->onCancel(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->streamHandlers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private stringToByteData(Ljava/lang/String;I)[B
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-static {p1, p2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p2, 0x0

    goto :goto_0
.end method

.method public static synthetic t(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceListAll$5(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic u(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceUpdateMetadata$6(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic v(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceGetDownloadURL$1(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic w(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceGetData$2(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic x(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$getPluginConstantsForFirebaseApp$7(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic y(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceDelete$0(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic z(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->lambda$referenceList$4(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method


# virtual methods
.method convertToPigeonListResult(Lcom/google/firebase/storage/j;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/storage/j;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/storage/p;

    invoke-direct {p0, v2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonReference(Lcom/google/firebase/storage/p;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/firebase/storage/j;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/firebase/storage/p;

    invoke-direct {p0, v3}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonReference(Lcom/google/firebase/storage/p;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v2, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;

    invoke-direct {v2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;-><init>()V

    invoke-virtual {v2, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;->setItems(Ljava/util/List;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/storage/j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;->setPageToken(Ljava/lang/String;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;->setPrefixs(Ljava/util/List;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult$Builder;->build()Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;

    move-result-object p1

    return-object p1
.end method

.method convertToPigeonMetaData(Lcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;
    .locals 1

    new-instance v0, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData$Builder;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData$Builder;-><init>()V

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->parseMetadataToMap(Lcom/google/firebase/storage/o;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData$Builder;->setMetadata(Ljava/util/Map;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData$Builder;->build()Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;

    move-result-object p1

    return-object p1
.end method

.method public didReinitializeFirebaseCore()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/storage/e;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/firebase/storage/e;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method getMetaDataFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;)Lcom/google/firebase/storage/o;
    .locals 3

    new-instance v0, Lcom/google/firebase/storage/o$b;

    invoke-direct {v0}, Lcom/google/firebase/storage/o$b;-><init>()V

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getCacheControl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/o$b;->d(Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getContentDisposition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/o$b;->e(Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getContentEncoding()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/o$b;->f(Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getContentLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/o$b;->g(Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getContentType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/storage/o$b;->h(Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;->getCustomMetadata()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/google/firebase/storage/o$b;->i(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/storage/o$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/firebase/storage/o$b;->a()Lcom/google/firebase/storage/o;

    move-result-object p1

    return-object p1
.end method

.method public getPluginConstantsForFirebaseApp(Lzb/g;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lio/flutter/plugins/firebase/storage/a;

    invoke-direct {v1, p1}, Lio/flutter/plugins/firebase/storage/a;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public getReferencebyPath(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->convertToPigeonReference(Lcom/google/firebase/storage/p;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;

    move-result-object p1

    invoke-interface {p4, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->initInstance(Lio/flutter/plugin/common/BinaryMessenger;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    invoke-static {}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->cancelInProgressTasks()V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object p1, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    invoke-static {p1, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FirebaseStorageHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FirebaseStorageHostApi;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    iput-object v0, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    invoke-direct {p0}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->removeEventListeners()V

    return-void
.end method

.method public referenceDelete(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->l()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/b;

    invoke-direct {p2, p3}, Lio/flutter/plugins/firebase/storage/b;-><init>(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referenceDownloadFile(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Ljava/lang/String;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getReferenceFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Long;->intValue()I

    move-result p2

    new-instance p4, Ljava/io/File;

    invoke-direct {p4, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p1, p4}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->downloadFile(ILcom/google/firebase/storage/p;Ljava/io/File;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->startTaskWithMethodChannel(Lio/flutter/plugin/common/MethodChannel;)Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    move-result-object p1

    const-string p2, "plugins.flutter.io/firebase_storage/taskEvent"

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->registerEventChannel(Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p5, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public referenceGetData(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/firebase/storage/p;->o(J)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/h;

    invoke-direct {p2, p4}, Lio/flutter/plugins/firebase/storage/h;-><init>(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referenceGetDownloadURL(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/i;

    invoke-direct {p2, p3}, Lio/flutter/plugins/firebase/storage/i;-><init>(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referenceGetMetaData(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->r()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/c;

    invoke-direct {p2, p0, p3}, Lio/flutter/plugins/firebase/storage/c;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referenceList(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;->getPageToken()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;->getMaxResults()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;->getPageToken()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/firebase/storage/p;->z(ILjava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListOptions;->getMaxResults()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/p;->y(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_0
    new-instance p2, Lio/flutter/plugins/firebase/storage/d;

    invoke-direct {p2, p0, p4}, Lio/flutter/plugins/firebase/storage/d;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referenceListAll(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonListResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/storage/p;->A()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/f;

    invoke-direct {p2, p0, p3}, Lio/flutter/plugins/firebase/storage/f;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public referencePutData(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;[BLio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "[B",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getReferenceFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p0, p4}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getMetaDataFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;)Lcom/google/firebase/storage/o;

    move-result-object p2

    invoke-virtual {p5}, Ljava/lang/Long;->intValue()I

    move-result p4

    invoke-static {p4, p1, p3, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->uploadBytes(ILcom/google/firebase/storage/p;[BLcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->startTaskWithMethodChannel(Lio/flutter/plugin/common/MethodChannel;)Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    move-result-object p1

    const-string p2, "plugins.flutter.io/firebase_storage/taskEvent"

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->registerEventChannel(Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p6, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p6, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public referencePutFile(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Ljava/lang/String;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getReferenceFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p0, p4}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getMetaDataFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;)Lcom/google/firebase/storage/o;

    move-result-object p2

    invoke-virtual {p5}, Ljava/lang/Long;->intValue()I

    move-result p4

    new-instance p5, Ljava/io/File;

    invoke-direct {p5, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p3

    invoke-static {p4, p1, p3, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->uploadFile(ILcom/google/firebase/storage/p;Landroid/net/Uri;Lcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->startTaskWithMethodChannel(Lio/flutter/plugin/common/MethodChannel;)Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    move-result-object p1

    const-string p2, "plugins.flutter.io/firebase_storage/taskEvent"

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->registerEventChannel(Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p6, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p6, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public referencePutString(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Ljava/lang/String;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getReferenceFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p0, p5}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getMetaDataFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;)Lcom/google/firebase/storage/o;

    move-result-object p2

    invoke-virtual {p6}, Ljava/lang/Long;->intValue()I

    move-result p5

    invoke-virtual {p4}, Ljava/lang/Long;->intValue()I

    move-result p4

    invoke-direct {p0, p3, p4}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->stringToByteData(Ljava/lang/String;I)[B

    move-result-object p3

    invoke-static {p5, p1, p3, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->uploadBytes(ILcom/google/firebase/storage/p;[BLcom/google/firebase/storage/o;)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->startTaskWithMethodChannel(Lio/flutter/plugin/common/MethodChannel;)Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    move-result-object p1

    const-string p2, "plugins.flutter.io/firebase_storage/taskEvent"

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->registerEventChannel(Ljava/lang/String;Lio/flutter/plugin/common/EventChannel$StreamHandler;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p7, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p7, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public referenceUpdateMetadata(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonFullMetaData;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageReference;->getFullPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/f;->n(Ljava/lang/String;)Lcom/google/firebase/storage/p;

    move-result-object p1

    invoke-virtual {p0, p3}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getMetaDataFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonSettableMetadata;)Lcom/google/firebase/storage/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/storage/p;->G(Lcom/google/firebase/storage/o;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/firebase/storage/g;

    invoke-direct {p2, p0, p4}, Lio/flutter/plugins/firebase/storage/g;-><init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public setMaxDownloadRetryTime(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/storage/f;->o(J)V

    const/4 p1, 0x0

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public setMaxOperationRetryTime(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/storage/f;->p(J)V

    const/4 p1, 0x0

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public setMaxUploadRetryTime(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/storage/f;->q(J)V

    const/4 p1, 0x0

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public taskCancel(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getInProgressTaskForHandle(I)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    const-string p2, "Cancel operation was called on a task which does not exist."

    const/4 v0, 0x0

    const-string v1, "unknown"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getAndroidTask()Lcom/google/firebase/storage/e0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/storage/e0;->w()Z

    move-result p2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "status"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string p2, "snapshot"

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getSnapshot()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p3, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public taskPause(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getInProgressTaskForHandle(I)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    const-string p2, "Pause operation was called on a task which does not exist."

    const/4 v0, 0x0

    const-string v1, "unknown"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getAndroidTask()Lcom/google/firebase/storage/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/storage/e0;->a0()Z

    move-result v0

    const-string v1, "status"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_1

    const-string v0, "snapshot"

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getSnapshot()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p3, p2}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public taskResume(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getInProgressTaskForHandle(I)Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    const-string p2, "Resume operation was called on a task which does not exist."

    const/4 v0, 0x0

    const-string v1, "unknown"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getAndroidTask()Lcom/google/firebase/storage/e0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/storage/e0;->d0()Z

    move-result p2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "status"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string p2, "snapshot"

    invoke-virtual {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->getSnapshot()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageTask;->parseTaskSnapshot(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p3, v0}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p3, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public useStorageEmulator(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;Ljava/lang/String;Ljava/lang/Long;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->getStorageFromPigeon(Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$PigeonStorageFirebaseApp;)Lcom/google/firebase/storage/f;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/Long;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/google/firebase/storage/f;->r(Ljava/lang/String;I)V

    const/4 p1, 0x0

    invoke-interface {p4, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStorageException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$FlutterError;

    move-result-object p1

    invoke-interface {p4, p1}, Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;->error(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
