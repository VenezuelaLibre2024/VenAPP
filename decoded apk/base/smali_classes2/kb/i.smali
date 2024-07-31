.class public final Lkb/i;
.super Lkb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/i$b;,
        Lkb/i$c;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Lkb/i$c;


# direct methods
.method private constructor <init>(IIILkb/i$c;)V
    .locals 0

    invoke-direct {p0}, Lkb/c;-><init>()V

    iput p1, p0, Lkb/i;->a:I

    iput p2, p0, Lkb/i;->b:I

    iput p3, p0, Lkb/i;->c:I

    iput-object p4, p0, Lkb/i;->d:Lkb/i$c;

    return-void
.end method

.method synthetic constructor <init>(IIILkb/i$c;Lkb/i$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lkb/i;-><init>(IIILkb/i$c;)V

    return-void
.end method

.method public static a()Lkb/i$b;
    .locals 2

    new-instance v0, Lkb/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/i$b;-><init>(Lkb/i$a;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lkb/i;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lkb/i;->a:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lkb/i;->c:I

    return v0
.end method

.method public e()Lkb/i$c;
    .locals 1

    iget-object v0, p0, Lkb/i;->d:Lkb/i$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lkb/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lkb/i;

    invoke-virtual {p1}, Lkb/i;->c()I

    move-result v0

    invoke-virtual {p0}, Lkb/i;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lkb/i;->b()I

    move-result v0

    invoke-virtual {p0}, Lkb/i;->b()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lkb/i;->d()I

    move-result v0

    invoke-virtual {p0}, Lkb/i;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lkb/i;->e()Lkb/i$c;

    move-result-object p1

    invoke-virtual {p0}, Lkb/i;->e()Lkb/i$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lkb/i;->d:Lkb/i$c;

    sget-object v1, Lkb/i$c;->d:Lkb/i$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lkb/i;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lkb/i;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lkb/i;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, Lkb/i;->d:Lkb/i$c;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AesEax Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkb/i;->d:Lkb/i$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lkb/i;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte IV, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lkb/i;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tag, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lkb/i;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
