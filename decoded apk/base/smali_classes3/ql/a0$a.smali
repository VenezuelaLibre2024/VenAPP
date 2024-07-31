.class public Lql/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lql/u;

.field private b:Ljava/lang/String;

.field private c:Lql/t$a;

.field private d:Lql/b0;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lql/a0$a;->e:Ljava/util/Map;

    const-string v0, "GET"

    iput-object v0, p0, Lql/a0$a;->b:Ljava/lang/String;

    new-instance v0, Lql/t$a;

    invoke-direct {v0}, Lql/t$a;-><init>()V

    iput-object v0, p0, Lql/a0$a;->c:Lql/t$a;

    return-void
.end method

.method public constructor <init>(Lql/a0;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lql/a0$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lql/a0;->i()Lql/u;

    move-result-object v0

    iput-object v0, p0, Lql/a0$a;->a:Lql/u;

    invoke-virtual {p1}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lql/a0$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    iput-object v0, p0, Lql/a0$a;->d:Lql/b0;

    invoke-virtual {p1}, Lql/a0;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lql/a0;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ldk/h0;->u(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lql/a0$a;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lql/a0;->e()Lql/t;

    move-result-object p1

    invoke-virtual {p1}, Lql/t;->k()Lql/t$a;

    move-result-object p1

    iput-object p1, p0, Lql/a0$a;->c:Lql/t$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lql/a0$a;->c()Lql/t$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lql/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    return-object p0
.end method

.method public b()Lql/a0;
    .locals 7

    iget-object v1, p0, Lql/a0$a;->a:Lql/u;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lql/a0$a;->b:Ljava/lang/String;

    iget-object v0, p0, Lql/a0$a;->c:Lql/t$a;

    invoke-virtual {v0}, Lql/t$a;->e()Lql/t;

    move-result-object v3

    iget-object v4, p0, Lql/a0$a;->d:Lql/b0;

    iget-object v0, p0, Lql/a0$a;->e:Ljava/util/Map;

    invoke-static {v0}, Lrl/d;->T(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lql/a0;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lql/a0;-><init>(Lql/u;Ljava/lang/String;Lql/t;Lql/b0;Ljava/util/Map;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Lql/t$a;
    .locals 1

    iget-object v0, p0, Lql/a0$a;->c:Lql/t$a;

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lql/a0$a;->c()Lql/t$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lql/t$a;->h(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    return-object p0
.end method

.method public e(Lql/t;)Lql/a0$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lql/t;->k()Lql/t$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lql/a0$a;->l(Lql/t$a;)V

    return-object p0
.end method

.method public f(Ljava/lang/String;Lql/b0;)Lql/a0$a;
    .locals 3

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    const-string v0, "method "

    if-nez p2, :cond_2

    invoke-static {p1}, Lwl/f;->d(Ljava/lang/String;)Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {p1}, Lwl/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-virtual {p0, p1}, Lql/a0$a;->m(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lql/a0$a;->k(Lql/b0;)V

    return-object p0

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lql/b0;)Lql/a0$a;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PATCH"

    invoke-virtual {p0, v0, p1}, Lql/a0$a;->f(Ljava/lang/String;Lql/b0;)Lql/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public h(Lql/b0;)Lql/a0$a;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "POST"

    invoke-virtual {p0, v0, p1}, Lql/a0$a;->f(Ljava/lang/String;Lql/b0;)Lql/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public i(Lql/b0;)Lql/a0$a;
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PUT"

    invoke-virtual {p0, v0, p1}, Lql/a0$a;->f(Ljava/lang/String;Lql/b0;)Lql/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lql/a0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lql/a0$a;->c()Lql/t$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lql/t$a;->g(Ljava/lang/String;)Lql/t$a;

    return-object p0
.end method

.method public final k(Lql/b0;)V
    .locals 0

    iput-object p1, p0, Lql/a0$a;->d:Lql/b0;

    return-void
.end method

.method public final l(Lql/t$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lql/a0$a;->c:Lql/t$a;

    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lql/a0$a;->b:Ljava/lang/String;

    return-void
.end method

.method public final n(Lql/u;)V
    .locals 0

    iput-object p1, p0, Lql/a0$a;->a:Lql/u;

    return-void
.end method

.method public o(Ljava/lang/String;)Lql/a0$a;
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ws:"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lxk/g;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "this as java.lang.String).substring(startIndex)"

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http:"

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    const-string v0, "wss:"

    invoke-static {p1, v0, v1}, Lxk/g;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https:"

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Lql/u;->k:Lql/u$b;

    invoke-virtual {v0, p1}, Lql/u$b;->d(Ljava/lang/String;)Lql/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lql/a0$a;->p(Lql/u;)Lql/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public p(Lql/u;)Lql/a0$a;
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lql/a0$a;->n(Lql/u;)V

    return-object p0
.end method
