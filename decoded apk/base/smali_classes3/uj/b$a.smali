.class final Luj/b$a;
.super Ldj/r$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lkj/d;

.field private final b:Lgj/a;

.field private final c:Lkj/d;

.field private final d:Luj/b$c;

.field volatile e:Z


# direct methods
.method constructor <init>(Luj/b$c;)V
    .locals 2

    invoke-direct {p0}, Ldj/r$b;-><init>()V

    iput-object p1, p0, Luj/b$a;->d:Luj/b$c;

    new-instance p1, Lkj/d;

    invoke-direct {p1}, Lkj/d;-><init>()V

    iput-object p1, p0, Luj/b$a;->a:Lkj/d;

    new-instance v0, Lgj/a;

    invoke-direct {v0}, Lgj/a;-><init>()V

    iput-object v0, p0, Luj/b$a;->b:Lgj/a;

    new-instance v1, Lkj/d;

    invoke-direct {v1}, Lkj/d;-><init>()V

    iput-object v1, p0, Luj/b$a;->c:Lkj/d;

    invoke-virtual {v1, p1}, Lkj/d;->b(Lgj/b;)Z

    invoke-virtual {v1, v0}, Lkj/d;->b(Lgj/b;)Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Lgj/b;
    .locals 6

    iget-boolean v0, p0, Luj/b$a;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Luj/b$a;->d:Luj/b$c;

    const-wide/16 v2, 0x0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Luj/b$a;->a:Lkj/d;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Luj/e;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lkj/a;)Luj/h;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lgj/b;
    .locals 6

    iget-boolean v0, p0, Luj/b$a;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Luj/b$a;->d:Luj/b$c;

    iget-object v5, p0, Luj/b$a;->b:Lgj/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Luj/e;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lkj/a;)Luj/h;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Luj/b$a;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Luj/b$a;->e:Z

    iget-object v0, p0, Luj/b$a;->c:Lkj/d;

    invoke-virtual {v0}, Lkj/d;->dispose()V

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Luj/b$a;->e:Z

    return v0
.end method
