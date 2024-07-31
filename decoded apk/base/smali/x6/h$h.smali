.class Lx6/h$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lx6/h;


# direct methods
.method private constructor <init>(Lx6/h;)V
    .locals 0

    iput-object p1, p0, Lx6/h$h;->a:Lx6/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx6/h;Lx6/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx6/h$h;-><init>(Lx6/h;)V

    return-void
.end method

.method public static synthetic c(Lx6/g;)V
    .locals 0

    invoke-static {p0}, Lx6/h$h;->d(Lx6/g;)V

    return-void
.end method

.method private static synthetic d(Lx6/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lx6/g;->d(Lx6/u$a;)V

    return-void
.end method


# virtual methods
.method public a(Lx6/g;I)V
    .locals 5

    const/4 v0, 0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {v0}, Lx6/h;->q(Lx6/h;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {v0}, Lx6/h;->n(Lx6/h;)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->o(Lx6/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->p(Lx6/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    new-instance v0, Lx6/k;

    invoke-direct {v0, p1}, Lx6/k;-><init>(Lx6/g;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {v3}, Lx6/h;->n(Lx6/h;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->m(Lx6/h;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->r(Lx6/h;)Lx6/g;

    move-result-object p2

    const/4 v0, 0x0

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2, v0}, Lx6/h;->s(Lx6/h;Lx6/g;)Lx6/g;

    :cond_1
    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->f(Lx6/h;)Lx6/g;

    move-result-object p2

    if-ne p2, p1, :cond_2

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2, v0}, Lx6/h;->g(Lx6/h;Lx6/g;)Lx6/g;

    :cond_2
    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->h(Lx6/h;)Lx6/h$g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx6/h$g;->d(Lx6/g;)V

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->n(Lx6/h;)J

    move-result-wide v3

    cmp-long p2, v3, v1

    if-eqz p2, :cond_3

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->p(Lx6/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->o(Lx6/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    iget-object p1, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p1}, Lx6/h;->i(Lx6/h;)V

    return-void
.end method

.method public b(Lx6/g;I)V
    .locals 4

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->n(Lx6/h;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->o(Lx6/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lx6/h$h;->a:Lx6/h;

    invoke-static {p2}, Lx6/h;->p(Lx6/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
