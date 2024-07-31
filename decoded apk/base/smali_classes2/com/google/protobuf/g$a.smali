.class Lcom/google/protobuf/g$a;
.super Lcom/google/protobuf/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/g;->q()Lcom/google/protobuf/g$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:I

.field private final b:I

.field final synthetic c:Lcom/google/protobuf/g;


# direct methods
.method constructor <init>(Lcom/google/protobuf/g;)V
    .locals 1

    iput-object p1, p0, Lcom/google/protobuf/g$a;->c:Lcom/google/protobuf/g;

    invoke-direct {p0}, Lcom/google/protobuf/g$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/g$a;->a:I

    invoke-virtual {p1}, Lcom/google/protobuf/g;->size()I

    move-result p1

    iput p1, p0, Lcom/google/protobuf/g$a;->b:I

    return-void
.end method


# virtual methods
.method public b()B
    .locals 2

    iget v0, p0, Lcom/google/protobuf/g$a;->a:I

    iget v1, p0, Lcom/google/protobuf/g$a;->b:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/protobuf/g$a;->a:I

    iget-object v1, p0, Lcom/google/protobuf/g$a;->c:Lcom/google/protobuf/g;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/g;->o(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/protobuf/g$a;->a:I

    iget v1, p0, Lcom/google/protobuf/g$a;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
