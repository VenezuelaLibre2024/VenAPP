.class Landroidx/camera/camera2/internal/f2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroidx/camera/camera2/internal/compat/d0;

.field private c:I


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/compat/d0;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/f2;->a:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/camera/camera2/internal/f2;->b:Landroidx/camera/camera2/internal/compat/d0;

    iput p2, p0, Landroidx/camera/camera2/internal/f2;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/f2;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/camera2/internal/f2;->c:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method b(I)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/f2;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Landroidx/camera/camera2/internal/f2;->c:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
