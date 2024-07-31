.class final Luj/c$b;
.super Ldj/r$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lgj/a;

.field private final b:Luj/c$a;

.field private final c:Luj/c$c;

.field final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Luj/c$a;)V
    .locals 1

    invoke-direct {p0}, Ldj/r$b;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Luj/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Luj/c$b;->b:Luj/c$a;

    new-instance v0, Lgj/a;

    invoke-direct {v0}, Lgj/a;-><init>()V

    iput-object v0, p0, Luj/c$b;->a:Lgj/a;

    invoke-virtual {p1}, Luj/c$a;->b()Luj/c$c;

    move-result-object p1

    iput-object p1, p0, Luj/c$b;->c:Luj/c$c;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lgj/b;
    .locals 6

    iget-object v0, p0, Luj/c$b;->a:Lgj/a;

    invoke-virtual {v0}, Lgj/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Luj/c$b;->c:Luj/c$c;

    iget-object v5, p0, Luj/c$b;->a:Lgj/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Luj/e;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lkj/a;)Luj/h;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 3

    iget-object v0, p0, Luj/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Luj/c$b;->a:Lgj/a;

    invoke-virtual {v0}, Lgj/a;->dispose()V

    iget-object v0, p0, Luj/c$b;->b:Luj/c$a;

    iget-object v1, p0, Luj/c$b;->c:Luj/c$c;

    invoke-virtual {v0, v1}, Luj/c$a;->d(Luj/c$c;)V

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Luj/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
