.class final Lrj/f$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lgj/b;",
        ">;",
        "Ldj/q<",
        "TU;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3fec6c572fe7d027L


# instance fields
.field final a:J

.field final b:Lrj/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrj/f$b<",
            "TT;TU;>;"
        }
    .end annotation
.end field

.field volatile c:Z

.field volatile d:Lmj/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/j<",
            "TU;>;"
        }
    .end annotation
.end field

.field e:I


# direct methods
.method constructor <init>(Lrj/f$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/f$b<",
            "TT;TU;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p2, p0, Lrj/f$a;->a:J

    iput-object p1, p0, Lrj/f$a;->b:Lrj/f$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/f$a;->c:Z

    iget-object v0, p0, Lrj/f$a;->b:Lrj/f$b;

    invoke-virtual {v0}, Lrj/f$b;->g()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 2

    invoke-static {p0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lmj/e;

    if-eqz v0, :cond_1

    check-cast p1, Lmj/e;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lmj/f;->l(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Lrj/f$a;->e:I

    iput-object p1, p0, Lrj/f$a;->d:Lmj/j;

    iput-boolean v1, p0, Lrj/f$a;->c:Z

    iget-object p1, p0, Lrj/f$a;->b:Lrj/f$b;

    invoke-virtual {p1}, Lrj/f$b;->g()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Lrj/f$a;->e:I

    iput-object p1, p0, Lrj/f$a;->d:Lmj/j;

    :cond_1
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iget v0, p0, Lrj/f$a;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lrj/f$a;->b:Lrj/f$b;

    invoke-virtual {v0, p1, p0}, Lrj/f$b;->l(Ljava/lang/Object;Lrj/f$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrj/f$a;->b:Lrj/f$b;

    invoke-virtual {p1}, Lrj/f$b;->g()V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 0

    invoke-static {p0}, Lkj/b;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrj/f$a;->b:Lrj/f$b;

    iget-object v0, v0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v0, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lrj/f$a;->b:Lrj/f$b;

    iget-boolean v0, p1, Lrj/f$b;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lrj/f$b;->f()Z

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lrj/f$a;->c:Z

    iget-object p1, p0, Lrj/f$a;->b:Lrj/f$b;

    invoke-virtual {p1}, Lrj/f$b;->g()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
