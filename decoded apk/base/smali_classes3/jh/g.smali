.class public Ljh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final n:Ljava/lang/String; = "g"


# instance fields
.field private a:Ljh/k;

.field private b:Ljh/j;

.field private c:Ljh/h;

.field private d:Landroid/os/Handler;

.field private e:Ljh/m;

.field private f:Z

.field private g:Z

.field private h:Landroid/os/Handler;

.field private i:Ljh/i;

.field private j:Ljava/lang/Runnable;

.field private k:Ljava/lang/Runnable;

.field private l:Ljava/lang/Runnable;

.field private m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljh/g;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljh/g;->g:Z

    new-instance v0, Ljh/i;

    invoke-direct {v0}, Ljh/i;-><init>()V

    iput-object v0, p0, Ljh/g;->i:Ljh/i;

    new-instance v0, Ljh/g$a;

    invoke-direct {v0, p0}, Ljh/g$a;-><init>(Ljh/g;)V

    iput-object v0, p0, Ljh/g;->j:Ljava/lang/Runnable;

    new-instance v0, Ljh/g$b;

    invoke-direct {v0, p0}, Ljh/g$b;-><init>(Ljh/g;)V

    iput-object v0, p0, Ljh/g;->k:Ljava/lang/Runnable;

    new-instance v0, Ljh/g$c;

    invoke-direct {v0, p0}, Ljh/g$c;-><init>(Ljh/g;)V

    iput-object v0, p0, Ljh/g;->l:Ljava/lang/Runnable;

    new-instance v0, Ljh/g$d;

    invoke-direct {v0, p0}, Ljh/g$d;-><init>(Ljh/g;)V

    iput-object v0, p0, Ljh/g;->m:Ljava/lang/Runnable;

    invoke-static {}, Lih/r;->a()V

    invoke-static {}, Ljh/k;->d()Ljh/k;

    move-result-object v0

    iput-object v0, p0, Ljh/g;->a:Ljh/k;

    new-instance v0, Ljh/h;

    invoke-direct {v0, p1}, Ljh/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ljh/g;->c:Ljh/h;

    iget-object p1, p0, Ljh/g;->i:Ljh/i;

    invoke-virtual {v0, p1}, Ljh/h;->o(Ljh/i;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Ljh/g;->h:Landroid/os/Handler;

    return-void
.end method

.method private C()V
    .locals 2

    iget-boolean v0, p0, Ljh/g;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraInstance is not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(Ljh/g;Ljh/p;)V
    .locals 0

    invoke-direct {p0, p1}, Ljh/g;->q(Ljh/p;)V

    return-void
.end method

.method public static synthetic b(Ljh/g;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ljh/g;->s(Z)V

    return-void
.end method

.method public static synthetic c(Ljh/g;Ljh/p;)V
    .locals 0

    invoke-direct {p0, p1}, Ljh/g;->r(Ljh/p;)V

    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    sget-object v0, Ljh/g;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Ljh/g;)Ljh/h;
    .locals 0

    iget-object p0, p0, Ljh/g;->c:Ljh/h;

    return-object p0
.end method

.method static synthetic f(Ljh/g;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Ljh/g;->t(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic g(Ljh/g;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Ljh/g;->d:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic h(Ljh/g;)Lih/p;
    .locals 0

    invoke-direct {p0}, Ljh/g;->o()Lih/p;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Ljh/g;)Ljh/j;
    .locals 0

    iget-object p0, p0, Ljh/g;->b:Ljh/j;

    return-object p0
.end method

.method static synthetic j(Ljh/g;Z)Z
    .locals 0

    iput-boolean p1, p0, Ljh/g;->g:Z

    return p1
.end method

.method static synthetic k(Ljh/g;)Ljh/k;
    .locals 0

    iget-object p0, p0, Ljh/g;->a:Ljh/k;

    return-object p0
.end method

.method private o()Lih/p;
    .locals 1

    iget-object v0, p0, Ljh/g;->c:Ljh/h;

    invoke-virtual {v0}, Ljh/h;->h()Lih/p;

    move-result-object v0

    return-object v0
.end method

.method private synthetic q(Ljh/p;)V
    .locals 1

    iget-object v0, p0, Ljh/g;->c:Ljh/h;

    invoke-virtual {v0, p1}, Ljh/h;->m(Ljh/p;)V

    return-void
.end method

.method private synthetic r(Ljh/p;)V
    .locals 2

    iget-boolean v0, p0, Ljh/g;->f:Z

    if-nez v0, :cond_0

    sget-object p1, Ljh/g;->n:Ljava/lang/String;

    const-string v0, "Camera is closed, not requesting preview"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    new-instance v1, Ljh/f;

    invoke-direct {v1, p0, p1}, Ljh/f;-><init>(Ljh/g;Ljh/p;)V

    invoke-virtual {v0, v1}, Ljh/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic s(Z)V
    .locals 1

    iget-object v0, p0, Ljh/g;->c:Ljh/h;

    invoke-virtual {v0, p1}, Ljh/h;->t(Z)V

    return-void
.end method

.method private t(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Ljh/g;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget v1, Lig/k;->d:I

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 2

    invoke-static {}, Lih/r;->a()V

    iget-boolean v0, p0, Ljh/g;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    new-instance v1, Ljh/d;

    invoke-direct {v1, p0, p1}, Ljh/d;-><init>(Ljh/g;Z)V

    invoke-virtual {v0, v1}, Ljh/k;->c(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 2

    invoke-static {}, Lih/r;->a()V

    invoke-direct {p0}, Ljh/g;->C()V

    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    iget-object v1, p0, Ljh/g;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljh/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public l()V
    .locals 2

    invoke-static {}, Lih/r;->a()V

    iget-boolean v0, p0, Ljh/g;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    iget-object v1, p0, Ljh/g;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljh/k;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljh/g;->g:Z

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljh/g;->f:Z

    return-void
.end method

.method public m()V
    .locals 2

    invoke-static {}, Lih/r;->a()V

    invoke-direct {p0}, Ljh/g;->C()V

    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    iget-object v1, p0, Ljh/g;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljh/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n()Ljh/m;
    .locals 1

    iget-object v0, p0, Ljh/g;->e:Ljh/m;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Ljh/g;->g:Z

    return v0
.end method

.method public u()V
    .locals 2

    invoke-static {}, Lih/r;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljh/g;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljh/g;->g:Z

    iget-object v0, p0, Ljh/g;->a:Ljh/k;

    iget-object v1, p0, Ljh/g;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljh/k;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public v(Ljh/p;)V
    .locals 2

    iget-object v0, p0, Ljh/g;->h:Landroid/os/Handler;

    new-instance v1, Ljh/e;

    invoke-direct {v1, p0, p1}, Ljh/e;-><init>(Ljh/g;Ljh/p;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w(Ljh/i;)V
    .locals 1

    iget-boolean v0, p0, Ljh/g;->f:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Ljh/g;->i:Ljh/i;

    iget-object v0, p0, Ljh/g;->c:Ljh/h;

    invoke-virtual {v0, p1}, Ljh/h;->o(Ljh/i;)V

    :cond_0
    return-void
.end method

.method public x(Ljh/m;)V
    .locals 1

    iput-object p1, p0, Ljh/g;->e:Ljh/m;

    iget-object v0, p0, Ljh/g;->c:Ljh/h;

    invoke-virtual {v0, p1}, Ljh/h;->q(Ljh/m;)V

    return-void
.end method

.method public y(Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Ljh/g;->d:Landroid/os/Handler;

    return-void
.end method

.method public z(Ljh/j;)V
    .locals 0

    iput-object p1, p0, Ljh/g;->b:Ljh/j;

    return-void
.end method
