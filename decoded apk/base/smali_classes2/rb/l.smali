.class public final Lrb/l;
.super Lrb/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/l$b;,
        Lrb/l$c;,
        Lrb/l$d;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lrb/l$d;

.field private final d:Lrb/l$c;


# direct methods
.method private constructor <init>(IILrb/l$d;Lrb/l$c;)V
    .locals 0

    invoke-direct {p0}, Lrb/q;-><init>()V

    iput p1, p0, Lrb/l;->a:I

    iput p2, p0, Lrb/l;->b:I

    iput-object p3, p0, Lrb/l;->c:Lrb/l$d;

    iput-object p4, p0, Lrb/l;->d:Lrb/l$c;

    return-void
.end method

.method synthetic constructor <init>(IILrb/l$d;Lrb/l$c;Lrb/l$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lrb/l;-><init>(IILrb/l$d;Lrb/l$c;)V

    return-void
.end method

.method public static a()Lrb/l$b;
    .locals 2

    new-instance v0, Lrb/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/l$b;-><init>(Lrb/l$a;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lrb/l;->b:I

    return v0
.end method

.method public c()Lrb/l$c;
    .locals 1

    iget-object v0, p0, Lrb/l;->d:Lrb/l$c;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lrb/l;->a:I

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lrb/l;->c:Lrb/l$d;

    sget-object v1, Lrb/l$d;->e:Lrb/l$d;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lrb/l;->b()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lrb/l$d;->b:Lrb/l$d;

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lrb/l;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lrb/l$d;->c:Lrb/l$d;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lrb/l$d;->d:Lrb/l$d;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lrb/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lrb/l;

    invoke-virtual {p1}, Lrb/l;->d()I

    move-result v0

    invoke-virtual {p0}, Lrb/l;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lrb/l;->e()I

    move-result v0

    invoke-virtual {p0}, Lrb/l;->e()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lrb/l;->f()Lrb/l$d;

    move-result-object v0

    invoke-virtual {p0}, Lrb/l;->f()Lrb/l$d;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lrb/l;->c()Lrb/l$c;

    move-result-object p1

    invoke-virtual {p0}, Lrb/l;->c()Lrb/l$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Lrb/l$d;
    .locals 1

    iget-object v0, p0, Lrb/l;->c:Lrb/l$d;

    return-object v0
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lrb/l;->c:Lrb/l$d;

    sget-object v1, Lrb/l$d;->e:Lrb/l$d;

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

    iget v1, p0, Lrb/l;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lrb/l;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, Lrb/l;->c:Lrb/l$d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lrb/l;->d:Lrb/l$c;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/l;->c:Lrb/l$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/l;->d:Lrb/l$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrb/l;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrb/l;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
