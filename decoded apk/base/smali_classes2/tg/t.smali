.class public final Ltg/t;
.super Ltg/y;
.source "SourceFile"


# instance fields
.field private final i:Ltg/y;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltg/y;-><init>()V

    new-instance v0, Ltg/i;

    invoke-direct {v0}, Ltg/i;-><init>()V

    iput-object v0, p0, Ltg/t;->i:Ltg/y;

    return-void
.end method

.method private static s(Ldg/q;)Ldg/q;
    .locals 5

    invoke-virtual {p0}, Ldg/q;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_1

    new-instance v1, Ldg/q;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ldg/q;->e()[Ldg/s;

    move-result-object v2

    sget-object v3, Ldg/a;->UPC_A:Ldg/a;

    const/4 v4, 0x0

    invoke-direct {v1, v0, v4, v2, v3}, Ldg/q;-><init>(Ljava/lang/String;[B[Ldg/s;Ldg/a;)V

    invoke-virtual {p0}, Ldg/q;->d()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ldg/q;->d()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldg/q;->g(Ljava/util/Map;)V

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Ldg/c;)Ldg/q;
    .locals 1

    iget-object v0, p0, Ltg/t;->i:Ltg/y;

    invoke-virtual {v0, p1}, Ltg/r;->a(Ldg/c;)Ldg/q;

    move-result-object p1

    invoke-static {p1}, Ltg/t;->s(Ldg/q;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public b(Ldg/c;Ljava/util/Map;)Ldg/q;
    .locals 1
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

    iget-object v0, p0, Ltg/t;->i:Ltg/y;

    invoke-virtual {v0, p1, p2}, Ltg/r;->b(Ldg/c;Ljava/util/Map;)Ldg/q;

    move-result-object p1

    invoke-static {p1}, Ltg/t;->s(Ldg/q;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method public c(ILkg/a;Ljava/util/Map;)Ldg/q;
    .locals 1
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

    iget-object v0, p0, Ltg/t;->i:Ltg/y;

    invoke-virtual {v0, p1, p2, p3}, Ltg/y;->c(ILkg/a;Ljava/util/Map;)Ldg/q;

    move-result-object p1

    invoke-static {p1}, Ltg/t;->s(Ldg/q;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method protected l(Lkg/a;[ILjava/lang/StringBuilder;)I
    .locals 1

    iget-object v0, p0, Ltg/t;->i:Ltg/y;

    invoke-virtual {v0, p1, p2, p3}, Ltg/y;->l(Lkg/a;[ILjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public m(ILkg/a;[ILjava/util/Map;)Ldg/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkg/a;",
            "[I",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Ldg/q;"
        }
    .end annotation

    iget-object v0, p0, Ltg/t;->i:Ltg/y;

    invoke-virtual {v0, p1, p2, p3, p4}, Ltg/y;->m(ILkg/a;[ILjava/util/Map;)Ldg/q;

    move-result-object p1

    invoke-static {p1}, Ltg/t;->s(Ldg/q;)Ldg/q;

    move-result-object p1

    return-object p1
.end method

.method q()Ldg/a;
    .locals 1

    sget-object v0, Ldg/a;->UPC_A:Ldg/a;

    return-object v0
.end method
