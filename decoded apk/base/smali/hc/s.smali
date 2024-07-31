.class public final Lhc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lhc/m;

.field private final b:Lic/a;

.field private volatile c:Z

.field private volatile d:I

.field private volatile e:J

.field private volatile f:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lhc/j;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Ldc/b;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, Lhc/m;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhc/j;

    invoke-direct {v0, p2, p3, p4}, Lhc/m;-><init>(Lhc/j;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance p2, Lic/a$a;

    invoke-direct {p2}, Lic/a$a;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Lhc/s;-><init>(Landroid/content/Context;Lhc/m;Lic/a;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lhc/m;Lic/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhc/s;->a:Lhc/m;

    iput-object p3, p0, Lhc/s;->b:Lic/a;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lhc/s;->e:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->b()Lcom/google/android/gms/common/api/internal/c;

    move-result-object p1

    new-instance v0, Lhc/s$a;

    invoke-direct {v0, p0, p2, p3}, Lhc/s$a;-><init>(Lhc/s;Lhc/m;Lic/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/c;->a(Lcom/google/android/gms/common/api/internal/c$a;)V

    return-void
.end method

.method static synthetic a(Lhc/s;Z)Z
    .locals 0

    iput-boolean p1, p0, Lhc/s;->c:Z

    return p1
.end method

.method static synthetic b(Lhc/s;)Z
    .locals 0

    invoke-direct {p0}, Lhc/s;->g()Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lhc/s;)J
    .locals 2

    iget-wide v0, p0, Lhc/s;->e:J

    return-wide v0
.end method

.method private g()Z
    .locals 4

    iget-boolean v0, p0, Lhc/s;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lhc/s;->c:Z

    if-nez v0, :cond_0

    iget v0, p0, Lhc/s;->d:I

    if-lez v0, :cond_0

    iget-wide v0, p0, Lhc/s;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public d(Lec/c;)V
    .locals 6

    instance-of v0, p1, Lhc/b;

    if-eqz v0, :cond_0

    check-cast p1, Lhc/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lec/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lhc/b;->d(Ljava/lang/String;)Lhc/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lhc/b;->h()J

    move-result-wide v0

    invoke-virtual {p1}, Lhc/b;->f()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    double-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lhc/s;->e:J

    iget-wide v0, p0, Lhc/s;->e:J

    invoke-virtual {p1}, Lhc/b;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lhc/b;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lhc/s;->e:J

    :cond_1
    invoke-direct {p0}, Lhc/s;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lhc/s;->a:Lhc/m;

    iget-wide v0, p0, Lhc/s;->e:J

    iget-object v2, p0, Lhc/s;->b:Lic/a;

    invoke-interface {v2}, Lic/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lhc/m;->g(J)V

    :cond_2
    return-void
.end method

.method public e(I)V
    .locals 5

    iget v0, p0, Lhc/s;->d:I

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    iput p1, p0, Lhc/s;->d:I

    invoke-direct {p0}, Lhc/s;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhc/s;->a:Lhc/m;

    iget-wide v1, p0, Lhc/s;->e:J

    iget-object v3, p0, Lhc/s;->b:Lic/a;

    invoke-interface {v3}, Lic/a;->a()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lhc/m;->g(J)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lhc/s;->d:I

    if-lez v0, :cond_1

    if-nez p1, :cond_1

    iget-object v0, p0, Lhc/s;->a:Lhc/m;

    invoke-virtual {v0}, Lhc/m;->c()V

    :cond_1
    :goto_0
    iput p1, p0, Lhc/s;->d:I

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lhc/s;->f:Z

    return-void
.end method
