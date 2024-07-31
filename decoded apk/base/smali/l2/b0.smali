.class public Ll2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static final r:Ljava/lang/String;


# instance fields
.field final a:Landroidx/work/impl/utils/futures/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final b:Landroid/content/Context;

.field final c:Lk2/u;

.field final d:Landroidx/work/c;

.field final e:Lf2/f;

.field final f:Lm2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, Lf2/j;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll2/b0;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk2/u;Landroidx/work/c;Lf2/f;Lm2/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->s()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Ll2/b0;->a:Landroidx/work/impl/utils/futures/c;

    iput-object p1, p0, Ll2/b0;->b:Landroid/content/Context;

    iput-object p2, p0, Ll2/b0;->c:Lk2/u;

    iput-object p3, p0, Ll2/b0;->d:Landroidx/work/c;

    iput-object p4, p0, Ll2/b0;->e:Lf2/f;

    iput-object p5, p0, Ll2/b0;->f:Lm2/b;

    return-void
.end method

.method public static synthetic a(Ll2/b0;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ll2/b0;->c(Landroidx/work/impl/utils/futures/c;)V

    return-void
.end method

.method private synthetic c(Landroidx/work/impl/utils/futures/c;)V
    .locals 1

    iget-object v0, p0, Ll2/b0;->a:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll2/b0;->d:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->getForegroundInfoAsync()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/work/impl/utils/futures/c;->q(Lcom/google/common/util/concurrent/f;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/work/impl/utils/futures/a;->cancel(Z)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll2/b0;->a:Landroidx/work/impl/utils/futures/c;

    return-object v0
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Ll2/b0;->c:Lk2/u;

    iget-boolean v0, v0, Lk2/u;->q:Z

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->s()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iget-object v1, p0, Ll2/b0;->f:Lm2/b;

    invoke-interface {v1}, Lm2/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Ll2/a0;

    invoke-direct {v2, p0, v0}, Ll2/a0;-><init>(Ll2/b0;Landroidx/work/impl/utils/futures/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Ll2/b0$a;

    invoke-direct {v1, p0, v0}, Ll2/b0$a;-><init>(Ll2/b0;Landroidx/work/impl/utils/futures/c;)V

    iget-object v2, p0, Ll2/b0;->f:Lm2/b;

    invoke-interface {v2}, Lm2/b;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/work/impl/utils/futures/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Ll2/b0;->a:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->o(Ljava/lang/Object;)Z

    return-void
.end method
