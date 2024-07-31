.class Lj3/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld4/a$d<",
        "Lj3/h<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj3/k$a;


# direct methods
.method constructor <init>(Lj3/k$a;)V
    .locals 0

    iput-object p1, p0, Lj3/k$a$a;->a:Lj3/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj3/k$a$a;->b()Lj3/h;

    move-result-object v0

    return-object v0
.end method

.method public b()Lj3/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj3/h<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lj3/h;

    iget-object v1, p0, Lj3/k$a$a;->a:Lj3/k$a;

    iget-object v2, v1, Lj3/k$a;->a:Lj3/h$e;

    iget-object v1, v1, Lj3/k$a;->b:Landroidx/core/util/e;

    invoke-direct {v0, v2, v1}, Lj3/h;-><init>(Lj3/h$e;Landroidx/core/util/e;)V

    return-object v0
.end method
