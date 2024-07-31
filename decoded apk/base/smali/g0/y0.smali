.class public Lg0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/r0;


# instance fields
.field private final a:Lw/y0;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/core/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/a<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lw/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lw/k;->e()Lw/y0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lw/y0;

    iput-object v0, p0, Lg0/y0;->a:Lw/y0;

    invoke-virtual {p1}, Lw/k;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lg0/y0;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lw/k;->b()Landroidx/core/util/a;

    move-result-object p1

    iput-object p1, p0, Lg0/y0;->c:Landroidx/core/util/a;

    return-void
.end method

.method public static synthetic d(Lg0/y0;Lw/i1;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/y0;->f(Lw/i1;)V

    return-void
.end method

.method public static synthetic e(Lg0/y0;Lw/x0;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/y0;->g(Lw/x0;)V

    return-void
.end method

.method private synthetic f(Lw/i1;)V
    .locals 1

    iget-object v0, p0, Lg0/y0;->a:Lw/y0;

    invoke-interface {v0, p1}, Lw/y0;->b(Lw/i1;)V

    return-void
.end method

.method private synthetic g(Lw/x0;)V
    .locals 1

    iget-object v0, p0, Lg0/y0;->a:Lw/y0;

    invoke-interface {v0, p1}, Lw/y0;->a(Lw/x0;)V

    return-void
.end method


# virtual methods
.method public a(Lw/x0;)V
    .locals 2

    iget-object v0, p0, Lg0/y0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg0/x0;

    invoke-direct {v1, p0, p1}, Lg0/x0;-><init>(Lg0/y0;Lw/x0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lw/i1;)V
    .locals 2

    iget-object v0, p0, Lg0/y0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lg0/w0;

    invoke-direct {v1, p0, p1}, Lg0/w0;-><init>(Lg0/y0;Lw/i1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(II)Lcom/google/common/util/concurrent/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Snapshot not supported by external SurfaceProcessor"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
