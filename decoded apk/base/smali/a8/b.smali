.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/j;


# static fields
.field private static final d:Ly6/y;


# instance fields
.field final a:Ly6/k;

.field private final b:Lt6/u1;

.field private final c:Lt8/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly6/y;

    invoke-direct {v0}, Ly6/y;-><init>()V

    sput-object v0, La8/b;->d:Ly6/y;

    return-void
.end method

.method public constructor <init>(Ly6/k;Lt6/u1;Lt8/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/b;->a:Ly6/k;

    iput-object p2, p0, La8/b;->b:Lt6/u1;

    iput-object p3, p0, La8/b;->c:Lt8/n0;

    return-void
.end method


# virtual methods
.method public a(Ly6/l;)Z
    .locals 2

    iget-object v0, p0, La8/b;->a:Ly6/k;

    sget-object v1, La8/b;->d:Ly6/y;

    invoke-interface {v0, p1, v1}, Ly6/k;->f(Ly6/l;Ly6/y;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Ly6/m;)V
    .locals 1

    iget-object v0, p0, La8/b;->a:Ly6/k;

    invoke-interface {v0, p1}, Ly6/k;->b(Ly6/m;)V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, La8/b;->a:Ly6/k;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2, v1, v2}, Ly6/k;->a(JJ)V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, La8/b;->a:Ly6/k;

    instance-of v1, v0, Li7/h0;

    if-nez v1, :cond_1

    instance-of v0, v0, Lg7/g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, La8/b;->a:Ly6/k;

    instance-of v1, v0, Li7/h;

    if-nez v1, :cond_1

    instance-of v1, v0, Li7/b;

    if-nez v1, :cond_1

    instance-of v1, v0, Li7/e;

    if-nez v1, :cond_1

    instance-of v0, v0, Lf7/f;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f()La8/j;
    .locals 4

    invoke-virtual {p0}, La8/b;->d()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, La8/b;->a:Ly6/k;

    instance-of v1, v0, La8/t;

    if-eqz v1, :cond_0

    new-instance v0, La8/t;

    iget-object v1, p0, La8/b;->b:Lt6/u1;

    iget-object v1, v1, Lt6/u1;->c:Ljava/lang/String;

    iget-object v2, p0, La8/b;->c:Lt8/n0;

    invoke-direct {v0, v1, v2}, La8/t;-><init>(Ljava/lang/String;Lt8/n0;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Li7/h;

    if-eqz v1, :cond_1

    new-instance v0, Li7/h;

    invoke-direct {v0}, Li7/h;-><init>()V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Li7/b;

    if-eqz v1, :cond_2

    new-instance v0, Li7/b;

    invoke-direct {v0}, Li7/b;-><init>()V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Li7/e;

    if-eqz v1, :cond_3

    new-instance v0, Li7/e;

    invoke-direct {v0}, Li7/e;-><init>()V

    goto :goto_0

    :cond_3
    instance-of v0, v0, Lf7/f;

    if-eqz v0, :cond_4

    new-instance v0, Lf7/f;

    invoke-direct {v0}, Lf7/f;-><init>()V

    :goto_0
    new-instance v1, La8/b;

    iget-object v2, p0, La8/b;->b:Lt6/u1;

    iget-object v3, p0, La8/b;->c:Lt8/n0;

    invoke-direct {v1, v0, v2, v3}, La8/b;-><init>(Ly6/k;Lt6/u1;Lt8/n0;)V

    return-object v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La8/b;->a:Ly6/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
