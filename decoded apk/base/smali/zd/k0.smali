.class public Lzd/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Z

.field private c:Z

.field private d:Ljava/lang/Runnable;

.field private final e:Lak/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lak/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lzd/k0;->a:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzd/k0;->b:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd/k0;->c:Z

    invoke-static {}, Lak/a;->w()Lak/a;

    move-result-object v0

    iput-object v0, p0, Lzd/k0;->e:Lak/a;

    return-void
.end method

.method public static synthetic a(Lzd/k0;)V
    .locals 0

    invoke-direct {p0}, Lzd/k0;->c()V

    return-void
.end method

.method private synthetic c()V
    .locals 2

    iget-boolean v0, p0, Lzd/k0;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lzd/k0;->c:Z

    if-nez v1, :cond_1

    :cond_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lzd/k0;->b:Z

    return-void
.end method


# virtual methods
.method public b()Lij/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/k0;->e:Lak/a;

    sget-object v1, Ldj/a;->BUFFER:Ldj/a;

    invoke-virtual {v0, v1}, Ldj/o;->u(Ldj/a;)Ldj/f;

    move-result-object v0

    invoke-virtual {v0}, Ldj/f;->C()Lij/a;

    move-result-object v0

    return-object v0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzd/k0;->c:Z

    iget-object p1, p0, Lzd/k0;->d:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lzd/k0;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object p1, p0, Lzd/k0;->a:Landroid/os/Handler;

    new-instance v0, Lzd/j0;

    invoke-direct {v0, p0}, Lzd/j0;-><init>(Lzd/k0;)V

    iput-object v0, p0, Lzd/k0;->d:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzd/k0;->c:Z

    iget-boolean p1, p0, Lzd/k0;->b:Z

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iput-boolean v0, p0, Lzd/k0;->b:Z

    iget-object v0, p0, Lzd/k0;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzd/k0;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "went foreground"

    invoke-static {p1}, Lzd/l2;->c(Ljava/lang/String;)V

    iget-object p1, p0, Lzd/k0;->e:Lak/a;

    const-string v0, "ON_FOREGROUND"

    invoke-virtual {p1, v0}, Lak/a;->c(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
