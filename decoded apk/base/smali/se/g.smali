.class public Lse/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final f:Lre/a;


# instance fields
.field private final a:Lse/h;

.field private final b:Lcom/google/firebase/perf/util/l;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Lse/g;->f:Lre/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lwe/k;Lcom/google/firebase/perf/util/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lse/g;->d:Z

    iput-boolean v0, p0, Lse/g;->e:Z

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lse/g;->c:Ljava/util/Map;

    iput-object p4, p0, Lse/g;->b:Lcom/google/firebase/perf/util/l;

    invoke-static {p3}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object p3

    invoke-virtual {p3, p1}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    move-result-object p3

    invoke-virtual {p3, p2}, Lse/h;->l(Ljava/lang/String;)Lse/h;

    move-result-object p2

    iput-object p2, p0, Lse/g;->a:Lse/h;

    invoke-virtual {p2}, Lse/h;->n()V

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lse/g;->f:Lre/a;

    const/4 p3, 0x1

    new-array p4, p3, [Ljava/lang/Object;

    aput-object p1, p4, v0

    const-string p1, "HttpMetric feature is disabled. URL %s"

    invoke-virtual {p2, p1, p4}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p3, p0, Lse/g;->e:Z

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lse/g;->d:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lse/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lse/g;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "Exceeds max limit of number of attributes - %d"

    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1, p2}, Lte/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "HttpMetric has been logged already so unable to modify attributes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x2

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lse/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lse/g;->f:Lre/a;

    const-string v5, "Setting attribute \'%s\' to %s on network request \'%s\'"

    new-array v6, v1, [Ljava/lang/Object;

    aput-object p1, v6, v2

    aput-object p2, v6, v3

    iget-object v7, p0, Lse/g;->a:Lse/h;

    invoke-virtual {v7}, Lse/h;->f()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-virtual {v4, v5, v6}, Lre/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v3

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v5, Lse/g;->f:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    aput-object p2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    const-string v0, "Cannot set attribute \'%s\' with value \'%s\' (%s)"

    invoke-virtual {v5, v0, v1}, Lre/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v2, :cond_0

    iget-object v0, p0, Lse/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lse/g;->a:Lse/h;

    invoke-virtual {v0, p1}, Lse/h;->m(I)Lse/h;

    return-void
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lse/g;->a:Lse/h;

    invoke-virtual {v0, p1, p2}, Lse/h;->p(J)Lse/h;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lse/g;->a:Lse/h;

    invoke-virtual {v0, p1}, Lse/h;->s(Ljava/lang/String;)Lse/h;

    return-void
.end method

.method public f(J)V
    .locals 1

    iget-object v0, p0, Lse/g;->a:Lse/h;

    invoke-virtual {v0, p1, p2}, Lse/h;->t(J)Lse/h;

    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lse/g;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v0}, Lcom/google/firebase/perf/util/l;->g()V

    iget-object v0, p0, Lse/g;->a:Lse/h;

    iget-object v1, p0, Lse/g;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->r(J)Lse/h;

    return-void
.end method

.method public h()V
    .locals 3

    iget-boolean v0, p0, Lse/g;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lse/g;->a:Lse/h;

    iget-object v1, p0, Lse/g;->b:Lcom/google/firebase/perf/util/l;

    invoke-virtual {v1}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lse/h;->v(J)Lse/h;

    move-result-object v0

    iget-object v1, p0, Lse/g;->c:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lse/h;->k(Ljava/util/Map;)Lse/h;

    move-result-object v0

    invoke-virtual {v0}, Lse/h;->b()Lxe/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lse/g;->d:Z

    return-void
.end method
