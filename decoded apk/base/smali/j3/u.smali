.class final Lj3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/v;
.implements Ld4/a$f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj3/v<",
        "TZ;>;",
        "Ld4/a$f;"
    }
.end annotation


# static fields
.field private static final e:Landroidx/core/util/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/e<",
            "Lj3/u<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ld4/c;

.field private b:Lj3/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj3/v<",
            "TZ;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj3/u$a;

    invoke-direct {v0}, Lj3/u$a;-><init>()V

    const/16 v1, 0x14

    invoke-static {v1, v0}, Ld4/a;->d(ILd4/a$d;)Landroidx/core/util/e;

    move-result-object v0

    sput-object v0, Lj3/u;->e:Landroidx/core/util/e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ld4/c;->a()Ld4/c;

    move-result-object v0

    iput-object v0, p0, Lj3/u;->a:Ld4/c;

    return-void
.end method

.method private a(Lj3/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TZ;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj3/u;->d:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/u;->c:Z

    iput-object p1, p0, Lj3/u;->b:Lj3/v;

    return-void
.end method

.method static b(Lj3/v;)Lj3/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lj3/v<",
            "TZ;>;)",
            "Lj3/u<",
            "TZ;>;"
        }
    .end annotation

    sget-object v0, Lj3/u;->e:Landroidx/core/util/e;

    invoke-interface {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj3/u;

    invoke-static {v0}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj3/u;

    invoke-direct {v0, p0}, Lj3/u;->a(Lj3/v;)V

    return-object v0
.end method

.method private c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lj3/u;->b:Lj3/v;

    sget-object v0, Lj3/u;->e:Landroidx/core/util/e;

    invoke-interface {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/u;->a:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    iget-boolean v0, p0, Lj3/u;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj3/u;->c:Z

    iget-boolean v0, p0, Lj3/u;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj3/u;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    iget-object v0, p0, Lj3/u;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h()Ld4/c;
    .locals 1

    iget-object v0, p0, Lj3/u;->a:Ld4/c;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lj3/u;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->p()I

    move-result v0

    return v0
.end method

.method public declared-synchronized q()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj3/u;->a:Ld4/c;

    invoke-virtual {v0}, Ld4/c;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj3/u;->d:Z

    iget-boolean v0, p0, Lj3/u;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj3/u;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->q()V

    invoke-direct {p0}, Lj3/u;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public r()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lj3/u;->b:Lj3/v;

    invoke-interface {v0}, Lj3/v;->r()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
