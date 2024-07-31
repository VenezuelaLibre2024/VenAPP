.class public Le2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[Le2/n;

.field private final b:Ljava/lang/String;

.field private final c:[B

.field private final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[Le2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/m;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Le2/m;->c:[B

    iput-object p2, p0, Le2/m;->a:[Le2/n;

    const/4 p1, 0x0

    iput p1, p0, Le2/m;->d:I

    return-void
.end method

.method public constructor <init>([B[Le2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Le2/m;->c:[B

    const/4 p1, 0x0

    iput-object p1, p0, Le2/m;->b:Ljava/lang/String;

    iput-object p2, p0, Le2/m;->a:[Le2/n;

    const/4 p1, 0x1

    iput p1, p0, Le2/m;->d:I

    return-void
.end method

.method private a(I)V
    .locals 3

    iget v0, p0, Le2/m;->d:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong data accessor type detected. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le2/m;->d:I

    invoke-direct {p0, v2}, Le2/m;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " expected, but got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Le2/m;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private f(I)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "ArrayBuffer"

    return-object p1

    :cond_1
    const-string p1, "String"

    return-object p1
.end method


# virtual methods
.method public b()[B
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Le2/m;->a(I)V

    iget-object v0, p0, Le2/m;->c:[B

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le2/m;->c:[B

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le2/m;->a(I)V

    iget-object v0, p0, Le2/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()[Le2/n;
    .locals 1

    iget-object v0, p0, Le2/m;->a:[Le2/n;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Le2/m;->d:I

    return v0
.end method
