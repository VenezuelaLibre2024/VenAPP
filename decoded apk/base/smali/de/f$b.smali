.class public Lde/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lde/g;

.field b:Lde/g;

.field c:Ljava/lang/String;

.field d:Lde/a;

.field e:Lde/n;

.field f:Lde/n;

.field g:Lde/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/e;Ljava/util/Map;)Lde/f;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lde/f;"
        }
    .end annotation

    iget-object v0, p0, Lde/f$b;->d:Lde/a;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lde/f$b;->g:Lde/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lde/a;->c()Lde/d;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model secondary action must be null or have a button"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lde/f$b;->e:Lde/n;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lde/f$b;->a:Lde/g;

    if-nez v0, :cond_3

    iget-object v0, p0, Lde/f$b;->b:Lde/g;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model must have at least one image"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget-object v0, p0, Lde/f$b;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lde/f;

    iget-object v3, p0, Lde/f$b;->e:Lde/n;

    iget-object v4, p0, Lde/f$b;->f:Lde/n;

    iget-object v5, p0, Lde/f$b;->a:Lde/g;

    iget-object v6, p0, Lde/f$b;->b:Lde/g;

    iget-object v7, p0, Lde/f$b;->c:Ljava/lang/String;

    iget-object v8, p0, Lde/f$b;->d:Lde/a;

    iget-object v9, p0, Lde/f$b;->g:Lde/a;

    const/4 v11, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v10, p2

    invoke-direct/range {v1 .. v11}, Lde/f;-><init>(Lde/e;Lde/n;Lde/n;Lde/g;Lde/g;Ljava/lang/String;Lde/a;Lde/a;Ljava/util/Map;Lde/f$a;)V

    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model must have a background color"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model must have a title"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model must have a primary action button"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Card model must have a primary action"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lde/n;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->f:Lde/n;

    return-object p0
.end method

.method public d(Lde/g;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->b:Lde/g;

    return-object p0
.end method

.method public e(Lde/g;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->a:Lde/g;

    return-object p0
.end method

.method public f(Lde/a;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->d:Lde/a;

    return-object p0
.end method

.method public g(Lde/a;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->g:Lde/a;

    return-object p0
.end method

.method public h(Lde/n;)Lde/f$b;
    .locals 0

    iput-object p1, p0, Lde/f$b;->e:Lde/n;

    return-object p0
.end method
