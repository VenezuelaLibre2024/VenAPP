.class public Lzd/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzd/u2;

.field private final b:Landroid/app/Application;

.field private final c:Lce/a;

.field private d:Lpf/e;


# direct methods
.method constructor <init>(Lzd/u2;Landroid/app/Application;Lce/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/k;->a:Lzd/u2;

    iput-object p2, p0, Lzd/k;->b:Landroid/app/Application;

    iput-object p3, p0, Lzd/k;->c:Lce/a;

    return-void
.end method

.method public static synthetic a(Lzd/k;)Lpf/e;
    .locals 0

    invoke-direct {p0}, Lzd/k;->h()Lpf/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzd/k;Lpf/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/k;->i(Lpf/e;)V

    return-void
.end method

.method public static synthetic c(Lzd/k;Lpf/e;)Z
    .locals 0

    invoke-direct {p0, p1}, Lzd/k;->g(Lpf/e;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lzd/k;Lpf/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/k;->k(Lpf/e;)V

    return-void
.end method

.method public static synthetic e(Lzd/k;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/k;->j(Ljava/lang/Throwable;)V

    return-void
.end method

.method private g(Lpf/e;)Z
    .locals 9

    invoke-virtual {p1}, Lpf/e;->e0()J

    move-result-wide v0

    iget-object p1, p0, Lzd/k;->c:Lce/a;

    invoke-interface {p1}, Lce/a;->a()J

    move-result-wide v2

    new-instance p1, Ljava/io/File;

    iget-object v4, p0, Lzd/k;->b:Landroid/app/Application;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v5, "fiam_eligible_campaigns_cache_file"

    invoke-direct {p1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    move v5, v6

    :cond_0
    return v5

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    invoke-virtual {p1, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    add-long/2addr v0, v7

    cmp-long p1, v2, v0

    if-gez p1, :cond_2

    move v5, v6

    :cond_2
    return v5

    :cond_3
    return v6
.end method

.method private synthetic h()Lpf/e;
    .locals 1

    iget-object v0, p0, Lzd/k;->d:Lpf/e;

    return-object v0
.end method

.method private synthetic i(Lpf/e;)V
    .locals 0

    iput-object p1, p0, Lzd/k;->d:Lpf/e;

    return-void
.end method

.method private synthetic j(Ljava/lang/Throwable;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lzd/k;->d:Lpf/e;

    return-void
.end method

.method private synthetic k(Lpf/e;)V
    .locals 0

    iput-object p1, p0, Lzd/k;->d:Lpf/e;

    return-void
.end method


# virtual methods
.method public f()Ldj/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/j<",
            "Lpf/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzd/f;

    invoke-direct {v0, p0}, Lzd/f;-><init>(Lzd/k;)V

    invoke-static {v0}, Ldj/j;->l(Ljava/util/concurrent/Callable;)Ldj/j;

    move-result-object v0

    iget-object v1, p0, Lzd/k;->a:Lzd/u2;

    invoke-static {}, Lpf/e;->h0()Lcom/google/protobuf/z0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lzd/u2;->e(Lcom/google/protobuf/z0;)Ldj/j;

    move-result-object v1

    new-instance v2, Lzd/g;

    invoke-direct {v2, p0}, Lzd/g;-><init>(Lzd/k;)V

    invoke-virtual {v1, v2}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/h;

    invoke-direct {v1, p0}, Lzd/h;-><init>(Lzd/k;)V

    invoke-virtual {v0, v1}, Ldj/j;->h(Ljj/g;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/i;

    invoke-direct {v1, p0}, Lzd/i;-><init>(Lzd/k;)V

    invoke-virtual {v0, v1}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method public l(Lpf/e;)Ldj/b;
    .locals 2

    iget-object v0, p0, Lzd/k;->a:Lzd/u2;

    invoke-virtual {v0, p1}, Lzd/u2;->f(Lcom/google/protobuf/a;)Ldj/b;

    move-result-object v0

    new-instance v1, Lzd/j;

    invoke-direct {v1, p0, p1}, Lzd/j;-><init>(Lzd/k;Lpf/e;)V

    invoke-virtual {v0, v1}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method
