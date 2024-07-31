.class public Lx6/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/u$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lv7/a0$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lx6/u$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lx6/u$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lx6/u$a$a;",
            ">;I",
            "Lv7/a0$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lx6/u$a;->a:I

    iput-object p3, p0, Lx6/u$a;->b:Lv7/a0$b;

    return-void
.end method

.method public static synthetic a(Lx6/u$a;Lx6/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/u$a;->s(Lx6/u;)V

    return-void
.end method

.method public static synthetic b(Lx6/u$a;Lx6/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/u$a;->o(Lx6/u;)V

    return-void
.end method

.method public static synthetic c(Lx6/u$a;Lx6/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/u$a;->n(Lx6/u;)V

    return-void
.end method

.method public static synthetic d(Lx6/u$a;Lx6/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/u$a;->p(Lx6/u;)V

    return-void
.end method

.method public static synthetic e(Lx6/u$a;Lx6/u;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx6/u$a;->r(Lx6/u;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic f(Lx6/u$a;Lx6/u;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx6/u$a;->q(Lx6/u;I)V

    return-void
.end method

.method private synthetic n(Lx6/u;)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1}, Lx6/u;->u(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic o(Lx6/u;)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1}, Lx6/u;->B(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic p(Lx6/u;)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1}, Lx6/u;->C(ILv7/a0$b;)V

    return-void
.end method

.method private synthetic q(Lx6/u;I)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1}, Lx6/u;->A(ILv7/a0$b;)V

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2}, Lx6/u;->J(ILv7/a0$b;I)V

    return-void
.end method

.method private synthetic r(Lx6/u;Ljava/lang/Exception;)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1, p2}, Lx6/u;->I(ILv7/a0$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Lx6/u;)V
    .locals 2

    iget v0, p0, Lx6/u$a;->a:I

    iget-object v1, p0, Lx6/u$a;->b:Lv7/a0$b;

    invoke-interface {p1, v0, v1}, Lx6/u;->y(ILv7/a0$b;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/os/Handler;Lx6/u;)V
    .locals 2

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lx6/u$a$a;

    invoke-direct {v1, p1, p2}, Lx6/u$a$a;-><init>(Landroid/os/Handler;Lx6/u;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/s;

    invoke-direct {v3, p0, v2}, Lx6/s;-><init>(Lx6/u$a;Lx6/u;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/r;

    invoke-direct {v3, p0, v2}, Lx6/r;-><init>(Lx6/u$a;Lx6/u;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/t;

    invoke-direct {v3, p0, v2}, Lx6/t;-><init>(Lx6/u$a;Lx6/u;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(I)V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/q;

    invoke-direct {v3, p0, v2, p1}, Lx6/q;-><init>(Lx6/u$a;Lx6/u;I)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/p;

    invoke-direct {v3, p0, v2, p1}, Lx6/p;-><init>(Lx6/u$a;Lx6/u;Ljava/lang/Exception;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    iget-object v1, v1, Lx6/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lx6/o;

    invoke-direct {v3, p0, v2}, Lx6/o;-><init>(Lx6/u$a;Lx6/u;)V

    invoke-static {v1, v3}, Lt8/r0;->L0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lx6/u;)V
    .locals 3

    iget-object v0, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/u$a$a;

    iget-object v2, v1, Lx6/u$a$a;->b:Lx6/u;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(ILv7/a0$b;)Lx6/u$a;
    .locals 2

    new-instance v0, Lx6/u$a;

    iget-object v1, p0, Lx6/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Lx6/u$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILv7/a0$b;)V

    return-object v0
.end method
