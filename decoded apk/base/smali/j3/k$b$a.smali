.class Lj3/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld4/a$d<",
        "Lj3/l<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj3/k$b;


# direct methods
.method constructor <init>(Lj3/k$b;)V
    .locals 0

    iput-object p1, p0, Lj3/k$b$a;->a:Lj3/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj3/k$b$a;->b()Lj3/l;

    move-result-object v0

    return-object v0
.end method

.method public b()Lj3/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj3/l<",
            "*>;"
        }
    .end annotation

    new-instance v8, Lj3/l;

    iget-object v0, p0, Lj3/k$b$a;->a:Lj3/k$b;

    iget-object v1, v0, Lj3/k$b;->a:Lm3/a;

    iget-object v2, v0, Lj3/k$b;->b:Lm3/a;

    iget-object v3, v0, Lj3/k$b;->c:Lm3/a;

    iget-object v4, v0, Lj3/k$b;->d:Lm3/a;

    iget-object v5, v0, Lj3/k$b;->e:Lj3/m;

    iget-object v6, v0, Lj3/k$b;->f:Lj3/p$a;

    iget-object v7, v0, Lj3/k$b;->g:Landroidx/core/util/e;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lj3/l;-><init>(Lm3/a;Lm3/a;Lm3/a;Lm3/a;Lj3/m;Lj3/p$a;Landroidx/core/util/e;)V

    return-object v8
.end method
