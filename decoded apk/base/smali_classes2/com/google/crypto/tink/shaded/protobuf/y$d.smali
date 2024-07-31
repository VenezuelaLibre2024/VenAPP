.class final Lcom/google/crypto/tink/shaded/protobuf/y$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/crypto/tink/shaded/protobuf/u$b<",
        "Lcom/google/crypto/tink/shaded/protobuf/y$d;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/crypto/tink/shaded/protobuf/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "*>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:Lcom/google/crypto/tink/shaded/protobuf/t1$b;

.field final d:Z

.field final e:Z


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b:I

    return v0
.end method

.method public b(Lcom/google/crypto/tink/shaded/protobuf/y$d;)I
    .locals 1

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b:I

    iget p1, p1, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->d:Z

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->b(Lcom/google/crypto/tink/shaded/protobuf/y$d;)I

    move-result p1

    return p1
.end method

.method public d()Lcom/google/crypto/tink/shaded/protobuf/t1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->c:Lcom/google/crypto/tink/shaded/protobuf/t1$b;

    return-object v0
.end method

.method public e()Lcom/google/crypto/tink/shaded/protobuf/t1$c;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->c:Lcom/google/crypto/tink/shaded/protobuf/t1$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/t1$b;->b()Lcom/google/crypto/tink/shaded/protobuf/t1$c;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->e:Z

    return v0
.end method

.method public h()Lcom/google/crypto/tink/shaded/protobuf/a0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->a:Lcom/google/crypto/tink/shaded/protobuf/a0$d;

    return-object v0
.end method

.method public j(Lcom/google/crypto/tink/shaded/protobuf/r0$a;Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y$a;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->w(Lcom/google/crypto/tink/shaded/protobuf/y;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method
