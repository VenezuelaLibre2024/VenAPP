.class public final Lt5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/f$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Z

.field private final c:Lt5/f$a;

.field private final d:Lt5/f$a;

.field private final e:Lt5/f$a;

.field private final f:Landroid/net/Uri;

.field private final g:Landroid/net/Uri;

.field private final h:Landroid/net/Uri;

.field private final i:Landroid/net/Uri;

.field private final j:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Landroid/os/Handler;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messenger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/f;->a:Landroid/content/Context;

    new-instance p1, Lt5/f$a;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0, p3}, Lt5/f$a;-><init>(Lt5/f;ILandroid/os/Handler;)V

    iput-object p1, p0, Lt5/f;->c:Lt5/f$a;

    new-instance p1, Lt5/f$a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0, p3}, Lt5/f$a;-><init>(Lt5/f;ILandroid/os/Handler;)V

    iput-object p1, p0, Lt5/f;->d:Lt5/f$a;

    new-instance p1, Lt5/f$a;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0, p3}, Lt5/f$a;-><init>(Lt5/f;ILandroid/os/Handler;)V

    iput-object p1, p0, Lt5/f;->e:Lt5/f$a;

    sget-object p1, Lx5/e;->a:Lx5/e$a;

    invoke-virtual {p1}, Lx5/e$a;->a()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lt5/f;->f:Landroid/net/Uri;

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    iput-object p1, p0, Lt5/f;->g:Landroid/net/Uri;

    sget-object p1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    iput-object p1, p0, Lt5/f;->h:Landroid/net/Uri;

    sget-object p1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    iput-object p1, p0, Lt5/f;->i:Landroid/net/Uri;

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "com.fluttercandies/photo_manager/notify"

    invoke-direct {p1, p2, p3}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lt5/f;->j:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public static final synthetic a(Lt5/f;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lt5/f;->f:Landroid/net/Uri;

    return-object p0
.end method

.method private final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lt5/f;->a:Landroid/content/Context;

    return-object v0
.end method

.method private final e(Lt5/f$a;Landroid/net/Uri;)V
    .locals 2

    invoke-direct {p0}, Lt5/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    invoke-virtual {p1, p2}, Lt5/f$a;->d(Landroid/net/Uri;)V

    return-void
.end method


# virtual methods
.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lt5/f;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final d(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V
    .locals 3

    const-string v0, "changeType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lck/m;

    const-string v1, "platform"

    const-string v2, "android"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "uri"

    invoke-static {v1, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "type"

    invoke-static {p1, p2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v0, p2

    const-string p1, "mediaType"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v0, p2

    invoke-static {v0}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p1

    if-eqz p3, :cond_0

    const-string p2, "id"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p4, :cond_1

    const-string p2, "galleryId"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p1}, Lb6/a;->a(Ljava/lang/Object;)V

    iget-object p2, p0, Lt5/f;->j:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "change"

    invoke-virtual {p2, p3, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final f()V
    .locals 3

    iget-boolean v0, p0, Lt5/f;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt5/f;->d:Lt5/f$a;

    iget-object v1, p0, Lt5/f;->g:Landroid/net/Uri;

    const-string v2, "imageUri"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lt5/f;->e(Lt5/f$a;Landroid/net/Uri;)V

    iget-object v0, p0, Lt5/f;->c:Lt5/f$a;

    iget-object v1, p0, Lt5/f;->h:Landroid/net/Uri;

    const-string v2, "videoUri"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lt5/f;->e(Lt5/f$a;Landroid/net/Uri;)V

    iget-object v0, p0, Lt5/f;->e:Lt5/f$a;

    iget-object v1, p0, Lt5/f;->i:Landroid/net/Uri;

    const-string v2, "audioUri"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lt5/f;->e(Lt5/f$a;Landroid/net/Uri;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt5/f;->b:Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, Lt5/f;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lt5/f;->b:Z

    invoke-direct {p0}, Lt5/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lt5/f;->d:Lt5/f$a;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    invoke-direct {p0}, Lt5/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lt5/f;->c:Lt5/f$a;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    invoke-direct {p0}, Lt5/f;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lt5/f;->e:Lt5/f$a;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    return-void
.end method
