.class final Lcom/google/protobuf/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/t$b<",
        "Lcom/google/protobuf/x$d;",
        ">;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "*>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:Lcom/google/protobuf/t1$b;

.field final d:Z

.field final e:Z


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/x$d;->b:I

    return v0
.end method

.method public b(Lcom/google/protobuf/x$d;)I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/x$d;->b:I

    iget p1, p1, Lcom/google/protobuf/x$d;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/x$d;->d:Z

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/x$d;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/x$d;->b(Lcom/google/protobuf/x$d;)I

    move-result p1

    return p1
.end method

.method public d()Lcom/google/protobuf/t1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$d;->c:Lcom/google/protobuf/t1$b;

    return-object v0
.end method

.method public e()Lcom/google/protobuf/t1$c;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$d;->c:Lcom/google/protobuf/t1$b;

    invoke-virtual {v0}, Lcom/google/protobuf/t1$b;->h()Lcom/google/protobuf/t1$c;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/x$d;->e:Z

    return v0
.end method

.method public g(Lcom/google/protobuf/r0$a;Lcom/google/protobuf/r0;)Lcom/google/protobuf/r0$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/x$a;

    check-cast p2, Lcom/google/protobuf/x;

    invoke-virtual {p1, p2}, Lcom/google/protobuf/x$a;->F(Lcom/google/protobuf/x;)Lcom/google/protobuf/x$a;

    move-result-object p1

    return-object p1
.end method

.method public h()Lcom/google/protobuf/z$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/z$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/x$d;->a:Lcom/google/protobuf/z$d;

    return-object v0
.end method
