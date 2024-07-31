.class public abstract Lr1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr1/u;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Lck/h;


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/d0;->a:Lr1/u;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lr1/d0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lr1/d0$a;

    invoke-direct {p1, p0}, Lr1/d0$a;-><init>(Lr1/d0;)V

    invoke-static {p1}, Lck/i;->a(Lok/a;)Lck/h;

    move-result-object p1

    iput-object p1, p0, Lr1/d0;->c:Lck/h;

    return-void
.end method

.method public static final synthetic a(Lr1/d0;)Lv1/m;
    .locals 0

    invoke-direct {p0}, Lr1/d0;->d()Lv1/m;

    move-result-object p0

    return-object p0
.end method

.method private final d()Lv1/m;
    .locals 2

    invoke-virtual {p0}, Lr1/d0;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lr1/d0;->a:Lr1/u;

    invoke-virtual {v1, v0}, Lr1/u;->f(Ljava/lang/String;)Lv1/m;

    move-result-object v0

    return-object v0
.end method

.method private final f()Lv1/m;
    .locals 1

    iget-object v0, p0, Lr1/d0;->c:Lck/h;

    invoke-interface {v0}, Lck/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv1/m;

    return-object v0
.end method

.method private final g(Z)Lv1/m;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lr1/d0;->f()Lv1/m;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lr1/d0;->d()Lv1/m;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public b()Lv1/m;
    .locals 3

    invoke-virtual {p0}, Lr1/d0;->c()V

    iget-object v0, p0, Lr1/d0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lr1/d0;->g(Z)Lv1/m;

    move-result-object v0

    return-object v0
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Lr1/d0;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->c()V

    return-void
.end method

.method protected abstract e()Ljava/lang/String;
.end method

.method public h(Lv1/m;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lr1/d0;->f()Lv1/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lr1/d0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
