.class Landroidx/camera/core/k$b;
.super Landroidx/camera/core/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/camera/core/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/o;Landroidx/camera/core/k;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/e;-><init>(Landroidx/camera/core/o;)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/core/k$b;->d:Ljava/lang/ref/WeakReference;

    new-instance p1, Landroidx/camera/core/l;

    invoke-direct {p1, p0}, Landroidx/camera/core/l;-><init>(Landroidx/camera/core/k$b;)V

    invoke-virtual {p0, p1}, Landroidx/camera/core/e;->a(Landroidx/camera/core/e$a;)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/k$b;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/k$b;->i(Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic f(Landroidx/camera/core/k;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/k$b;->g(Landroidx/camera/core/k;)V

    return-void
.end method

.method private static synthetic g(Landroidx/camera/core/k;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/k;->z()V

    return-void
.end method

.method private synthetic i(Landroidx/camera/core/o;)V
    .locals 2

    iget-object p1, p0, Landroidx/camera/core/k$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/k;

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroidx/camera/core/k;->t:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/core/m;

    invoke-direct {v1, p1}, Landroidx/camera/core/m;-><init>(Landroidx/camera/core/k;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
