.class public final Lvn/hunghd/flutterdownloader/DownloadWorker;
.super Landroidx/work/Worker;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn/hunghd/flutterdownloader/DownloadWorker$a;,
        Lvn/hunghd/flutterdownloader/DownloadWorker$b;
    }
.end annotation


# static fields
.field public static final L:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

.field private static final M:Ljava/lang/String;

.field private static final N:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final O:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static P:Lio/flutter/embedding/engine/FlutterEngine;

.field private static final Q:Ljavax/net/ssl/HostnameVerifier;


# instance fields
.field private A:I

.field private B:I

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:J

.field private J:I

.field private K:Z

.field private final f:Ljava/util/regex/Pattern;

.field private final r:Ljava/util/regex/Pattern;

.field private final s:Ljava/util/regex/Pattern;

.field private t:Lio/flutter/plugin/common/MethodChannel;

.field private u:Lvn/hunghd/flutterdownloader/b;

.field private v:Llm/i;

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->L:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    const-class v0, Lvn/hunghd/flutterdownloader/DownloadWorker;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->M:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->O:Ljava/util/ArrayDeque;

    new-instance v0, Llm/f;

    invoke-direct {v0}, Llm/f;-><init>()V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p2, "(?i)\\bcharset=\\s*\"?([^\\s;\"]*)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->f:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename\\*=([^\']+)\'([^\']*)\'\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename=\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->s:Ljava/util/regex/Pattern;

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Llm/d;

    invoke-direct {v0, p0, p1}, Llm/d;-><init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final A(Landroid/content/Context;)V
    .locals 5

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Llm/h;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Llm/h;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "FLUTTER_DOWNLOADER_NOTIFICATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {v2, v0}, Lcom/dexterous/flutterlocalnotifications/m;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v2, v0, v0}, Lcom/dexterous/flutterlocalnotifications/o;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-static {p1}, Landroidx/core/app/t0;->f(Landroid/content/Context;)Landroidx/core/app/t0;

    move-result-object p1

    const-string v0, "from(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroidx/core/app/t0;->e(Landroid/app/NotificationChannel;)V

    :cond_1
    return-void
.end method

