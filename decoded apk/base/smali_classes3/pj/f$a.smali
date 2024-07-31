.class final Lpj/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/i;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/f;
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
        "Ljava/lang/Object;",
        "Ldj/i<",
        "TT;>;",
        "Lgj/b;"
    }
.end annotation


# instance fields
.field final a:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:J

.field c:Lim/c;

.field d:J

.field e:Z


# direct methods
.method constructor <init>(Ldj/l;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/f$a;->a:Ldj/l;

    iput-wide p2, p0, Lpj/f$a;->b:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/f$a;->c:Lim/c;

    iget-boolean v0, p0, Lpj/f$a;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/f$a;->e:Z

    iget-object v0, p0, Lpj/f$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lpj/f$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lpj/f$a;->d:J

    iget-wide v2, p0, Lpj/f$a;->b:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/f$a;->e:Z

    iget-object v0, p0, Lpj/f$a;->c:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/f$a;->c:Lim/c;

    iget-object v0, p0, Lpj/f$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lpj/f$a;->d:J

    return-void
.end method

.method public d(Lim/c;)V
    .locals 2

    iget-object v0, p0, Lpj/f$a;->c:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lpj/f$a;->c:Lim/c;

    iget-object v0, p0, Lpj/f$a;->a:Ldj/l;

    invoke-interface {v0, p0}, Ldj/l;->b(Lgj/b;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lpj/f$a;->c:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/f$a;->c:Lim/c;

    return-void
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lpj/f$a;->c:Lim/c;

    sget-object v1, Lwj/g;->CANCELLED:Lwj/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lpj/f$a;->e:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/f$a;->e:Z

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/f$a;->c:Lim/c;

    iget-object v0, p0, Lpj/f$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
