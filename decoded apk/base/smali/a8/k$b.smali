.class La8/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:La8/k;


# direct methods
.method private constructor <init>(La8/k;)V
    .locals 0

    iput-object p1, p0, La8/k$b;->a:La8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(La8/k;La8/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, La8/k$b;-><init>(La8/k;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, La8/p;

    invoke-virtual {p0, p1}, La8/k$b;->b(La8/p;)V

    return-void
.end method

.method public b(La8/p;)V
    .locals 1

    iget-object p1, p0, La8/k$b;->a:La8/k;

    invoke-static {p1}, La8/k;->n(La8/k;)Lv7/y$a;

    move-result-object p1

    iget-object v0, p0, La8/k$b;->a:La8/k;

    invoke-interface {p1, v0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public i(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La8/k$b;->a:La8/k;

    invoke-static {v0}, La8/k;->p(La8/k;)Lb8/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lb8/l;->f(Landroid/net/Uri;)V

    return-void
.end method

.method public onPrepared()V
    .locals 11

    iget-object v0, p0, La8/k$b;->a:La8/k;

    invoke-static {v0}, La8/k;->h(La8/k;)I

    move-result v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La8/k$b;->a:La8/k;

    invoke-static {v0}, La8/k;->i(La8/k;)[La8/p;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, La8/p;->r()Lv7/f1;

    move-result-object v5

    iget v5, v5, Lv7/f1;->a:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lv7/d1;

    iget-object v1, p0, La8/k$b;->a:La8/k;

    invoke-static {v1}, La8/k;->i(La8/k;)[La8/p;

    move-result-object v1

    array-length v3, v1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, La8/p;->r()Lv7/f1;

    move-result-object v7

    iget v7, v7, Lv7/f1;->a:I

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, La8/p;->r()Lv7/f1;

    move-result-object v10

    invoke-virtual {v10, v8}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, La8/k$b;->a:La8/k;

    new-instance v2, Lv7/f1;

    invoke-direct {v2, v0}, Lv7/f1;-><init>([Lv7/d1;)V

    invoke-static {v1, v2}, La8/k;->m(La8/k;Lv7/f1;)Lv7/f1;

    iget-object v0, p0, La8/k$b;->a:La8/k;

    invoke-static {v0}, La8/k;->n(La8/k;)Lv7/y$a;

    move-result-object v0

    iget-object v1, p0, La8/k$b;->a:La8/k;

    invoke-interface {v0, v1}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method