.method private final B(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Resume download: Range: bytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    const-string v0, "Accept-Encoding"

    const-string v2, "identity"

    invoke-virtual {p1, v0, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Range"

    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoInput(Z)V

    return-wide p2
.end method

.method private final C(Landroid/content/Context;)V
    .locals 6

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Lio/flutter/embedding/engine/FlutterEngine;

    if-nez v1, :cond_1

    const-string v1, "vn.hunghd.downloader.pref"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "getSharedPreferences(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback_dispatcher_handle_key"

    const-wide/16 v3, 0x0

    invoke-interface {p1, v1, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    new-instance p1, Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v5, 0x0

    invoke-direct {p1, v1, v5, v2}, Lio/flutter/embedding/engine/FlutterEngine;-><init>(Landroid/content/Context;[Ljava/lang/String;Z)V

    sput-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-static {v3, v4}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Fatal: failed to find callback"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->findAppBundlePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "findAppBundlePath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    sget-object v3, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Lio/flutter/embedding/engine/FlutterEngine;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;

    invoke-direct {v4, v2, v1, p1}, Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    invoke-virtual {v3, v4}, Lio/flutter/embedding/engine/dart/DartExecutor;->executeDartCallback(Lio/flutter/embedding/engine/dart/DartExecutor$DartCallback;)V

    :cond_1
    sget-object p1, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object v0

    const-string v1, "vn.hunghd/downloader_background"

    invoke-direct {p1, v0, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V
    .locals 4

    invoke-direct {p0, p3, p4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->x(Llm/a;I)V

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroidx/core/app/o$e;

    const-string v1, "FLUTTER_DOWNLOADER_NOTIFICATION"

    invoke-direct {v0, p1, v1}, Landroidx/core/app/o$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroidx/core/app/o$e;->n(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {v0, p5}, Landroidx/core/app/o$e;->l(Landroid/app/PendingIntent;)Landroidx/core/app/o$e;

    move-result-object p5

    const/4 v0, 0x1

    invoke-virtual {p5, v0}, Landroidx/core/app/o$e;->A(Z)Landroidx/core/app/o$e;

    move-result-object p5

    invoke-virtual {p5, v0}, Landroidx/core/app/o$e;->g(Z)Landroidx/core/app/o$e;

    move-result-object p5

    const/4 v1, -0x1

    invoke-virtual {p5, v1}, Landroidx/core/app/o$e;->B(I)Landroidx/core/app/o$e;

    move-result-object p5

    const-string v1, "setPriority(...)"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const v2, 0x1080082

    const/4 v3, 0x0

    if-eq v1, v0, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_3

    const/4 v0, 0x3

    if-eq v1, v0, :cond_2

    const/4 v0, 0x4

    if-eq v1, v0, :cond_1

    const/4 v0, 0x5

    if-eq v1, v0, :cond_0

    invoke-virtual {p5, v3, v3, v3}, Landroidx/core/app/o$e;->C(IIZ)Landroidx/core/app/o$e;

    :goto_0
    invoke-virtual {p5, v3}, Landroidx/core/app/o$e;->z(Z)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-direct {p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->s()I

    move-result v1

    :goto_1
    invoke-virtual {v0, v1}, Landroidx/core/app/o$e;->F(I)Landroidx/core/app/o$e;

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/lang/String;

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:Ljava/lang/String;

    :goto_2
    invoke-virtual {p5, v0}, Landroidx/core/app/o$e;->m(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {v0, v3, v3, v3}, Landroidx/core/app/o$e;->C(IIZ)Landroidx/core/app/o$e;

    invoke-virtual {p5, v3}, Landroidx/core/app/o$e;->z(Z)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/core/app/o$e;->F(I)Landroidx/core/app/o$e;

    goto :goto_3

    :cond_4
    if-gtz p4, :cond_5

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Ljava/lang/String;

    invoke-virtual {p5, v0}, Landroidx/core/app/o$e;->m(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v0

    invoke-virtual {v0, v3, v3, v3}, Landroidx/core/app/o$e;->C(IIZ)Landroidx/core/app/o$e;

    goto :goto_0

    :cond_5
    const/16 v1, 0x64

    if-ge p4, v1, :cond_0

    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:Ljava/lang/String;

    invoke-virtual {p5, v2}, Landroidx/core/app/o$e;->m(Ljava/lang/CharSequence;)Landroidx/core/app/o$e;

    move-result-object v2

    invoke-virtual {v2, v1, p4, v3}, Landroidx/core/app/o$e;->C(IIZ)Landroidx/core/app/o$e;

    invoke-virtual {p5, v0}, Landroidx/core/app/o$e;->z(Z)Landroidx/core/app/o$e;

    move-result-object v0

    const v1, 0x1080081

    goto :goto_1

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    if-eqz p6, :cond_6

    const-string p6, "Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed"

    invoke-direct {p0, p6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p6

    invoke-virtual {p6}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :cond_6
    const-string p1, "Update too frequently!!!!, this should be dropped"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    return-void

    :cond_7
    :goto_4
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Update notification: {notificationId: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:I

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", status: "

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", progress: "

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x7d

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/core/app/t0;->f(Landroid/content/Context;)Landroidx/core/app/t0;

    move-result-object p1

    iget p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:I

    invoke-virtual {p5}, Landroidx/core/app/o$e;->c()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/core/app/t0;->i(ILandroid/app/Notification;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:J

    :cond_8
    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->h(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->i(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic g(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->y(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V

    return-void
.end method

.method private static final h(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private static final i(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->C(Landroid/content/Context;)V

    return-void
.end method

.method private final j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    const-string v4, "image/"

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v3, v4, v5, v6, v7}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    const-string v8, " to MediaStore"

    const-string v9, "insert "

    const-string v10, "_data"

    const-string v11, "datetaken"

    const-string v12, "date_added"

    const-string v13, "mime_type"

    const-string v14, ""

    const-string v15, "description"

    const-string v5, "_display_name"

    const-string v6, "title"

    if-eqz v4, :cond_0

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v4, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v4, v10, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v2, v4}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    goto :goto_0

    :cond_0
    const-string v4, "video"

    move-object/from16 v16, v8

    const/4 v0, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v0, v7}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v0, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v0, v10, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v3, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v0

    :goto_1
    return-void
.end method

.method private final k()V
    .locals 8

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llm/b;->l()Llm/a;

    move-result-object v1

    sget-object v2, Llm/a;->COMPLETE:Llm/a;

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Llm/b;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Llm/b;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Llm/b;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Llm/b;->o()Ljava/lang/String;

    move-result-object v2

    const-string v3, "/"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lxk/g;->Z(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0}, Llm/b;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Llm/b;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    return-void
.end method

.method private final l(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const-string p1, "It looks like you are trying to save file in public storage but not setting \'saveInPublicStorage\' to \'true\'"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, "Create a file using java.io API failed "

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final m(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    invoke-static {}, Llm/c;->a()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "EXTERNAL_CONTENT_URI"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "_display_name"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mime_type"

    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "relative_path"

    sget-object p2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, "Create a file using MediaStore API failed."

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 27

    move-object/from16 v8, p0

    move-object/from16 v1, p3

    move-object/from16 v9, p4

    move/from16 v2, p7

    const-string v10, "toString(...)"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    iget-object v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    if-eqz v4, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Llm/b;->g()I

    move-result v4

    iput v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_12
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    :cond_1
    const-wide/16 v4, 0x0

    move-object/from16 v6, p2

    const/4 v7, 0x0

    :goto_1
    :try_start_1
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    const/4 v15, 0x1

    if-nez v12, :cond_2

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v6, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v12, v15

    goto :goto_2

    :cond_2
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    add-int/2addr v12, v15

    :goto_2
    const/4 v13, 0x3

    if-gt v12, v13, :cond_28

    new-instance v12, Ljava/net/URL;

    invoke-direct {v12, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iget-boolean v13, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_11
    .catchall {:try_start_1 .. :try_end_1} :catchall_b

    const-string v14, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    const-string v11, "null cannot be cast to non-null type java.net.HttpURLConnection"

    const-string v15, "https"

    move-object/from16 v17, v3

    const-string v3, "this as java.lang.String).toLowerCase(locale)"

    move-wide/from16 v19, v4

    const-string v4, "US"

    const-string v5, "getProtocol(...)"

    if-eqz v13, :cond_4

    :try_start_2
    sget-object v13, Lvn/hunghd/flutterdownloader/DownloadWorker;->L:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    invoke-static {v13}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;->a(Lvn/hunghd/flutterdownloader/DownloadWorker$a;)V

    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v15}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v4, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v3, v4}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    goto :goto_4

    :cond_3
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v15}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_11
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    :goto_4
    move-object v11, v3

    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Open connection to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v11, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v3, "User-Agent"

    const-string v4, "Mozilla/5.0..."

    invoke-virtual {v11, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, p5

    invoke-direct {v8, v11, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->z(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_10
    .catchall {:try_start_3 .. :try_end_3} :catchall_a

    if-eqz p6, :cond_6

    :try_start_4
    invoke-direct {v8, v11, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->B(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-wide/from16 v19, v4

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v11

    goto/16 :goto_29

    :catch_0
    move-exception v0

    move-object v12, v0

    :goto_5
    move-object/from16 v16, v11

    goto/16 :goto_2a

    :cond_6
    :goto_6
    :try_start_5
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v12
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_10
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    const/16 v4, 0x133

    if-eq v12, v4, :cond_27

    const/16 v4, 0x134

    if-eq v12, v4, :cond_27

    packed-switch v12, :pswitch_data_0

    :try_start_6
    invoke-virtual {v11}, Ljava/net/URLConnection;->connect()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_d
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    const/16 v2, 0xc8

    const-string v21, "Download canceled"

    if-eq v12, v2, :cond_8

    if-eqz p6, :cond_7

    const/16 v2, 0xce

    if-ne v12, v2, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v16, v11

    goto/16 :goto_1d

    :cond_8
    :goto_7
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v11}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v5

    const-string v2, "getContentType(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/net/URLConnection;->getContentLengthLong()J

    move-result-wide v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Content-Type = "

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Content-Length = "

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    invoke-direct {v8, v5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Charset = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v8, v12}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_d
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    if-nez p6, :cond_e

    if-nez v9, :cond_e

    :try_start_8
    const-string v12, "Content-Disposition"

    invoke-virtual {v11, v12}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Content-Disposition = "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v8, v13}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    if-eqz v12, :cond_a

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_9

    goto :goto_8

    :cond_9
    move v13, v7

    goto :goto_9

    :cond_a
    :goto_8
    const/4 v13, 0x1

    :goto_9
    if-nez v13, :cond_b

    invoke-direct {v8, v12, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    :cond_b
    if-eqz v9, :cond_d

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_c

    goto :goto_a

    :cond_c
    move v2, v7

    goto :goto_b

    :cond_d
    :goto_a
    const/4 v2, 0x1

    :goto_b
    if-eqz v2, :cond_e

    const-string v13, "/"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v2, 0x6

    const/16 v17, 0x0

    move-object v12, v6

    const/4 v7, 0x1

    move/from16 v16, v2

    invoke-static/range {v12 .. v17}, Lxk/g;->Z(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v7

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v6, "this as java.lang.String).substring(startIndex)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    const-string v6, "UTF-8"

    invoke-static {v2, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_c

    :catch_1
    move-exception v0

    move-object v12, v0

    move-object v9, v2

    goto/16 :goto_5

    :catch_2
    move-exception v0

    move-object v6, v0

    :try_start_a
    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_c
    move-object v9, v2

    goto :goto_d

    :cond_e
    const/4 v7, 0x1

    :goto_d
    :try_start_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "fileName = "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    iget-object v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_d
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    if-eqz v2, :cond_f

    :try_start_c
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v6, v9, v5}, Llm/i;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_f
    :try_start_d
    invoke-virtual {v11}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v12
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    const/16 v13, 0x1d

    if-eqz p6, :cond_10

    :try_start_e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    move-object v14, v1

    move-object v15, v2

    goto :goto_e

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v11

    move-object/from16 v18, v12

    goto/16 :goto_1c

    :catch_3
    move-exception v0

    move-object/from16 v16, v11

    move-object/from16 v18, v12

    const/4 v11, 0x0

    move-object v12, v0

    goto/16 :goto_2d

    :cond_10
    :try_start_f
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    if-lt v2, v13, :cond_11

    :try_start_10
    iget-boolean v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Z

    if-eqz v2, :cond_11

    invoke-direct {v8, v9, v5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->m(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->r(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "w"

    invoke-virtual {v6, v1, v7}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    move-object v15, v1

    move-object v14, v2

    goto :goto_e

    :cond_11
    :try_start_11
    invoke-static {v9}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {v8, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/io/FileOutputStream;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    move-object v14, v2

    move-object v15, v6

    :goto_e
    :try_start_12
    new-instance v7, Lkotlin/jvm/internal/w;

    invoke-direct {v7}, Lkotlin/jvm/internal/w;-><init>()V

    const/16 v1, 0x1000

    new-array v6, v1, [B

    move-wide/from16 v1, v19

    :goto_f
    invoke-virtual {v12, v6}, Ljava/io/InputStream;->read([B)I

    move-result v13

    iput v13, v7, Lkotlin/jvm/internal/w;->a:I
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_8
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    move-object/from16 p5, v5

    const/4 v5, -0x1

    move-object/from16 v16, v11

    const/16 v11, 0x64

    if-eq v13, v5, :cond_15

    :try_start_13
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v5

    if-nez v5, :cond_15

    iget v5, v7, Lkotlin/jvm/internal/w;->a:I
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    move-object/from16 p7, v12

    int-to-long v12, v5

    add-long/2addr v12, v1

    int-to-long v1, v11

    mul-long/2addr v1, v12

    add-long v23, v3, v19

    :try_start_14
    div-long v1, v1, v23

    long-to-int v2, v1

    const/4 v1, 0x0

    if-eqz v15, :cond_12

    invoke-virtual {v15, v6, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    :cond_12
    iget v5, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    if-eqz v5, :cond_13

    iget v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:I

    add-int/2addr v1, v5

    if-gt v2, v1, :cond_13

    if-ne v2, v11, :cond_14

    :cond_13
    if-eq v2, v5, :cond_14

    iput v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Llm/a;->RUNNING:Llm/a;

    invoke-virtual {v1, v5, v11, v2}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    const/16 v17, 0x0

    const/16 v23, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move v5, v2

    move-object/from16 v2, p1

    move-wide/from16 v24, v3

    move-object v3, v9

    move-object v4, v11

    move-object/from16 v11, p5

    move-object/from16 v26, v6

    move-object/from16 v6, v17

    move-object/from16 v17, v7

    move/from16 v11, v22

    move/from16 v7, v23

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    goto :goto_10

    :cond_14
    move-wide/from16 v24, v3

    move-object/from16 v26, v6

    move-object/from16 v17, v7

    const/4 v11, 0x0

    :goto_10
    move-object/from16 v5, p5

    move-wide v1, v12

    move-object/from16 v11, v16

    move-object/from16 v7, v17

    move-wide/from16 v3, v24

    move-object/from16 v6, v26

    move-object/from16 v12, p7

    goto :goto_f

    :catchall_2
    move-exception v0

    goto/16 :goto_18

    :catch_4
    move-exception v0

    goto/16 :goto_1a

    :cond_15
    move-object/from16 v1, p5

    move v2, v11

    move-object/from16 p7, v12

    const/4 v11, 0x0

    iget-object v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    if-eqz v3, :cond_16

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v3

    goto :goto_11

    :cond_16
    const/4 v3, 0x0

    :goto_11
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v3}, Llm/b;->h()Z

    move-result v4

    if-eqz v4, :cond_17

    iget v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    :cond_17
    move v5, v2

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v3}, Llm/b;->h()Z

    move-result v2

    if-eqz v2, :cond_18

    sget-object v2, Llm/a;->PAUSED:Llm/a;

    goto :goto_12

    :cond_18
    sget-object v2, Llm/a;->CANCELED:Llm/a;

    goto :goto_12

    :cond_19
    sget-object v2, Llm/a;->COMPLETE:Llm/a;

    :goto_12
    move-object v4, v2

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v2, v3}, Landroidx/core/content/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    sget-object v3, Llm/a;->COMPLETE:Llm/a;

    if-ne v4, v3, :cond_1f

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1d

    if-ge v3, v6, :cond_1a

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->u(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-direct {v8, v14}, Lvn/hunghd/flutterdownloader/DownloadWorker;->t(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, v9, v14, v6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    iget-boolean v6, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Z
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    if-eqz v6, :cond_1f

    const/16 v6, 0x1d

    if-ge v3, v6, :cond_1c

    if-eqz v2, :cond_1c

    if-eqz v15, :cond_1b

    invoke-virtual {v15}, Ljava/io/OutputStream;->flush()V

    :try_start_15
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_5

    goto :goto_13

    :catch_5
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1b
    :goto_13
    :try_start_16
    invoke-virtual/range {p7 .. p7}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_6

    goto :goto_14

    :catch_6
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_14
    invoke-virtual/range {v16 .. v16}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    :cond_1c
    :try_start_17
    sget-object v2, Llm/g;->a:Llm/g;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getApplicationContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v6, v14, v1}, Llm/g;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Setting an intent to open the file "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    const/16 v2, 0x1f

    if-lt v3, v2, :cond_1d

    const/high16 v2, 0x14000000

    goto :goto_15

    :cond_1d
    const/high16 v2, 0x10000000

    :goto_15
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v11, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    move-object v6, v1

    goto :goto_16

    :cond_1e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "There\'s no application that can open the file "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    :cond_1f
    const/4 v6, 0x0

    :goto_16
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v4, v5}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_17

    :cond_20
    const-string v21, "File downloaded"

    :goto_17
    move-object/from16 v1, v21

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    move-object/from16 v18, p7

    move-object v11, v15

    goto/16 :goto_22

    :catchall_3
    move-exception v0

    goto :goto_19

    :catch_7
    move-exception v0

    goto :goto_1b

    :catchall_4
    move-exception v0

    move-object/from16 v16, v11

    :goto_18
    move-object/from16 p7, v12

    :goto_19
    move-object/from16 v18, p7

    move-object v1, v0

    move-object v11, v15

    goto/16 :goto_32

    :catch_8
    move-exception v0

    move-object/from16 v16, v11

    :goto_1a
    move-object/from16 p7, v12

    :goto_1b
    move-object/from16 v18, p7

    move-object v12, v0

    move-object v11, v15

    goto/16 :goto_2d

    :catchall_5
    move-exception v0

    move-object/from16 v16, v11

    move-object/from16 p7, v12

    move-object/from16 v18, p7

    move-object v1, v0

    :goto_1c
    const/4 v11, 0x0

    goto/16 :goto_32

    :catch_9
    move-exception v0

    move-object/from16 v16, v11

    move-object/from16 p7, v12

    move-object/from16 v18, p7

    move-object v12, v0

    const/4 v11, 0x0

    goto/16 :goto_2d

    :goto_1d
    :try_start_18
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Llm/b;->h()Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Llm/a;->PAUSED:Llm/a;

    goto :goto_1e

    :cond_21
    sget-object v1, Llm/a;->CANCELED:Llm/a;

    goto :goto_1e

    :cond_22
    sget-object v1, Llm/a;->FAILED:Llm/a;

    :goto_1e
    move-object v4, v1

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    invoke-virtual {v1, v2, v4, v3}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    if-nez v9, :cond_23

    move-object/from16 v3, p2

    goto :goto_1f

    :cond_23
    move-object v3, v9

    :goto_1f
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->isStopped()Z

    move-result v1

    if-eqz v1, :cond_24

    :goto_20
    move-object/from16 v1, v21

    goto :goto_21

    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server replied HTTP code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    goto :goto_20

    :goto_21
    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_c
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    const/4 v11, 0x0

    const/16 v18, 0x0

    :goto_22
    if-eqz v11, :cond_25

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_19
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_a

    goto :goto_23

    :catch_a
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_25
    :goto_23
    if-eqz v18, :cond_26

    :try_start_1a
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_b

    goto :goto_24

    :catch_b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_26
    :goto_24
    invoke-virtual/range {v16 .. v16}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_31

    :catchall_6
    move-exception v0

    goto :goto_25

    :catch_c
    move-exception v0

    goto/16 :goto_26

    :catchall_7
    move-exception v0

    move-object/from16 v16, v11

    goto :goto_25

    :catch_d
    move-exception v0

    move-object/from16 v16, v11

    goto :goto_26

    :cond_27
    :pswitch_0
    move-object/from16 v16, v11

    :try_start_1b
    const-string v4, "Response with redirection code"

    invoke-direct {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    const-string v4, "Location"
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_f
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    move-object/from16 v5, v16

    :try_start_1c
    invoke-virtual {v5, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "getHeaderField(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Location = "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v7, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v6

    const-string v4, "toExternalForm(...)"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "New url: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_e
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    move-object v7, v5

    move-object/from16 v3, v17

    move-wide/from16 v4, v19

    goto/16 :goto_1

    :catchall_8
    move-exception v0

    goto :goto_27

    :catch_e
    move-exception v0

    goto :goto_28

    :catchall_9
    move-exception v0

    move-object/from16 v5, v16

    :goto_25
    move-object v1, v0

    goto :goto_29

    :catch_f
    move-exception v0

    move-object/from16 v5, v16

    :goto_26
    move-object v12, v0

    goto :goto_2a

    :catchall_a
    move-exception v0

    move-object v5, v11

    :goto_27
    move-object v1, v0

    move-object/from16 v16, v5

    goto :goto_29

    :catch_10
    move-exception v0

    move-object v5, v11

    :goto_28
    move-object v12, v0

    move-object/from16 v16, v5

    goto :goto_2a

    :cond_28
    :try_start_1d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Stuck in redirect loop"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_11
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    :catchall_b
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v7

    :goto_29
    const/4 v11, 0x0

    goto :goto_2b

    :catch_11
    move-exception v0

    move-object v12, v0

    move-object/from16 v16, v7

    :goto_2a
    const/4 v11, 0x0

    goto :goto_2c

    :catchall_c
    move-exception v0

    move-object v1, v0

    const/4 v11, 0x0

    const/16 v16, 0x0

    :goto_2b
    const/16 v18, 0x0

    goto :goto_32

    :catch_12
    move-exception v0

    move-object v12, v0

    const/4 v11, 0x0

    const/16 v16, 0x0

    :goto_2c
    const/16 v18, 0x0

    :goto_2d
    :try_start_1e
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Llm/a;->FAILED:Llm/a;

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    invoke-virtual {v1, v2, v4, v3}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    if-nez v9, :cond_29

    move-object/from16 v3, p2

    goto :goto_2e

    :cond_29
    move-object v3, v9

    :goto_2e
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual {v12}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_d

    if-eqz v11, :cond_2a

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_1f
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_13

    goto :goto_2f

    :catch_13
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2a
    :goto_2f
    if-eqz v18, :cond_2b

    :try_start_20
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_14

    goto :goto_30

    :catch_14
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2b
    :goto_30
    if-eqz v16, :cond_2c

    goto/16 :goto_24

    :cond_2c
    :goto_31
    return-void

    :catchall_d
    move-exception v0

    move-object v1, v0

    :goto_32
    if-eqz v11, :cond_2d

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_21
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_15

    goto :goto_33

    :catch_15
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2d
    :goto_33
    if-eqz v18, :cond_2e

    :try_start_22
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStream;->close()V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_16

    goto :goto_34

    :catch_16
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2e
    :goto_34
    if-eqz v16, :cond_2f

    invoke-virtual/range {v16 .. v16}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2f
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final o(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-gt v4, v2, :cond_6

    if-nez v5, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x20

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->f(II)I

    move-result v6

    if-gtz v6, :cond_2

    move v6, v1

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    if-nez v5, :cond_4

    if-nez v6, :cond_3

    move v5, v1

    goto :goto_0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_6
    :goto_3
    add-int/2addr v2, v1

    invoke-interface {p1, v4, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string p1, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    return-object v0
.end method

.method private final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-eqz p1, :cond_6

    const-string v0, ";"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lxk/g;->u0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    if-eqz p1, :cond_6

    aget-object p1, p1, v0

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    move v3, v0

    move v4, v3

    :goto_0
    if-gt v3, v1, :cond_5

    if-nez v4, :cond_0

    move v5, v3

    goto :goto_1

    :cond_0
    move v5, v1

    :goto_1
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x20

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->f(II)I

    move-result v5

    if-gtz v5, :cond_1

    move v5, v2

    goto :goto_2

    :cond_1
    move v5, v0

    :goto_2
    if-nez v4, :cond_3

    if-nez v5, :cond_2

    move v4, v2

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    :goto_3
    add-int/2addr v1, v2

    invoke-interface {p1, v3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    return-object p1
.end method

.method private final q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->s:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->r:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    move-object p2, v0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    if-nez p2, :cond_5

    const-string p2, "ISO-8859-1"

    :cond_5
    invoke-static {v1, p2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private final r(Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    const-string v0, "_data"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {p1, v1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-static {p1, v1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {p1, v0}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, "Get a path for a MediaStore failed"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;)V

    return-object v1
.end method

.method private final s()I
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    const-string v1, "getApplicationInfo(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "vn.hunghd.flutterdownloader.NOTIFICATION_ICON"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    return v0
.end method

.method private final t(Ljava/lang/String;)Z
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    const-string v1, "getExternalStorageDirectory(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPath(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final u(Ljava/lang/String;)Z
    .locals 4

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "image/"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "video"

    invoke-static {p1, v1, v0, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final v(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Z

    if-eqz v0, :cond_0

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->M:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final w(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Z

    if-eqz v0, :cond_0

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->M:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final x(Llm/a;I)V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "callback_handle"

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroidx/work/b;->k(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lvn/hunghd/flutterdownloader/DownloadWorker;->O:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Llm/e;

    invoke-direct {v1, p0, v0}, Llm/e;-><init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private static final y(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Lio/flutter/plugin/common/MethodChannel;

    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final z(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Headers = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    const-string v2, "keys(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public doWork()Landroidx/work/c$a;
    .locals 19

    move-object/from16 v9, p0

    sget-object v0, Lvn/hunghd/flutterdownloader/b;->a:Lvn/hunghd/flutterdownloader/b$a;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvn/hunghd/flutterdownloader/b$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/b;

    move-result-object v0

    iput-object v0, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Lvn/hunghd/flutterdownloader/b;

    new-instance v1, Llm/i;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Llm/i;-><init>(Lvn/hunghd/flutterdownloader/b;)V

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v1, "file_name"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v1, "saved_file"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "headers"

    invoke-virtual {v1, v2}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "is_resume"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "timeout"

    const/16 v4, 0x3a98

    invoke-virtual {v1, v2, v4}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "debug"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "step"

    const/16 v4, 0xa

    invoke-virtual {v1, v2, v4}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v1

    iput v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "ignoreSsl"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Llm/h;->h:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Ljava/lang/String;

    sget v2, Llm/h;->f:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:Ljava/lang/String;

    sget v2, Llm/h;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:Ljava/lang/String;

    sget v2, Llm/h;->e:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:Ljava/lang/String;

    sget v2, Llm/h;->g:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Ljava/lang/String;

    sget v2, Llm/h;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/lang/String;

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    const-string v14, "toString(...)"

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DownloadWorker{url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",filename="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",savedDir="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",header="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",isResume="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v16, :cond_1

    invoke-virtual/range {v16 .. v16}, Llm/b;->l()Llm/a;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    const-string v2, "GONE"

    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    if-eqz v16, :cond_9

    invoke-virtual/range {v16 .. v16}, Llm/b;->l()Llm/a;

    move-result-object v1

    sget-object v2, Llm/a;->CANCELED:Llm/a;

    if-ne v1, v2, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "show_notification"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "open_file_from_notification"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v2, "save_in_public_storage"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Z

    invoke-virtual/range {v16 .. v16}, Llm/b;->f()I

    move-result v1

    iput v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v7, "getApplicationContext(...)"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v11, :cond_4

    move-object v3, v10

    goto :goto_1

    :cond_4
    move-object v3, v11

    :goto_1
    sget-object v6, Llm/a;->RUNNING:Llm/a;

    invoke-virtual/range {v16 .. v16}, Llm/b;->g()I

    move-result v5

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object v4, v6

    move-object v15, v6

    move-object/from16 v6, v17

    move/from16 v17, v12

    move-object v12, v7

    move/from16 v7, v18

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    if-eqz v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Llm/b;->g()I

    move-result v3

    invoke-virtual {v1, v2, v15, v3}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exists file for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "automatic resuming..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Ljava/lang/String;)V

    const/4 v1, 0x1

    move v7, v1

    goto :goto_2

    :cond_6
    move/from16 v7, v17

    :goto_2
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    move-object v3, v10

    move-object v4, v0

    move-object v5, v11

    move-object v6, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lvn/hunghd/flutterdownloader/DownloadWorker;->n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-direct/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->k()V

    const/4 v1, 0x0

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Lvn/hunghd/flutterdownloader/b;

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v11, :cond_7

    move-object v3, v10

    goto :goto_3

    :cond_7
    move-object v3, v11

    :goto_3
    sget-object v8, Llm/a;->FAILED:Llm/a;

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v4, v8

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    if-eqz v1, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    invoke-virtual {v1, v2, v8, v3}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v1, 0x0

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Lvn/hunghd/flutterdownloader/b;

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    :goto_4
    return-object v0

    :cond_9
    :goto_5
    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    const-string v1, "success(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'headers\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'saved_file\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'url\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v0, "didInitializeDispatcher"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter p1

    :cond_0
    :goto_0
    :try_start_0
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->O:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v1, :cond_0

    const-string v2, ""

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    sget-object p2, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_1
    return-void
.end method

.method public onStopped()V
    .locals 9

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "getApplicationContext(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvn/hunghd/flutterdownloader/b;->a:Lvn/hunghd/flutterdownloader/b$a;

    invoke-virtual {v0, v1}, Lvn/hunghd/flutterdownloader/b$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/b;

    move-result-object v0

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Lvn/hunghd/flutterdownloader/b;

    new-instance v2, Llm/i;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {v2, v0}, Llm/i;-><init>(Lvn/hunghd/flutterdownloader/b;)V

    iput-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v2

    const-string v3, "file_name"

    invoke-virtual {v2, v3}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    const-string v7, "toString(...)"

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Llm/i;->d(Ljava/lang/String;)Llm/b;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Llm/b;->l()Llm/a;

    move-result-object v3

    sget-object v4, Llm/a;->ENQUEUED:Llm/a;

    if-ne v3, v4, :cond_2

    if-nez v2, :cond_1

    move-object v2, v0

    :cond_1
    sget-object v8, Llm/a;->CANCELED:Llm/a;

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v3, v8

    invoke-direct/range {v0 .. v6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Landroid/content/Context;Ljava/lang/String;Llm/a;ILandroid/app/PendingIntent;Z)V

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Llm/i;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/work/c;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:I

    invoke-virtual {v0, v1, v8, v2}, Llm/i;->i(Ljava/lang/String;Llm/a;I)V

    :cond_2
    return-void
.end method
