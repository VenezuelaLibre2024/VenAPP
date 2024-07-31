.class public Lcom/arthenica/ffmpegkit/FFmpegKitConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static b:Lcom/arthenica/ffmpegkit/m;

.field private static c:I

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/arthenica/ffmpegkit/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/lang/Object;

.field private static g:I

.field private static h:Ljava/util/concurrent/ExecutorService;

.field private static i:Lcom/arthenica/ffmpegkit/o;

.field private static j:Lcom/arthenica/ffmpegkit/b0;

.field private static k:Lcom/arthenica/ffmpegkit/i;

.field private static l:Lcom/arthenica/ffmpegkit/l;

.field private static m:Lcom/arthenica/ffmpegkit/t;

.field private static final n:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final o:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;",
            ">;"
        }
    .end annotation
.end field

.field private static p:Lcom/arthenica/ffmpegkit/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "com.arthenica"

    invoke-static {v0}, Lu2/a;->b(Ljava/lang/String;)V

    const-string v0, "Loading ffmpeg-kit."

    const-string v1, "ffmpeg-kit"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->e()Z

    move-result v0

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/u;->f(Z)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->j()I

    move-result v0

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/m;->h(I)Lcom/arthenica/ffmpegkit/m;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:Lcom/arthenica/ffmpegkit/m;

    const/16 v0, 0xa

    sput v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g:I

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    sput-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h:Ljava/util/concurrent/ExecutorService;

    sput v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    new-instance v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$a;

    invoke-direct {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$a;-><init>()V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i:Lcom/arthenica/ffmpegkit/o;

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j:Lcom/arthenica/ffmpegkit/b0;

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k:Lcom/arthenica/ffmpegkit/i;

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l:Lcom/arthenica/ffmpegkit/l;

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m:Lcom/arthenica/ffmpegkit/t;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o:Landroid/util/SparseArray;

    sget-object v0, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED:Lcom/arthenica/ffmpegkit/p;

    sput-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p:Lcom/arthenica/ffmpegkit/p;

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->l()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->c()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x2

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->m()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x3

    invoke-static {}, Lcom/arthenica/ffmpegkit/u;->d()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const-string v2, "Loaded ffmpeg-kit-%s-%s-%s-%s."

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()Lcom/arthenica/ffmpegkit/x;
    .locals 3

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arthenica/ffmpegkit/x;

    monitor-exit v0

    return-object v1

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static B()Lcom/arthenica/ffmpegkit/m;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:Lcom/arthenica/ffmpegkit/m;

    return-object v0
.end method

.method public static C()Lcom/arthenica/ffmpegkit/p;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p:Lcom/arthenica/ffmpegkit/p;

    return-object v0
.end method

.method public static D(Lcom/arthenica/ffmpegkit/s;I)V
    .locals 7

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->w()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->f()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->nativeFFprobeExecute(J[Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/arthenica/ffmpegkit/w;

    invoke-direct {v2, v1}, Lcom/arthenica/ffmpegkit/w;-><init>(I)V

    invoke-virtual {p0, v2}, Lcom/arthenica/ffmpegkit/b;->r(Lcom/arthenica/ffmpegkit/w;)V

    invoke-virtual {v2}, Lcom/arthenica/ffmpegkit/w;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/b;->c(I)Ljava/util/List;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/arthenica/ffmpegkit/n;

    invoke-virtual {v4}, Lcom/arthenica/ffmpegkit/n;->a()Lcom/arthenica/ffmpegkit/m;

    move-result-object v5

    sget-object v6, Lcom/arthenica/ffmpegkit/m;->AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

    if-ne v5, v6, :cond_0

    invoke-virtual {v4}, Lcom/arthenica/ffmpegkit/n;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/r;->a(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/s;->B(Lcom/arthenica/ffmpegkit/q;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/b;->s(Ljava/lang/Exception;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v0

    invoke-static {p1}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    aput-object p0, v1, p1

    const-string p0, "Get media information execute failed: %s.%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "ffmpeg-kit"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_1
    return-void
.end method

.method public static E()Lcom/arthenica/ffmpegkit/t;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m:Lcom/arthenica/ffmpegkit/t;

    return-object v0
.end method

.method public static F()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/x;

    invoke-interface {v3}, Lcom/arthenica/ffmpegkit/x;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    check-cast v3, Lcom/arthenica/ffmpegkit/s;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static G(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "_display_name"

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_3
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_0
    const-string v2, "unknown"

    :goto_1
    if-eqz v1, :cond_1

    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_1
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n:Landroid/util/SparseArray;

    new-instance v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v3, v4, p1, p2, p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;-><init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/String;Landroid/content/ContentResolver;)V

    invoke-virtual {v1, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "saf:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_2
    move-exception p0

    const/4 p2, 0x3

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v0

    const/4 p1, 0x2

    invoke-static {p0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p2, p1

    const-string p1, "Failed to get %s column for %s.%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "ffmpeg-kit"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    throw p0
.end method

.method public static H(J)Lcom/arthenica/ffmpegkit/x;
    .locals 2

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:Ljava/util/Map;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/x;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static I()I
    .locals 1

    sget v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    return v0
.end method

.method public static J()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/x;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedList;

    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static K(Lcom/arthenica/ffmpegkit/y;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/arthenica/ffmpegkit/y;",
            ")",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/x;

    invoke-interface {v3}, Lcom/arthenica/ffmpegkit/x;->getState()Lcom/arthenica/ffmpegkit/y;

    move-result-object v4

    if-ne v4, p0, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static L()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->getNativeVersion()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "%s-lts"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->getNativeVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static M(Lcom/arthenica/ffmpegkit/z;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/z;->h()I

    move-result p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->ignoreNativeSignal(I)V

    return-void
.end method

.method public static N()Z
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->isNativeLTSBuild()Z

    move-result v0

    return v0
.end method

.method public static O(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    new-instance v0, Ljava/io/File;

    const-string v1, "pipes"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    const/4 v1, 0x0

    const-string v2, "ffmpeg-kit"

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    if-nez p0, :cond_0

    new-array p0, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p0, v4

    const-string v0, "Failed to create pipes directory: %s."

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    const/4 p0, 0x4

    new-array p0, p0, [Ljava/lang/Object;

    aput-object v0, p0, v4

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    aput-object v0, p0, v3

    const-string v0, "fk_pipe_"

    const/4 v5, 0x2

    aput-object v0, p0, v5

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x3

    aput-object v0, p0, v6

    const-string v0, "{0}{1}{2}{3}"

    invoke-static {v0, p0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->registerNewNativeFFmpegPipe(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    new-array v5, v5, [Ljava/lang/Object;

    aput-object p0, v5, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v5, v3

    const-string p0, "Failed to register new FFmpeg pipe %s. Operation failed with rc=%d."

    invoke-static {p0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static P(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->setNativeEnvironmentVariable(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static Q(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->R(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public static R(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    new-instance v0, Ljava/io/File;

    const-string v1, "fontconfig"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    const-string v1, "ffmpeg-kit"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result p0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v4, v3

    const-string p0, "Created temporary font conf directory: %s."

    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance p0, Ljava/io/File;

    const-string v4, "fonts.conf"

    invoke-direct {p0, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v5, v3

    const-string v4, "Deleted old temporary font configuration: %s."

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v5

    if-lez v5, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v5, v3

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    if-eqz v6, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    const-string v8, "    <match target=\"pattern\">\n"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "        <test qual=\"any\" name=\"family\">\n"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v7, v8, v3

    const-string v7, "            <string>%s</string>\n"

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "        </test>\n"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v8, v2, [Ljava/lang/Object;

    aput-object v6, v8, v3

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "        </edit>\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "    </match>\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    move v5, v3

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "<?xml version=\"1.0\"?>\n"

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n"

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "<fontconfig>\n"

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "    <dir prefix=\"cwd\">.</dir>\n"

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "    <dir>"

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "</dir>\n"

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v4, "</fontconfig>\n"

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v4, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v6, p0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    const-string p0, "Saved new temporary font configuration with %d font name mappings."

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, p2, v3

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->S(Ljava/lang/String;)I

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "Font directory %s registered successfully."

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p2, v5, v3

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_7

    :try_start_1
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    :goto_3
    check-cast p0, Ljava/io/FileOutputStream;

    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catchall_0
    move-exception p0

    goto :goto_5

    :catch_0
    move-exception p0

    :try_start_2
    const-string p2, "Failed to set font directory: %s.%s"

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v3

    invoke-static {p0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v2

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_7

    :try_start_3
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    :cond_7
    :goto_4
    return-void

    :goto_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    :try_start_4
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/FileOutputStream;

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_8
    throw p0
.end method

.method public static S(Ljava/lang/String;)I
    .locals 1

    const-string v0, "FONTCONFIG_PATH"

    invoke-static {v0, p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->setNativeEnvironmentVariable(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static T(Lcom/arthenica/ffmpegkit/m;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->setNativeLogLevel(I)V

    :cond_0
    return-void
.end method

.method public static U(Lcom/arthenica/ffmpegkit/p;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p:Lcom/arthenica/ffmpegkit/p;

    return-void
.end method

.method public static V(I)V
    .locals 1

    const/16 v0, 0x3e8

    if-ge p0, v0, :cond_1

    if-lez p0, :cond_0

    sput p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i()V

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Session history size must not exceed the hard limit!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic a()I
    .locals 1

    sget v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    return v0
.end method

.method static b(Lcom/arthenica/ffmpegkit/x;)V
    .locals 4

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:Ljava/util/Map;

    invoke-interface {p0}, Lcom/arthenica/ffmpegkit/x;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0}, Lcom/arthenica/ffmpegkit/x;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static c([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, "null"

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    if-lez v1, :cond_1

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    aget-object v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lcom/arthenica/ffmpegkit/h;)V
    .locals 2

    new-instance v0, Lcom/arthenica/ffmpegkit/c;

    invoke-direct {v0, p0}, Lcom/arthenica/ffmpegkit/c;-><init>(Lcom/arthenica/ffmpegkit/h;)V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arthenica/ffmpegkit/b;->v(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private static native disableNativeRedirection()V
.end method

.method public static e(Lcom/arthenica/ffmpegkit/k;)V
    .locals 2

    new-instance v0, Lcom/arthenica/ffmpegkit/d;

    invoke-direct {v0, p0}, Lcom/arthenica/ffmpegkit/d;-><init>(Lcom/arthenica/ffmpegkit/k;)V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arthenica/ffmpegkit/b;->v(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private static native enableNativeRedirection()V
.end method

.method public static f(Lcom/arthenica/ffmpegkit/s;I)V
    .locals 1

    new-instance v0, Lcom/arthenica/ffmpegkit/e;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/arthenica/ffmpegkit/e;-><init>(Lcom/arthenica/ffmpegkit/s;Ljava/lang/Integer;)V

    sget-object p1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/b;->v(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method public static g()V
    .locals 2

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static native getNativeBuildDate()Ljava/lang/String;
.end method

.method private static native getNativeFFmpegVersion()Ljava/lang/String;
.end method

.method static native getNativeLogLevel()I
.end method

.method private static native getNativeVersion()Ljava/lang/String;
.end method

.method public static h(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method private static i()V
    .locals 4

    :catch_0
    :cond_0
    :goto_0
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sget v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arthenica/ffmpegkit/x;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:Ljava/util/Map;

    invoke-interface {v0}, Lcom/arthenica/ffmpegkit/x;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static native ignoreNativeSignal(I)V
.end method

.method public static j()V
    .locals 0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->disableNativeRedirection()V

    return-void
.end method

.method public static k(Lcom/arthenica/ffmpegkit/i;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k:Lcom/arthenica/ffmpegkit/i;

    return-void
.end method

.method public static l(Lcom/arthenica/ffmpegkit/l;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l:Lcom/arthenica/ffmpegkit/l;

    return-void
.end method

.method private static log(JI[B)V
    .locals 5

    invoke-static {p2}, Lcom/arthenica/ffmpegkit/m;->h(I)Lcom/arthenica/ffmpegkit/m;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p3}, Ljava/lang/String;-><init>([B)V

    new-instance p3, Lcom/arthenica/ffmpegkit/n;

    invoke-direct {p3, p0, p1, v0, v1}, Lcom/arthenica/ffmpegkit/n;-><init>(JLcom/arthenica/ffmpegkit/m;Ljava/lang/String;)V

    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p:Lcom/arthenica/ffmpegkit/p;

    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:Lcom/arthenica/ffmpegkit/m;

    sget-object v4, Lcom/arthenica/ffmpegkit/m;->AV_LOG_QUIET:Lcom/arthenica/ffmpegkit/m;

    if-ne v3, v4, :cond_0

    sget-object v3, Lcom/arthenica/ffmpegkit/m;->AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v3

    if-ne p2, v3, :cond_1

    :cond_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v3

    if-le p2, v3, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-static {p0, p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lcom/arthenica/ffmpegkit/x;

    move-result-object p0

    const/4 p1, 0x1

    const-string p2, "ffmpeg-kit"

    const/4 v3, 0x0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Lcom/arthenica/ffmpegkit/x;->d()Lcom/arthenica/ffmpegkit/p;

    move-result-object v2

    invoke-interface {p0, p3}, Lcom/arthenica/ffmpegkit/x;->o(Lcom/arthenica/ffmpegkit/n;)V

    invoke-interface {p0}, Lcom/arthenica/ffmpegkit/x;->e()Lcom/arthenica/ffmpegkit/o;

    move-result-object v4

    if-eqz v4, :cond_3

    :try_start_0
    invoke-interface {p0}, Lcom/arthenica/ffmpegkit/x;->e()Lcom/arthenica/ffmpegkit/o;

    move-result-object p0

    invoke-interface {p0, p3}, Lcom/arthenica/ffmpegkit/o;->a(Lcom/arthenica/ffmpegkit/n;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-array v4, p1, [Ljava/lang/Object;

    invoke-static {p0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v3

    const-string p0, "Exception thrown inside session log callback.%s"

    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    move p0, p1

    goto :goto_1

    :cond_3
    move p0, v3

    :goto_1
    sget-object v4, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i:Lcom/arthenica/ffmpegkit/o;

    if-eqz v4, :cond_4

    :try_start_1
    invoke-interface {v4, p3}, Lcom/arthenica/ffmpegkit/o;->a(Lcom/arthenica/ffmpegkit/n;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p3

    new-array v4, p1, [Ljava/lang/Object;

    invoke-static {p3}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    aput-object p3, v4, v3

    const-string p3, "Exception thrown inside global log callback.%s"

    invoke-static {p3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    move v3, p1

    :cond_4
    sget-object p3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p3, p3, v2

    if-eq p3, p1, :cond_a

    const/4 p1, 0x2

    if-eq p3, p1, :cond_8

    const/4 p1, 0x3

    if-eq p3, p1, :cond_7

    const/4 p1, 0x4

    if-eq p3, p1, :cond_5

    goto :goto_3

    :cond_5
    if-nez v3, :cond_6

    if-eqz p0, :cond_9

    :cond_6
    return-void

    :cond_7
    if-eqz p0, :cond_9

    return-void

    :cond_8
    if-eqz v3, :cond_9

    return-void

    :cond_9
    :goto_3
    sget-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$b;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    packed-switch p0, :pswitch_data_0

    invoke-static {p2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :pswitch_0
    invoke-static {p2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :pswitch_1
    invoke-static {p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :pswitch_2
    invoke-static {p2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :pswitch_3
    invoke-static {p2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    :goto_4
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(Lcom/arthenica/ffmpegkit/o;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i:Lcom/arthenica/ffmpegkit/o;

    return-void
.end method

.method public static native messagesInTransmit(J)I
.end method

.method public static n(Lcom/arthenica/ffmpegkit/t;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m:Lcom/arthenica/ffmpegkit/t;

    return-void
.end method

.method static native nativeFFmpegCancel(J)V
.end method

.method private static native nativeFFmpegExecute(J[Ljava/lang/String;)I
.end method

.method static native nativeFFprobeExecute(J[Ljava/lang/String;)I
.end method

.method public static o()V
    .locals 0

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->enableNativeRedirection()V

    return-void
.end method

.method public static p(Lcom/arthenica/ffmpegkit/b0;)V
    .locals 0

    sput-object p0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j:Lcom/arthenica/ffmpegkit/b0;

    return-void
.end method

.method static q(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    :try_start_0
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, " ."

    invoke-direct {v1, v0, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    invoke-static {v0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, p0

    const-string p0, "Failed to extract extension from saf display name: %s.%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "raw"

    return-object p0
.end method

.method public static r(Lcom/arthenica/ffmpegkit/h;)V
    .locals 3

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->w()V

    :try_start_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->f()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->nativeFFmpegExecute(J[Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/arthenica/ffmpegkit/w;

    invoke-direct {v1, v0}, Lcom/arthenica/ffmpegkit/w;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/arthenica/ffmpegkit/b;->r(Lcom/arthenica/ffmpegkit/w;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/arthenica/ffmpegkit/b;->s(Ljava/lang/Exception;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    invoke-static {v0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, p0

    const-string p0, "FFmpeg execute failed: %s.%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private static native registerNewNativeFFmpegPipe(Ljava/lang/String;)I
.end method

.method public static s(Lcom/arthenica/ffmpegkit/k;)V
    .locals 3

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->w()V

    :try_start_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->f()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->nativeFFprobeExecute(J[Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/arthenica/ffmpegkit/w;

    invoke-direct {v1, v0}, Lcom/arthenica/ffmpegkit/w;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/arthenica/ffmpegkit/b;->r(Lcom/arthenica/ffmpegkit/w;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/arthenica/ffmpegkit/b;->s(Ljava/lang/Exception;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->t()[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    invoke-static {v0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, p0

    const-string p0, "FFprobe execute failed: %s.%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private static safClose(I)I
    .locals 6

    const-string v0, "ffmpeg-kit"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o:Landroid/util/SparseArray;

    invoke-virtual {v3, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->c()Landroid/os/ParcelFileDescriptor;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, p0}, Landroid/util/SparseArray;->delete(I)V

    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n:Landroid/util/SparseArray;

    invoke-virtual {v4}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->d()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->delete(I)V

    invoke-virtual {v5}, Landroid/os/ParcelFileDescriptor;->close()V

    return v1

    :cond_0
    const-string v3, "ParcelFileDescriptor for SAF fd %d not found."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    const-string v3, "SAF fd %d not found."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v4, v2

    invoke-static {v3}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v1

    const-string p0, "Failed to close SAF fd: %d.%s"

    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return v2
.end method

.method private static safOpen(I)I
    .locals 7

    const-string v0, "ffmpeg-kit"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n:Landroid/util/SparseArray;

    invoke-virtual {v3, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->a()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->e()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig$c;->f(Landroid/os/ParcelFileDescriptor;)V

    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v4

    sget-object v5, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o:Landroid/util/SparseArray;

    invoke-virtual {v5, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return v4

    :cond_0
    const-string v3, "SAF id %d not found."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v4, v2

    invoke-static {v3}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v1

    const-string p0, "Failed to open SAF id: %d.%s"

    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return v2
.end method

.method private static native setNativeEnvironmentVariable(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method private static native setNativeLogLevel(I)V
.end method

.method private static statistics(JIFFJDDD)V
    .locals 16

    new-instance v15, Lcom/arthenica/ffmpegkit/a0;

    move-object v1, v15

    move-wide/from16 v2, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    move-wide/from16 v11, p9

    move-wide/from16 v13, p11

    invoke-direct/range {v1 .. v14}, Lcom/arthenica/ffmpegkit/a0;-><init>(JIFFJDDD)V

    invoke-static/range {p0 .. p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lcom/arthenica/ffmpegkit/x;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ffmpeg-kit"

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/arthenica/ffmpegkit/x;->g()Z

    move-result v4

    if-eqz v4, :cond_0

    check-cast v0, Lcom/arthenica/ffmpegkit/h;

    invoke-virtual {v0, v15}, Lcom/arthenica/ffmpegkit/h;->y(Lcom/arthenica/ffmpegkit/a0;)V

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/h;->D()Lcom/arthenica/ffmpegkit/b0;

    move-result-object v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/h;->D()Lcom/arthenica/ffmpegkit/b0;

    move-result-object v0

    invoke-interface {v0, v15}, Lcom/arthenica/ffmpegkit/b0;->a(Lcom/arthenica/ffmpegkit/a0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v0}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v1

    const-string v0, "Exception thrown inside session statistics callback.%s"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j:Lcom/arthenica/ffmpegkit/b0;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0, v15}, Lcom/arthenica/ffmpegkit/b0;->a(Lcom/arthenica/ffmpegkit/a0;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v4, v0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v4}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "Exception thrown inside global statistics callback.%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-void
.end method

.method public static t()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->getNativeBuildDate()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static u()Lcom/arthenica/ffmpegkit/i;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k:Lcom/arthenica/ffmpegkit/i;

    return-object v0
.end method

.method public static v()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/x;

    invoke-interface {v3}, Lcom/arthenica/ffmpegkit/x;->g()Z

    move-result v4

    if-eqz v4, :cond_0

    check-cast v3, Lcom/arthenica/ffmpegkit/h;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static w()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->getNativeFFmpegVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static x()Lcom/arthenica/ffmpegkit/l;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l:Lcom/arthenica/ffmpegkit/l;

    return-object v0
.end method

.method public static y()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/x;

    invoke-interface {v3}, Lcom/arthenica/ffmpegkit/x;->n()Z

    move-result v4

    if-eqz v4, :cond_0

    check-cast v3, Lcom/arthenica/ffmpegkit/k;

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static z()Lcom/arthenica/ffmpegkit/x;
    .locals 5

    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arthenica/ffmpegkit/x;

    invoke-interface {v2}, Lcom/arthenica/ffmpegkit/x;->getState()Lcom/arthenica/ffmpegkit/y;

    move-result-object v3

    sget-object v4, Lcom/arthenica/ffmpegkit/y;->COMPLETED:Lcom/arthenica/ffmpegkit/y;

    if-ne v3, v4, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
