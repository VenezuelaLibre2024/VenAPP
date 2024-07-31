.class final Lv7/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ly6/p;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Leb/v<",
            "Lv7/a0$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lv7/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ls8/j$a;

.field private f:Lx6/x;

.field private g:Ls8/d0;


# direct methods
.method public constructor <init>(Ly6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/q$a;->a:Ly6/p;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lv7/q$a;->b:Ljava/util/Map;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lv7/q$a;->c:Ljava/util/Set;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lv7/q$a;->d:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Class;)Lv7/a0$a;
    .locals 0

    invoke-static {p0}, Lv7/q$a;->j(Ljava/lang/Class;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q$a;->h(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q$a;->g(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q$a;->i(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lv7/q$a;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-direct {p0, p1}, Lv7/q$a;->k(Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q;->f(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic h(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q;->f(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic i(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;
    .locals 0

    invoke-static {p0, p1}, Lv7/q;->f(Ljava/lang/Class;Ls8/j$a;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic j(Ljava/lang/Class;)Lv7/a0$a;
    .locals 0

    invoke-static {p0}, Lv7/q;->e(Ljava/lang/Class;)Lv7/a0$a;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k(Ls8/j$a;)Lv7/a0$a;
    .locals 2

    new-instance v0, Lv7/q0$b;

    iget-object v1, p0, Lv7/q$a;->a:Ly6/p;

    invoke-direct {v0, p1, v1}, Lv7/q0$b;-><init>(Ls8/j$a;Ly6/p;)V

    return-object v0
.end method

.method private l(I)Leb/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Leb/v<",
            "Lv7/a0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv7/q$a;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv7/q$a;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/v;

    return-object p1

    :cond_0
    iget-object v0, p0, Lv7/q$a;->e:Ls8/j$a;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/j$a;

    const-class v1, Lv7/a0$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    const/4 v3, 0x1

    if-eq p1, v3, :cond_4

    const/4 v3, 0x2

    if-eq p1, v3, :cond_3

    const/4 v3, 0x3

    if-eq p1, v3, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    new-instance v1, Lv7/p;

    invoke-direct {v1, p0, v0}, Lv7/p;-><init>(Lv7/q$a;Ls8/j$a;)V

    :goto_0
    move-object v2, v1

    goto :goto_2

    :cond_2
    const-class v0, Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource$Factory;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lv7/o;

    invoke-direct {v1, v0}, Lv7/o;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    const-class v3, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    new-instance v3, Lv7/n;

    invoke-direct {v3, v1, v0}, Lv7/n;-><init>(Ljava/lang/Class;Ls8/j$a;)V

    goto :goto_1

    :cond_4
    const-class v3, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    new-instance v3, Lv7/m;

    invoke-direct {v3, v1, v0}, Lv7/m;-><init>(Ljava/lang/Class;Ls8/j$a;)V

    goto :goto_1

    :cond_5
    const-class v3, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    new-instance v3, Lv7/l;

    invoke-direct {v3, v1, v0}, Lv7/l;-><init>(Ljava/lang/Class;Ls8/j$a;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v2, v3

    :catch_0
    :goto_2
    iget-object v0, p0, Lv7/q$a;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_6

    iget-object v0, p0, Lv7/q$a;->c:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v2
.end method


# virtual methods
.method public f(I)Lv7/a0$a;
    .locals 2

    iget-object v0, p0, Lv7/q$a;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lv7/q$a;->l(I)Leb/v;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {v0}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0$a;

    iget-object v1, p0, Lv7/q$a;->f:Lx6/x;

    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Lv7/a0$a;->b(Lx6/x;)Lv7/a0$a;

    :cond_2
    iget-object v1, p0, Lv7/q$a;->g:Ls8/d0;

    if-eqz v1, :cond_3

    invoke-interface {v0, v1}, Lv7/a0$a;->c(Ls8/d0;)Lv7/a0$a;

    :cond_3
    iget-object v1, p0, Lv7/q$a;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public m(Ls8/j$a;)V
    .locals 1

    iget-object v0, p0, Lv7/q$a;->e:Ls8/j$a;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lv7/q$a;->e:Ls8/j$a;

    iget-object p1, p0, Lv7/q$a;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lv7/q$a;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    :cond_0
    return-void
.end method

.method public n(Lx6/x;)V
    .locals 2

    iput-object p1, p0, Lv7/q$a;->f:Lx6/x;

    iget-object v0, p0, Lv7/q$a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/a0$a;

    invoke-interface {v1, p1}, Lv7/a0$a;->b(Lx6/x;)Lv7/a0$a;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Ls8/d0;)V
    .locals 2

    iput-object p1, p0, Lv7/q$a;->g:Ls8/d0;

    iget-object v0, p0, Lv7/q$a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/a0$a;

    invoke-interface {v1, p1}, Lv7/a0$a;->c(Ls8/d0;)Lv7/a0$a;

    goto :goto_0

    :cond_0
    return-void
.end method
