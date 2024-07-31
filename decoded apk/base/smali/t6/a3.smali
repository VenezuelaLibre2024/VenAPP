.class final Lt6/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/a3$a;,
        Lt6/a3$b;,
        Lt6/a3$c;,
        Lt6/a3$d;
    }
.end annotation


# instance fields
.field private final a:Lu6/m3;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt6/a3$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lv7/y;",
            "Lt6/a3$c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lt6/a3$c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lt6/a3$d;

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lt6/a3$c;",
            "Lt6/a3$b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lt6/a3$c;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lu6/a;

.field private final i:Lt8/o;

.field private j:Lv7/x0;

.field private k:Z

.field private l:Ls8/m0;


# direct methods
.method public constructor <init>(Lt6/a3$d;Lu6/a;Lt8/o;Lu6/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lt6/a3;->a:Lu6/m3;

    iput-object p1, p0, Lt6/a3;->e:Lt6/a3$d;

    new-instance p1, Lv7/x0$a;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Lv7/x0$a;-><init>(I)V

    iput-object p1, p0, Lt6/a3;->j:Lv7/x0;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lt6/a3;->c:Ljava/util/IdentityHashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt6/a3;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt6/a3;->b:Ljava/util/List;

    iput-object p2, p0, Lt6/a3;->h:Lu6/a;

    iput-object p3, p0, Lt6/a3;->i:Lt8/o;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt6/a3;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lt6/a3;->g:Ljava/util/Set;

    return-void
.end method

.method private B(II)V
    .locals 4

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_0
    if-lt p2, p1, :cond_1

    iget-object v1, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a3$c;

    iget-object v2, p0, Lt6/a3;->d:Ljava/util/Map;

    iget-object v3, v1, Lt6/a3$c;->b:Ljava/lang/Object;

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v2}, Lv7/w;->Z()Lt6/d4;

    move-result-object v2

    invoke-virtual {v2}, Lt6/d4;->u()I

    move-result v2

    neg-int v2, v2

    invoke-direct {p0, p2, v2}, Lt6/a3;->g(II)V

    iput-boolean v0, v1, Lt6/a3$c;->e:Z

    iget-boolean v2, p0, Lt6/a3;->k:Z

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Lt6/a3;->u(Lt6/a3$c;)V

    :cond_0
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic a(Lt6/a3;Lv7/a0;Lt6/d4;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/a3;->t(Lv7/a0;Lt6/d4;)V

    return-void
.end method

.method static synthetic b(Lt6/a3;)Lt8/o;
    .locals 0

    iget-object p0, p0, Lt6/a3;->i:Lt8/o;

    return-object p0
.end method

.method static synthetic c(Lt6/a3$c;Lv7/a0$b;)Lv7/a0$b;
    .locals 0

    invoke-static {p0, p1}, Lt6/a3;->n(Lt6/a3$c;Lv7/a0$b;)Lv7/a0$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lt6/a3$c;I)I
    .locals 0

    invoke-static {p0, p1}, Lt6/a3;->r(Lt6/a3$c;I)I

    move-result p0

    return p0
.end method

.method static synthetic e(Lt6/a3;)Lu6/a;
    .locals 0

    iget-object p0, p0, Lt6/a3;->h:Lu6/a;

    return-object p0
.end method

