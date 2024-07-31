.class final Lpj/e$a;
.super Lwj/c;
.source "SourceFile"

# interfaces
.implements Ldj/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwj/c<",
        "TT;>;",
        "Ldj/i<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x386f7dd17fceb6ddL


# instance fields
.field final c:J

.field final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final e:Z

.field f:Lim/c;

.field r:J

.field s:Z


# direct methods
.method constructor <init>(Lim/b;JLjava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;JTT;Z)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwj/c;-><init>(Lim/b;)V

    iput-wide p2, p0, Lpj/e$a;->c:J

    iput-object p4, p0, Lpj/e$a;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lpj/e$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lpj/e$a;->s:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/e$a;->s:Z

    iget-object v0, p0, Lpj/e$a;->d:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lpj/e$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwj/c;->a:Lim/b;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwj/c;->a:Lim/b;

    invoke-interface {v0}, Lim/b;->a()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lwj/c;->e(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lpj/e$a;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lpj/e$a;->r:J

    iget-wide v2, p0, Lpj/e$a;->c:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/e$a;->s:Z

    iget-object v0, p0, Lpj/e$a;->f:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    invoke-virtual {p0, p1}, Lwj/c;->e(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lpj/e$a;->r:J

    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lwj/c;->cancel()V

    iget-object v0, p0, Lpj/e$a;->f:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    return-void
.end method

.method public d(Lim/c;)V
    .locals 2

    iget-object v0, p0, Lpj/e$a;->f:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lpj/e$a;->f:Lim/c;

    iget-object v0, p0, Lwj/c;->a:Lim/b;

    invoke-interface {v0, p0}, Lim/b;->d(Lim/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lpj/e$a;->s:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/e$a;->s:Z

    iget-object v0, p0, Lwj/c;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
