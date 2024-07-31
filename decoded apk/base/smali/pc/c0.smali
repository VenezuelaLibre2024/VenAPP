.class Lpc/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/b;
.implements Lee/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lee/b<",
        "TT;>;",
        "Lee/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final c:Lee/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/a$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lee/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile b:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc/z;

    invoke-direct {v0}, Lpc/z;-><init>()V

    sput-object v0, Lpc/c0;->c:Lee/a$a;

    new-instance v0, Lpc/a0;

    invoke-direct {v0}, Lpc/a0;-><init>()V

    sput-object v0, Lpc/c0;->d:Lee/b;

    return-void
.end method

.method private constructor <init>(Lee/a$a;Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a$a<",
            "TT;>;",
            "Lee/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/c0;->a:Lee/a$a;

    iput-object p2, p0, Lpc/c0;->b:Lee/b;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lpc/c0;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lee/b;)V
    .locals 0

    invoke-static {p0}, Lpc/c0;->f(Lee/b;)V

    return-void
.end method

.method public static synthetic d(Lee/a$a;Lee/a$a;Lee/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpc/c0;->h(Lee/a$a;Lee/a$a;Lee/b;)V

    return-void
.end method

.method static e()Lpc/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lpc/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpc/c0;

    sget-object v1, Lpc/c0;->c:Lee/a$a;

    sget-object v2, Lpc/c0;->d:Lee/b;

    invoke-direct {v0, v1, v2}, Lpc/c0;-><init>(Lee/a$a;Lee/b;)V

    return-object v0
.end method

.method private static synthetic f(Lee/b;)V
    .locals 0

    return-void
.end method

.method private static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static synthetic h(Lee/a$a;Lee/a$a;Lee/b;)V
    .locals 0

    invoke-interface {p0, p2}, Lee/a$a;->a(Lee/b;)V

    invoke-interface {p1, p2}, Lee/a$a;->a(Lee/b;)V

    return-void
.end method

.method static i(Lee/b;)Lpc/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lee/b<",
            "TT;>;)",
            "Lpc/c0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpc/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lpc/c0;-><init>(Lee/a$a;Lee/b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lee/a$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/a$a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpc/c0;->b:Lee/b;

    sget-object v1, Lpc/c0;->d:Lee/b;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Lee/a$a;->a(Lee/b;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpc/c0;->b:Lee/b;

    if-eq v0, v1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lpc/c0;->a:Lee/a$a;

    new-instance v2, Lpc/b0;

    invoke-direct {v2, v1, p1}, Lpc/b0;-><init>(Lee/a$a;Lee/a$a;)V

    iput-object v2, p0, Lpc/c0;->a:Lee/a$a;

    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Lee/a$a;->a(Lee/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lpc/c0;->b:Lee/b;

    invoke-interface {v0}, Lee/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method j(Lee/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpc/c0;->b:Lee/b;

    sget-object v1, Lpc/c0;->d:Lee/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpc/c0;->a:Lee/a$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lpc/c0;->a:Lee/a$a;

    iput-object p1, p0, Lpc/c0;->b:Lee/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lee/a$a;->a(Lee/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
