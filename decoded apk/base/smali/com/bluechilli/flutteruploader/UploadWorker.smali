.class public Lcom/bluechilli/flutteruploader/UploadWorker;
.super Landroidx/work/c;
.source "SourceFile"

# interfaces
.implements Ld3/a;


# static fields
.field private static final u:Ljava/lang/String; = "UploadWorker"

.field private static v:Lio/flutter/embedding/engine/FlutterEngine;


# instance fields
.field private e:Ljava/lang/String;

.field private f:Lql/e;

.field private r:Z

.field private s:Landroid/content/Context;

.field private t:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/work/c;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    invoke-static {p1}, Ld3/r;->a(Landroid/content/Context;)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->t:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    return-void
.end method

.method public static synthetic d(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bluechilli/flutteruploader/UploadWorker;->l(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic e(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/bluechilli/flutteruploader/UploadWorker;->m(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "application/octet-stream"

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v1, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    const-string v2, "UploadWorker - GetMimeType"

    invoke-static {v1, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-object v0
.end method

.method private h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;
    .locals 2

    new-instance v0, Landroidx/work/b$a;

    invoke-direct {v0}, Landroidx/work/b$a;-><init>()V

    const-string v1, "statusCode"

    invoke-virtual {v0, v1, p2}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p2

    const-string v0, "status"

    invoke-virtual {p2, v0, p1}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "errorCode"

    invoke-virtual {p1, p2, p3}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "errorMessage"

    invoke-virtual {p1, p2, p4}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "errorDetails"

    invoke-virtual {p1, p2, p5}, Landroidx/work/b$a;->i(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    return-object p1
.end method

.method private j([Ljava/lang/StackTraceElement;)[Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v2, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;
    .locals 7

    sget-object p1, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    const-string v0, "exception encountered"

    invoke-static {p1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-boolean p1, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    if-eqz p1, :cond_0

    sget v0, Ld3/s;->e:I

    goto :goto_0

    :cond_0
    sget v0, Ld3/s;->d:I

    :goto_0
    move v2, v0

    if-eqz p1, :cond_1

    const-string p3, "upload_cancelled"

    :cond_1
    move-object v4, p3

    const/16 v3, 0x1f4

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bluechilli/flutteruploader/UploadWorker;->j([Ljava/lang/StackTraceElement;)[Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;

    move-result-object p1

    invoke-static {p1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method

.method private synthetic l(Landroidx/concurrent/futures/c$a;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/bluechilli/flutteruploader/UploadWorker;->i()Landroidx/work/c$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    throw p1
.end method

.method private synthetic m(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->t:Ljava/util/concurrent/Executor;

    new-instance v1, Ld3/v;

    invoke-direct {v1, p0, p1}, Ld3/v;-><init>(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private n(Ljava/util/Map;Ljava/lang/String;)Lql/x$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lql/x$a;"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lql/x$a;

    invoke-direct {v0, p2}, Lql/x$a;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lql/x$a;

    invoke-direct {v0}, Lql/x$a;-><init>()V

    :goto_0
    sget-object p2, Lql/x;->l:Lql/w;

    invoke-virtual {v0, p2}, Lql/x$a;->e(Lql/w;)Lql/x$a;

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1, v2}, Lql/x$a;->a(Ljava/lang/String;Ljava/lang/String;)Lql/x$a;

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method private o(Landroid/content/Context;II)V
    .locals 1

    new-instance p1, Landroidx/work/b$a;

    invoke-direct {p1}, Landroidx/work/b$a;-><init>()V

    const-string v0, "status"

    invoke-virtual {p1, v0, p2}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "progress"

    invoke-virtual {p1, p2, p3}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/work/c;->setProgressAsync(Landroidx/work/b;)Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method private p()V
    .locals 5

    iget-object v0, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    invoke-static {v0}, Ld3/q;->b(Landroid/content/Context;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object v2, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "callbackHandle: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/bluechilli/flutteruploader/UploadWorker;->v:Lio/flutter/embedding/engine/FlutterEngine;

    if-nez v2, :cond_0

    new-instance v2, Lio/flutter/embedding/engine/FlutterEngine;

    iget-object v3, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    invoke-direct {v2, v3}, Lio/flutter/embedding/engine/FlutterEngine;-><init>(Landroid/content/Context;)V

    sput-object v2, Lcom/bluechilli/flutteruploader/UploadWorker;->v:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    move-result-object v2

    invoke-virtual {v2}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    move-result-object v2

    iget-object v3, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lio/flutter/embedding/engine/loader/FlutterLoader;->ensureInitializationComplete(Landroid/content/Context;[Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    move-result-object v0

    invoke-virtual {v2}, Lio/flutter/embedding/engine/loader/FlutterLoader;->findAppBundlePath()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/bluechilli/flutteruploader/UploadWorker;->v:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object v2

    new-instance v3, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;

    iget-object v4, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    invoke-direct {v3, v4, v1, v0}, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    invoke-virtual {v2, v3}, Lio/flutter/embedding/engine/dart/DartExecutor;->executeDartCallback(Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;)V

    :cond_0
    return-void
.end method

.method private q(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "flutter_uploader"

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-static {v1, v0, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p1

    :catchall_0
    move-object v1, v0

    :catchall_1
    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-boolean p1, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    sget-object p1, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to upload - taskId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", error: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    sget p2, Ld3/s;->d:I

    const/4 p3, -0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/bluechilli/flutteruploader/UploadWorker;->o(Landroid/content/Context;II)V

    return-void
.end method

.method public c(Ljava/lang/String;JJ)V
    .locals 4

    iget-boolean p1, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    long-to-double v0, p2

    long-to-double v2, p4

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int p1, v0

    sget-object v0, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "taskId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", bytesWritten: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", contentLength: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", progress: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    sget p3, Ld3/s;->b:I

    invoke-direct {p0, p2, p3, p1}, Lcom/bluechilli/flutteruploader/UploadWorker;->o(Landroid/content/Context;II)V

    return-void
.end method

.method public i()Landroidx/work/c$a;
    .locals 17

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "url"

    invoke-virtual {v1, v2}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v2

    const-string v3, "method"

    invoke-virtual {v2, v3}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v3

    const-string v4, "requestTimeout"

    const/16 v5, 0xe10

    invoke-virtual {v3, v4, v5}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v4

    const-string v5, "binaryUpload"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v5

    const-string v8, "headers"

    invoke-virtual {v5, v8}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v9

    const-string v10, "data"

    invoke-virtual {v9, v10}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v10

    const-string v11, "files"

    invoke-virtual {v10, v11}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v11

    const-string v12, "tag"

    invoke-virtual {v11, v12}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->e:Ljava/lang/String;

    if-nez v11, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    iput-object v11, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->e:Ljava/lang/String;

    :cond_0
    const/4 v11, 0x0

    :try_start_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Lcom/google/gson/Gson;

    invoke-direct {v13}, Lcom/google/gson/Gson;-><init>()V

    new-instance v14, Lcom/bluechilli/flutteruploader/UploadWorker$a;

    invoke-direct {v14, v7}, Lcom/bluechilli/flutteruploader/UploadWorker$a;-><init>(Lcom/bluechilli/flutteruploader/UploadWorker;)V

    invoke-virtual {v14}, Lcom/google/gson/reflect/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v14

    new-instance v15, Lcom/bluechilli/flutteruploader/UploadWorker$b;

    invoke-direct {v15, v7}, Lcom/bluechilli/flutteruploader/UploadWorker$b;-><init>(Lcom/bluechilli/flutteruploader/UploadWorker;)V

    invoke-virtual {v15}, Lcom/google/gson/reflect/a;->getType()Ljava/lang/reflect/Type;

    move-result-object v15

    if-eqz v5, :cond_1

    invoke-virtual {v13, v5, v14}, Lcom/google/gson/Gson;->i(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    goto :goto_0

    :cond_1
    move-object v5, v11

    :goto_0
    if-eqz v9, :cond_2

    invoke-virtual {v13, v9, v14}, Lcom/google/gson/Gson;->i(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    goto :goto_1

    :cond_2
    move-object v9, v11

    :goto_1
    if-eqz v10, :cond_3

    invoke-virtual {v13, v10, v15}, Lcom/google/gson/Gson;->i(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Ljava/util/List;

    :cond_3
    if-eqz v4, :cond_5

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld3/c;

    new-instance v9, Ljava/io/File;

    invoke-virtual {v4}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-nez v10, :cond_4

    sget v2, Ld3/s;->d:I

    const/16 v3, 0x1f4

    const-string v4, "invalid_files"

    const-string v5, "There are no items to upload"

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;

    move-result-object v1

    invoke-static {v1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lcom/google/gson/k; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iput-object v11, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :cond_4
    :try_start_1
    invoke-virtual {v4}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v7, v4}, Lcom/bluechilli/flutteruploader/UploadWorker;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lql/w;->f(Ljava/lang/String;)Lql/w;

    move-result-object v4

    invoke-static {v9, v4}, Lql/b0;->c(Ljava/io/File;Lql/w;)Lql/b0;

    move-result-object v4

    goto/16 :goto_4

    :cond_5
    invoke-direct {v7, v9, v11}, Lcom/bluechilli/flutteruploader/UploadWorker;->n(Ljava/util/Map;Ljava/lang/String;)Lql/x$a;

    move-result-object v4

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v10, v6

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld3/c;

    new-instance v14, Ljava/io/File;

    invoke-virtual {v12}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v15, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lcom/google/gson/k; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    const-string v11, "attaching file: "

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    move-result v6

    if-eqz v6, :cond_6

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v12}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v7, v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lql/w;->f(Ljava/lang/String;)Lql/w;

    move-result-object v6

    invoke-static {v14, v6}, Lql/b0;->c(Ljava/io/File;Lql/w;)Lql/b0;

    move-result-object v6

    invoke-virtual {v12}, Ld3/c;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v11, v12, v6}, Lql/x$a;->b(Ljava/lang/String;Ljava/lang/String;Lql/b0;)Lql/x$a;

    goto :goto_3

    :cond_6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "File does not exists -> file:"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ld3/c;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    const/4 v6, 0x0

    const/4 v11, 0x0

    goto :goto_2

    :cond_7
    if-gtz v10, :cond_8

    sget v2, Ld3/s;->d:I

    const/16 v3, 0x1f4

    const-string v4, "invalid_files"

    const-string v5, "There are no items to upload"

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;

    move-result-object v1

    invoke-static {v1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_2
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/google/gson/k; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :cond_8
    :try_start_3
    invoke-virtual {v4}, Lql/x$a;->d()Lql/x;

    move-result-object v4

    :goto_4
    new-instance v6, Ld3/b;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v4, v9, v7}, Ld3/b;-><init>(Lql/b0;Ljava/lang/String;Ld3/a;)V

    new-instance v4, Lql/a0$a;

    invoke-direct {v4}, Lql/a0$a;-><init>()V

    const-string v9, "Accept"

    const-string v10, "*/*"

    invoke-virtual {v4, v9, v10}, Lql/a0$a;->a(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    if-eqz v5, :cond_a

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_9
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_9

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_9

    invoke-virtual {v4, v10, v11}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move-result-object v4

    goto :goto_5

    :cond_a
    invoke-static {v1}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_b

    sget v2, Ld3/s;->d:I

    const/16 v3, 0x1f4

    const-string v4, "invalid_url"

    const-string v5, "url is not a valid url"

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;

    move-result-object v1

    invoke-static {v1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_3
    .catch Ljava/net/ProtocolException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Lcom/google/gson/k; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :cond_b
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v9, 0x136ef

    const/4 v10, 0x1

    if-eq v5, v9, :cond_d

    const v9, 0x4862828

    if-eq v5, v9, :cond_c

    goto :goto_6

    :cond_c
    const-string v5, "PATCH"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move v2, v10

    goto :goto_7

    :cond_d
    const-string v5, "PUT"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v2, -0x1

    :goto_7
    if-eqz v2, :cond_10

    if-eq v2, v10, :cond_f

    invoke-virtual {v4, v1}, Lql/a0$a;->o(Ljava/lang/String;)Lql/a0$a;

    move-result-object v1

    invoke-virtual {v1, v6}, Lql/a0$a;->h(Lql/b0;)Lql/a0$a;

    move-result-object v1

    :goto_8
    invoke-virtual {v1}, Lql/a0$a;->b()Lql/a0;

    move-result-object v1

    goto :goto_9

    :cond_f
    invoke-virtual {v4, v1}, Lql/a0$a;->o(Ljava/lang/String;)Lql/a0$a;

    move-result-object v1

    invoke-virtual {v1, v6}, Lql/a0$a;->g(Lql/b0;)Lql/a0$a;

    move-result-object v1

    goto :goto_8

    :cond_10
    invoke-virtual {v4, v1}, Lql/a0$a;->o(Ljava/lang/String;)Lql/a0$a;

    move-result-object v1

    invoke-virtual {v1, v6}, Lql/a0$a;->i(Lql/b0;)Lql/a0$a;

    move-result-object v1

    goto :goto_8

    :goto_9
    sget-object v2, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start uploading for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lql/y$a;

    invoke-direct {v2}, Lql/y$a;-><init>()V

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Lql/y$a;->b(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v2

    invoke-virtual {v2, v3, v4, v5}, Lql/y$a;->K(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v2

    invoke-virtual {v2, v3, v4, v5}, Lql/y$a;->G(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v2

    invoke-virtual {v2}, Lql/y$a;->a()Lql/y;

    move-result-object v2

    invoke-virtual {v2, v1}, Lql/y;->w(Lql/a0;)Lql/e;

    move-result-object v1

    iput-object v1, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    invoke-interface {v1}, Lql/e;->n()Lql/c0;

    move-result-object v1

    invoke-virtual {v1}, Lql/c0;->g()I

    move-result v3

    invoke-virtual {v1}, Lql/c0;->o()Lql/t;

    move-result-object v2

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "content-type"

    invoke-virtual {v2, v5}, Lql/t;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lql/c0;->a()Lql/d0;

    move-result-object v6

    if-eqz v5, :cond_11

    const-string v9, "json"

    invoke-virtual {v5, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_11

    if-eqz v6, :cond_11

    move/from16 v16, v10

    goto :goto_a

    :cond_11
    const/16 v16, 0x0

    :goto_a
    invoke-virtual {v2}, Lql/t;->f()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9
    :try_end_4
    .catch Ljava/net/ProtocolException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/google/gson/k; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const-string v10, ""

    if-eqz v9, :cond_13

    :try_start_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v2, v9}, Lql/t;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_12

    invoke-interface {v4, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_12
    invoke-interface {v4, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_13
    invoke-virtual {v13, v4}, Lcom/google/gson/Gson;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v6, :cond_14

    invoke-virtual {v6}, Lql/d0;->g()Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    goto :goto_c

    :cond_14
    move-object v5, v10

    :goto_c
    invoke-virtual {v1}, Lql/c0;->q()Z

    move-result v1

    if-nez v1, :cond_15

    sget v2, Ld3/s;->d:I

    const-string v4, "upload_error"

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/bluechilli/flutteruploader/UploadWorker;->h(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/b;

    move-result-object v1

    invoke-static {v1}, Landroidx/work/c$a;->b(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_5
    .catch Ljava/net/ProtocolException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Lcom/google/gson/k; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :cond_15
    :try_start_6
    new-instance v1, Landroidx/work/b$a;

    invoke-direct {v1}, Landroidx/work/b$a;-><init>()V

    const-string v4, "id"

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v4, v6}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    const-string v4, "status"

    sget v6, Ld3/s;->c:I

    invoke-virtual {v1, v4, v6}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object v1

    const-string v4, "statusCode"

    invoke-virtual {v1, v4, v3}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object v1

    invoke-virtual {v1, v8, v2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1
    :try_end_6
    .catch Ljava/net/ProtocolException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lcom/google/gson/k; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const-string v2, "response"

    if-eqz v16, :cond_16

    :try_start_7
    invoke-virtual {v1, v2, v5}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;
    :try_end_7
    .catch Ljava/net/ProtocolException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Lcom/google/gson/k; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_16
    :try_start_8
    invoke-virtual {v1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/net/ProtocolException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Lcom/google/gson/k; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_d

    :catch_0
    move-exception v0

    move-object v3, v0

    :try_start_9
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_18

    sget-object v3, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    const-string v4, "IllegalStateException while building a outputData object. Replace response with on-disk reference."

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_9
    .catch Ljava/net/ProtocolException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Lcom/google/gson/k; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    const/4 v3, 0x0

    :try_start_a
    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;
    :try_end_a
    .catch Ljava/net/ProtocolException; {:try_start_a .. :try_end_a} :catch_5
    .catch Lcom/google/gson/k; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    invoke-direct {v7, v2, v5}, Lcom/bluechilli/flutteruploader/UploadWorker;->q(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_17

    const-string v3, "response_file"

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    :cond_17
    invoke-virtual {v1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v1

    :goto_d
    invoke-static {v1}, Landroidx/work/c$a;->e(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_b
    .catch Ljava/net/ProtocolException; {:try_start_b .. :try_end_b} :catch_5
    .catch Lcom/google/gson/k; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v2, v3

    goto :goto_f

    :cond_18
    :try_start_c
    throw v3
    :try_end_c
    .catch Ljava/net/ProtocolException; {:try_start_c .. :try_end_c} :catch_5
    .catch Lcom/google/gson/k; {:try_start_c .. :try_end_c} :catch_4
    .catch Ljava/net/UnknownHostException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v2, v11

    goto :goto_f

    :catch_1
    move-exception v0

    move-object v1, v0

    :try_start_d
    iget-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const-string v3, "upload error"

    invoke-direct {v7, v2, v1, v3}, Lcom/bluechilli/flutteruploader/UploadWorker;->k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catch_2
    move-exception v0

    move-object v1, v0

    :try_start_e
    iget-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const-string v3, "io_error"

    invoke-direct {v7, v2, v1, v3}, Lcom/bluechilli/flutteruploader/UploadWorker;->k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catch_3
    move-exception v0

    move-object v1, v0

    :try_start_f
    iget-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const-string v3, "unknown_host"

    invoke-direct {v7, v2, v1, v3}, Lcom/bluechilli/flutteruploader/UploadWorker;->k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catch_4
    move-exception v0

    move-object v1, v0

    :try_start_10
    iget-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const-string v3, "json_error"

    invoke-direct {v7, v2, v1, v3}, Lcom/bluechilli/flutteruploader/UploadWorker;->k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catchall_2
    move-exception v0

    move-object v1, v0

    const/4 v2, 0x0

    goto :goto_f

    :catch_5
    move-exception v0

    move-object v1, v0

    :try_start_11
    iget-boolean v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    if-eqz v2, :cond_19

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :cond_19
    const/4 v2, 0x0

    :try_start_12
    iget-object v3, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->s:Landroid/content/Context;

    const-string v4, "protocol"

    invoke-direct {v7, v3, v1, v4}, Lcom/bluechilli/flutteruploader/UploadWorker;->k(Landroid/content/Context;Ljava/lang/Exception;Ljava/lang/String;)Landroidx/work/c$a;

    move-result-object v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    return-object v1

    :catchall_3
    move-exception v0

    goto :goto_e

    :catchall_4
    move-exception v0

    const/4 v2, 0x0

    :goto_e
    move-object v1, v0

    :goto_f
    iput-object v2, v7, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    throw v1
.end method

.method public onStopped()V
    .locals 3

    invoke-super {p0}, Landroidx/work/c;->onStopped()V

    sget-object v0, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    const-string v1, "UploadWorker - Stopped"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->r:Z

    iget-object v0, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lql/e;->R0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bluechilli/flutteruploader/UploadWorker;->f:Lql/e;

    invoke-interface {v0}, Lql/e;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/bluechilli/flutteruploader/UploadWorker;->u:Ljava/lang/String;

    const-string v2, "Upload Request cancelled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public startWork()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bluechilli/flutteruploader/UploadWorker;->p()V

    new-instance v0, Ld3/u;

    invoke-direct {v0, p0}, Ld3/u;-><init>(Lcom/bluechilli/flutteruploader/UploadWorker;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
