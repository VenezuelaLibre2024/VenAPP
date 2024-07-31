.class public final Lcom/facebook/appevents/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/appevents/n;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/appevents/n;

    invoke-direct {v0}, Lcom/facebook/appevents/n;-><init>()V

    sput-object v0, Lcom/facebook/appevents/n;->a:Lcom/facebook/appevents/n;

    const-class v0, Lcom/facebook/appevents/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/n;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final declared-synchronized a(Lcom/facebook/appevents/a;Lcom/facebook/appevents/j0;)V
    .locals 2

    const-class v0, Lcom/facebook/appevents/n;

    monitor-enter v0

    :try_start_0
    const-class v1, Lcom/facebook/appevents/n;

    invoke-static {v1}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "accessTokenAppIdPair"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appEvents"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lq4/g;->b()V

    invoke-static {}, Lcom/facebook/appevents/f;->a()Lcom/facebook/appevents/i0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/appevents/j0;->d()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Lcom/facebook/appevents/i0;->a(Lcom/facebook/appevents/a;Ljava/util/List;)V

    invoke-static {v1}, Lcom/facebook/appevents/f;->b(Lcom/facebook/appevents/i0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    const-class p1, Lcom/facebook/appevents/n;

    invoke-static {p0, p1}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final declared-synchronized b(Lcom/facebook/appevents/e;)V
    .locals 5

    const-class v0, Lcom/facebook/appevents/n;

    monitor-enter v0

    :try_start_0
    const-class v1, Lcom/facebook/appevents/n;

    invoke-static {v1}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "eventsToPersist"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lq4/g;->b()V

    invoke-static {}, Lcom/facebook/appevents/f;->a()Lcom/facebook/appevents/i0;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/appevents/e;->f()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/appevents/a;

    invoke-virtual {p0, v3}, Lcom/facebook/appevents/e;->c(Lcom/facebook/appevents/a;)Lcom/facebook/appevents/j0;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/facebook/appevents/j0;->d()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/facebook/appevents/i0;->a(Lcom/facebook/appevents/a;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    const-string p0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lcom/facebook/appevents/f;->b(Lcom/facebook/appevents/i0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    const-class v1, Lcom/facebook/appevents/n;

    invoke-static {p0, v1}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method
