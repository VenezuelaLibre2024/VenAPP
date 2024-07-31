.class Lx6/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/v$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final b:Lx6/u$a;

.field private c:Lx6/n;

.field private d:Z

.field final synthetic e:Lx6/h;


# direct methods
.method public constructor <init>(Lx6/h;Lx6/u$a;)V
    .locals 0

    iput-object p1, p0, Lx6/h$f;->e:Lx6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx6/h$f;->b:Lx6/u$a;

    return-void
.end method

.method public static synthetic c(Lx6/h$f;)V
    .locals 0

    invoke-direct {p0}, Lx6/h$f;->g()V

    return-void
.end method

.method public static synthetic d(Lx6/h$f;Lt6/u1;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/h$f;->f(Lt6/u1;)V

    return-void
.end method

.method private synthetic f(Lt6/u1;)V
    .locals 4

    iget-object v0, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {v0}, Lx6/h;->q(Lx6/h;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lx6/h$f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {v0}, Lx6/h;->k(Lx6/h;)Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    iget-object v2, p0, Lx6/h$f;->b:Lx6/u$a;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lx6/h;->l(Lx6/h;Landroid/os/Looper;Lx6/u$a;Lt6/u1;Z)Lx6/n;

    move-result-object p1

    iput-object p1, p0, Lx6/h$f;->c:Lx6/n;

    iget-object p1, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {p1}, Lx6/h;->j(Lx6/h;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic g()V
    .locals 2

    iget-boolean v0, p0, Lx6/h$f;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx6/h$f;->c:Lx6/n;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lx6/h$f;->b:Lx6/u$a;

    invoke-interface {v0, v1}, Lx6/n;->d(Lx6/u$a;)V

    :cond_1
    iget-object v0, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {v0}, Lx6/h;->j(Lx6/h;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx6/h$f;->d:Z

    return-void
.end method


# virtual methods
.method public e(Lt6/u1;)V
    .locals 2

    iget-object v0, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {v0}, Lx6/h;->p(Lx6/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lx6/j;

    invoke-direct {v1, p0, p1}, Lx6/j;-><init>(Lx6/h$f;Lt6/u1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lx6/h$f;->e:Lx6/h;

    invoke-static {v0}, Lx6/h;->p(Lx6/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lx6/i;

    invoke-direct {v1, p0}, Lx6/i;-><init>(Lx6/h$f;)V

    invoke-static {v0, v1}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    return-void
.end method
