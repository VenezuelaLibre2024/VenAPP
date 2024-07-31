.class final Landroidx/camera/core/j;
.super Landroidx/camera/core/i;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/i;-><init>()V

    return-void
.end method


# virtual methods
.method d(Landroidx/camera/core/impl/g1;)Landroidx/camera/core/o;
    .locals 0

    invoke-interface {p1}, Landroidx/camera/core/impl/g1;->g()Landroidx/camera/core/o;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 0

    return-void
.end method

.method o(Landroidx/camera/core/o;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/camera/core/i;->e(Landroidx/camera/core/o;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Landroidx/camera/core/j$a;

    invoke-direct {v1, p0, p1}, Landroidx/camera/core/j$a;-><init>(Landroidx/camera/core/j;Landroidx/camera/core/o;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method