.method private g(II)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    iget v1, v0, Lt6/a3$c;->d:I

    add-int/2addr v1, p2

    iput v1, v0, Lt6/a3$c;->d:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private j(Lt6/a3$c;)V
    .locals 1

    iget-object v0, p0, Lt6/a3;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/a3$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lt6/a3$b;->a:Lv7/a0;

    iget-object p1, p1, Lt6/a3$b;->b:Lv7/a0$c;

    invoke-interface {v0, p1}, Lv7/a0;->c(Lv7/a0$c;)V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a3$c;

    iget-object v2, v1, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Lt6/a3;->j(Lt6/a3$c;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private l(Lt6/a3$c;)V
    .locals 1

    iget-object v0, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lt6/a3;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/a3$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lt6/a3$b;->a:Lv7/a0;

    iget-object p1, p1, Lt6/a3$b;->b:Lv7/a0$c;

    invoke-interface {v0, p1}, Lv7/a0;->f(Lv7/a0$c;)V

    :cond_0
    return-void
.end method

.method private static m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lt6/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static n(Lt6/a3$c;Lv7/a0$b;)Lv7/a0$b;
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/a0$b;

    iget-wide v1, v1, Lv7/z;->d:J

    iget-wide v3, p1, Lv7/z;->d:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v0, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-static {p0, v0}, Lt6/a3;->p(Lt6/a3$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lv7/a0$b;->c(Ljava/lang/Object;)Lv7/a0$b;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lt6/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static p(Lt6/a3$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lt6/a3$c;->b:Ljava/lang/Object;

    invoke-static {p0, p1}, Lt6/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static r(Lt6/a3$c;I)I
    .locals 0

    iget p0, p0, Lt6/a3$c;->d:I

    add-int/2addr p1, p0

    return p1
.end method

.method private synthetic t(Lv7/a0;Lt6/d4;)V
    .locals 0

    iget-object p1, p0, Lt6/a3;->e:Lt6/a3$d;

    invoke-interface {p1}, Lt6/a3$d;->c()V

    return-void
.end method

.method private u(Lt6/a3$c;)V
    .locals 3

    iget-boolean v0, p1, Lt6/a3$c;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/a3;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$b;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$b;

    iget-object v1, v0, Lt6/a3$b;->a:Lv7/a0;

    iget-object v2, v0, Lt6/a3$b;->b:Lv7/a0$c;

    invoke-interface {v1, v2}, Lv7/a0;->b(Lv7/a0$c;)V

    iget-object v1, v0, Lt6/a3$b;->a:Lv7/a0;

    iget-object v2, v0, Lt6/a3$b;->c:Lt6/a3$a;

    invoke-interface {v1, v2}, Lv7/a0;->g(Lv7/h0;)V

    iget-object v1, v0, Lt6/a3$b;->a:Lv7/a0;

    iget-object v0, v0, Lt6/a3$b;->c:Lt6/a3$a;

    invoke-interface {v1, v0}, Lv7/a0;->q(Lx6/u;)V

    iget-object v0, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private x(Lt6/a3$c;)V
    .locals 5

    iget-object v0, p1, Lt6/a3$c;->a:Lv7/w;

    new-instance v1, Lt6/n2;

    invoke-direct {v1, p0}, Lt6/n2;-><init>(Lt6/a3;)V

    new-instance v2, Lt6/a3$a;

    invoke-direct {v2, p0, p1}, Lt6/a3$a;-><init>(Lt6/a3;Lt6/a3$c;)V

    iget-object v3, p0, Lt6/a3;->f:Ljava/util/HashMap;

    new-instance v4, Lt6/a3$b;

    invoke-direct {v4, v0, v1, v2}, Lt6/a3$b;-><init>(Lv7/a0;Lv7/a0$c;Lt6/a3$a;)V

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lt8/r0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lv7/a0;->j(Landroid/os/Handler;Lv7/h0;)V

    invoke-static {}, Lt8/r0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lv7/a0;->s(Landroid/os/Handler;Lx6/u;)V

    iget-object p1, p0, Lt6/a3;->l:Ls8/m0;

    iget-object v2, p0, Lt6/a3;->a:Lu6/m3;

    invoke-interface {v0, v1, p1, v2}, Lv7/a0;->a(Lv7/a0$c;Ls8/m0;Lu6/m3;)V

    return-void
.end method


# virtual methods
.method public A(IILv7/x0;)Lt6/d4;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lt6/a3;->q()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput-object p3, p0, Lt6/a3;->j:Lv7/x0;

    invoke-direct {p0, p1, p2}, Lt6/a3;->B(II)V

    invoke-virtual {p0}, Lt6/a3;->i()Lt6/d4;

    move-result-object p1

    return-object p1
.end method

.method public C(Ljava/util/List;Lv7/x0;)Lt6/d4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt6/a3$c;",
            ">;",
            "Lv7/x0;",
            ")",
            "Lt6/d4;"
        }
    .end annotation

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lt6/a3;->B(II)V

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lt6/a3;->f(ILjava/util/List;Lv7/x0;)Lt6/d4;

    move-result-object p1

    return-object p1
.end method

.method public D(Lv7/x0;)Lt6/d4;
    .locals 2

    invoke-virtual {p0}, Lt6/a3;->q()I

    move-result v0

    invoke-interface {p1}, Lv7/x0;->getLength()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-interface {p1}, Lv7/x0;->e()Lv7/x0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lv7/x0;->g(II)Lv7/x0;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lt6/a3;->j:Lv7/x0;

    invoke-virtual {p0}, Lt6/a3;->i()Lt6/d4;

    move-result-object p1

    return-object p1
.end method

.method public f(ILjava/util/List;Lv7/x0;)Lt6/d4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lt6/a3$c;",
            ">;",
            "Lv7/x0;",
            ")",
            "Lt6/d4;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p3, p0, Lt6/a3;->j:Lv7/x0;

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_3

    sub-int v0, p3, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    if-lez p3, :cond_0

    iget-object v1, p0, Lt6/a3;->b:Ljava/util/List;

    add-int/lit8 v2, p3, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a3$c;

    iget-object v2, v1, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v2}, Lv7/w;->Z()Lt6/d4;

    move-result-object v2

    iget v1, v1, Lt6/a3$c;->d:I

    invoke-virtual {v2}, Lt6/d4;->u()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lt6/a3$c;->b(I)V

    iget-object v1, v0, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v1}, Lv7/w;->Z()Lt6/d4;

    move-result-object v1

    invoke-virtual {v1}, Lt6/d4;->u()I

    move-result v1

    invoke-direct {p0, p3, v1}, Lt6/a3;->g(II)V

    iget-object v1, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v1, p3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Lt6/a3;->d:Ljava/util/Map;

    iget-object v2, v0, Lt6/a3$c;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lt6/a3;->k:Z

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lt6/a3;->x(Lt6/a3$c;)V

    iget-object v1, p0, Lt6/a3;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-direct {p0, v0}, Lt6/a3;->j(Lt6/a3$c;)V

    :cond_2
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lt6/a3;->i()Lt6/d4;

    move-result-object p1

    return-object p1
