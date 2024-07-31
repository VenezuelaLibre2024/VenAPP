.class final Lz/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static volatile a:Lz/b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Ljava/util/concurrent/Executor;
    .locals 2

    sget-object v0, Lz/b;->a:Lz/b;

    if-eqz v0, :cond_0

    sget-object v0, Lz/b;->a:Lz/b;

    return-object v0

    :cond_0
    const-class v0, Lz/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz/b;->a:Lz/b;

    if-nez v1, :cond_1

    new-instance v1, Lz/b;

    invoke-direct {v1}, Lz/b;-><init>()V

    sput-object v1, Lz/b;->a:Lz/b;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lz/b;->a:Lz/b;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
