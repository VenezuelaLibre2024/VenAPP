.class public final Lx0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lzk/k0;

.field private final b:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "TT;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lbl/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbl/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lzk/k0;Lok/l;Lok/p;Lok/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/k0;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;",
            "Lok/p<",
            "-TT;-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;",
            "Lok/p<",
            "-TT;-",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onComplete"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUndeliveredElement"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumeMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/l;->a:Lzk/k0;

    iput-object p4, p0, Lx0/l;->b:Lok/p;

    const/4 p4, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    invoke-static {v1, p4, p4, v0, p4}, Lbl/f;->b(ILbl/a;Lok/l;ILjava/lang/Object;)Lbl/d;

    move-result-object p4

    iput-object p4, p0, Lx0/l;->c:Lbl/d;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p4, p0, Lx0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {p1}, Lzk/k0;->h()Lgk/f;

    move-result-object p1

    sget-object p4, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p1, p4}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    check-cast p1, Lzk/w1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p4, Lx0/l$a;

    invoke-direct {p4, p2, p0, p3}, Lx0/l$a;-><init>(Lok/l;Lx0/l;Lok/p;)V

    invoke-interface {p1, p4}, Lzk/w1;->R(Lok/l;)Lzk/c1;

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lx0/l;)Lok/p;
    .locals 0

    iget-object p0, p0, Lx0/l;->b:Lok/p;

    return-object p0
.end method

.method public static final synthetic b(Lx0/l;)Lbl/d;
    .locals 0

    iget-object p0, p0, Lx0/l;->c:Lbl/d;

    return-object p0
.end method

.method public static final synthetic c(Lx0/l;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lx0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic d(Lx0/l;)Lzk/k0;
    .locals 0

    iget-object p0, p0, Lx0/l;->a:Lzk/k0;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/l;->c:Lbl/d;

    invoke-interface {v0, p1}, Lbl/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lbl/g$a;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lbl/g;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lbl/k;

    const-string v0, "Channel was closed normally"

    invoke-direct {p1, v0}, Lbl/k;-><init>(Ljava/lang/String;)V

    :cond_0
    throw p1

    :cond_1
    invoke-static {p1}, Lbl/g;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lx0/l;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_2

    iget-object v0, p0, Lx0/l;->a:Lzk/k0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lx0/l$b;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lx0/l$b;-><init>(Lx0/l;Lgk/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