.end method

.method public h(Lv7/a0$b;Ls8/b;J)Lv7/y;
    .locals 2

    iget-object v0, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-static {v0}, Lt6/a3;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lv7/z;->a:Ljava/lang/Object;

    invoke-static {v1}, Lt6/a3;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lv7/a0$b;->c(Ljava/lang/Object;)Lv7/a0$b;

    move-result-object p1

    iget-object v1, p0, Lt6/a3;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    invoke-direct {p0, v0}, Lt6/a3;->l(Lt6/a3$c;)V

    iget-object v1, v0, Lt6/a3$c;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v1, p1, p2, p3, p4}, Lv7/w;->W(Lv7/a0$b;Ls8/b;J)Lv7/v;

    move-result-object p1

    iget-object p2, p0, Lt6/a3;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lt6/a3;->k()V

    return-object p1
.end method

.method public i()Lt6/d4;
    .locals 3

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lt6/d4;->a:Lt6/d4;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt6/a3$c;

    iput v1, v2, Lt6/a3$c;->d:I

    iget-object v2, v2, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v2}, Lv7/w;->Z()Lt6/d4;

    move-result-object v2

    invoke-virtual {v2}, Lt6/d4;->u()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lt6/n3;

    iget-object v1, p0, Lt6/a3;->b:Ljava/util/List;

    iget-object v2, p0, Lt6/a3;->j:Lv7/x0;

    invoke-direct {v0, v1, v2}, Lt6/n3;-><init>(Ljava/util/Collection;Lv7/x0;)V

    return-object v0
