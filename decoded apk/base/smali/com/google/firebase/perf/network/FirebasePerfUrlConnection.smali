.class public Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lcom/google/firebase/perf/util/n;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->g()V

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v0

    invoke-static {p1}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lcom/google/firebase/perf/network/b;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lcom/google/firebase/perf/network/b;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3}, Lcom/google/firebase/perf/network/b;->getContent()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lcom/google/firebase/perf/network/a;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lcom/google/firebase/perf/network/a;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3}, Lcom/google/firebase/perf/network/a;->getContent()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v2

    invoke-virtual {p1, v0, v1}, Lse/h;->r(J)Lse/h;

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lse/h;->v(J)Lse/h;

    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    invoke-static {p1}, Lue/d;->d(Lse/h;)V

    throw v2
.end method

.method static b(Lcom/google/firebase/perf/util/n;[Ljava/lang/Class;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/l;->g()V

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v0

    invoke-static {p2}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lcom/google/firebase/perf/network/b;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p3, p2}, Lcom/google/firebase/perf/network/b;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3, p1}, Lcom/google/firebase/perf/network/b;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lcom/google/firebase/perf/network/a;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p3, p2}, Lcom/google/firebase/perf/network/a;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3, p1}, Lcom/google/firebase/perf/network/a;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p2, v0, v1}, Lse/h;->r(J)Lse/h;

    invoke-virtual {p3}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lse/h;->v(J)Lse/h;

    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    invoke-static {p2}, Lue/d;->d(Lse/h;)V

    throw p1
.end method

.method static c(Lcom/google/firebase/perf/util/n;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/io/InputStream;
    .locals 4

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->g()V

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->e()J

    move-result-wide v0

    invoke-static {p1}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->a()Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v3, :cond_0

    new-instance v3, Lcom/google/firebase/perf/network/b;

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lcom/google/firebase/perf/network/b;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3}, Lcom/google/firebase/perf/network/b;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_1

    new-instance v3, Lcom/google/firebase/perf/network/a;

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-direct {v3, v2, p2, p1}, Lcom/google/firebase/perf/network/a;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    invoke-virtual {v3}, Lcom/google/firebase/perf/network/a;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v2

    invoke-virtual {p1, v0, v1}, Lse/h;->r(J)Lse/h;

    invoke-virtual {p2}, Lcom/google/firebase/perf/util/l;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lse/h;->v(J)Lse/h;

    invoke-virtual {p0}, Lcom/google/firebase/perf/util/n;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/h;->x(Ljava/lang/String;)Lse/h;

    invoke-static {p1}, Lue/d;->d(Lse/h;)V

    throw v2
.end method

.method public static getContent(Ljava/net/URL;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lcom/google/firebase/perf/util/n;

    invoke-direct {v0, p0}, Lcom/google/firebase/perf/util/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/l;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->a(Lcom/google/firebase/perf/util/n;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getContent(Ljava/net/URL;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lcom/google/firebase/perf/util/n;

    invoke-direct {v0, p0}, Lcom/google/firebase/perf/util/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/l;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-static {v0, p1, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->b(Lcom/google/firebase/perf/util/n;[Ljava/lang/Class;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static instrument(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/perf/network/b;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    new-instance v1, Lcom/google/firebase/perf/util/l;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v2

    invoke-static {v2}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/perf/network/b;-><init>(Ljavax/net/ssl/HttpsURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/firebase/perf/network/a;

    check-cast p0, Ljava/net/HttpURLConnection;

    new-instance v1, Lcom/google/firebase/perf/util/l;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object v2

    invoke-static {v2}, Lse/h;->c(Lwe/k;)Lse/h;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/perf/network/a;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/perf/util/l;Lse/h;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static openStream(Ljava/net/URL;)Ljava/io/InputStream;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lcom/google/firebase/perf/util/n;

    invoke-direct {v0, p0}, Lcom/google/firebase/perf/util/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, Lwe/k;->k()Lwe/k;

    move-result-object p0

    new-instance v1, Lcom/google/firebase/perf/util/l;

    invoke-direct {v1}, Lcom/google/firebase/perf/util/l;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->c(Lcom/google/firebase/perf/util/n;Lwe/k;Lcom/google/firebase/perf/util/l;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method
