.class public final Leg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldg/c;)Ldg/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Leg/b;->b(Ldg/c;Ljava/util/Map;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldg/c;Ljava/util/Map;)Ldg/q;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg/c;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Ldg/q;"
        }
    .end annotation

    new-instance v0, Lgg/a;

    invoke-virtual {p1}, Ldg/c;->a()Lkg/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lgg/a;-><init>(Lkg/b;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1}, Lgg/a;->a(Z)Leg/a;

    move-result-object v2

    invoke-virtual {v2}, Lkg/g;->b()[Ldg/s;

    move-result-object v3
    :try_end_0
    .catch Ldg/m; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ldg/h; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v4, Lfg/a;

    invoke-direct {v4}, Lfg/a;-><init>()V

    invoke-virtual {v4, v2}, Lfg/a;->c(Leg/a;)Lkg/e;

    move-result-object v2
    :try_end_1
    .catch Ldg/m; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ldg/h; {:try_start_1 .. :try_end_1} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    move-object v3, v1

    :goto_0
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_2

    :catch_3
    move-exception v2

    move-object v3, v1

    :goto_1
    move-object v4, v3

    move-object v3, v1

    :goto_2
    if-nez v1, :cond_2

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, Lgg/a;->a(Z)Leg/a;

    move-result-object v0

    invoke-virtual {v0}, Lkg/g;->b()[Ldg/s;

    move-result-object v4

    new-instance v1, Lfg/a;

    invoke-direct {v1}, Lfg/a;-><init>()V

    invoke-virtual {v1, v0}, Lfg/a;->c(Leg/a;)Lkg/e;

    move-result-object v1
    :try_end_2
    .catch Ldg/m; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ldg/h; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_3

    :catch_5
    move-exception p1

    :goto_3
    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    throw v3

    :cond_0
    throw p1

    :cond_1
    throw v2

    :cond_2
    :goto_4
    move-object v6, v4

    if-eqz p2, :cond_3

    sget-object v0, Ldg/e;->NEED_RESULT_POINT_CALLBACK:Ldg/e;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldg/t;

    if-eqz p2, :cond_3

    array-length v0, v6

    :goto_5
    if-ge p1, v0, :cond_3

    aget-object v2, v6, p1

    invoke-interface {p2, v2}, Ldg/t;->a(Ldg/s;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_3
    new-instance p1, Ldg/q;

    invoke-virtual {v1}, Lkg/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lkg/e;->e()[B

    move-result-object v4

    invoke-virtual {v1}, Lkg/e;->c()I

    move-result v5

    sget-object v7, Ldg/a;->AZTEC:Ldg/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Ldg/q;-><init>(Ljava/lang/String;[BI[Ldg/s;Ldg/a;J)V

    invoke-virtual {v1}, Lkg/e;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v0, Ldg/r;->BYTE_SEGMENTS:Ldg/r;

    invoke-virtual {p1, v0, p2}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v1}, Lkg/e;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    sget-object v0, Ldg/r;->ERROR_CORRECTION_LEVEL:Ldg/r;

    invoke-virtual {p1, v0, p2}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    :cond_5
    sget-object p2, Ldg/r;->SYMBOLOGY_IDENTIFIER:Ldg/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "]z"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lkg/e;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ldg/q;->h(Ldg/r;Ljava/lang/Object;)V

    return-object p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method
