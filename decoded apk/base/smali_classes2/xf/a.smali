.class public Lxf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxf/a$l;,
        Lxf/a$k;,
        Lxf/a$j;,
        Lxf/a$g;,
        Lxf/a$d;,
        Lxf/a$f;,
        Lxf/a$i;,
        Lxf/a$h;,
        Lxf/a$e;,
        Lxf/a$c;,
        Lxf/a$b;,
        Lxf/a$a;
    }
.end annotation


# instance fields
.field private final a:Lyf/a;

.field private final b:Landroid/graphics/Rect;

.field private final c:[Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Lyf/a;Landroid/graphics/Matrix;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyf/a;

    iput-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {p1}, Lyf/a;->e()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-static {v0, p2}, Lbg/b;->c(Landroid/graphics/Rect;Landroid/graphics/Matrix;)V

    :cond_0
    iput-object v0, p0, Lxf/a;->b:Landroid/graphics/Rect;

    invoke-interface {p1}, Lyf/a;->k()[Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lbg/b;->b([Landroid/graphics/Point;Landroid/graphics/Matrix;)V

    :cond_1
    iput-object p1, p0, Lxf/a;->c:[Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lxf/a;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public b()Lxf/a$c;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->a()Lxf/a$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lxf/a$d;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->i()Lxf/a$d;

    move-result-object v0

    return-object v0
.end method

.method public d()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lxf/a;->c:[Landroid/graphics/Point;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Lxf/a$e;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->d()Lxf/a$e;

    move-result-object v0

    return-object v0
.end method

.method public g()Lxf/a$f;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->r()Lxf/a$f;

    move-result-object v0

    return-object v0
.end method

.method public h()I
    .locals 3

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->getFormat()I

    move-result v0

    const/16 v1, 0x1000

    const/4 v2, -0x1

    if-gt v0, v1, :cond_0

    if-nez v0, :cond_1

    return v2

    :cond_0
    move v0, v2

    :cond_1
    return v0
.end method

.method public i()Lxf/a$g;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->l()Lxf/a$g;

    move-result-object v0

    return-object v0
.end method

.method public j()Lxf/a$i;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->c()Lxf/a$i;

    move-result-object v0

    return-object v0
.end method

.method public k()[B
    .locals 2

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->j()[B

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Lxf/a$j;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->h()Lxf/a$j;

    move-result-object v0

    return-object v0
.end method

.method public n()Lxf/a$k;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->getUrl()Lxf/a$k;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->g()I

    move-result v0

    return v0
.end method

.method public p()Lxf/a$l;
    .locals 1

    iget-object v0, p0, Lxf/a;->a:Lyf/a;

    invoke-interface {v0}, Lyf/a;->m()Lxf/a$l;

    move-result-object v0

    return-object v0
.end method
