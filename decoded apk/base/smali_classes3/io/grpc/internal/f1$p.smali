.class Lio/grpc/internal/f1$p;
.super Lvi/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/f1$p$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lvi/e0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Lvi/d;

.field final synthetic d:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lvi/d;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lio/grpc/internal/f1;->B()Lvi/e0;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lio/grpc/internal/f1$p$a;

    invoke-direct {p1, p0}, Lio/grpc/internal/f1$p$a;-><init>(Lio/grpc/internal/f1$p;)V

    iput-object p1, p0, Lio/grpc/internal/f1$p;->c:Lvi/d;

    const-string p1, "authority"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/grpc/internal/f1$p;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Ljava/lang/String;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$p;-><init>(Lio/grpc/internal/f1;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i(Lio/grpc/internal/f1$p;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method static synthetic j(Lio/grpc/internal/f1$p;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$p;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic k(Lio/grpc/internal/f1$p;Lvi/x0;Lvi/c;)Lvi/g;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$p;->l(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p0

    return-object p0
.end method

.method private l(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lvi/e0;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/grpc/internal/f1$p;->c:Lvi/d;

    invoke-virtual {v0, p1, p2}, Lvi/d;->h(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, v2, Lio/grpc/internal/i1$c;

    if-eqz v0, :cond_2

    check-cast v2, Lio/grpc/internal/i1$c;

    iget-object v0, v2, Lio/grpc/internal/i1$c;->b:Lio/grpc/internal/i1;

    invoke-virtual {v0, p1}, Lio/grpc/internal/i1;->f(Lvi/x0;)Lio/grpc/internal/i1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lio/grpc/internal/i1$b;->g:Lvi/c$c;

    invoke-virtual {p2, v1, v0}, Lvi/c;->q(Lvi/c$c;Ljava/lang/Object;)Lvi/c;

    move-result-object p2

    goto :goto_0

    :cond_2
    new-instance v0, Lio/grpc/internal/f1$h;

    iget-object v3, p0, Lio/grpc/internal/f1$p;->c:Lvi/d;

    iget-object v1, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->M(Lio/grpc/internal/f1;)Ljava/util/concurrent/Executor;

    move-result-object v4

    move-object v1, v0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lio/grpc/internal/f1$h;-><init>(Lvi/e0;Lvi/d;Ljava/util/concurrent/Executor;Lvi/x0;Lvi/c;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$p;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->B()Lvi/e0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$p;->l(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$p$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$p$b;-><init>(Lio/grpc/internal/f1$p;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->B()Lvi/e0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$p;->l(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->n(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lio/grpc/internal/f1$p$c;

    invoke-direct {p1, p0}, Lio/grpc/internal/f1$p$c;-><init>(Lio/grpc/internal/f1$p;)V

    return-object p1

    :cond_2
    invoke-static {}, Lvi/r;->e()Lvi/r;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/f1$p$e;

    invoke-direct {v1, p0, v0, p1, p2}, Lio/grpc/internal/f1$p$e;-><init>(Lio/grpc/internal/f1$p;Lvi/r;Lvi/x0;Lvi/c;)V

    iget-object p1, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object p1, p1, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance p2, Lio/grpc/internal/f1$p$d;

    invoke-direct {p2, p0, v1}, Lio/grpc/internal/f1$p$d;-><init>(Lio/grpc/internal/f1$p;Lio/grpc/internal/f1$p$e;)V

    invoke-virtual {p1, p2}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-object v1
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lio/grpc/internal/f1;->B()Lvi/e0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/grpc/internal/f1$p;->n(Lvi/e0;)V

    :cond_0
    return-void
.end method

.method n(Lvi/e0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/e0;

    iget-object v1, p0, Lio/grpc/internal/f1$p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {}, Lio/grpc/internal/f1;->B()Lvi/e0;

    move-result-object p1

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->I(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->I(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/f1$p$e;

    invoke-virtual {v0}, Lio/grpc/internal/f1$p$e;->r()V

    goto :goto_0

    :cond_0
    return-void
.end method
