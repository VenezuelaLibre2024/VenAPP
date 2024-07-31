.class public Lg0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lw/k0;

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
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lw/k;->f()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    invoke-virtual {p1}, Lw/k;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lg0/z;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lw/k;->d()Lw/k0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lw/k0;

    iput-object v0, p0, Lg0/z;->b:Lw/k0;

    invoke-virtual {p1}, Lw/k;->b()Landroidx/core/util/a;

    move-result-object p1

    iput-object p1, p0, Lg0/z;->c:Landroidx/core/util/a;

    return-void
.end method

.method public static synthetic a(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/z;->c(Lw/k0$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic b(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/z;->d(Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic c(Lw/k0$a;Landroidx/concurrent/futures/c$a;)V
    .locals 1

    iget-object v0, p0, Lg0/z;->b:Lw/k0;

    invoke-interface {v0, p1}, Lw/k0;->a(Lw/k0$a;)Lw/k0$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic d(Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg0/z;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lg0/y;

    invoke-direct {v1, p0, p1, p2}, Lg0/y;-><init>(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "InternalImageProcessor#process "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public e(Lw/k0$a;)Lw/k0$b;
    .locals 3

    :try_start_0
    new-instance v0, Lg0/x;

    invoke-direct {v0, p0, p1}, Lg0/x;-><init>(Lg0/z;Lw/k0$a;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/k0$b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    new-instance v0, Lw/g0;

    const/4 v1, 0x0

    const-string v2, "Failed to invoke ImageProcessor."

    invoke-direct {v0, v1, v2, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
