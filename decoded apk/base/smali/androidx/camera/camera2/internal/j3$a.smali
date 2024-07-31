.class Landroidx/camera/camera2/internal/j3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Landroid/os/Handler;

.field private final d:Landroidx/camera/camera2/internal/a2;

.field private final e:Landroidx/camera/core/impl/t1;

.field private final f:Landroidx/camera/core/impl/t1;

.field private final g:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Landroidx/camera/camera2/internal/a2;Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/j3$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/camera/camera2/internal/j3$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Landroidx/camera/camera2/internal/j3$a;->c:Landroid/os/Handler;

    iput-object p4, p0, Landroidx/camera/camera2/internal/j3$a;->d:Landroidx/camera/camera2/internal/a2;

    iput-object p5, p0, Landroidx/camera/camera2/internal/j3$a;->e:Landroidx/camera/core/impl/t1;

    iput-object p6, p0, Landroidx/camera/camera2/internal/j3$a;->f:Landroidx/camera/core/impl/t1;

    new-instance p1, Lt/i;

    invoke-direct {p1, p5, p6}, Lt/i;-><init>(Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;)V

    invoke-virtual {p1}, Lt/i;->b()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lt/y;

    invoke-direct {p1, p5}, Lt/y;-><init>(Landroidx/camera/core/impl/t1;)V

    invoke-virtual {p1}, Lt/y;->i()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lt/h;

    invoke-direct {p1, p6}, Lt/h;-><init>(Landroidx/camera/core/impl/t1;)V

    invoke-virtual {p1}, Lt/h;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/j3$a;->g:Z

    return-void
.end method


# virtual methods
.method a()Landroidx/camera/camera2/internal/j3;
    .locals 9

    new-instance v0, Landroidx/camera/camera2/internal/j3;

    iget-boolean v1, p0, Landroidx/camera/camera2/internal/j3$a;->g:Z

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/camera/camera2/internal/i3;

    iget-object v3, p0, Landroidx/camera/camera2/internal/j3$a;->e:Landroidx/camera/core/impl/t1;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j3$a;->f:Landroidx/camera/core/impl/t1;

    iget-object v5, p0, Landroidx/camera/camera2/internal/j3$a;->d:Landroidx/camera/camera2/internal/a2;

    iget-object v6, p0, Landroidx/camera/camera2/internal/j3$a;->a:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Landroidx/camera/camera2/internal/j3$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v8, p0, Landroidx/camera/camera2/internal/j3$a;->c:Landroid/os/Handler;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Landroidx/camera/camera2/internal/i3;-><init>(Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;Landroidx/camera/camera2/internal/a2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/camera/camera2/internal/d3;

    iget-object v2, p0, Landroidx/camera/camera2/internal/j3$a;->d:Landroidx/camera/camera2/internal/a2;

    iget-object v3, p0, Landroidx/camera/camera2/internal/j3$a;->a:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Landroidx/camera/camera2/internal/j3$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, p0, Landroidx/camera/camera2/internal/j3$a;->c:Landroid/os/Handler;

    invoke-direct {v1, v2, v3, v4, v5}, Landroidx/camera/camera2/internal/d3;-><init>(Landroidx/camera/camera2/internal/a2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    :goto_0
    invoke-direct {v0, v1}, Landroidx/camera/camera2/internal/j3;-><init>(Landroidx/camera/camera2/internal/j3$b;)V

    return-object v0
.end method
