.class final Lbj/g;
.super Lvi/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/g$d;,
        Lbj/g$b;,
        Lbj/g$c;,
        Lbj/g$e;
    }
.end annotation


# static fields
.field static final h:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Lbj/g$d<",
            "Lvi/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final i:Lvi/g1;


# instance fields
.field private final c:Lvi/p0$d;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lvi/x;",
            "Lvi/p0$h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Random;

.field private f:Lvi/p;

.field private g:Lbj/g$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "state-info"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lbj/g;->h:Lvi/a$c;

    sget-object v0, Lvi/g1;->f:Lvi/g1;

    const-string v1, "no subchannels ready"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    sput-object v0, Lbj/g;->i:Lvi/g1;

    return-void
.end method

.method constructor <init>(Lvi/p0$d;)V
    .locals 2

    invoke-direct {p0}, Lvi/p0;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbj/g;->d:Ljava/util/Map;

    new-instance v0, Lbj/g$b;

    sget-object v1, Lbj/g;->i:Lvi/g1;

    invoke-direct {v0, v1}, Lbj/g$b;-><init>(Lvi/g1;)V

    iput-object v0, p0, Lbj/g;->g:Lbj/g$e;

    const-string v0, "helper"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/p0$d;

    iput-object p1, p0, Lbj/g;->c:Lvi/p0$d;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lbj/g;->e:Ljava/util/Random;

    return-void
.end method

