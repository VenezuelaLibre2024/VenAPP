.class public final Li4/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Li4/n0$a;-><init>()V

    return-void
.end method

.method private final b(Li4/i0;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Li4/n0;
    .locals 2

    instance-of v0, p3, Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    sget-object v0, Li4/u;->z:Li4/u$c;

    check-cast p3, Lorg/json/JSONObject;

    invoke-virtual {v0, p3, p4, p2}, Li4/u$c;->a(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Li4/u;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-static {}, Li4/n0;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, Li4/u;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p4}, Li4/u;->b()I

    move-result p3

    const/16 v0, 0xbe

    if-ne p3, v0, :cond_2

    sget-object p3, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    invoke-virtual {p1}, Li4/i0;->m()Li4/a;

    move-result-object p3

    invoke-static {p3}, Lcom/facebook/internal/n0;->Z(Li4/a;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p4}, Li4/u;->g()I

    move-result p3

    const/16 v0, 0x1ed

    if-eq p3, v0, :cond_0

    sget-object p3, Li4/a;->w:Li4/a$c;

    invoke-virtual {p3, v1}, Li4/a$c;->h(Li4/a;)V

    goto :goto_1

    :cond_0
    sget-object p3, Li4/a;->w:Li4/a$c;

    invoke-virtual {p3}, Li4/a$c;->e()Li4/a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Li4/a;->o()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p3}, Li4/a$c;->d()V

    :cond_2
    :goto_1
    new-instance p3, Li4/n0;

    invoke-direct {p3, p1, p2, p4}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    return-object p3

    :cond_3
    const-string p4, "body"

    const-string v0, "FACEBOOK_NON_JSON_RESULT"

    invoke-static {p3, p4, v0}, Lcom/facebook/internal/n0;->P(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    instance-of p4, p3, Lorg/json/JSONObject;

    if-eqz p4, :cond_4

    new-instance p4, Li4/n0;

    check-cast p3, Lorg/json/JSONObject;

    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p4, p1, p2, v0, p3}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object p4

    :cond_4
    instance-of p4, p3, Lorg/json/JSONArray;

    if-eqz p4, :cond_5

    new-instance p4, Li4/n0;

    check-cast p3, Lorg/json/JSONArray;

    invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p4, p1, p2, v0, p3}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V

    return-object p4

    :cond_5
    sget-object p3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    const-string p4, "NULL"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    sget-object p4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne p3, p4, :cond_7

    new-instance p4, Li4/n0;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p4, p1, p2, p3, v1}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object p4

    :cond_7
    new-instance p1, Li4/r;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Got unexpected object type in response, class: "

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Li4/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final c(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/List<",
            "Li4/i0;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Li4/n0;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li4/i0;

    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "body"

    invoke-virtual {v4, v5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-nez p1, :cond_0

    const/16 v5, 0xc8

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    :goto_0
    const-string v6, "code"

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v4

    new-instance v5, Li4/n0;

    new-instance v6, Li4/u;

    invoke-direct {v6, p1, v4}, Li4/u;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v5, v2, p1, v6}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    goto :goto_1

    :catch_1
    move-exception v4

    new-instance v5, Li4/n0;

    new-instance v6, Li4/u;

    invoke-direct {v6, p1, v4}, Li4/u;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v5, v2, p1, v6}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    :goto_1
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    move-object v5, p3

    :goto_2
    instance-of v2, v5, Lorg/json/JSONArray;

    if-eqz v2, :cond_4

    move-object v2, v5

    check-cast v2, Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ne v4, v0, :cond_4

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    :goto_3
    add-int/lit8 v2, v3, 0x1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li4/i0;

    :try_start_1
    move-object v6, v5

    check-cast v6, Lorg/json/JSONArray;

    invoke-virtual {v6, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v6, "obj"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v4, p1, v3, p3}, Li4/n0$a;->b(Li4/i0;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Li4/n0;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Li4/r; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_5

    :catch_2
    move-exception v3

    new-instance v6, Li4/n0;

    new-instance v7, Li4/u;

    invoke-direct {v7, p1, v3}, Li4/u;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v6, v4, p1, v7}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    goto :goto_4

    :catch_3
    move-exception v3

    new-instance v6, Li4/n0;

    new-instance v7, Li4/u;

    invoke-direct {v7, p1, v3}, Li4/u;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v6, v4, p1, v7}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    :goto_4
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    if-lt v2, v0, :cond_2

    goto :goto_6

    :cond_2
    move v3, v2

    goto :goto_3

    :cond_3
    :goto_6
    return-object v1

    :cond_4
    new-instance p1, Li4/r;

    const-string p2, "Unexpected number of results"

    invoke-direct {p1, p2}, Li4/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/net/HttpURLConnection;Li4/r;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li4/i0;",
            ">;",
            "Ljava/net/HttpURLConnection;",
            "Li4/r;",
            ")",
            "Ljava/util/List<",
            "Li4/n0;",
            ">;"
        }
    .end annotation

    const-string v0, "requests"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/i0;

    new-instance v2, Li4/n0;

    new-instance v3, Li4/u;

    invoke-direct {v3, p2, p3}, Li4/u;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V

    invoke-direct {v2, v1, p2, v3}, Li4/n0;-><init>(Li4/i0;Ljava/net/HttpURLConnection;Li4/u;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final d(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Li4/m0;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/net/HttpURLConnection;",
            "Li4/m0;",
            ")",
            "Ljava/util/List<",
            "Li4/n0;",
            ">;"
        }
    .end annotation

    const-string v0, "requests"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/facebook/internal/n0;->t0(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->INCLUDE_RAW_RESPONSES:Li4/q0;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string v3, "Response"

    const-string v4, "Response (raw)\n  Size: %d\n  Response:\n%s\n"

    invoke-virtual {v0, v1, v3, v4, v2}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Li4/n0$a;->e(Ljava/lang/String;Ljava/net/HttpURLConnection;Li4/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/net/HttpURLConnection;Li4/m0;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/HttpURLConnection;",
            "Li4/m0;",
            ")",
            "Ljava/util/List<",
            "Li4/n0;",
            ">;"
        }
    .end annotation

    const-string v0, "responseString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requests"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONTokener;

    invoke-direct {v0, p1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "resultObject"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, v0}, Li4/n0$a;->c(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->REQUESTS:Li4/q0;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p3}, Li4/m0;->s()Ljava/lang/String;

    move-result-object p3

    aput-object p3, v2, v3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p3, 0x1

    aput-object p1, v2, p3

    const/4 p1, 0x2

    aput-object p2, v2, p1

    const-string p1, "Response"

    const-string p3, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"

    invoke-virtual {v0, v1, p1, p3, v2}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p2
.end method

.method public final f(Ljava/net/HttpURLConnection;Li4/m0;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Li4/m0;",
            ")",
            "Ljava/util/List<",
            "Li4/n0;",
            ">;"
        }
    .end annotation

    const-string v0, "Response <Error>: %s"

    const-string v1, "Response"

    const-string v2, "connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "requests"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    invoke-static {}, Li4/e0;->E()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    const/16 v6, 0x190

    if-lt v5, v6, :cond_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    :goto_0
    invoke-virtual {p0, v4, p1, p2}, Li4/n0$a;->d(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Li4/m0;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Li4/r; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-static {v4}, Lcom/facebook/internal/n0;->j(Ljava/io/Closeable;)V

    goto :goto_2

    :cond_1
    :try_start_1
    const-string v5, "GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized"

    invoke-static {}, Li4/n0;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v6, Li4/r;

    invoke-direct {v6, v5}, Li4/r;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_1
    .catch Li4/r; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception v5

    :try_start_2
    sget-object v6, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v7, Li4/q0;->REQUESTS:Li4/q0;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v2

    invoke-virtual {v6, v7, v1, v0, v3}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Li4/r;

    invoke-direct {v0, v5}, Li4/r;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p2, p1, v0}, Li4/n0$a;->a(Ljava/util/List;Ljava/net/HttpURLConnection;Li4/r;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :catch_1
    move-exception v5

    sget-object v6, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v7, Li4/q0;->REQUESTS:Li4/q0;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v2

    invoke-virtual {v6, v7, v1, v0, v3}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p1, v5}, Li4/n0$a;->a(Ljava/util/List;Ljava/net/HttpURLConnection;Li4/r;)Ljava/util/List;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    return-object p1

    :goto_3
    invoke-static {v4}, Lcom/facebook/internal/n0;->j(Ljava/io/Closeable;)V

    throw p1
.end method
