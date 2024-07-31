.class public final La9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/e$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:I

.field private final f:Lx8/c0;

.field private final g:Z


# direct methods
.method synthetic constructor <init>(La9/e$a;La9/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La9/e$a;->n(La9/e$a;)Z

    move-result p2

    iput-boolean p2, p0, La9/e;->a:Z

    invoke-static {p1}, La9/e$a;->j(La9/e$a;)I

    move-result p2

    iput p2, p0, La9/e;->b:I

    invoke-static {p1}, La9/e$a;->k(La9/e$a;)I

    move-result p2

    iput p2, p0, La9/e;->c:I

    invoke-static {p1}, La9/e$a;->m(La9/e$a;)Z

    move-result p2

    iput-boolean p2, p0, La9/e;->d:Z

    invoke-static {p1}, La9/e$a;->i(La9/e$a;)I

    move-result p2

    iput p2, p0, La9/e;->e:I

    invoke-static {p1}, La9/e$a;->l(La9/e$a;)Lx8/c0;

    move-result-object p2

    iput-object p2, p0, La9/e;->f:Lx8/c0;

    invoke-static {p1}, La9/e$a;->o(La9/e$a;)Z

    move-result p1

    iput-boolean p1, p0, La9/e;->g:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La9/e;->e:I

    return v0
.end method

.method public b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, La9/e;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, La9/e;->c:I

    return v0
.end method

.method public d()Lx8/c0;
    .locals 1

    iget-object v0, p0, La9/e;->f:Lx8/c0;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, La9/e;->d:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, La9/e;->a:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, La9/e;->g:Z

    return v0
.end method
