.class public final Loi/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/graphics/Point;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Point;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    iget v1, p0, Landroid/graphics/Point;->x:I

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "x"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget p0, p0, Landroid/graphics/Point;->y:I

    int-to-double v1, p0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string v1, "y"

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lxf/a$a;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$a;->a()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "getAddressLines(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, v1, v5

    invoke-virtual {v6}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "addressLines"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-virtual {p0}, Lxf/a$a;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "type"

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxf/a$c;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$c;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$c;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "description"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$c;->b()Lxf/a$b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lxf/a$b;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "end"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "location"

    invoke-virtual {p0}, Lxf/a$c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "organizer"

    invoke-virtual {p0}, Lxf/a$c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a$c;->e()Lxf/a$b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lxf/a$b;->a()Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v1, "start"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "status"

    invoke-virtual {p0}, Lxf/a$c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "summary"

    invoke-virtual {p0}, Lxf/a$c;->g()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x6

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lxf/a$d;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$d;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$d;->a()Ljava/util/List;

    move-result-object v1

    const-string v2, "getAddresses(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxf/a$a;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {v4}, Loi/a0;->b(Lxf/a$a;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v1, "addresses"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$d;->b()Ljava/util/List;

    move-result-object v1

    const-string v2, "getEmails(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxf/a$f;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {v4}, Loi/a0;->f(Lxf/a$f;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string v1, "emails"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$d;->c()Lxf/a$h;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Loi/a0;->h(Lxf/a$h;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    const-string v2, "name"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "organization"

    invoke-virtual {p0}, Lxf/a$d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$d;->e()Ljava/util/List;

    move-result-object v1

    const-string v2, "getPhones(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxf/a$i;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {v3}, Loi/a0;->i(Lxf/a$i;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const-string v1, "phones"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "title"

    invoke-virtual {p0}, Lxf/a$d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "urls"

    invoke-virtual {p0}, Lxf/a$d;->g()Ljava/util/List;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x6

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lxf/a$e;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$e;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0xe

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$e;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "addressCity"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "addressState"

    invoke-virtual {p0}, Lxf/a$e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "addressStreet"

    invoke-virtual {p0}, Lxf/a$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "addressZip"

    invoke-virtual {p0}, Lxf/a$e;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "birthDate"

    invoke-virtual {p0}, Lxf/a$e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "documentType"

    invoke-virtual {p0}, Lxf/a$e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "expiryDate"

    invoke-virtual {p0}, Lxf/a$e;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "firstName"

    invoke-virtual {p0}, Lxf/a$e;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "gender"

    invoke-virtual {p0}, Lxf/a$e;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "issueDate"

    invoke-virtual {p0}, Lxf/a$e;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "issuingCountry"

    invoke-virtual {p0}, Lxf/a$e;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "lastName"

    invoke-virtual {p0}, Lxf/a$e;->l()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "licenseNumber"

    invoke-virtual {p0}, Lxf/a$e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "middleName"

    invoke-virtual {p0}, Lxf/a$e;->n()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/16 v1, 0xd

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lxf/a$f;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$f;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$f;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "address"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "body"

    invoke-virtual {p0}, Lxf/a$f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "subject"

    invoke-virtual {p0}, Lxf/a$f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$f;->d()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "type"

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lxf/a$g;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$g;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$g;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "latitude"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$g;->b()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string v1, "longitude"

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lxf/a$h;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$h;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$h;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "first"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "formattedName"

    invoke-virtual {p0}, Lxf/a$h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "last"

    invoke-virtual {p0}, Lxf/a$h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "middle"

    invoke-virtual {p0}, Lxf/a$h;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "prefix"

    invoke-virtual {p0}, Lxf/a$h;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "pronunciation"

    invoke-virtual {p0}, Lxf/a$h;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "suffix"

    invoke-virtual {p0}, Lxf/a$h;->g()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x6

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lxf/a$i;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$i;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$i;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "number"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lxf/a$i;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "type"

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lxf/a$j;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$j;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$j;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "message"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "phoneNumber"

    invoke-virtual {p0}, Lxf/a$j;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lxf/a$k;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$k;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$k;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "url"

    invoke-virtual {p0}, Lxf/a$k;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lxf/a$l;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a$l;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a$l;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "encryptionType"

    invoke-static {v2, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "password"

    invoke-virtual {p0}, Lxf/a$l;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "ssid"

    invoke-virtual {p0}, Lxf/a$l;->c()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lxf/a;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxf/a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xf

    new-array v0, v0, [Lck/m;

    invoke-virtual {p0}, Lxf/a;->d()[Landroid/graphics/Point;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    array-length v5, v1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v1

    move v6, v3

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v1, v6

    invoke-static {v7}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-static {v7}, Loi/a0;->a(Landroid/graphics/Point;)Ljava/util/Map;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    move-object v4, v2

    :cond_1
    const-string v1, "corners"

    invoke-static {v1, v4}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "format"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "rawBytes"

    invoke-virtual {p0}, Lxf/a;->k()[B

    move-result-object v3

    invoke-static {v1, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "rawValue"

    invoke-virtual {p0}, Lxf/a;->l()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "type"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->b()Lxf/a$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Loi/a0;->c(Lxf/a$c;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    const-string v3, "calendarEvent"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->c()Lxf/a$d;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Loi/a0;->d(Lxf/a$d;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    const-string v3, "contactInfo"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->f()Lxf/a$e;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Loi/a0;->e(Lxf/a$e;)Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_4
    move-object v1, v2

    :goto_3
    const-string v3, "driverLicense"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->g()Lxf/a$f;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Loi/a0;->f(Lxf/a$f;)Ljava/util/Map;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, v2

    :goto_4
    const-string v3, "email"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->i()Lxf/a$g;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {v1}, Loi/a0;->g(Lxf/a$g;)Ljava/util/Map;

    move-result-object v1

    goto :goto_5

    :cond_6
    move-object v1, v2

    :goto_5
    const-string v3, "geoPoint"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->j()Lxf/a$i;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Loi/a0;->i(Lxf/a$i;)Ljava/util/Map;

    move-result-object v1

    goto :goto_6

    :cond_7
    move-object v1, v2

    :goto_6
    const-string v3, "phone"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->m()Lxf/a$j;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Loi/a0;->j(Lxf/a$j;)Ljava/util/Map;

    move-result-object v1

    goto :goto_7

    :cond_8
    move-object v1, v2

    :goto_7
    const-string v3, "sms"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->n()Lxf/a$k;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v1}, Loi/a0;->k(Lxf/a$k;)Ljava/util/Map;

    move-result-object v1

    goto :goto_8

    :cond_9
    move-object v1, v2

    :goto_8
    const-string v3, "url"

    invoke-static {v3, v1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    invoke-virtual {p0}, Lxf/a;->p()Lxf/a$l;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, Loi/a0;->l(Lxf/a$l;)Ljava/util/Map;

    move-result-object v2

    :cond_a
    const-string v1, "wifi"

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "displayValue"

    invoke-virtual {p0}, Lxf/a;->e()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    const/16 v1, 0xe

    aput-object p0, v0, v1

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
