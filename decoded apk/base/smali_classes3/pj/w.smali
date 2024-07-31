.class public final Lpj/w;
.super Lij/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/w$a;,
        Lpj/w$b;,
        Lpj/w$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lij/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Ldj/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpj/w$c<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field final d:I

.field final e:Lim/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lim/a<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lim/a;Ldj/f;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/a<",
            "TT;>;",
            "Ldj/f<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpj/w$c<",
            "TT;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Lij/a;-><init>()V

    iput-object p1, p0, Lpj/w;->e:Lim/a;

    iput-object p2, p0, Lpj/w;->b:Ldj/f;

    iput-object p3, p0, Lpj/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iput p4, p0, Lpj/w;->d:I

    return-void
.end method

.method public static M(Ldj/f;I)Lij/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/f<",
            "TT;>;I)",
            "Lij/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Lpj/w$a;

    invoke-direct {v1, v0, p1}, Lpj/w$a;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    new-instance v2, Lpj/w;

    invoke-direct {v2, v1, p0, v0, p1}, Lpj/w;-><init>(Lim/a;Ldj/f;Ljava/util/concurrent/atomic/AtomicReference;I)V

    invoke-static {v2}, Lyj/a;->o(Lij/a;)Lij/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/w;->e:Lim/a;

    invoke-interface {v0, p1}, Lim/a;->a(Lim/b;)V

    return-void
.end method

.method public L(Ljj/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;)V"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lpj/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpj/w$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpj/w$c;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    new-instance v1, Lpj/w$c;

    iget-object v2, p0, Lpj/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iget v3, p0, Lpj/w;->d:I

    invoke-direct {v1, v2, v3}, Lpj/w$c;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    iget-object v2, p0, Lpj/w;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Le2/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v1, v0, Lpj/w$c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Lpj/w$c;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    :try_start_0
    invoke-interface {p1, v0}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    iget-object p1, p0, Lpj/w;->b:Ldj/f;

    invoke-virtual {p1, v0}, Ldj/f;->H(Ldj/i;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lxj/g;->d(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