.method static synthetic f(Lbj/g;Lvi/p0$h;Lvi/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lbj/g;->k(Lvi/p0$h;Lvi/q;)V

    return-void
.end method

.method private static g(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lvi/p0$h;",
            ">;)",
            "Ljava/util/List<",
            "Lvi/p0$h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/p0$h;

    invoke-static {v1}, Lbj/g;->j(Lvi/p0$h;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static h(Lvi/p0$h;)Lbj/g$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/p0$h;",
            ")",
            "Lbj/g$d<",
            "Lvi/q;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lvi/p0$h;->c()Lvi/a;

    move-result-object p0

    sget-object v0, Lbj/g;->h:Lvi/a$c;

    invoke-virtual {p0, v0}, Lvi/a;->b(Lvi/a$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbj/g$d;

    const-string v0, "STATE_INFO"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbj/g$d;

    return-object p0
.end method

.method static j(Lvi/p0$h;)Z
    .locals 1

    invoke-static {p0}, Lbj/g;->h(Lvi/p0$h;)Lbj/g$d;

    move-result-object p0

    iget-object p0, p0, Lbj/g$d;->a:Ljava/lang/Object;

    check-cast p0, Lvi/q;

    invoke-virtual {p0}, Lvi/q;->c()Lvi/p;

    move-result-object p0

    sget-object v0, Lvi/p;->READY:Lvi/p;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private k(Lvi/p0$h;Lvi/q;)V
    .locals 3

    iget-object v0, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lvi/p0$h;->a()Lvi/x;

    move-result-object v1

    invoke-static {v1}, Lbj/g;->o(Lvi/x;)Lvi/x;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v2, Lvi/p;->IDLE:Lvi/p;

    if-ne v0, v2, :cond_2

    :cond_1
    iget-object v0, p0, Lbj/g;->c:Lvi/p0$d;

    invoke-virtual {v0}, Lvi/p0$d;->e()V

    :cond_2
    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v2, Lvi/p;->IDLE:Lvi/p;

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lvi/p0$h;->e()V

    :cond_3
    invoke-static {p1}, Lbj/g;->h(Lvi/p0$h;)Lbj/g$d;

    move-result-object p1

    iget-object v0, p1, Lbj/g$d;->a:Ljava/lang/Object;

    check-cast v0, Lvi/q;

    invoke-virtual {v0}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->CONNECTING:Lvi/p;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-void

    :cond_5
    iput-object p2, p1, Lbj/g$d;->a:Ljava/lang/Object;

    invoke-direct {p0}, Lbj/g;->p()V

    return-void
.end method

.method private static l(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TT;>;",
            "Ljava/util/Set<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private m(Lvi/p0$h;)V
    .locals 1

    invoke-virtual {p1}, Lvi/p0$h;->f()V

    invoke-static {p1}, Lbj/g;->h(Lvi/p0$h;)Lbj/g$d;

    move-result-object p1

    sget-object v0, Lvi/p;->SHUTDOWN:Lvi/p;

    invoke-static {v0}, Lvi/q;->a(Lvi/p;)Lvi/q;

    move-result-object v0

    iput-object v0, p1, Lbj/g$d;->a:Ljava/lang/Object;

    return-void
.end method

.method private static n(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)",
            "Ljava/util/Map<",
            "Lvi/x;",
            "Lvi/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/x;

    invoke-static {v1}, Lbj/g;->o(Lvi/x;)Lvi/x;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static o(Lvi/x;)Lvi/x;
    .locals 1

    new-instance v0, Lvi/x;

    invoke-virtual {p0}, Lvi/x;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lvi/x;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private p()V
    .locals 6

    invoke-virtual {p0}, Lbj/g;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lbj/g;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Lbj/g;->i:Lvi/g1;

    invoke-virtual {p0}, Lbj/g;->i()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi/p0$h;

    invoke-static {v3}, Lbj/g;->h(Lvi/p0$h;)Lbj/g$d;

    move-result-object v3

    iget-object v3, v3, Lbj/g$d;->a:Ljava/lang/Object;

    check-cast v3, Lvi/q;

    invoke-virtual {v3}, Lvi/q;->c()Lvi/p;

    move-result-object v4

    sget-object v5, Lvi/p;->CONNECTING:Lvi/p;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Lvi/q;->c()Lvi/p;

    move-result-object v4

    sget-object v5, Lvi/p;->IDLE:Lvi/p;

    if-ne v4, v5, :cond_2

    :cond_1
    const/4 v2, 0x1

    :cond_2
    sget-object v4, Lbj/g;->i:Lvi/g1;

    if-eq v0, v4, :cond_3

    invoke-virtual {v0}, Lvi/g1;->p()Z

    move-result v4

    if-nez v4, :cond_0

    :cond_3
    invoke-virtual {v3}, Lvi/q;->d()Lvi/g1;

    move-result-object v0

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_5

    sget-object v1, Lvi/p;->CONNECTING:Lvi/p;

    goto :goto_1

    :cond_5
    sget-object v1, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    :goto_1
    new-instance v2, Lbj/g$b;

    invoke-direct {v2, v0}, Lbj/g$b;-><init>(Lvi/g1;)V

    invoke-direct {p0, v1, v2}, Lbj/g;->q(Lvi/p;Lbj/g$e;)V

    goto :goto_2

    :cond_6
    iget-object v1, p0, Lbj/g;->e:Ljava/util/Random;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    sget-object v2, Lvi/p;->READY:Lvi/p;

    new-instance v3, Lbj/g$c;

    invoke-direct {v3, v0, v1}, Lbj/g$c;-><init>(Ljava/util/List;I)V

    invoke-direct {p0, v2, v3}, Lbj/g;->q(Lvi/p;Lbj/g$e;)V

    :goto_2
    return-void
.end method

.method private q(Lvi/p;Lbj/g$e;)V
    .locals 1

    iget-object v0, p0, Lbj/g;->f:Lvi/p;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lbj/g;->g:Lbj/g$e;

    invoke-virtual {p2, v0}, Lbj/g$e;->b(Lbj/g$e;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lbj/g;->c:Lvi/p0$d;

    invoke-virtual {v0, p1, p2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    iput-object p1, p0, Lbj/g;->f:Lvi/p;

    iput-object p2, p0, Lbj/g;->g:Lbj/g$e;

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lvi/p0$g;)Z
    .locals 7

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lvi/g1;->u:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NameResolver returned no usable address. addrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", attrs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->b()Lvi/a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/g;->c(Lvi/g1;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Lbj/g;->n(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lbj/g;->l(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvi/x;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/x;

    iget-object v3, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi/p0$h;

    if-eqz v3, :cond_1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Lvi/p0$h;->h(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lvi/a;->c()Lvi/a$b;

    move-result-object v3

    sget-object v4, Lbj/g;->h:Lvi/a$c;

    new-instance v5, Lbj/g$d;

    sget-object v6, Lvi/p;->IDLE:Lvi/p;

    invoke-static {v6}, Lvi/q;->a(Lvi/p;)Lvi/q;

    move-result-object v6

    invoke-direct {v5, v6}, Lbj/g$d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v3

    iget-object v4, p0, Lbj/g;->c:Lvi/p0$d;

    invoke-static {}, Lvi/p0$b;->c()Lvi/p0$b$a;

    move-result-object v5

    invoke-virtual {v5, v1}, Lvi/p0$b$a;->e(Lvi/x;)Lvi/p0$b$a;

    move-result-object v1

    invoke-virtual {v3}, Lvi/a$b;->a()Lvi/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Lvi/p0$b$a;->f(Lvi/a;)Lvi/p0$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lvi/p0$b$a;->b()Lvi/p0$b;

    move-result-object v1

    invoke-virtual {v4, v1}, Lvi/p0$d;->a(Lvi/p0$b;)Lvi/p0$h;

    move-result-object v1

    const-string v3, "subchannel"

    invoke-static {v1, v3}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/p0$h;

    new-instance v3, Lbj/g$a;

    invoke-direct {v3, p0, v1}, Lbj/g$a;-><init>(Lbj/g;Lvi/p0$h;)V

    invoke-virtual {v1, v3}, Lvi/p0$h;->g(Lvi/p0$j;)V

    iget-object v3, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lvi/p0$h;->e()V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/x;

    iget-object v2, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/p0$h;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lbj/g;->p()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/p0$h;

    invoke-direct {p0, v0}, Lbj/g;->m(Lvi/p0$h;)V

    goto :goto_2

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public c(Lvi/g1;)V
    .locals 2

    iget-object v0, p0, Lbj/g;->f:Lvi/p;

    sget-object v1, Lvi/p;->READY:Lvi/p;

    if-eq v0, v1, :cond_0

    sget-object v0, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    new-instance v1, Lbj/g$b;

    invoke-direct {v1, p1}, Lbj/g$b;-><init>(Lvi/g1;)V

    invoke-direct {p0, v0, v1}, Lbj/g;->q(Lvi/p;Lbj/g$e;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    invoke-virtual {p0}, Lbj/g;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/p0$h;

    invoke-direct {p0, v1}, Lbj/g;->m(Lvi/p0$h;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lvi/p0$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbj/g;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
