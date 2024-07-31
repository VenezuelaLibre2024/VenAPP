.class Lj3/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:Lm3/a;

.field final b:Lm3/a;

.field final c:Lm3/a;

.field final d:Lm3/a;

.field final e:Lj3/m;

.field final f:Lj3/p$a;

.field final g:Landroidx/core/util/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/e<",
            "Lj3/l<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm3/a;Lm3/a;Lm3/a;Lm3/a;Lj3/m;Lj3/p$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj3/k$b$a;

    invoke-direct {v0, p0}, Lj3/k$b$a;-><init>(Lj3/k$b;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Ld4/a;->d(ILd4/a$d;)Landroidx/core/util/e;

    move-result-object v0

    iput-object v0, p0, Lj3/k$b;->g:Landroidx/core/util/e;

    iput-object p1, p0, Lj3/k$b;->a:Lm3/a;

    iput-object p2, p0, Lj3/k$b;->b:Lm3/a;

    iput-object p3, p0, Lj3/k$b;->c:Lm3/a;

    iput-object p4, p0, Lj3/k$b;->d:Lm3/a;

    iput-object p5, p0, Lj3/k$b;->e:Lj3/m;

    iput-object p6, p0, Lj3/k$b;->f:Lj3/p$a;

    return-void
.end method


# virtual methods
.method a(Lh3/f;ZZZZ)Lj3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lh3/f;",
            "ZZZZ)",
            "Lj3/l<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lj3/k$b;->g:Landroidx/core/util/e;

    invoke-interface {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj3/l;

    invoke-static {v0}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lj3/l;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lj3/l;->l(Lh3/f;ZZZZ)Lj3/l;

    move-result-object p1

    return-object p1
.end method
