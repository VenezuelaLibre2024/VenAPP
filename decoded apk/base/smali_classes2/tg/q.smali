.class public final Ltg/q;
.super Ltg/r;
.source "SourceFile"


# static fields
.field private static final b:[Ltg/y;


# instance fields
.field private final a:[Ltg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ltg/y;

    sput-object v0, Ltg/q;->b:[Ltg/y;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ltg/r;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Ldg/e;->POSSIBLE_FORMATS:Ldg/e;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_4

    sget-object v1, Ldg/a;->EAN_13:Ldg/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ltg/i;

    invoke-direct {v1}, Ltg/i;-><init>()V

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    sget-object v1, Ldg/a;->UPC_A:Ldg/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ltg/t;

    invoke-direct {v1}, Ltg/t;-><init>()V

    goto :goto_1

    :cond_2
    :goto_2
    sget-object v1, Ldg/a;->EAN_8:Ldg/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ltg/k;

    invoke-direct {v1}, Ltg/k;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object v1, Ldg/a;->UPC_E:Ldg/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Ltg/a0;

    invoke-direct {p1}, Ltg/a0;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ltg/i;

    invoke-direct {p1}, Ltg/i;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance p1, Ltg/k;

    invoke-direct {p1}, Ltg/k;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance p1, Ltg/a0;

    invoke-direct {p1}, Ltg/a0;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object p1, Ltg/q;->b:[Ltg/y;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ltg/y;

    iput-object p1, p0, Ltg/q;->a:[Ltg/y;

    return-void
.end method


# virtual methods
.method public c(ILkg/a;Ljava/util/Map;)Ldg/q;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkg/a;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Ldg/q;"
        }
    .end annotation

    invoke-static {p2}, Ltg/y;->p(Lkg/a;)[I

    move-result-object v0

    iget-object v1, p0, Ltg/q;->a:[Ltg/y;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_5

    aget-object v5, v1, v4

    :try_start_0
    invoke-virtual {v5, p1, p2, v0, p3}, Ltg/y;->m(ILkg/a;[ILjava/util/Map;)Ldg/q;

    move-result-object v5

    invoke-virtual {v5}, Ldg/q;->b()Ldg/a;

    move-result-object v6

    sget-object v7, Ldg/a;->EAN_13:Ldg/a;

    const/4 v8, 0x1

    if-ne v6, v7, :cond_0

    invoke-virtual {v5}, Ldg/q;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    if-ne v6, v7, :cond_0

    move v6, v8

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    if-nez p3, :cond_1

    const/4 v7, 0x0

    goto :goto_2

    :cond_1
    sget-object v7, Ldg/e;->POSSIBLE_FORMATS:Ldg/e;

    invoke-interface {p3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    :goto_2
    if-eqz v7, :cond_3

    sget-object v9, Ldg/a;->UPC_A:Ldg/a;

    invoke-interface {v7, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    move v7, v3

    goto :goto_4

    :cond_3
    :goto_3
    move v7, v8

    :goto_4
    if-eqz v6, :cond_4

    if-eqz v7, :cond_4

    new-instance v6, Ldg/q;

    invoke-virtual {v5}, Ldg/q;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ldg/q;->c()[B

    move-result-object v8

    invoke-virtual {v5}, Ldg/q;->e()[Ldg/s;

    move-result-object v9

    sget-object v10, Ldg/a;->UPC_A:Ldg/a;

    invoke-direct {v6, v7, v8, v9, v10}, Ldg/q;-><init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;)V

    invoke-virtual {v5}, Ldg/q;->d()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v6, v5}, Ldg/q;->g(Ljava/util/Map;)V
    :try_end_0
    .catch Ldg/p; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :cond_4
    return-object v5

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    invoke-static {}, Ldg/m;->a()Ldg/m;

    move-result-object p1

    throw p1
.end method

.method public reset()V
    .locals 4

    iget-object v0, p0, Ltg/q;->a:[Ltg/y;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Ldg/o;->reset()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
