.class public Lk/c;
.super Lk/f;
.source "SourceFile"


# static fields
.field private static volatile c:Lk/c;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Lk/f;

.field private final b:Lk/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/a;

    invoke-direct {v0}, Lk/a;-><init>()V

    sput-object v0, Lk/c;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lk/b;

    invoke-direct {v0}, Lk/b;-><init>()V

    sput-object v0, Lk/c;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk/f;-><init>()V

    new-instance v0, Lk/d;

    invoke-direct {v0}, Lk/d;-><init>()V

    iput-object v0, p0, Lk/c;->b:Lk/f;

    iput-object v0, p0, Lk/c;->a:Lk/f;

    return-void
.end method

.method public static synthetic e(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lk/c;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lk/c;->i(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static g()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lk/c;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static h()Lk/c;
    .locals 2

    sget-object v0, Lk/c;->c:Lk/c;

    if-eqz v0, :cond_0

    sget-object v0, Lk/c;->c:Lk/c;

    return-object v0

    :cond_0
    const-class v0, Lk/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lk/c;->c:Lk/c;

    if-nez v1, :cond_1

    new-instance v1, Lk/c;

    invoke-direct {v1}, Lk/c;-><init>()V

    sput-object v1, Lk/c;->c:Lk/c;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lk/c;->c:Lk/c;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static synthetic i(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lk/c;->h()Lk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lk/c;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static synthetic j(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lk/c;->h()Lk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lk/c;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/f;

    invoke-virtual {v0, p1}, Lk/f;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/f;

    invoke-virtual {v0}, Lk/f;->c()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/f;

    invoke-virtual {v0, p1}, Lk/f;->d(Ljava/lang/Runnable;)V

    return-void
.end method
