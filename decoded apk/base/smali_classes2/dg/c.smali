.class public final Ldg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ldg/b;

.field private b:Lkg/b;


# direct methods
.method public constructor <init>(Ldg/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Ldg/c;->a:Ldg/b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Binarizer must be non-null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lkg/b;
    .locals 1

    iget-object v0, p0, Ldg/c;->b:Lkg/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0}, Ldg/b;->b()Lkg/b;

    move-result-object v0

    iput-object v0, p0, Ldg/c;->b:Lkg/b;

    :cond_0
    iget-object v0, p0, Ldg/c;->b:Lkg/b;

    return-object v0
.end method

.method public b(ILkg/a;)Lkg/a;
    .locals 1

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0, p1, p2}, Ldg/b;->c(ILkg/a;)Lkg/a;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0}, Ldg/b;->d()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0}, Ldg/b;->f()I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0}, Ldg/b;->e()Ldg/j;

    move-result-object v0

    invoke-virtual {v0}, Ldg/j;->f()Z

    move-result v0

    return v0
.end method

.method public f()Ldg/c;
    .locals 3

    iget-object v0, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v0}, Ldg/b;->e()Ldg/j;

    move-result-object v0

    invoke-virtual {v0}, Ldg/j;->g()Ldg/j;

    move-result-object v0

    new-instance v1, Ldg/c;

    iget-object v2, p0, Ldg/c;->a:Ldg/b;

    invoke-virtual {v2, v0}, Ldg/b;->a(Ldg/j;)Ldg/b;

    move-result-object v0

    invoke-direct {v1, v0}, Ldg/c;-><init>(Ldg/b;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ldg/c;->a()Lkg/b;

    move-result-object v0

    invoke-virtual {v0}, Lkg/b;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ldg/m; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method