.end method

.method public q()I
    .locals 1

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lt6/a3;->k:Z

    return v0
.end method

.method public v(IIILv7/x0;)Lt6/d4;
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lt6/a3;->q()I

    move-result v1

    if-gt p2, v1, :cond_0

    if-ltz p3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lt8/a;->a(Z)V

    iput-object p4, p0, Lt6/a3;->j:Lv7/x0;

    if-eq p1, p2, :cond_3

    if-ne p1, p3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p4

    sub-int v1, p2, p1

    add-int/2addr v1, p3

    sub-int/2addr v1, v0

    add-int/lit8 v0, p2, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v1, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a3$c;

    iget v1, v1, Lt6/a3$c;->d:I

    iget-object v2, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-static {v2, p1, p2, p3}, Lt8/r0;->B0(Ljava/util/List;III)V

    :goto_1
    if-gt p4, v0, :cond_2

    iget-object p1, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/a3$c;

    iput v1, p1, Lt6/a3$c;->d:I

    iget-object p1, p1, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {p1}, Lv7/w;->Z()Lt6/d4;

    move-result-object p1

    invoke-virtual {p1}, Lt6/d4;->u()I

    move-result p1

    add-int/2addr v1, p1

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lt6/a3;->i()Lt6/d4;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_2
    invoke-virtual {p0}, Lt6/a3;->i()Lt6/d4;

    move-result-object p1

    return-object p1
.end method

.method public w(Ls8/m0;)V
    .locals 3

    iget-boolean v0, p0, Lt6/a3;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-object p1, p0, Lt6/a3;->l:Ls8/m0;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lt6/a3;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    invoke-direct {p0, v0}, Lt6/a3;->x(Lt6/a3$c;)V

    iget-object v2, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lt6/a3;->k:Z

    return-void
.end method

.method public y()V
    .locals 5

    iget-object v0, p0, Lt6/a3;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/a3$b;

    :try_start_0
    iget-object v2, v1, Lt6/a3$b;->a:Lv7/a0;

    iget-object v3, v1, Lt6/a3$b;->b:Lv7/a0$c;

    invoke-interface {v2, v3}, Lv7/a0;->b(Lv7/a0$c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "MediaSourceList"

    const-string v4, "Failed to release child source."

    invoke-static {v3, v4, v2}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v2, v1, Lt6/a3$b;->a:Lv7/a0;

    iget-object v3, v1, Lt6/a3$b;->c:Lt6/a3$a;

    invoke-interface {v2, v3}, Lv7/a0;->g(Lv7/h0;)V

    iget-object v2, v1, Lt6/a3$b;->a:Lv7/a0;

    iget-object v1, v1, Lt6/a3$b;->c:Lt6/a3$a;

    invoke-interface {v2, v1}, Lv7/a0;->q(Lx6/u;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/a3;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lt6/a3;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt6/a3;->k:Z

    return-void
.end method

.method public z(Lv7/y;)V
    .locals 2

    iget-object v0, p0, Lt6/a3;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/a3$c;

    iget-object v1, v0, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v1, p1}, Lv7/w;->l(Lv7/y;)V

    iget-object v1, v0, Lt6/a3$c;->c:Ljava/util/List;

    check-cast p1, Lv7/v;

    iget-object p1, p1, Lv7/v;->a:Lv7/a0$b;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lt6/a3;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lt6/a3;->k()V

    :cond_0
    invoke-direct {p0, v0}, Lt6/a3;->u(Lt6/a3$c;)V

    return-void
.end method
