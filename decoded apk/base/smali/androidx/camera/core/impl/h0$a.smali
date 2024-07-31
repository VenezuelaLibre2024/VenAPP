.class Landroidx/camera/core/impl/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/camera/core/impl/c0$a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/camera/core/impl/h0$b;

.field private final d:Landroidx/camera/core/impl/h0$c;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/c0$a;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/h0$b;Landroidx/camera/core/impl/h0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/h0$a;->a:Landroidx/camera/core/impl/c0$a;

    iput-object p2, p0, Landroidx/camera/core/impl/h0$a;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/camera/core/impl/h0$a;->c:Landroidx/camera/core/impl/h0$b;

    iput-object p4, p0, Landroidx/camera/core/impl/h0$a;->d:Landroidx/camera/core/impl/h0$c;

    return-void
.end method


# virtual methods
.method a()Landroidx/camera/core/impl/c0$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/h0$a;->a:Landroidx/camera/core/impl/c0$a;

    return-object v0
.end method

.method b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/impl/h0$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/core/impl/h0$a;->c:Landroidx/camera/core/impl/h0$b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroidx/camera/core/impl/g0;

    invoke-direct {v2, v1}, Landroidx/camera/core/impl/g0;-><init>(Landroidx/camera/core/impl/h0$b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to configure."

    invoke-static {v1, v2, v0}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method c()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/impl/h0$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/core/impl/h0$a;->d:Landroidx/camera/core/impl/h0$c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroidx/camera/core/impl/f0;

    invoke-direct {v2, v1}, Landroidx/camera/core/impl/f0;-><init>(Landroidx/camera/core/impl/h0$c;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to open."

    invoke-static {v1, v2, v0}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method d(Landroidx/camera/core/impl/c0$a;)Landroidx/camera/core/impl/c0$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/h0$a;->a:Landroidx/camera/core/impl/c0$a;

    iput-object p1, p0, Landroidx/camera/core/impl/h0$a;->a:Landroidx/camera/core/impl/c0$a;

    return-object v0
.end method
